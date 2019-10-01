package com.nam;

import javax.jws.WebService;

@WebService(endpointInterface = "com.nam.WebService42")
public class WebService42Impl implements WebService42{
    @Override
    public String getString(String name) {
        System.out.println("~");
        return String.format("Hello %s!", name);
    }
}
