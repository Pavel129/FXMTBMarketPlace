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
@since   2022/06/30 22:28:39
*/
@SuppressWarnings("ALL")
@Entity (name="com.maritimebank.FXMtbMarketPlace.PMtbMpDepReqDoc")
@NamedNativeQuery (name="com.maritimebank.FXMtbMarketPlace.PMtbMpDepReqDoc", query="SELECT IMDRID,DOC_TYPE,DOC_SER,DOC_NUM,ISSUEDATE,ISSUEAUTHORITYCODE,ISSUEAUTHORITYNAME FROM mtb.mp_dep_req_doc")
public class PMtbMpDepReqDoc implements Serializable
{
    private static final long serialVersionUID = 30_06_2022_22_28_41L;

    private Long IMDRID;
    private Long DOC_TYPE;
    private String DOC_SER;
    private String DOC_NUM;
    private LocalDate ISSUEDATE;
    private String ISSUEAUTHORITYCODE;
    private String ISSUEAUTHORITYNAME;

    public PMtbMpDepReqDoc(){}

    @Id 
    @Column(name="IMDRID",nullable = false,length = 0)
    public Long getIMDRID() {
        return IMDRID;
    }
    public void setIMDRID(Long val) {
        IMDRID = val; 
    }
    @Column(name="DOC_TYPE",length = 2)
    public Long getDOC_TYPE() {
        return DOC_TYPE;
    }
    public void setDOC_TYPE(Long val) {
        DOC_TYPE = val; 
    }
    @Column(name="DOC_SER",length = 50)
    public String getDOC_SER() {
        return DOC_SER;
    }
    public void setDOC_SER(String val) {
        DOC_SER = val; 
    }
    @Column(name="DOC_NUM",length = 50)
    public String getDOC_NUM() {
        return DOC_NUM;
    }
    public void setDOC_NUM(String val) {
        DOC_NUM = val; 
    }
    @Column(name="ISSUEDATE")
    public LocalDate getISSUEDATE() {
        return ISSUEDATE;
    }
    public void setISSUEDATE(LocalDate val) {
        ISSUEDATE = val; 
    }
    @Column(name="ISSUEAUTHORITYCODE",length = 30)
    public String getISSUEAUTHORITYCODE() {
        return ISSUEAUTHORITYCODE;
    }
    public void setISSUEAUTHORITYCODE(String val) {
        ISSUEAUTHORITYCODE = val; 
    }
    @Column(name="ISSUEAUTHORITYNAME",length = 255)
    public String getISSUEAUTHORITYNAME() {
        return ISSUEAUTHORITYNAME;
    }
    public void setISSUEAUTHORITYNAME(String val) {
        ISSUEAUTHORITYNAME = val; 
    }
}