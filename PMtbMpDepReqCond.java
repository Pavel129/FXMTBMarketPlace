package com.maritimebank.FXMTBMarketPlace;

import java.math.BigDecimal;
import java.sql.*;
import java.time.*;
import java.io.Serializable;
import javax.persistence.*;

import org.apache.poi.hpsf.Decimal;
import ru.inversion.dataset.mark.*;
import ru.inversion.db.entity.ProxyFor;

/**
@author  Grigorev
@since   2022/07/05 11:33:43
*/
@Entity (name="com.maritimebank.FXMTBMarketPlace.PMtbMpDepReqCond")
@NamedNativeQuery (name="com.maritimebank.FXMTBMarketPlace.PMtbMpDepReqCond", query="SELECT IMDRID,DURATION_C,WD_MTM_C,IR_METHOD_C,IR_PERIOD_C,PROD_ID,AMOUNT,DURATION_T,DURATION_V,WD_MTM,WD_ACCNUM,WD_ACCBIC,IR_METHOD,IR_PERIOD,IP_ACCNUM,IP_ACCBIC,ANNUALRATE,AGRTEXT FROM mtb.mp_dep_req_cond")
public class PMtbMpDepReqCond implements Serializable
{
    private static final long serialVersionUID = 5_07_2022_11_33_44L;

    private Long IMDRID;
    private String DURATION_C;
    private String WD_MTM_C;
    private String IR_METHOD_C;
    private String IR_PERIOD_C;
    private String PROD_ID;
    private BigDecimal AMOUNT;
    private Long DURATION_T;
    private Long DURATION_V;
    private Long WD_MTM;
    private String WD_ACCNUM;
    private String WD_ACCBIC;
    private Long IR_METHOD;
    private Long IR_PERIOD;
    private String IP_ACCNUM;
    private String IP_ACCBIC;
    private BigDecimal ANNUALRATE;
    private Clob AGRTEXT;

    public PMtbMpDepReqCond(){}

    @Id 
    @Column(name="IMDRID",nullable = false,length = 0)
    public Long getIMDRID() {
        return IMDRID;
    }
    public void setIMDRID(Long val) {
        IMDRID = val; 
    }
    @Column(name="DURATION_C",length = 10)
    public String getDURATION_C() {
        return DURATION_C;
    }
    public void setDURATION_C(String val) {
        DURATION_C = val; 
    }
    @Column(name="WD_MTM_C",length = 30)
    public String getWD_MTM_C() {
        return WD_MTM_C;
    }
    public void setWD_MTM_C(String val) {
        WD_MTM_C = val;
    }
    @Column(name="IR_METHOD_C",length = 30)
    public String getIR_METHOD_C() {
        return IR_METHOD_C;
    }
    public void setIR_METHOD_C(String val) {
        IR_METHOD_C = val; 
    }
    @Column(name="IR_PERIOD_C",length = 15)
    public String getIR_PERIOD_C() {
        return IR_PERIOD_C;
    }
    public void setIR_PERIOD_C(String val) {
        IR_PERIOD_C = val; 
    }
    @Column(name="PROD_ID",length = 30)
    public String getPROD_ID() {
        return PROD_ID;
    }
    public void setPROD_ID(String val) {
        PROD_ID = val; 
    }
    @Column(name="AMOUNT",length = 0)
    public BigDecimal getAMOUNT() {
        return AMOUNT;
    }
    public void setAMOUNT(BigDecimal val) {
        AMOUNT = val;
    }
    @Column(name="DURATION_T",length = 0)
    public Long getDURATION_T() {
        return DURATION_T;
    }
    public void setDURATION_T(Long val) {
        DURATION_T = val; 
    }
    @Column(name="DURATION_V",length = 0)
    public Long getDURATION_V() {
        return DURATION_V;
    }
    public void setDURATION_V(Long val) {
        DURATION_V = val; 
    }
    @Column(name="WD_MTM",length = 0)
    public Long getWD_MTM() {
        return WD_MTM;
    }
    public void setWD_MTM(Long val) {
        WD_MTM = val; 
    }
    @Column(name="WD_ACCNUM",length = 35)
    public String getWD_ACCNUM() {
        return WD_ACCNUM;
    }
    public void setWD_ACCNUM(String val) {
        WD_ACCNUM = val; 
    }
    @Column(name="WD_ACCBIC",length = 11)
    public String getWD_ACCBIC() {
        return WD_ACCBIC;
    }
    public void setWD_ACCBIC(String val) {
        WD_ACCBIC = val; 
    }
    @Column(name="IR_METHOD",length = 0)
    public Long getIR_METHOD() {
        return IR_METHOD;
    }
    public void setIR_METHOD(Long val) {
        IR_METHOD = val; 
    }
    @Column(name="IR_PERIOD",length = 0)
    public Long getIR_PERIOD() {
        return IR_PERIOD;
    }
    public void setIR_PERIOD(Long val) {
        IR_PERIOD = val; 
    }
    @Column(name="IP_ACCNUM",length = 35)
    public String getIP_ACCNUM() {
        return IP_ACCNUM;
    }
    public void setIP_ACCNUM(String val) {
        IP_ACCNUM = val; 
    }
    @Column(name="IP_ACCBIC",length = 11)
    public String getIP_ACCBIC() {
        return IP_ACCBIC;
    }
    public void setIP_ACCBIC(String val) {
        IP_ACCBIC = val; 
    }
    @Column(name="ANNUALRATE",length = 0)
    public BigDecimal getANNUALRATE() {
        return ANNUALRATE;
    }
    public void setANNUALRATE(BigDecimal val) {
        ANNUALRATE = val; 
    }
    @Column(name="AGRTEXT")
    public Clob getAGRTEXT() {
        return AGRTEXT;
    }
    public void setAGRTEXT(Clob val) {
        AGRTEXT = val; 
    }
}