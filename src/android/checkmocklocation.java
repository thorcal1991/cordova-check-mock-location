package com.thor.plugins;

import org.apache.cordova.*;
import org.json.JSONArray;
import org.json.JSONException;

public class checkmocklocation extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray data, CallbackContext callbackContext) throws JSONException {

        if (action.equals("check")) {

            
            callbackContext.success("successfully called plugin");

            return true;

        } else {
            
            return false;

        }
    }
}
