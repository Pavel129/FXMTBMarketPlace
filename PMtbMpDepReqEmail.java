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
@since   2022/06/30 22:49:34
*/
@Entity (name="com.maritimebank.FXMTBMarketPlace.PMtbMpDepReqEmail")
@NamedNativeQuery (name="com.maritimebank.FXMTBMarketPlace.PMtbMpDepReqEmail", query="SELECT IMDRID,DECODE(EMAIL_TYPE,1,'Осн.',2,'Доп.') as EMAIL_TYPE,EMAIL_ADDR FROM mtb.mp_dep_req_email")
public class PMtbMpDepReqEmail implements Serializable
{
    private static final long serialVersionUID = 30_06_2022_22_49_36L;

    private Long IMDRID;
    private String EMAIL_TYPE;
    private String EMAIL_ADDR;

    public PMtbMpDepReqEmail(){}

    @Id 
    @Column(name="IMDRID",nullable = false,length = 0)
    public Long getIMDRID() {
        return IMDRID;
    }
    public void setIMDRID(Long val) {
        IMDRID = val; 
    }
    @Column(name="EMAIL_TYPE",length = 2)
    public String getEMAIL_TYPE() {
        return EMAIL_TYPE;
    }
    public void setEMAIL_TYPE(String val) {
        EMAIL_TYPE = val; 
    }
    @Column(name="EMAIL_ADDR",length = 100)
    public String getEMAIL_ADDR() {
        return EMAIL_ADDR;
    }
    public void setEMAIL_ADDR(String val) {
        EMAIL_ADDR = val; 
    }
}