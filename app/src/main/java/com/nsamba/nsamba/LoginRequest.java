package com.nsamba.nsamba;


import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by SmirkQueen on 18/06/2016.
 */
public class LoginRequest extends StringRequest {
    private static final String Login_Request_URL = "http://nsamba.us/Login.php";
    private Map<String, String> params;

    public LoginRequest(String username, String password, Response.Listener<String> Listener){
        super(Method.POST, Login_Request_URL, Listener, null);
        params= new HashMap<>();
        params.put("username", username);
        params.put("password", password);


    }




    @Override
    public Map<String, String> getParams() {
        return params;
    }
}
