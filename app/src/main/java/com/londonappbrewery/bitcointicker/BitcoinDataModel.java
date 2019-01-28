package com.londonappbrewery.bitcointicker;

import org.json.JSONException;
import org.json.JSONObject;

public class BitcoinDataModel {

    private String mPrice;

    public static BitcoinDataModel fromJson(JSONObject jsonObject) {
        try {
            BitcoinDataModel bitcoinData = new BitcoinDataModel();

            double bitValue = jsonObject.getDouble("ask");

            bitcoinData.mPrice = Double.toString(bitValue);

            return bitcoinData;
        } catch (JSONException e){
            e.printStackTrace();
            return null;
        }
    }

    public String getPrice() {
        return mPrice;
    }
}
