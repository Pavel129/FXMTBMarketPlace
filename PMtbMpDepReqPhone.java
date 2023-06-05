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
@since   2022/06/30 22:40:03
*/
@Entity (name="com.maritimebank.FXMTBMarketPlace.PMtbMpDepReqPhone")
@NamedNativeQuery (name="com.maritimebank.FXMTBMarketPlace.PMtbMpDepReqPhone", query="SELECT IMDRID,DECODE(PHONE_TYPE,1,'Мобильный',2,'Домашний',3,'Рабочий') as PHONE_TYPE,PHONE_NUM,PHONE_DATE FROM mtb.mp_dep_req_phone")
public class PMtbMpDepReqPhone implements Serializable
{
    private static final long serialVersionUID = 30_06_2022_22_40_04L;

    private Long IMDRID;
    private String PHONE_TYPE;
    private String PHONE_NUM;
    private LocalDate PHONE_DATE;

    public PMtbMpDepReqPhone(){}

    @Id 
    @Column(name="IMDRID",nullable = false,length = 0)
    public Long getIMDRID() {
        return IMDRID;
    }
    public void setIMDRID(Long val) {
        IMDRID = val; 
    }
    @Column(name="PHONE_TYPE",length = 2)
    public String getPHONE_TYPE() {
        return PHONE_TYPE;
    }
    public void setPHONE_TYPE(String val) {
        PHONE_TYPE = val; 
    }
    @Column(name="PHONE_NUM",length = 50)
    public String getPHONE_NUM() {
        return PHONE_NUM;
    }
    public void setPHONE_NUM(String val) {
        PHONE_NUM = val; 
    }
    @Column(name="PHONE_DATE")
    public LocalDate getPHONE_DATE() {
        return PHONE_DATE;
    }
    public void setPHONE_DATE(LocalDate val) {
        PHONE_DATE = val; 
    }
}