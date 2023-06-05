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
@since   2022/07/26 19:42:45
*/
@Entity (name="com.maritimebank.FXMTBMarketPlace.PMtbMpDepReqPeriod")
@NamedNativeQuery (name="com.maritimebank.FXMTBMarketPlace.PMtbMpDepReqPeriod", query="SELECT IPERID,CPERNAME,CPRODNAME,CDESCR,IPERDAY FROM mtb.mp_dep_req_period")
public class PMtbMpDepReqPeriod implements Serializable
{
    private static final long serialVersionUID = 26_07_2022_19_42_46L;

    private String IPERID;
    private String CPERNAME;
    private String CPRODNAME;
    private String CDESCR;
    private Long IPERDAY;

    public PMtbMpDepReqPeriod(){}

    @Id 
    @Column(name="IPERID",nullable = false,length = 0)
    public String getIPERID() {
        return IPERID;
    }
    public void setIPERID(String val) {
        IPERID = val; 
    }
    @Column(name="CPERNAME",nullable = false,length = 30)
    public String getCPERNAME() {
        return CPERNAME;
    }
    public void setCPERNAME(String val) {
        CPERNAME = val; 
    }
    @Column(name="CPRODNAME",length = 70)
    public String getCPRODNAME() {
        return CPRODNAME;
    }
    public void setCPRODNAME(String val) {
        CPRODNAME = val; 
    }
    @Column(name="CDESCR",length = 101)
    public String getCDESCR() {
        return CDESCR;
    }
    public void setCDESCR(String val) {
        CDESCR = val; 
    }
    @Column(name="IPERDAY",length = 101)
    public Long getIPERDAY() {
        return IPERDAY;
    }
    public void setIPERDAY(Long val) {
        IPERDAY = val;
    }
}