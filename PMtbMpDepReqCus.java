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
@since   2022/06/30 19:50:51
*/
@SuppressWarnings("ALL")
@Entity (name="com.maritimebank.FXMtbMarketPlace.PMtbMpDepReqCus")
@NamedNativeQuery (name="com.maritimebank.FXMtbMarketPlace.PMtbMpDepReqCus", query="SELECT IMDRID,ID,FIRSTNAME,LASTNAME,MIDDLENAME,DECODE(GENDER,1,'Муж.','Жен.')GENDER,BIRTHDATE,BIRTHPLACE,CITIZENSHIP,INN,SNILS,REG_POSTCODE,REG_FULLADDRESS,REG_COUNTRYID,REG_REGION,REG_CITY,REG_DISTRICT,REG_AREA,REG_SETTLEMENT,REG_STREET,REG_FIASCODE,REG_BUILDING,REG_FRAME,REG_HOUSE,REG_FLAT,RES_POSTCODE,RES_FULLADDRESS,RES_COUNTRYID,RES_REGION,RES_CITY,RES_DISTRICT,RES_AREA,RES_SETTLEMENT,RES_STREET,RES_FIASCODE,RES_BUILDING,RES_FRAME,RES_HOUSE,RES_FLAT,DECODE(IDEN_TYPE,1,'ЕБС',2,'Курьер',3,'Офис')IDEN_TYPE,IDEN_DATE,FA_OWNWILLACTION,FA_NOONECONTROLSACTIONS,FA_ONLYRUSSIANTAXPAYER,FA_NOTUSABIRTHPLACE,FA_NOTUSATAXPAYER,FA_NOUSAGREENCARD,DECODE(FA_CRSSTATUS,'UNACCOUNTABLE','Неподотчетный','ACCOUNTABLE','Подотчетный')FA_CRSSTATUS FROM mtb.mp_dep_req_cus")
public class PMtbMpDepReqCus implements Serializable
{
    private static final long serialVersionUID = 30_06_2022_19_50_56L;

    private Long IMDRID;
    private String ID;
    private String FIRSTNAME;
    private String LASTNAME;
    private String MIDDLENAME;
    private String GENDER;
    private LocalDate BIRTHDATE;
    private String BIRTHPLACE;
    private String CITIZENSHIP;
    private String INN;
    private String SNILS;
    private String REG_POSTCODE;
    private String REG_FULLADDRESS;
    private String REG_COUNTRYID;
    private String REG_REGION;
    private String REG_CITY;
    private String REG_DISTRICT;
    private String REG_AREA;
    private String REG_SETTLEMENT;
    private String REG_STREET;
    private String REG_FIASCODE;
    private String REG_BUILDING;
    private String REG_FRAME;
    private String REG_HOUSE;
    private String REG_FLAT;
    private String RES_POSTCODE;
    private String RES_FULLADDRESS;
    private String RES_COUNTRYID;
    private String RES_REGION;
    private String RES_CITY;
    private String RES_DISTRICT;
    private String RES_AREA;
    private String RES_SETTLEMENT;
    private String RES_STREET;
    private String RES_FIASCODE;
    private String RES_BUILDING;
    private String RES_FRAME;
    private String RES_HOUSE;
    private String RES_FLAT;
    private String IDEN_TYPE;
    private LocalDate IDEN_DATE;
    private String FA_OWNWILLACTION;
    private String FA_NOONECONTROLSACTIONS;
    private String FA_ONLYRUSSIANTAXPAYER;
    private String FA_NOTUSABIRTHPLACE;
    private String FA_NOTUSATAXPAYER;
    private String FA_NOUSAGREENCARD;
    private String FA_CRSSTATUS;

    public PMtbMpDepReqCus(){}

    @Id 
    @Column(name="IMDRID",nullable = false,length = 0)
    public Long getIMDRID() {
        return IMDRID;
    }
    public void setIMDRID(Long val) {
        IMDRID = val; 
    }
    @Column(name="ID",length = 36)
    public String getID() {
        return ID;
    }
    public void setID(String val) {
        ID = val; 
    }
    @Column(name="FIRSTNAME",length = 50)
    public String getFIRSTNAME() {
        return FIRSTNAME;
    }
    public void setFIRSTNAME(String val) {
        FIRSTNAME = val; 
    }
    @Column(name="LASTNAME",length = 50)
    public String getLASTNAME() {
        return LASTNAME;
    }
    public void setLASTNAME(String val) {
        LASTNAME = val; 
    }
    @Column(name="MIDDLENAME",length = 50)
    public String getMIDDLENAME() {
        return MIDDLENAME;
    }
    public void setMIDDLENAME(String val) {
        MIDDLENAME = val; 
    }
    @Column(name="GENDER",length = 1)
    public String getGENDER() {
        return GENDER;
    }
    public void setGENDER(String val) {
        GENDER = val; 
    }
    @Column(name="BIRTHDATE")
    public LocalDate getBIRTHDATE() {
        return BIRTHDATE;
    }
    public void setBIRTHDATE(LocalDate val) {
        BIRTHDATE = val; 
    }
    @Column(name="BIRTHPLACE",length = 255)
    public String getBIRTHPLACE() {
        return BIRTHPLACE;
    }
    public void setBIRTHPLACE(String val) {
        BIRTHPLACE = val; 
    }
    @Column(name="CITIZENSHIP",length = 3)
    public String getCITIZENSHIP() {
        return CITIZENSHIP;
    }
    public void setCITIZENSHIP(String val) {
        CITIZENSHIP = val; 
    }
    @Column(name="INN",length = 12)
    public String getINN() {
        return INN;
    }
    public void setINN(String val) {
        INN = val; 
    }
    @Column(name="SNILS",length = 14)
    public String getSNILS() {
        return SNILS;
    }
    public void setSNILS(String val) {
        SNILS = val; 
    }
    @Column(name="REG_POSTCODE",length = 6)
    public String getREG_POSTCODE() {
        return REG_POSTCODE;
    }
    public void setREG_POSTCODE(String val) {
        REG_POSTCODE = val; 
    }
    @Column(name="REG_FULLADDRESS",length = 255)
    public String getREG_FULLADDRESS() {
        return REG_FULLADDRESS;
    }
    public void setREG_FULLADDRESS(String val) {
        REG_FULLADDRESS = val; 
    }
    @Column(name="REG_COUNTRYID",length = 3)
    public String getREG_COUNTRYID() {
        return REG_COUNTRYID;
    }
    public void setREG_COUNTRYID(String val) {
        REG_COUNTRYID = val; 
    }
    @Column(name="REG_REGION",length = 100)
    public String getREG_REGION() {
        return REG_REGION;
    }
    public void setREG_REGION(String val) {
        REG_REGION = val; 
    }
    @Column(name="REG_CITY",length = 100)
    public String getREG_CITY() {
        return REG_CITY;
    }
    public void setREG_CITY(String val) {
        REG_CITY = val; 
    }
    @Column(name="REG_DISTRICT",length = 100)
    public String getREG_DISTRICT() {
        return REG_DISTRICT;
    }
    public void setREG_DISTRICT(String val) {
        REG_DISTRICT = val; 
    }
    @Column(name="REG_AREA",length = 100)
    public String getREG_AREA() {
        return REG_AREA;
    }
    public void setREG_AREA(String val) {
        REG_AREA = val; 
    }
    @Column(name="REG_SETTLEMENT",length = 100)
    public String getREG_SETTLEMENT() {
        return REG_SETTLEMENT;
    }
    public void setREG_SETTLEMENT(String val) {
        REG_SETTLEMENT = val; 
    }
    @Column(name="REG_STREET",length = 100)
    public String getREG_STREET() {
        return REG_STREET;
    }
    public void setREG_STREET(String val) {
        REG_STREET = val; 
    }
    @Column(name="REG_FIASCODE",length = 36)
    public String getREG_FIASCODE() {
        return REG_FIASCODE;
    }
    public void setREG_FIASCODE(String val) {
        REG_FIASCODE = val; 
    }
    @Column(name="REG_BUILDING",length = 50)
    public String getREG_BUILDING() {
        return REG_BUILDING;
    }
    public void setREG_BUILDING(String val) {
        REG_BUILDING = val; 
    }
    @Column(name="REG_FRAME",length = 50)
    public String getREG_FRAME() {
        return REG_FRAME;
    }
    public void setREG_FRAME(String val) {
        REG_FRAME = val; 
    }
    @Column(name="REG_HOUSE",length = 50)
    public String getREG_HOUSE() {
        return REG_HOUSE;
    }
    public void setREG_HOUSE(String val) {
        REG_HOUSE = val; 
    }
    @Column(name="REG_FLAT",length = 50)
    public String getREG_FLAT() {
        return REG_FLAT;
    }
    public void setREG_FLAT(String val) {
        REG_FLAT = val; 
    }
    @Column(name="RES_POSTCODE",length = 6)
    public String getRES_POSTCODE() {
        return RES_POSTCODE;
    }
    public void setRES_POSTCODE(String val) {
        RES_POSTCODE = val; 
    }
    @Column(name="RES_FULLADDRESS",length = 255)
    public String getRES_FULLADDRESS() {
        return RES_FULLADDRESS;
    }
    public void setRES_FULLADDRESS(String val) {
        RES_FULLADDRESS = val; 
    }
    @Column(name="RES_COUNTRYID",length = 3)
    public String getRES_COUNTRYID() {
        return RES_COUNTRYID;
    }
    public void setRES_COUNTRYID(String val) {
        RES_COUNTRYID = val; 
    }
    @Column(name="RES_REGION",length = 100)
    public String getRES_REGION() {
        return RES_REGION;
    }
    public void setRES_REGION(String val) {
        RES_REGION = val; 
    }
    @Column(name="RES_CITY",length = 100)
    public String getRES_CITY() {
        return RES_CITY;
    }
    public void setRES_CITY(String val) {
        RES_CITY = val; 
    }
    @Column(name="RES_DISTRICT",length = 100)
    public String getRES_DISTRICT() {
        return RES_DISTRICT;
    }
    public void setRES_DISTRICT(String val) {
        RES_DISTRICT = val; 
    }
    @Column(name="RES_AREA",length = 100)
    public String getRES_AREA() {
        return RES_AREA;
    }
    public void setRES_AREA(String val) {
        RES_AREA = val; 
    }
    @Column(name="RES_SETTLEMENT",length = 100)
    public String getRES_SETTLEMENT() {
        return RES_SETTLEMENT;
    }
    public void setRES_SETTLEMENT(String val) {
        RES_SETTLEMENT = val; 
    }
    @Column(name="RES_STREET",length = 100)
    public String getRES_STREET() {
        return RES_STREET;
    }
    public void setRES_STREET(String val) {
        RES_STREET = val; 
    }
    @Column(name="RES_FIASCODE",length = 36)
    public String getRES_FIASCODE() {
        return RES_FIASCODE;
    }
    public void setRES_FIASCODE(String val) {
        RES_FIASCODE = val; 
    }
    @Column(name="RES_BUILDING",length = 50)
    public String getRES_BUILDING() {
        return RES_BUILDING;
    }
    public void setRES_BUILDING(String val) {
        RES_BUILDING = val; 
    }
    @Column(name="RES_FRAME",length = 50)
    public String getRES_FRAME() {
        return RES_FRAME;
    }
    public void setRES_FRAME(String val) {
        RES_FRAME = val; 
    }
    @Column(name="RES_HOUSE",length = 50)
    public String getRES_HOUSE() {
        return RES_HOUSE;
    }
    public void setRES_HOUSE(String val) {
        RES_HOUSE = val; 
    }
    @Column(name="RES_FLAT",length = 50)
    public String getRES_FLAT() {
        return RES_FLAT;
    }
    public void setRES_FLAT(String val) {
        RES_FLAT = val; 
    }
    @Column(name="IDEN_TYPE",length = 0)
    public String getIDEN_TYPE() {
        return IDEN_TYPE;
    }
    public void setIDEN_TYPE(String val) {
        IDEN_TYPE = val; 
    }
    @Column(name="IDEN_DATE")
    public LocalDate getIDEN_DATE() {
        return IDEN_DATE;
    }
    public void setIDEN_DATE(LocalDate val) {
        IDEN_DATE = val; 
    }
    @Column(name="FA_OWNWILLACTION",length = 8)
    public String getFA_OWNWILLACTION() {
        return FA_OWNWILLACTION;
    }
    public void setFA_OWNWILLACTION(String val) {
        FA_OWNWILLACTION = val; 
    }
    @Column(name="FA_NOONECONTROLSACTIONS",length = 8)
    public String getFA_NOONECONTROLSACTIONS() {
        return FA_NOONECONTROLSACTIONS;
    }
    public void setFA_NOONECONTROLSACTIONS(String val) {
        FA_NOONECONTROLSACTIONS = val; 
    }
    @Column(name="FA_ONLYRUSSIANTAXPAYER",length = 8)
    public String getFA_ONLYRUSSIANTAXPAYER() {
        return FA_ONLYRUSSIANTAXPAYER;
    }
    public void setFA_ONLYRUSSIANTAXPAYER(String val) {
        FA_ONLYRUSSIANTAXPAYER = val; 
    }
    @Column(name="FA_NOTUSABIRTHPLACE",length = 8)
    public String getFA_NOTUSABIRTHPLACE() {
        return FA_NOTUSABIRTHPLACE;
    }
    public void setFA_NOTUSABIRTHPLACE(String val) {
        FA_NOTUSABIRTHPLACE = val; 
    }
    @Column(name="FA_NOTUSATAXPAYER",length = 8)
    public String getFA_NOTUSATAXPAYER() {
        return FA_NOTUSATAXPAYER;
    }
    public void setFA_NOTUSATAXPAYER(String val) {
        FA_NOTUSATAXPAYER = val; 
    }
    @Column(name="FA_NOUSAGREENCARD",length = 8)
    public String getFA_NOUSAGREENCARD() {
        return FA_NOUSAGREENCARD;
    }
    public void setFA_NOUSAGREENCARD(String val) {
        FA_NOUSAGREENCARD = val; 
    }
    @Column(name="FA_CRSSTATUS",length = 50)
    public String getFA_CRSSTATUS() {
        return FA_CRSSTATUS;
    }
    public void setFA_CRSSTATUS(String val) {
        FA_CRSSTATUS = val; 
    }
}