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
@since   2022/06/30 11:38:08
*/
@SuppressWarnings("ALL")
@Entity (name="com.maritimebank.FXMtbMarketPlace.PMtbMpDepCheck")
@NamedNativeQuery (name="com.maritimebank.FXMtbMarketPlace.PMtbMpDepCheck", query="SELECT IMDRID,NCODE,CDESCRIPTION,NREASONCODE,CREASONDESCRIPTION,DNONVALIDSINCE,ID,NNUMBER,DDATE,CCODENO,CBIK,DDATEOFRECEIVEINFEDERALDB FROM mtb.mp_dep_check")
//@Table (name="MTB.MTB_MP_DEP_CHECK")
public class PMtbMpDepCheck implements Serializable
{
    private static final long serialVersionUID = 30_06_2022_11_38_08L;

    private Long IMDRID;
    private Long NCODE;
    private String CDESCRIPTION;
    private Long NREASONCODE;
    private String CREASONDESCRIPTION;
    private LocalDate DNONVALIDSINCE;
    private Long ID;
    private String NNUMBER;
    private LocalDate DDATE;
    private String CCODENO;
    private String CBIK;
    private LocalDateTime DDATEOFRECEIVEINFEDERALDB;


    public PMtbMpDepCheck(){}

    @Id 
    @Column(name="IMDRID",nullable = false,length = 0)
    public Long getIMDRID() {
        return IMDRID;
    }
    public void setIMDRID(Long val) {
        IMDRID = val; 
    }
    @Column(name="NCODE",length = 0)
    public Long getNCODE() {
        return NCODE;
    }
    public void setNCODE(Long val) {
        NCODE = val; 
    }
    @Column(name="CDESCRIPTION",length = 255)
    public String getCDESCRIPTION() {
        return CDESCRIPTION;
    }
    public void setCDESCRIPTION(String val) {
        CDESCRIPTION = val; 
    }
    @Column(name="NREASONCODE",length = 0)
    public Long getNREASONCODE() {
        return NREASONCODE;
    }
    public void setNREASONCODE(Long val) {
        NREASONCODE = val; 
    }
    @Column(name="CREASONDESCRIPTION",length = 255)
    public String getCREASONDESCRIPTION() {
        return CREASONDESCRIPTION;
    }
    public void setCREASONDESCRIPTION(String val) {
        CREASONDESCRIPTION = val; 
    }
    @Column(name="DNONVALIDSINCE")
    public LocalDate getDNONVALIDSINCE() {
        return DNONVALIDSINCE;
    }
    public void setDNONVALIDSINCE(LocalDate val) {
        DNONVALIDSINCE = val; 
    }
    @Id
    @Column(name="ID",length = 0)
    public Long getID() {
        return ID;
    }
    public void setID(Long val) {
        ID = val; 
    }
    @Column(name="NNUMBER",length = 255)
    public String getNNUMBER() {
        return NNUMBER;
    }
    public void setNNUMBER(String val) {
        NNUMBER = val; 
    }
    @Column(name="DDATE")
    public LocalDate getDDATE() {
        return DDATE;
    }
    public void setDDATE(LocalDate val) {
        DDATE = val; 
    }
    @Column(name="CCODENO",length = 4)
    public String getCCODENO() {
        return CCODENO;
    }
    public void setCCODENO(String val) {
        CCODENO = val; 
    }
    @Column(name="CBIK",length = 11)
    public String getCBIK() {
        return CBIK;
    }
    public void setCBIK(String val) {
        CBIK = val; 
    }
    @Column(name="DDATEOFRECEIVEINFEDERALDB")
    public LocalDateTime getDDATEOFRECEIVEINFEDERALDB() {
        return DDATEOFRECEIVEINFEDERALDB;
    }
    public void setDDATEOFRECEIVEINFEDERALDB(LocalDateTime val) {
        DDATEOFRECEIVEINFEDERALDB = val; 
    }
    
}