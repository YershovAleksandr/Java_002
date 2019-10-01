package com.nam;

import javax.xml.ws.Endpoint;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        Endpoint.publish("http://localhost:4242/wss/hello", new WebService42Impl());
    }
}
