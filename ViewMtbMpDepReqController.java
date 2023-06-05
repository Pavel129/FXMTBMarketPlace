package com.maritimebank.FXMTBMarketPlace;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.geometry.Orientation;
import javafx.scene.Node;
import javafx.scene.control.*;
import ru.inversion.bicomp.action.JInvButtonBiCompAction;
import ru.inversion.bicomp.action.StopExecuteActionBiCompException;
import ru.inversion.bicomp.pref.PreferencesWorker;
import ru.inversion.bicomp.stringconverter.DataSetStringConverter;
import ru.inversion.bicomp.util.ParamMap;
import ru.inversion.control.fields.date.JInvDateField;
import ru.inversion.dataset.*;
import ru.inversion.dataset.fx.DSFXAdapter;
import ru.inversion.dataset.aggr.AggrFuncEnum;
import ru.inversion.fx.form.controls.dsbar.DSInfoBar;
import ru.inversion.fx.form.controls.renderer.JInvTableCell;
import ru.inversion.fx.form.controls.table.toolbar.AggregatorType;

import ru.inversion.fx.form.*;
import ru.inversion.fx.form.controls.*;
import ru.inversion.fxcuslist.JInvFXCus;
import ru.inversion.fxdjfront.doginfo.PDogInfoMain;
import ru.inversion.fxdjfront.dogsclient.PDogSums;
import ru.inversion.fxdjfront.dogsclient.PvQdgMain;
import ru.inversion.fxpdoc.action.ActionShowOperlist;
import ru.inversion.fxpdoc.auview.PTableRecordClob;
import ru.inversion.fxpdoc.control.ViewClobDataController;
import ru.inversion.fxpdoc.operlist.PShowOperlist;
import ru.inversion.icons.enums.FontAwesome;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/**
 *
 * @author  Grigorev
 * @since   Wed Mar 09 10:47:27 MSK 2022
 */
public class ViewMtbMpDepReqController extends JInvFXBrowserController 
{
    @FXML private JInvTable<PMtbMpDepReq>           MTB_MP_DEP_REQ;
    @FXML private JInvTable<PMtbMpDepEvent>         MTB_MP_DEP_EVENT;
    @FXML private JInvTable<PMtbMpDepCheck>         MTB_MP_DEP_CHECK;
    @FXML private JInvTable<PMtbMpDepReqCus>        MTB_MP_DEP_REQ_CUS;
    @FXML private JInvTable<PMtbMpDepReqDoc>        MTB_MP_DEP_REQ_DOC;
    @FXML private JInvTable<PMtbMpDepReqPhone>      MTB_MP_DEP_REQ_PHONE;
    @FXML private JInvTable<PMtbMpDepReqEmail>      MTB_MP_DEP_REQ_EMAIL;
    @FXML private JInvTable<PMtbMpDepReqCond>       MTB_MP_DEP_REQ_COND;
    @FXML private JInvTable<PMtbMpDepReqPayment>    MTB_MP_DEP_REQ_PAYMENT;
    
    @FXML private JInvTableColumn<PMtbMpDepEvent, String> MDE_MESSAGEBODY;
    @FXML private JInvTableColumn<PMtbMpDepReq, String> CMDRAGRID;
    
    @FXML private JInvTextField CHECK_NCODE,CHECK_CDESCRIPTION,CHECK_NREASONCODE,CHECK_CREASONDESCRIPTION;
    @FXML private JInvCalendar  CHECK_DNONVALIDSINCE;
    
    @FXML private JInvTextField CUS_ID,CUS_LASTNAME,CUS_FIRSTNAME,CUS_MIDDLENAME,CUS_GENDER,CUS_BIRTHPLACE;
    @FXML private JInvCalendar  CUS_BIRTHDATE,CUS_IDEN_DATE;
    @FXML private JInvTextField CUS_CITIZENSHIP,CUS_INN,CUS_SNILS,CUS_IDEN_TYPE,FA_CRSSTATUS;
    @FXML private JInvTextField REG_FULLADDRESS,REG_COUNTRYID,REG_POSTCODE,REG_REGION,REG_CITY,REG_DISTRICT,REG_AREA,REG_SETTLEMENT,REG_STREET,REG_FIASCODE,REG_BUILDING,REG_FRAME,REG_HOUSE,REG_FLAT;
    @FXML private JInvTextField RES_FULLADDRESS,RES_COUNTRYID,RES_POSTCODE,RES_REGION,RES_CITY,RES_DISTRICT,RES_AREA,RES_SETTLEMENT,RES_STREET,RES_FIASCODE,RES_BUILDING,RES_FRAME,RES_HOUSE,RES_FLAT;
    @FXML private JInvCheckBoxString FA_OWNWILLACTION,FA_NOONECONTROLSACTIONS,FA_ONLYRUSSIANTAXPAYER,FA_NOTUSABIRTHPLACE,FA_NOTUSATAXPAYER,FA_NOUSAGREENCARD;
    @FXML private JInvTextField PROD_ID,AMOUNT,DURATION_C,DURATION_V,IR_PERIOD_C,IR_METHOD_C,WD_MTM_C,WD_ACCBIC,WD_ACCNUM,IP_ACCBIC,IP_ACCNUM;
    @FXML private JInvPercentField ANNUALRATE;
    @FXML private JInvTextArea AGRTEXT;
    @FXML private JInvXMLViewer BXML;
    @FXML private Button BBXML;
    @FXML private JInvCalendar  PAY_DTRNDOC;
    @FXML private JInvTextField PAY_ITRNDOCNUM,PAY_CTRNPURP;
    @FXML private JInvToolBar toolBar,toolBarR;

    @FXML private DSInfoBar MTBMP_DEP_REQ_FX$MARK;
    
    @FXML private JInvComboBox MTB_MP_DEP_REQ_PERIOD;
    @FXML private JInvTextField BLANK_COUNT;
    
    private final XXIDataSet<PMtbMpDepReq>          dsMTB_MP_DEP_REQ        = new XXIDataSet<> ();
    private final XXIDataSet<PMtbMpDepEvent>        dsMTB_MP_DEP_EVENT      = new XXIDataSet<> ();
    private final XXIDataSet<PMtbMpDepCheck>        dsMTB_MP_DEP_CHECK      = new XXIDataSet<> ();
    private final XXIDataSet<PMtbMpDepReqCus>       dsMTB_MP_DEP_REQ_CUS    = new XXIDataSet<> ();
    private final XXIDataSet<PMtbMpDepReqDoc>       dsMTB_MP_DEP_REQ_DOC    = new XXIDataSet<> ();
    private final XXIDataSet<PMtbMpDepReqPhone>     dsMTB_MP_DEP_REQ_PHONE  = new XXIDataSet<> ();
    private final XXIDataSet<PMtbMpDepReqEmail>     dsMTB_MP_DEP_REQ_EMAIL  = new XXIDataSet<> ();
    private final XXIDataSet<PMtbMpDepReqCond>      dsMTB_MP_DEP_REQ_COND   = new XXIDataSet<> ();
    private final XXIDataSet<PMtbMpDepReqPayment>   dsMTB_MP_DEP_REQ_PAYMENT= new XXIDataSet<> ();
    private final XXIDataSet<PMtbMpDepReqPeriod>    dsMTB_MP_DEP_REQ_PERIOD = new XXIDataSet<> ();
    private SQLDataSet<PMtbMpDepReqPeriod> dsfxperiod;
    //
    ButtonType btn_do,btn_cancel,btn_ok;
    //
    private POptions pv = new POptions ();
    //
    private void initDataSet ()  
    {
        dsMTB_MP_DEP_REQ.setTaskContext (getTaskContext ());        dsMTB_MP_DEP_REQ.setRowClass (PMtbMpDepReq.class);
        dsMTB_MP_DEP_EVENT.setTaskContext (getTaskContext ());      dsMTB_MP_DEP_EVENT.setRowClass (PMtbMpDepEvent.class);
        dsMTB_MP_DEP_CHECK.setTaskContext (getTaskContext ());      dsMTB_MP_DEP_CHECK.setRowClass (PMtbMpDepCheck.class);
        dsMTB_MP_DEP_REQ_CUS.setTaskContext (getTaskContext ());    dsMTB_MP_DEP_REQ_CUS.setRowClass (PMtbMpDepReqCus.class);
        dsMTB_MP_DEP_REQ_DOC.setTaskContext (getTaskContext ());    dsMTB_MP_DEP_REQ_DOC.setRowClass (PMtbMpDepReqDoc.class);
        dsMTB_MP_DEP_REQ_PHONE.setTaskContext (getTaskContext ());  dsMTB_MP_DEP_REQ_PHONE.setRowClass (PMtbMpDepReqPhone.class);
        dsMTB_MP_DEP_REQ_EMAIL.setTaskContext (getTaskContext ());  dsMTB_MP_DEP_REQ_EMAIL.setRowClass (PMtbMpDepReqEmail.class);
        dsMTB_MP_DEP_REQ_COND.setTaskContext (getTaskContext ());   dsMTB_MP_DEP_REQ_COND.setRowClass (PMtbMpDepReqCond.class);
        dsMTB_MP_DEP_REQ_PAYMENT.setTaskContext (getTaskContext ());dsMTB_MP_DEP_REQ_PAYMENT.setRowClass (PMtbMpDepReqPayment.class);
        dsMTB_MP_DEP_REQ_PERIOD.setTaskContext (getTaskContext ()); dsMTB_MP_DEP_REQ_PERIOD.setRowClass (PMtbMpDepReqPeriod.class);
        dsMTB_MP_DEP_REQ.setOrderBy("IMDRID DESC");
        dsMTB_MP_DEP_EVENT.setOrderBy("imdeid");
        dsMTB_MP_DEP_REQ_PAYMENT.setOrderBy("IQEVTRNNUM");
    
        DataLinkBuilder.linkDataSet(dsMTB_MP_DEP_REQ,dsMTB_MP_DEP_EVENT,PMtbMpDepReq::getIMDRID,"IMDRID");
        DataLinkBuilder.linkDataSet(dsMTB_MP_DEP_REQ,dsMTB_MP_DEP_CHECK,PMtbMpDepReq::getIMDRID,"IMDRID");
        DataLinkBuilder.linkDataSet(dsMTB_MP_DEP_REQ,dsMTB_MP_DEP_REQ_CUS,PMtbMpDepReq::getIMDRID,"IMDRID");
        DataLinkBuilder.linkDataSet(dsMTB_MP_DEP_REQ,dsMTB_MP_DEP_REQ_DOC,PMtbMpDepReq::getIMDRID,"IMDRID");
        DataLinkBuilder.linkDataSet(dsMTB_MP_DEP_REQ,dsMTB_MP_DEP_REQ_PHONE,PMtbMpDepReq::getIMDRID,"IMDRID");
        DataLinkBuilder.linkDataSet(dsMTB_MP_DEP_REQ,dsMTB_MP_DEP_REQ_EMAIL,PMtbMpDepReq::getIMDRID,"IMDRID");
        DataLinkBuilder.linkDataSet(dsMTB_MP_DEP_REQ,dsMTB_MP_DEP_REQ_COND,PMtbMpDepReq::getIMDRID,"IMDRID");
        DataLinkBuilder.linkDataSet(dsMTB_MP_DEP_REQ,dsMTB_MP_DEP_REQ_PAYMENT,PMtbMpDepReq::getIMDRID,"IMDRID");
    }
//
// Initializes the controller class.
//
    @Override
    protected void init() throws Exception
    {
        setTitle (getBundleString ("VIEW.TITLE"));
    
        PreferencesWorker.load (getTaskContext (), pv);
        if (!pv.isAction (POptions.Actions.VIEW_MDR.id())) throw new SecurityException (pv.getActionError (getTaskContext (), POptions.Actions.VIEW_MDR.id()));
        
        btn_ok       = new ButtonType(getBundleString("BTN_OK"), ButtonBar.ButtonData.OK_DONE);
        btn_do       = new ButtonType(getBundleString("BTN_DO"), ButtonBar.ButtonData.OK_DONE);
        btn_cancel   = new ButtonType(getBundleString("BTN_CANCEL"), ButtonBar.ButtonData.CANCEL_CLOSE);
        
        initDataSet ();
        DSFXAdapter<PMtbMpDepReq>           dsfx        = DSFXAdapter.bind (dsMTB_MP_DEP_REQ, MTB_MP_DEP_REQ, null, true);
        DSFXAdapter<PMtbMpDepEvent>         dsfxevent   = DSFXAdapter.bind (dsMTB_MP_DEP_EVENT, MTB_MP_DEP_EVENT, null, false);
        DSFXAdapter<PMtbMpDepCheck>         dsfxcheck   = DSFXAdapter.bind (dsMTB_MP_DEP_CHECK, MTB_MP_DEP_CHECK, null, false);
        DSFXAdapter<PMtbMpDepReqCus>        dsfxcus     = DSFXAdapter.bind (dsMTB_MP_DEP_REQ_CUS, MTB_MP_DEP_REQ_CUS, null, false);
        DSFXAdapter<PMtbMpDepReqDoc>        dsfxdoc     = DSFXAdapter.bind (dsMTB_MP_DEP_REQ_DOC, MTB_MP_DEP_REQ_DOC, null, false);
        DSFXAdapter<PMtbMpDepReqPhone>      dsfxphone   = DSFXAdapter.bind (dsMTB_MP_DEP_REQ_PHONE, MTB_MP_DEP_REQ_PHONE, null, false);
        DSFXAdapter<PMtbMpDepReqEmail>      dsfxemail   = DSFXAdapter.bind (dsMTB_MP_DEP_REQ_EMAIL, MTB_MP_DEP_REQ_EMAIL, null, false);
        DSFXAdapter<PMtbMpDepReqCond>       dsfxcond    = DSFXAdapter.bind (dsMTB_MP_DEP_REQ_COND, MTB_MP_DEP_REQ_COND, null, false);
        DSFXAdapter<PMtbMpDepReqPayment>    dsfxpayment = DSFXAdapter.bind (dsMTB_MP_DEP_REQ_PAYMENT, MTB_MP_DEP_REQ_PAYMENT, null, false);
        
        dsfx.setEnableFilter (true);
        dsfxevent.setEnableFilter (true);
        dsfxcheck.setEnableFilter (true);
        dsfxpayment.setEnableFilter (true);
    
        dsfxperiod=populateDataSet(PMtbMpDepReqPeriod.class,null,null,"IPERDAY",new ParamMap().add("IPERID","CDESCR"),2);
        DataSetStringConverter<PMtbMpDepReqPeriod,String> sc=new DataSetStringConverter<>(dsfxperiod,PMtbMpDepReqPeriod::getIPERID,PMtbMpDepReqPeriod::getCDESCR);
    
        MTB_MP_DEP_REQ_PERIOD.setConverter(sc);
        MTB_MP_DEP_REQ_PERIOD.getItems().clear();
        MTB_MP_DEP_REQ_PERIOD.getItems().addAll(sc.keySet());
        BLANK_COUNT.setText("100");
    
        BBXML.setOnMouseClicked((a)->{
            try {
                BXML.loadString(dsMTB_MP_DEP_REQ.getCurrentRow().getBXML());
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        
        MTBMP_DEP_REQ_FX$MARK.init (MTB_MP_DEP_REQ.getDataSetAdapter ());
        MTBMP_DEP_REQ_FX$MARK.addAggregator ("1", AggrFuncEnum.COUNT, AggregatorType.MARK, null, null);
        
        dsfxcheck.bindControl(CHECK_NCODE,CHECK_CDESCRIPTION,CHECK_NREASONCODE,CHECK_CREASONDESCRIPTION,CHECK_DNONVALIDSINCE);
        
        dsfxcus.bindControl(CUS_ID,CUS_LASTNAME,CUS_FIRSTNAME,CUS_MIDDLENAME,CUS_GENDER,CUS_BIRTHDATE,CUS_BIRTHPLACE);
        dsfxcus.bindControl(CUS_CITIZENSHIP,CUS_INN,CUS_SNILS,CUS_IDEN_TYPE,CUS_IDEN_DATE,FA_CRSSTATUS);
        dsfxcus.bindControl(REG_FULLADDRESS,REG_COUNTRYID,REG_POSTCODE,REG_REGION,REG_CITY,REG_DISTRICT,REG_AREA,REG_SETTLEMENT,REG_STREET,REG_FIASCODE,REG_BUILDING,REG_FRAME,REG_HOUSE,REG_FLAT);
        dsfxcus.bindControl(RES_FULLADDRESS,RES_COUNTRYID,RES_POSTCODE,RES_REGION,RES_CITY,RES_DISTRICT,RES_AREA,RES_SETTLEMENT,RES_STREET,RES_FIASCODE,RES_BUILDING,RES_FRAME,RES_HOUSE,RES_FLAT);
        dsfxcus.bindControl(FA_OWNWILLACTION,FA_NOONECONTROLSACTIONS,FA_ONLYRUSSIANTAXPAYER,FA_NOTUSABIRTHPLACE,FA_NOTUSATAXPAYER,FA_NOUSAGREENCARD);
    
        dsfxcond.bindControl(PROD_ID,AMOUNT,DURATION_C,DURATION_V,ANNUALRATE,IR_PERIOD_C,IR_METHOD_C,WD_MTM_C,WD_ACCBIC,WD_ACCNUM,IP_ACCBIC,IP_ACCNUM,AGRTEXT);
        
        dsfxpayment.bindControl(PAY_ITRNDOCNUM,PAY_DTRNDOC,PAY_CTRNPURP);
        
        initToolBar ();

        MTB_MP_DEP_REQ.setToolBar (toolBar);        MTB_MP_DEP_REQ.setAction (ActionFactory.ActionTypeEnum.REFRESH, (a) -> doRefresh (MTB_MP_DEP_REQ));
        MTB_MP_DEP_EVENT.setToolBar(toolBar);       MTB_MP_DEP_EVENT.setAction(ActionFactory.ActionTypeEnum.REFRESH,(a)->doRefresh(MTB_MP_DEP_EVENT));
        MTB_MP_DEP_CHECK.setToolBar(toolBar);       MTB_MP_DEP_CHECK.setAction(ActionFactory.ActionTypeEnum.REFRESH,(a)->doRefresh(MTB_MP_DEP_CHECK));
        MTB_MP_DEP_REQ_CUS.setToolBar(toolBar);     MTB_MP_DEP_REQ_CUS.setAction(ActionFactory.ActionTypeEnum.REFRESH,(a)->doRefresh(MTB_MP_DEP_REQ_CUS));
        MTB_MP_DEP_REQ_DOC.setToolBar(toolBar);     MTB_MP_DEP_REQ_DOC.setAction(ActionFactory.ActionTypeEnum.REFRESH,(a)->doRefresh(MTB_MP_DEP_REQ_DOC));
        MTB_MP_DEP_REQ_PHONE.setToolBar(toolBar);   MTB_MP_DEP_REQ_PHONE.setAction(ActionFactory.ActionTypeEnum.REFRESH,(a)->doRefresh(MTB_MP_DEP_REQ_PHONE));
        MTB_MP_DEP_REQ_EMAIL.setToolBar(toolBar);   MTB_MP_DEP_REQ_EMAIL.setAction(ActionFactory.ActionTypeEnum.REFRESH,(a)->doRefresh(MTB_MP_DEP_REQ_EMAIL));
        MTB_MP_DEP_REQ_COND.setToolBar(toolBar);    MTB_MP_DEP_REQ_COND.setAction(ActionFactory.ActionTypeEnum.REFRESH,(a)->doRefresh(MTB_MP_DEP_REQ_COND));
        MTB_MP_DEP_REQ_PAYMENT.setToolBar(toolBar); MTB_MP_DEP_REQ_PAYMENT.setAction(ActionFactory.ActionTypeEnum.REFRESH,(a)->doRefresh(MTB_MP_DEP_REQ_PAYMENT));
    
        MDE_MESSAGEBODY.setCellRenderer (this::ClobCellRenderer);
        CMDRAGRID.setCellRenderer (this::req_colorize);
        
        doRefresh (MTB_MP_DEP_REQ);
    }        
//
    private void doRefresh (JInvTable<?> t) {
        if (t.getId().equals("MTB_MP_DEP_REQ")){
            long currID = (dsMTB_MP_DEP_REQ.isEmpty()) ? 0 : dsMTB_MP_DEP_REQ.getCurrentRow().getIMDRID();
            t.executeQuery ((ok, th)-> {
                        if (ok)
                            if (!(currID == 0)) {
                                dsMTB_MP_DEP_REQ.findRow((dataSet, someValue) -> dataSet.getIMDRID().equals(someValue), currID);
                            } else
                                handleException(th);
                }, this);
        }else{
            t.executeQuery();
        }
    }
//
    private void initToolBar () 
    {
        toolBar.setStandartActions (ActionFactory.ActionTypeEnum.REFRESH);
        
        toolBar.getItems().addAll(
                new Separator(Orientation.VERTICAL)
                ,ActionFactory.createButton(FontAwesome.fa_group, "", (a) -> Go_CusList(), getBundleString("CUSLIST.TT"))
                ,ActionFactory.createButton(FontAwesome.fa_file_text_o, "", (a) -> Go_QDG(), getBundleString("QDG_INFO"))
                ,ActionFactory.createButton(FontAwesome.fa_align_justify, "", (a) -> Go_QDG_LIST(), getBundleString("QDG_LIST"))
                ,new JInvButtonBiCompAction<>(new ActionShowOperlist(this::doPreTRN))
                ,new Separator(Orientation.VERTICAL)
                ,ActionFactory.createButton(FontAwesome.fa_drivers_license_o, "", (a) -> MakeDocs(), getBundleString("GET_DOCS"))
        );
        //
        ButtonBase btn_e_cancel     =ActionFactory.createButton(FontAwesome.fa_frown_o, "", (a) -> MakeCancel(), getBundleString("EVT_CANCEL"));
        ButtonBase btn_e_activate   =ActionFactory.createButton(FontAwesome.fa_smile_o, "", (a) -> MakeActivation(), getBundleString("EVT_ACTIVATION"));
        ButtonBase btn_e_credit     =ActionFactory.createButton(FontAwesome.fa_plus_circle, "", (a) -> MakeCredit(), getBundleString("EVT_CREDIT"));
        ButtonBase btn_e_debit      =ActionFactory.createButton(FontAwesome.fa_minus_circle, "", (a) -> MakeDebit(), getBundleString("EVT_DEBIT"));
        ButtonBase btn_e_urgent     =ActionFactory.createButton(FontAwesome.fa_times_circle, "", (a) -> MakeUrgent(), getBundleString("EVT_URGENT"));
        ButtonBase btn_e_close      =ActionFactory.createButton(FontAwesome.fa_briefcase, "", (a) -> MakeClose(), getBundleString("EVT_CLOSE"));
        ButtonBase btn_c_link       =ActionFactory.createButton(FontAwesome.fa_user_plus, "", (a) -> MakeForcedLink(), getBundleString("FORCE_LINK"));
        //
        btn_e_cancel.setDisable(!pv.isAction (POptions.Actions.SEND_MDE.id()));
        btn_e_activate.setDisable(!pv.isAction (POptions.Actions.SEND_MDE.id()));
        btn_e_credit.setDisable(!pv.isAction (POptions.Actions.SEND_MDE.id()));
        btn_e_debit.setDisable(!pv.isAction (POptions.Actions.SEND_MDE.id()));
        btn_e_urgent.setDisable(!pv.isAction (POptions.Actions.SEND_MDE.id()));
        btn_e_close.setDisable(!pv.isAction (POptions.Actions.SEND_MDE.id()));
        btn_c_link.setDisable(!pv.isAction (POptions.Actions.LINK_CUS.id()));
        //
        toolBar.getItems().addAll(
                 new Separator(Orientation.VERTICAL)
                ,btn_e_cancel
                ,btn_e_activate
                ,btn_e_credit
                ,btn_e_debit
                ,btn_e_urgent
                ,btn_e_close
                ,new Separator(Orientation.VERTICAL)
                ,btn_c_link
        );
    
        toolBarR.getItems().addAll(
                ActionFactory.createButton(FontAwesome.fa_paste, "", (a) -> MakeBlank(), getBundleString("QDG_BLANK"))
        );
    }
    
    private void MakeBlank(){
        Alert user_alert;
        Long bc=Long.parseLong(BLANK_COUNT.getText());
        if( bc!=null && bc>0L) {
            if(!MTB_MP_DEP_REQ_PERIOD.getConverter().toString(MTB_MP_DEP_REQ_PERIOD.getValue()).isEmpty()){
                user_alert = new Alert(Alert.AlertType.WARNING, null, btn_do, btn_cancel);
                user_alert.setTitle(getBundleString("TITLE_WARNING"));
                user_alert.setHeaderText(getBundleString("BLANK_WARN")
                        + " " + MTB_MP_DEP_REQ_PERIOD.getConverter().toString(MTB_MP_DEP_REQ_PERIOD.getValue())
                        +" / "+BLANK_COUNT.getText()+" "+getBundleString("BLANK_PCS")
                        +" "+MTB_MP_DEP_REQ_PERIOD.getValue()
                        );
                user_alert.showAndWait();
                //
                if (user_alert.getResult() != null) {
                    if (user_alert.getResult().getText().equalsIgnoreCase(getBundleString("BTN_DO"))) {
                        ParamMap pm = new ParamMap();
                        pm.put("pPERID", MTB_MP_DEP_REQ_PERIOD.getValue());
                        pm.put("pCount", bc);
                        pm.execParallel(this, "MakeBlank", this::onMakeBlank);  // exec with callback
                    }
                }
            }else{
                user_alert = new Alert(Alert.AlertType.ERROR, null, btn_ok);
                user_alert.setTitle(getBundleString("TITLE_ERROR"));
                user_alert.setHeaderText(getBundleString("BLANK_PERIOD"));
                user_alert.showAndWait();
            }
        }else{
            user_alert = new Alert(Alert.AlertType.ERROR, null, btn_ok);
            user_alert.setTitle(getBundleString("TITLE_ERROR"));
            user_alert.setHeaderText(getBundleString("BLANK_BAD_COUNT"));
            user_alert.showAndWait();
        }
    }
    private void onMakeBlank(ParamMap pm){
        Alert user_alert;
        String nRet=pm.getString("nRet");
        if(nRet==null||nRet.isEmpty()){
            user_alert = new Alert(Alert.AlertType.INFORMATION, null, btn_ok);
            user_alert.setTitle(getBundleString("TITLE_INFO"));
            user_alert.setHeaderText(getBundleString("BLANK_OK")+" "+pm.getLong("pSaved")+" "+getBundleString("BLANK_PCS"));
            user_alert.showAndWait();
        }else{
            user_alert = new Alert(Alert.AlertType.ERROR, null, btn_ok);
            user_alert.setTitle(getBundleString("TITLE_ERROR"));
            user_alert.setHeaderText(getBundleString("BLANK_ERROR")+"\n"+nRet);
            user_alert.showAndWait();
        }
    }
    
    private void MakeForcedLink(){
        if(dsMTB_MP_DEP_REQ.getCurrentRow().getIMDRSTATUS()==-5L){
            Alert user_alert = new Alert(Alert.AlertType.WARNING, null, btn_do, btn_cancel);
            user_alert.setTitle(getBundleString("TITLE_WARNING"));
            user_alert.setHeaderText(getBundleString("LINK_WARN"));
            user_alert.showAndWait();
            //
            if (user_alert.getResult() != null) {
                if (user_alert.getResult().getText().equalsIgnoreCase(getBundleString("BTN_DO"))) {
                    ParamMap pm = new ParamMap();
                    pm.put("pMDRID", dsMTB_MP_DEP_REQ.getCurrentRow().getIMDRID());
                    pm.execParallel(this, "MakeForcedLink", this::onMakeForcedLink);  // exec with callback
                }
            }
        }else{
            Alert user_alert = new Alert(Alert.AlertType.ERROR, null, btn_ok);
            user_alert.setTitle(getBundleString("TITLE_ERROR"));
            user_alert.setHeaderText(getBundleString("MDR_BAD_STATUS"));
            user_alert.showAndWait();
        }
    }
    private void onMakeForcedLink(ParamMap pm){
        doRefresh(MTB_MP_DEP_REQ);
    }
    
    private void MakeDocs(){
        ParamMap pm=new ParamMap();
        pm.put("pMDRID",        dsMTB_MP_DEP_REQ.getCurrentRow().getIMDRID());
        pm.execParallel(this, "MakeDocRequest",this::onMakeDocs);  // exec with callback
    }
    
    private void onMakeDocs(ParamMap pm){
        doRefresh(MTB_MP_DEP_EVENT);
    }
    
    private void MakeCancel(){
        if(    dsMTB_MP_DEP_REQ.getCurrentRow().getIQDGSTATUS()!=null
            && dsMTB_MP_DEP_REQ.getCurrentRow().getIQDGSTATUS()>=3
        ){
            Alert user_alert = new Alert(Alert.AlertType.ERROR, null, btn_ok);
            user_alert.setTitle(getBundleString("TITLE_ERROR"));
            user_alert.setHeaderText(getBundleString("QDG_BAD_STATUS"));
            user_alert.showAndWait();
        }else {
            Alert user_alert = new Alert(Alert.AlertType.WARNING, null, btn_do, btn_cancel);
            user_alert.setTitle(getBundleString("TITLE_WARNING"));
            user_alert.setHeaderText(getBundleString("EVT_CANCEL_WARN"));
            user_alert.showAndWait();
            //
            if (user_alert.getResult() != null) {
                if (user_alert.getResult().getText().equalsIgnoreCase(getBundleString("BTN_DO"))) {
                    ParamMap pm = new ParamMap();
                    pm.put("pMDRID", dsMTB_MP_DEP_REQ.getCurrentRow().getIMDRID());
                    pm.execParallel(this, "MakeEvtCancel", this::onMakeCancel);  // exec with callback
                }
            }
        }
    }
    
    private void onMakeCancel(ParamMap pm){
        doRefresh(MTB_MP_DEP_EVENT);
    }
    
    private void MakeActivation(){
        if(dsMTB_MP_DEP_REQ.getCurrentRow().getIQDGSTATUS()<3){
            Alert user_alert = new Alert(Alert.AlertType.ERROR, null, btn_ok);
            user_alert.setTitle(getBundleString("TITLE_ERROR"));
            user_alert.setHeaderText(getBundleString("QDG_BAD_STATUS"));
            user_alert.showAndWait();
        }else{
            Alert user_alert = new Alert(Alert.AlertType.WARNING, null, btn_do, btn_cancel);
            user_alert.setTitle(getBundleString("TITLE_WARNING"));
            user_alert.setHeaderText(getBundleString("EVT_ACTIVATION_WARN"));
            user_alert.showAndWait();
            //
            if (user_alert.getResult() != null) {
                if (user_alert.getResult().getText().equalsIgnoreCase(getBundleString("BTN_DO"))) {
                    ParamMap pm = new ParamMap();
                    pm.put("pMDRID", dsMTB_MP_DEP_REQ.getCurrentRow().getIMDRID());
                    pm.execParallel(this, "MakeEvtActivation", this::onMakeActivation);  // exec with callback
                }
            }
        }
    }
    private void onMakeActivation(ParamMap pm){
        doRefresh(MTB_MP_DEP_REQ);
        doRefresh(MTB_MP_DEP_EVENT);
    }
    
    private void MakeCredit(){
        Alert user_alert;
        if(dsMTB_MP_DEP_REQ.getCurrentRow().getIQDGSTATUS()<3){
            user_alert = new Alert(Alert.AlertType.ERROR, null, btn_ok);
            user_alert.setTitle(getBundleString("TITLE_ERROR"));
            user_alert.setHeaderText(getBundleString("QDG_BAD_STATUS"));
            user_alert.showAndWait();
        }else{
            user_alert = new Alert(Alert.AlertType.WARNING, null, btn_do, btn_cancel);
            user_alert.setTitle(getBundleString("TITLE_WARNING"));
            user_alert.setHeaderText(getBundleString("EVT_REPLENISH_WARN"));
            user_alert.showAndWait();
            //
            if (user_alert.getResult() != null) {
                if (user_alert.getResult().getText().equalsIgnoreCase(getBundleString("BTN_DO"))) {
                    if(dsMTB_MP_DEP_REQ_PAYMENT.isEmpty()
                            ||dsMTB_MP_DEP_REQ_PAYMENT.getCurrentRow().getIQEVIDENT()==null
                            ||dsMTB_MP_DEP_REQ_PAYMENT.getCurrentRow().getIQEVTYPE()!=1
                    ){
                        user_alert = new Alert(Alert.AlertType.ERROR, null, btn_ok);
                        user_alert.setTitle(getBundleString("TITLE_ERROR"));
                        user_alert.setHeaderText(getBundleString("PAY_BAD_ID"));
                        user_alert.showAndWait();
                    }else {
                        ParamMap pm = new ParamMap();
                        pm.put("pMDRID", dsMTB_MP_DEP_REQ_PAYMENT.getCurrentRow().getIMDRID());
                        pm.put("pQevId", dsMTB_MP_DEP_REQ_PAYMENT.getCurrentRow().getIQEVIDENT());
                        pm.execParallel(this, "MakeEvtReplenish", this::onMakeReplenish);  // exec with callback
                    }
                }
            }
        }
    }
    
    private void onMakeReplenish(ParamMap pm){
        doRefresh(MTB_MP_DEP_REQ);
        doRefresh(MTB_MP_DEP_EVENT);
    }
    
    private void MakeDebit(){
    
    }
    
    private void MakeUrgent(){
    
    }
    
    private void MakeClose(){
        Alert user_alert;
        if(dsMTB_MP_DEP_REQ.getCurrentRow().getIQDGSTATUS()<5){
            user_alert = new Alert(Alert.AlertType.ERROR, null, btn_ok);
            user_alert.setTitle(getBundleString("TITLE_ERROR"));
            user_alert.setHeaderText(getBundleString("QDG_BAD_STATUS"));
            user_alert.showAndWait();
        }else{
            user_alert = new Alert(Alert.AlertType.WARNING, null, btn_do, btn_cancel);
            user_alert.setTitle(getBundleString("TITLE_WARNING"));
            user_alert.setHeaderText(getBundleString("EVT_CLOSING_WARN"));
            user_alert.showAndWait();
            //
            if (user_alert.getResult() != null) {
                if (user_alert.getResult().getText().equalsIgnoreCase(getBundleString("BTN_DO"))) {
                    if(dsMTB_MP_DEP_REQ_PAYMENT.isEmpty()
                            ||dsMTB_MP_DEP_REQ_PAYMENT.getCurrentRow().getIQEVIDENT()==null
                            ||dsMTB_MP_DEP_REQ_PAYMENT.getCurrentRow().getIQEVTYPE()!=2
                    ){
                        user_alert = new Alert(Alert.AlertType.ERROR, null, btn_ok);
                        user_alert.setTitle(getBundleString("TITLE_ERROR"));
                        user_alert.setHeaderText(getBundleString("REP_BAD_ID"));
                        user_alert.showAndWait();
                    }else {
                        ParamMap pm = new ParamMap();
                        pm.put("pMDRID", dsMTB_MP_DEP_REQ_PAYMENT.getCurrentRow().getIMDRID());
                        pm.put("pQevId", dsMTB_MP_DEP_REQ_PAYMENT.getCurrentRow().getIQEVIDENT());
                        pm.execParallel(this, "MakeEvtClose", this::onMakeClose);  // exec with callback
                    }
                }
            }
        }
    }
    private void onMakeClose(ParamMap pm){
        doRefresh(MTB_MP_DEP_REQ);
        doRefresh(MTB_MP_DEP_EVENT);
    }
    
    private void Go_QDG(){
        ParamMap pm = new ParamMap ();
        pm.add("DogId",dsMTB_MP_DEP_REQ.getCurrentRow().getIQDGIDENT());
        PDogInfoMain.showViewDogInfo(getViewContext(),getTaskContext(),pm);
    }
    
    private void Go_QDG_LIST(){
        ParamMap pm = new ParamMap ();
        pm.add("ICUSNUM",dsMTB_MP_DEP_REQ.getCurrentRow().getICUSNUM());
        PvQdgMain.showViewvQdg(getViewContext(),getTaskContext(),pm);
    }
    
    private void Go_CusList()
    {
        if (dsMTB_MP_DEP_REQ.hasMarkedRows())
            JInvFXCus.cusList(getTaskContext(), getViewContext(), "ICUSNUM IN (SELECT X.imdrcusnum FROM mtb.mp_dep_req X, MRK_ID M WHERE M.IDMARKER = "+dsMTB_MP_DEP_REQ.getMarkerID().toString()+" AND M.IDROW = X.IMDRID)");
    }
    
    private void doPreTRN (PShowOperlist p) {
        if (dsMTB_MP_DEP_REQ_PAYMENT.isEmpty()||dsMTB_MP_DEP_REQ_PAYMENT.getCurrentRow().getIQEVTRNNUM()==null)
            throw new StopExecuteActionBiCompException();
        SQLExpression sql=new SQLExpression(
                "(itrnnum=:num and itrnanum=:anum)");
            sql.setParameter("num",dsMTB_MP_DEP_REQ_PAYMENT.getCurrentRow().getIQEVTRNNUM() );
            sql.setParameter("anum",dsMTB_MP_DEP_REQ_PAYMENT.getCurrentRow().getIQEVTRNANUM() );
        p.setWhere(sql);
    }
//
    private void ClobCellRenderer (JInvTableCell<?,?> cell, Object obj )
    {
        if ("(CLOB)".equals (obj) || "(BLOB)".equals (obj) || "(BFILE)".equals (obj)) {
            JInvButton btn = new JInvButton(obj.toString());
            btn.setOnAction(this::onActionLobButton);
            btn.setFocusTraversable(false);
            cell.setText(null);
            cell.setGraphic(btn);
        }else cell.setGraphic (null);
    }
    
    private void onActionLobButton ( ActionEvent ev )
    {
        String cellID=(((Node)ev.getSource()).getParent()).getId();
        ParamMap pm = new ParamMap ();
        if(cellID.equals("MDE_MESSAGEBODY")){
            pm.put("p1",dsMTB_MP_DEP_EVENT.getCurrentRow().getIMDEID());
            pm.put ("FileName", dsMTB_MP_DEP_EVENT.getCurrentRow().getCMDENAME());
            pm.execParallel (this, "GetEventClob", this::onClobCellView);
        }
    }
    
    private void onClobCellView ( ParamMap map )
    {
        PTableRecordClob p = map.getPojo (PTableRecordClob.class);
        new FXFormLauncher<> (getTaskContext (), getViewContext (), ViewClobDataController.class)
                .dataObject (p)
                .modal (true)
                .show ();
    }
    
    private void req_colorize (JInvTableCell<PMtbMpDepReq,String> cell, Object value ) {
        //
        if(cell.getTableRow().getIndex() % 2 == 0) {
            cell.setStyle("-fx-background-color: rgb(255,255,255); -fx-background-insets: 0 1 1 0; -fx-text-fill: black");
        }else{
            cell.setStyle("-fx-background-color: rgb(249,249,249); -fx-background-insets: 0 1 1 0; -fx-text-fill: black");
        }
        PMtbMpDepReq p = (PMtbMpDepReq) cell.getTableRow().getItem();
        //
        if (p != null){
            int r,g,b;
            String rgb;
            rgb=(null==p.getCCOLOR())?"255255255":(p.getCCOLOR().isEmpty())?"255255255":p.getCCOLOR();
            if (!rgb.equals("255255255")) {
                r = Integer.parseInt(rgb.substring(0, 3));
                g = Integer.parseInt(rgb.substring(3, 6));
                b = Integer.parseInt(rgb.substring(6, 9));
                cell.setStyle("-fx-background-color: rgb(" + r + "," + g + "," + b + "); -fx-background-insets: 0 1 1 0; -fx-text-fill: black");
            }
        }
    }
}

