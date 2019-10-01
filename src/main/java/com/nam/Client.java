package com.nam;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.MalformedURLException;
import java.net.URL;

public class Client {
    public static void main(String[] args) throws MalformedURLException{
        URL url = new URL("http://localhost:4242/wss/hello?wsdl");

        QName qName = new QName("http://nam.com/", "WebService42ImplService");

        Service service = Service.create(url, qName);

        WebService42 webService42 = service.getPort(WebService42.class);

        System.out.println(webService42.getString("Hack 42!!11@@@@"));
    }
}
