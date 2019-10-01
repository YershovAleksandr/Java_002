package com.nam;

import com.nam2.*;

public class Client42 {
    public static void main(String[] args){
        WebService42ImplService webService42ImplService = new WebService42ImplService();

        WebService42 webService42 = webService42ImplService.getWebService42ImplPort();


        System.out.println(webService42.getString("Wtf????????????????????????"));
    }
}
