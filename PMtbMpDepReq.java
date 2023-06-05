package com.maritimebank.FXMTBMarketPlace;

import java.math.BigDecimal;
import java.sql.*;
import java.time.*;
import java.io.Serializable;
import javax.persistence.*;
import ru.inversion.dataset.mark.*;
import ru.inversion.db.entity.ProxyFor;

/**
@author  Grigorev
@since   2022/03/09 10:47:18
*/
@SuppressWarnings("ALL")
@Entity (name="com.maritimebank.FXMTBMarketPlace.PMtbMpDepReq")
@NamedNativeQuery (name="com.maritimebank.FXMTBMarketPlace.PMtbMpDepReq", query="SELECT IMDRID,DLOAD,CMDRAGRID,IMDRSTATUS,CABBCOM,ICUSNUM,CCUSNAME,PASSP_RES,INN_RESTR,CMDRERR,R_AMOUNT,R_RATE,CMDRAGRNUM,QDG_STATUS,CQDGACC,IQDGIDENT,IQDGSTATUS,IQDGCLI,BXML,CCOLOR FROM MTB.MP_DEP_REQ_FX MTB_MP_DEP_REQ")
public class PMtbMpDepReq extends IDMarkable implements Serializable
{
    private static final long serialVersionUID = 9_03_2022_10_47_22L;

    private Long IMDRID;
    private LocalDateTime DLOAD;
    private String CMDRAGRID;
    private Long IMDRSTATUS;
    private String CABBCOM;
    private Long ICUSNUM;
    private String CCUSNAME;
    private String PASSP_RES;
    private Long INN_RESTR;
    private String CMDRERR;
    private BigDecimal R_AMOUNT;
    private BigDecimal R_RATE;
    private String CMDRAGRNUM;
    private String QDG_STATUS;
    private String CQDGACC;
    //private LocalDateTime DPOTACTION;
    //private LocalDateTime DTRNTRAN;
    //private BigDecimal MTRNSUM;
    //private String CBNKORIGINALACCO;
    private Long IQDGIDENT;
    private Long IQDGSTATUS;
    //private Long ITRNNUM;
    //private Long ITRNANUM;
    private Long IQDGCLI;
    //private LocalDateTime OUT_DOC_DATE;
    //private Long OUT_DOC_NUM;
    //private String OUT_DOC_PURP;
    private String BXML;
    private String CCOLOR;
    
    public PMtbMpDepReq(){}

    @Id 
    @Column(name="IMDRID",nullable = false,length = 0)
    public Long getIMDRID() {
        return IMDRID;
    }
    public void setIMDRID(Long val) {
        IMDRID = val; 
    }
    @Column(name="DLOAD")
    public LocalDateTime getDLOAD() {
        return DLOAD;
    }
    public void setDLOAD(LocalDateTime val) {
        DLOAD = val; 
    }
    @Column(name="CMDRAGRID",length = 64)
    public String getCMDRAGRID() {
        return CMDRAGRID;
    }
    public void setCMDRAGRID(String val) {
        CMDRAGRID = val; 
    }
    @Column(name="IMDRSTATUS",length = 0)
    public Long getIMDRSTATUS() {
        return IMDRSTATUS;
    }
    public void setIMDRSTATUS(Long val) {
        IMDRSTATUS = val; 
    }
    @Column(name="CABBCOM",length = 1000)
    public String getCABBCOM() {
        return CABBCOM;
    }
    public void setCABBCOM(String val) {
        CABBCOM = val; 
    }
    @Column(name="ICUSNUM",length = 12)
    public Long getICUSNUM() {
        return ICUSNUM;
    }
    public void setICUSNUM(Long val) {
        ICUSNUM = val; 
    }
    @Column(name="CCUSNAME",length = 500)
    public String getCCUSNAME() {
        return CCUSNAME;
    }
    public void setCCUSNAME(String val) {
        CCUSNAME = val; 
    }
    @Column(name="PASSP_RES",length = 255)
    public String getPASSP_RES() {
        return PASSP_RES;
    }
    public void setPASSP_RES(String val) {
        PASSP_RES = val; 
    }
    @Column(name="INN_RESTR",length = 0)
    public Long getINN_RESTR() {
        return INN_RESTR;
    }
    public void setINN_RESTR(Long val) {
        INN_RESTR = val; 
    }
    @Column(name="CMDRERR",length = 2000)
    public String getCMDRERR() {
        return CMDRERR;
    }
    public void setCMDRERR(String val) {
        CMDRERR = val; 
    }
    @Column(name="R_AMOUNT",length = 0)
    public BigDecimal getR_AMOUNT() {
        return R_AMOUNT;
    }
    public void setR_AMOUNT(BigDecimal val) {
        R_AMOUNT = val; 
    }
    @Column(name="R_RATE",length = 0)
    public BigDecimal getR_RATE() {
        return R_RATE;
    }
    public void setR_RATE(BigDecimal val) {
        R_RATE = val; 
    }
    @Column(name="CMDRAGRNUM",length = 50)
    public String getCMDRAGRNUM() {
        return CMDRAGRNUM;
    }
    public void setCMDRAGRNUM(String val) {
        CMDRAGRNUM = val; 
    }
    @Column(name="QDG_STATUS",length = 8)
    public String getQDG_STATUS() {
        return QDG_STATUS;
    }
    public void setQDG_STATUS(String val) {
        QDG_STATUS = val; 
    }
    @Column(name="CQDGACC",length = 25)
    public String getCQDGACC() {
        return CQDGACC;
    }
    public void setCQDGACC(String val) {
        CQDGACC = val; 
    }
    /*@Column(name="DPOTACTION")
    public LocalDateTime getDPOTACTION() {
        return DPOTACTION;
    }
    public void setDPOTACTION(LocalDateTime val) {
        DPOTACTION = val; 
    }
    @Column(name="DTRNTRAN")
    public LocalDateTime getDTRNTRAN() {
        return DTRNTRAN;
    }
    public void setDTRNTRAN(LocalDateTime val) {
        DTRNTRAN = val; 
    }
    @Column(name="MTRNSUM",length = 16)
    public BigDecimal getMTRNSUM() {
        return MTRNSUM;
    }
    public void setMTRNSUM(BigDecimal val) {
        MTRNSUM = val; 
    }
    @Column(name="CBNKORIGINALACCO",length = 35)
    public String getCBNKORIGINALACCO() {
        return CBNKORIGINALACCO;
    }
    public void setCBNKORIGINALACCO(String val) {
        CBNKORIGINALACCO = val; 
    }*/
    @Column(name="IQDGIDENT",nullable = false,length = 10)
    public Long getIQDGIDENT() {
        return IQDGIDENT;
    }
    public void setIQDGIDENT(Long val) {
        IQDGIDENT = val; 
    }
    @Column(name="IQDGSTATUS",nullable = false,length = 2)
    public Long getIQDGSTATUS() {
        return IQDGSTATUS;
    }
    public void setIQDGSTATUS(Long val) {
        IQDGSTATUS = val; 
    }
    /*@Column(name="ITRNNUM",length = 12)
    public Long getITRNNUM() {
        return ITRNNUM;
    }
    public void setITRNNUM(Long val) {
        ITRNNUM = val; 
    }
    @Column(name="ITRNANUM",length = 12)
    public Long getITRNANUM() {
        return ITRNANUM;
    }
    public void setITRNANUM(Long val) {
        ITRNANUM = val; 
    }*/
    @Column(name="IQDGCLI",length = 12)
    public Long getIQDGCLI() {
        return IQDGCLI;
    }
    public void setIQDGCLI(Long val) {
        IQDGCLI = val; 
    }
    
    /*@Column(name="OUT_DOC_DATE")
    public LocalDateTime getOUT_DOC_DATE() {
        return OUT_DOC_DATE;
    }
    public void setOUT_DOC_DATE(LocalDateTime val) {
        OUT_DOC_DATE = val;
    }
    @Column(name="OUT_DOC_NUM",length = 9)
    public Long getOUT_DOC_NUM() {
        return OUT_DOC_NUM;
    }
    public void setOUT_DOC_NUM(Long val) {
        OUT_DOC_NUM = val;
    }
    @Column(name="OUT_DOC_PURP",length = 210)
    public String getOUT_DOC_PURP() {
        return OUT_DOC_PURP;
    }
    public void setOUT_DOC_PURP(String val) {
        OUT_DOC_PURP = val;
    }*/
    @Column(name="BXML")
    public String getBXML() {
        return BXML;
    }
    public void setBXML(String val) {
        BXML = val;
    }
    
    @Column(name="CCOLOR")
    public String getCCOLOR() {
        return CCOLOR;
    }
    public void setCCOLOR(String val) {
        CCOLOR = val;
    }
    
    @Transient
    @Override
    public Long getMarkLongID() {
        return getIMDRID();
    }
    @Override
    public boolean isMark() {
        return super.isMark();
    }
}