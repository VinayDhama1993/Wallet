package com.example.wallet;

import java.io.Serializable;

public class Wallet implements Serializable {
    private String wBalanceAmount;
    private String wAdded;
    private String wDateTime;
    private String wAmount;
    private String wUsedIn;
    private String wTxnId;
    private String wSpend;
    private String wRespCode;
    private String wRespMsg;

    public String getBalanceAmount() {
        return wBalanceAmount;
    }
    public void setBalanceAmount(String wBalanceAmount) {
        this.wBalanceAmount = wBalanceAmount;
    }
    public String getAdded() {
        return wAdded;
    }
    public void setAdded(String wAdded) {
        this.wAdded = wAdded;
    }
    public String getDateTime() {
        return wDateTime;
    }
    public void setDateTime(String wDateTime) {
        this.wDateTime = wDateTime;
    }
    public String getAmount() {
        return wAmount;
    }
    public void setAmount(String wAmount) {
        this.wAmount = wAmount;
    }
    public String getUsedIn() {
        return wUsedIn;
    }
    public void setUsedIn(String wUsedIn) {
        this.wUsedIn = wUsedIn;
    }
    public String getTxnId() {
        return wTxnId;
    }
    public void setTxnId(String wTxnId) {
        this.wTxnId = wTxnId;
    }
    public String getSpend() {
        return wSpend;
    }
    public void setSpend(String wSpend) {
        this.wSpend = wSpend;
    }
    public String getRespCode() {
        return wRespCode;
    }
    public void setRespCode(String wRespCode) {
        this.wRespCode = wRespCode;
    }
    public String getRespMsg() {
        return wRespMsg;
    }
    public void setRespMsg(String wRespMsg) {
        this.wRespMsg = wRespMsg;
    }
}


