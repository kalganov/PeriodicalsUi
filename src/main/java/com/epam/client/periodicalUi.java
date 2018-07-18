package com.epam.client;

import com.epam.client.models.User;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JsonUtils;
import com.google.gwt.http.client.Request;
import com.google.gwt.http.client.RequestBuilder;
import com.google.gwt.http.client.RequestCallback;
import com.google.gwt.http.client.Response;
import com.google.gwt.json.client.JSONObject;
import com.google.web.bindery.autobean.shared.AutoBean;
import com.google.web.bindery.autobean.shared.AutoBeanCodex;
import com.google.web.bindery.autobean.shared.AutoBeanUtils;

import java.util.HashMap;
import java.util.Map;

public class periodicalUi implements EntryPoint {

    private static final String SERVER_ERROR = "An error occurred while "
            + "attempting to contact the server. Please check your network "
            + "connection and try again.";

    private final GreetingServiceAsync greetingService = GWT.create(GreetingService.class);

    private User user;

    public void onModuleLoad() {

        user = new User( 1,"admin", "adm@epam.com");

//        AutoBean<User> userAutoBean = AutoBeanUtils.getAutoBean(user);
//        String payload = AutoBeanCodex.encode(userAutoBean).getPayload();
//        System.out.println(payload);

        Map<String, Object> userMap = new HashMap<>();
        userMap.put("id", user.getId());
        userMap.put("name", user.getName());
        userMap.put("email", user.getEmail());
        JSONObject encode = JsonConverter.encode(userMap);
        String s = encode.toString();
        System.out.println(encode);

//        ObjectMapper objectMapper = new ObjectMapper();
//        String jsonUser = "";
//        try {
//            jsonUser = objectMapper.writeValueAsString(user);
//        } catch (JsonProcessingException e) {
//            e.printStackTrace();
//        }

//        RequestBuilder login = new RequestBuilder(RequestBuilder.POST, "http://localhost:8080/login");
//        login.setHeader("Content-Type", "application/json");
//        login.setRequestData("email="+user.getEmail()+"&password=123");
//        login.setCallback(new RequestCallback() {
//            @Override
//            public void onResponseReceived(Request request, Response response) {
//                System.out.println(response);
//            }
//
//            @Override
//            public void onError(Request request, Throwable exception) {
//                System.out.println("ERROR");
//            }
//        });
    }
}
