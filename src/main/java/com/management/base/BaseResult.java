package com.management.base;

import java.util.HashMap;
import java.util.Map;

public class BaseResult {

    private final static String errorNo = "errorNo";
    private final static int OK = 1;
    private final static int error = 0;
    private final static String errorMsg = "errorMsg";

    public static Map<String,Object> resultOk(){
        Map<String,Object> map = new HashMap<>();
        map.put(errorNo,OK);
        return map;
    }
    public static Map<String,Object> resultOk(String msg){
        Map<String,Object> map = new HashMap<>();
        map.put(errorNo,OK);
        map.put(errorMsg,msg);
        return map;
    }


    public static Map<String,Object> resultError(){
        Map<String,Object> map = new HashMap<>();
        map.put(errorNo,error);
        return map;
    }
    public static Map<String,Object> resultError(String msg){
        Map<String,Object> map = new HashMap<>();
        map.put(errorNo,error);
        map.put(errorMsg,msg);
        return map;
    }
}
