package com.taxCalculator;

import javax.xml.ws.Endpoint;

public class WebServicePublisher {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8080/", new TaxCalculator());
        System.out.println("Web Service is published!");
    }
}
