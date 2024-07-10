package com.testing.app.model;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class Systemuser {
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "_dbuid", columnDefinition = "bpchar")
    private String dbuid;
    @Basic
    @Column(name = "loginemail", columnDefinition = "bpchar")
    private String loginemail;
    @Basic
    @Column(name = "loginpassword", columnDefinition = "bpchar")
    private String loginpassword;
    @Basic
    @Column(name = "loginsalt", columnDefinition = "bpchar")
    private String loginsalt;
    @Basic
    @Column(name = "loginpasswordtemp", columnDefinition = "bpchar")
    private String loginpasswordtemp;
    @Basic
    @Column(name = "loginpasswordtempexpirydate")
    private Timestamp loginpasswordtempexpirydate;
    @Basic
    @Column(name = "active")
    private short active;
    @Basic
    @Column(name = "userrole", columnDefinition = "bpchar")
    private String userrole;
    @Basic
    @Column(name = "userid", columnDefinition = "bpchar")
    private String userid;
    @Basic
    @Column(name = "createdate")
    private Timestamp createdate;
    @Basic
    @Column(name = "pwdcreationdate")
    private Timestamp pwdcreationdate;
    @Basic
    @Column(name = "pwdfailattempts")
    private Short pwdfailattempts;
    @Basic
    @Column(name = "pwdchanged")
    private Short pwdchanged;
    @Basic
    @Column(name = "lastlogon")
    private Timestamp lastlogon;
    @Basic
    @Column(name = "enableadmin")
    private Short enableadmin;
    @Basic
    @Column(name = "enableserviceprovider")
    private Short enableserviceprovider;
    @Basic
    @Column(name = "enableclient")
    private Short enableclient;
    @Basic
    @Column(name = "enableexercise")
    private Short enableexercise;
    @Basic
    @Column(name = "adminid", columnDefinition = "bpchar")
    private String adminid;

    public String getDbuid() {
        return dbuid;
    }

    public void setDbuid(String dbuid) {
        this.dbuid = dbuid;
    }

    public String getLoginemail() {
        return loginemail;
    }

    public void setLoginemail(String loginemail) {
        this.loginemail = loginemail;
    }

    public String getLoginpassword() {
        return loginpassword;
    }

    public void setLoginpassword(String loginpassword) {
        this.loginpassword = loginpassword;
    }

    public String getLoginsalt() {
        return loginsalt;
    }

    public void setLoginsalt(String loginsalt) {
        this.loginsalt = loginsalt;
    }

    public String getLoginpasswordtemp() {
        return loginpasswordtemp;
    }

    public void setLoginpasswordtemp(String loginpasswordtemp) {
        this.loginpasswordtemp = loginpasswordtemp;
    }

    public Timestamp getLoginpasswordtempexpirydate() {
        return loginpasswordtempexpirydate;
    }

    public void setLoginpasswordtempexpirydate(Timestamp loginpasswordtempexpirydate) {
        this.loginpasswordtempexpirydate = loginpasswordtempexpirydate;
    }

    public short getActive() {
        return active;
    }

    public void setActive(short active) {
        this.active = active;
    }

    public String getUserrole() {
        return userrole;
    }

    public void setUserrole(String userrole) {
        this.userrole = userrole;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public Timestamp getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Timestamp createdate) {
        this.createdate = createdate;
    }

    public Timestamp getPwdcreationdate() {
        return pwdcreationdate;
    }

    public void setPwdcreationdate(Timestamp pwdcreationdate) {
        this.pwdcreationdate = pwdcreationdate;
    }

    public Short getPwdfailattempts() {
        return pwdfailattempts;
    }

    public void setPwdfailattempts(Short pwdfailattempts) {
        this.pwdfailattempts = pwdfailattempts;
    }

    public Short getPwdchanged() {
        return pwdchanged;
    }

    public void setPwdchanged(Short pwdchanged) {
        this.pwdchanged = pwdchanged;
    }

    public Timestamp getLastlogon() {
        return lastlogon;
    }

    public void setLastlogon(Timestamp lastlogon) {
        this.lastlogon = lastlogon;
    }

    public Short getEnableadmin() {
        return enableadmin;
    }

    public void setEnableadmin(Short enableadmin) {
        this.enableadmin = enableadmin;
    }

    public Short getEnableserviceprovider() {
        return enableserviceprovider;
    }

    public void setEnableserviceprovider(Short enableserviceprovider) {
        this.enableserviceprovider = enableserviceprovider;
    }

    public Short getEnableclient() {
        return enableclient;
    }

    public void setEnableclient(Short enableclient) {
        this.enableclient = enableclient;
    }

    public Short getEnableexercise() {
        return enableexercise;
    }

    public void setEnableexercise(Short enableexercise) {
        this.enableexercise = enableexercise;
    }

    public String getAdminid() {
        return adminid;
    }

    public void setAdminid(String adminid) {
        this.adminid = adminid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Systemuser that = (Systemuser) o;
        return active == that.active && Objects.equals(dbuid, that.dbuid) && Objects.equals(loginemail, that.loginemail) && Objects.equals(loginpassword, that.loginpassword) && Objects.equals(loginsalt, that.loginsalt) && Objects.equals(loginpasswordtemp, that.loginpasswordtemp) && Objects.equals(loginpasswordtempexpirydate, that.loginpasswordtempexpirydate) && Objects.equals(userrole, that.userrole) && Objects.equals(userid, that.userid) && Objects.equals(createdate, that.createdate) && Objects.equals(pwdcreationdate, that.pwdcreationdate) && Objects.equals(pwdfailattempts, that.pwdfailattempts) && Objects.equals(pwdchanged, that.pwdchanged) && Objects.equals(lastlogon, that.lastlogon) && Objects.equals(enableadmin, that.enableadmin) && Objects.equals(enableserviceprovider, that.enableserviceprovider) && Objects.equals(enableclient, that.enableclient) && Objects.equals(enableexercise, that.enableexercise) && Objects.equals(adminid, that.adminid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dbuid, loginemail, loginpassword, loginsalt, loginpasswordtemp, loginpasswordtempexpirydate, active, userrole, userid, createdate, pwdcreationdate, pwdfailattempts, pwdchanged, lastlogon, enableadmin, enableserviceprovider, enableclient, enableexercise, adminid);
    }
}
