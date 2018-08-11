package com.example.wallet;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import java.util.ArrayList;


public class JSONParser {
    public static ArrayList<Wallet> wWallet = new ArrayList<>();

    public static Wallet parseFeed(JSONObject obj) {

        try {
            Wallet wallet = new Wallet();
            wallet.setBalanceAmount(obj.getString("balanceamt"));
            wallet.setAdded(obj.getString("added"));
            wallet.setDateTime(obj.getString("datetime"));
            wallet.setAmount(obj.getString("amount"));
            wallet.setUsedIn(obj.getString("usedIn"));
            wallet.setTxnId(obj.getString("txnid"));
            wallet.setSpend(obj.getString("spend"));
            wallet.setRespCode(obj.getString("resp_code"));
            wallet.setRespMsg(obj.getString("resp_msg"));
            return wallet;
        } catch (JSONException e1) {
            e1.printStackTrace();
            return null;
        }

    }

    public static ArrayList<Wallet> parseArrayFeed(JSONArray arr) {
        JSONObject obj=null;
        Wallet wallet = null;
        wWallet.clear();
        try {

            for(int i = 0;i<arr.length();i++) {
                obj = arr.getJSONObject(i);
                wallet= new Wallet();
                wallet.setBalanceAmount(obj.getString("balanceamt"));
                wallet.setAdded(obj.getString("added"));
                wallet.setDateTime(obj.getString("datetime"));
                wallet.setAmount(obj.getString("amount"));
                wallet.setUsedIn(obj.getString("usedIn"));
                wallet.setTxnId(obj.getString("txnid"));
                wallet.setSpend(obj.getString("spend"));
                wallet.setRespCode(obj.getString("resp_code"));
                wallet.setRespMsg(obj.getString("resp_msg"));
                wWallet.add(wallet);
            }
            return wWallet;
        } catch (JSONException e1) {
            e1.printStackTrace();
            return null;
        }
    }
}


