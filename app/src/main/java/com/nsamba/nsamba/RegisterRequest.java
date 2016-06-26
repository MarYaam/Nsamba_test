package com.nsamba.nsamba;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by SmirkQueen on 18/06/2016.
 */
public class RegisterRequest extends StringRequest {
    private static final String Register_Request_URL = "http://nsambatech.com/Register.php";
    private Map<String, String> params;

    public RegisterRequest(String name, String username, String password, Response.Listener<String> Listener){
        super(Method.POST, Register_Request_URL, Listener, null);
        params= new HashMap<>();
        params.put("name", name);
        params.put("username", username);
        params.put("password", password);


    }

    @Override
    public Map<String, String> getParams() {
        return params;
    }
}
