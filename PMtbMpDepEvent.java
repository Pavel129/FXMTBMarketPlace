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
@since   2022/06/28 13:52:06
*/
@SuppressWarnings("ALL")
@Entity (name="com.maritimebank.FXMTBMarketPlace.PMTBMpDepEvent")
@NamedNativeQuery (name="com.maritimebank.FXMTBMarketPlace.PMTBMpDepEvent", query="SELECT	imdeid, imdrid, cmdeid, cmdetype, cmdename, imdestatus, tmdestamp, tmdemod, cmdecomment, '(CLOB)' as messagebody, cmdeuser FROM mtb.mp_dep_event_fx")
public class PMtbMpDepEvent implements Serializable
{
    private static final long serialVersionUID = 28_06_2022_13_52_06L;

    private Long IMDEID;
    private Long IMDRID;
    private String CMDEID;
    private String CMDETYPE;
    private String CMDENAME;
    private String IMDESTATUS;
    private Timestamp TMDESTAMP;
    private Timestamp TMDEMOD;
    private String CMDECOMMENT;
    private String MESSAGEBODY;
    private String CMDEUSER;

    public PMtbMpDepEvent(){}

    @Id 
    @Column(name="IMDEID",nullable = false,length = 0)
    public Long getIMDEID() {
        return IMDEID;
    }
    public void setIMDEID(Long val) {
        IMDEID = val; 
    }
    @Column(name="IMDRID",nullable = false,length = 0)
    public Long getIMDRID() {
        return IMDRID;
    }
    public void setIMDRID(Long val) {
        IMDRID = val; 
    }
    @Column(name="CMDEID",nullable = false,length = 36)
    public String getCMDEID() {
        return CMDEID;
    }
    public void setCMDEID(String val) {
        CMDEID = val; 
    }
    @Column(name="CMDETYPE",nullable = false,length = 50)
    public String getCMDETYPE() {
        return CMDETYPE;
    }
    public void setCMDETYPE(String val) {
        CMDETYPE = val; 
    }
    @Column(name="CMDENAME",nullable = false,length = 255)
    public String getCMDENAME() {
        return CMDENAME;
    }
    public void setCMDENAME(String val) {
        CMDENAME = val; 
    }
    @Column(name="IMDESTATUS",nullable = false,length = 1)
    public String getIMDESTATUS() {
        return IMDESTATUS;
    }
    public void setIMDESTATUS(String val) {
        IMDESTATUS = val; 
    }
    @Column(name="TMDESTAMP")
    public Timestamp getTMDESTAMP() {
        return TMDESTAMP;
    }
    public void setTMDESTAMP(Timestamp val) {
        TMDESTAMP = val; 
    }
    @Column(name="TMDEMOD")
    public Timestamp getTMDEMOD() {
        return TMDEMOD;
    }
    public void setTMDEMOD(Timestamp val) {
        TMDEMOD = val; 
    }
    @Column(name="CMDECOMMENT",length = 4000)
    public String getCMDECOMMENT() {
        return CMDECOMMENT;
    }
    public void setCMDECOMMENT(String val) {
        CMDECOMMENT = val; 
    }
    @Column(name="MESSAGEBODY")
    public String getMESSAGEBODY() {
        return MESSAGEBODY;
    }
    public void setMESSAGEBODY(String val) {
        MESSAGEBODY = val; 
    }
    @Column(name="CMDEUSER")
    public String getCMDEUSER() {
        return CMDEUSER;
    }
    public void setCMDEUSER(String val) {
        CMDEUSER = val;
    }
}