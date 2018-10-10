package com.management.base;

import java.util.HashMap;
import java.util.Map;

public class BaseResultMap {

    public static String  ERROR = "-1";

    private static String OK = "1";

    public static Map<String,Object> resultOk(){
        Map<String,Object> map = new HashMap<>(16);
        map.put(OK,"");
        return map;
    }

    public static Map<String,Object> resultOk(String msg){
        Map<String,Object> map = new HashMap<>(16);
        map.put(OK,msg);
        return map;
    }

    public static Map<String,Object> resultError(){
        Map<String,Object> map = new HashMap<>(16);
        map.put(ERROR,"");
        return map;
    }

    public static Map<String,Object> resultError(String msg){
        Map<String,Object> map = new HashMap<>(16);
        map.put(ERROR,msg);
        return map;
    }

}
