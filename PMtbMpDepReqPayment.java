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
@since   2022/07/20 13:00:37
*/
@Entity (name="com.maritimebank.FXMTBMarketPlace.PMtbMpDepReqPayment")
@NamedNativeQuery (name="com.maritimebank.FXMTBMarketPlace.PMtbMpDepReqPayment", query="SELECT IMDRID,CMDRAGRNUM,DPOTACTION_IN,IBNKPORTIONID_IN,MBNKSUM_IN,MQEVSUM,DQEVSYSDATE,IQEVTYPE,IQEVTRNNUM,IQEVTRNANUM,IBNKPORTIONID_OUT,MBNKSUM_OUT,DPOTACTION_OUT,IDVRTRNNUM,ITRNDOCNUM,DTRNDOC,CTRNPURP,IQEVIDENT FROM mtb.mp_dep_req_payment")
public class PMtbMpDepReqPayment implements Serializable
{
    private static final long serialVersionUID = 20_07_2022_13_00_38L;

    private Long IMDRID;
    private String CMDRAGRNUM;
    private LocalDateTime DPOTACTION_IN;
    private Long IBNKPORTIONID_IN;
    private BigDecimal MBNKSUM_IN;
    private BigDecimal MQEVSUM;
    private LocalDateTime DQEVSYSDATE;
    private Long IQEVTYPE;
    private Long IQEVTRNNUM;
    private Long IQEVTRNANUM;
    private Long IBNKPORTIONID_OUT;
    private BigDecimal MBNKSUM_OUT;
    private LocalDateTime DPOTACTION_OUT;
    private Long IDVRTRNNUM;
    private Long ITRNDOCNUM;
    private LocalDate DTRNDOC;
    private String CTRNPURP;
    private Long IQEVIDENT;
    
    public PMtbMpDepReqPayment(){}

    @Id 
    @Column(name="IMDRID",nullable = false,length = 0)
    public Long getIMDRID() {
        return IMDRID;
    }
    public void setIMDRID(Long val) {
        IMDRID = val; 
    }
    @Column(name="CMDRAGRNUM",length = 50)
    public String getCMDRAGRNUM() {
        return CMDRAGRNUM;
    }
    public void setCMDRAGRNUM(String val) {
        CMDRAGRNUM = val; 
    }
    @Column(name="DPOTACTION_IN")
    public LocalDateTime getDPOTACTION_IN() {
        return DPOTACTION_IN;
    }
    public void setDPOTACTION_IN(LocalDateTime val) {
        DPOTACTION_IN = val; 
    }
    @Column(name="IBNKPORTIONID_IN",length = 0)
    public Long getIBNKPORTIONID_IN() {
        return IBNKPORTIONID_IN;
    }
    public void setIBNKPORTIONID_IN(Long val) {
        IBNKPORTIONID_IN = val; 
    }
    @Column(name="MBNKSUM_IN",length = 0)
    public BigDecimal getMBNKSUM_IN() {
        return MBNKSUM_IN;
    }
    public void setMBNKSUM_IN(BigDecimal val) {
        MBNKSUM_IN = val; 
    }
    @Column(name="MQEVSUM",length = 16)
    public BigDecimal getMQEVSUM() {
        return MQEVSUM;
    }
    public void setMQEVSUM(BigDecimal val) {
        MQEVSUM = val; 
    }
    @Column(name="DQEVSYSDATE")
    public LocalDateTime getDQEVSYSDATE() {
        return DQEVSYSDATE;
    }
    public void setDQEVSYSDATE(LocalDateTime val) {
        DQEVSYSDATE = val; 
    }
    @Column(name="IQEVTYPE",length = 3)
    public Long getIQEVTYPE() {
        return IQEVTYPE;
    }
    public void setIQEVTYPE(Long val) {
        IQEVTYPE = val; 
    }
    @Column(name="IQEVTRNNUM",length = 12)
    public Long getIQEVTRNNUM() {
        return IQEVTRNNUM;
    }
    public void setIQEVTRNNUM(Long val) {
        IQEVTRNNUM = val; 
    }
    @Column(name="IQEVTRNANUM",length = 12)
    public Long getIQEVTRNANUM() {
        return IQEVTRNANUM;
    }
    public void setIQEVTRNANUM(Long val) {
        IQEVTRNANUM = val; 
    }
    @Column(name="IBNKPORTIONID_OUT",length = 0)
    public Long getIBNKPORTIONID_OUT() {
        return IBNKPORTIONID_OUT;
    }
    public void setIBNKPORTIONID_OUT(Long val) {
        IBNKPORTIONID_OUT = val; 
    }
    @Column(name="MBNKSUM_OUT",length = 0)
    public BigDecimal getMBNKSUM_OUT() {
        return MBNKSUM_OUT;
    }
    public void setMBNKSUM_OUT(BigDecimal val) {
        MBNKSUM_OUT = val; 
    }
    @Column(name="DPOTACTION_OUT")
    public LocalDateTime getDPOTACTION_OUT() {
        return DPOTACTION_OUT;
    }
    public void setDPOTACTION_OUT(LocalDateTime val) {
        DPOTACTION_OUT = val; 
    }
    @Column(name="IDVRTRNNUM",length = 12)
    public Long getIDVRTRNNUM() {
        return IDVRTRNNUM;
    }
    public void setIDVRTRNNUM(Long val) {
        IDVRTRNNUM = val; 
    }
    @Column(name="ITRNDOCNUM",length = 0)
    public Long getITRNDOCNUM() {
        return ITRNDOCNUM;
    }
    public void setITRNDOCNUM(Long val) {
        ITRNDOCNUM = val; 
    }
    @Column(name="DTRNDOC")
    public LocalDate getDTRNDOC() {
        return DTRNDOC;
    }
    public void setDTRNDOC(LocalDate val) {
        DTRNDOC = val; 
    }
    @Column(name="CTRNPURP",length = 1024)
    public String getCTRNPURP() {
        return CTRNPURP;
    }
    public void setCTRNPURP(String val) {
        CTRNPURP = val; 
    }
    @Column(name="IQEVIDENT",length = 12)
    public Long getIQEVIDENT() {
        return IQEVIDENT;
    }
    public void setIQEVIDENT(Long val) {
        IQEVIDENT = val;
    }
}