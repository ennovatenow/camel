package com.evolvus.training.camel.processor;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import com.evolvus.training.camel.domain.ISO3166;

/**
 * Pass thru processor to just prove that marshaling/unmarshaling is happening
 * 
 * @author anisht
 * 
 */
public class ISO3166Processor implements Processor {

    
    public void process(Exchange arg0) throws Exception {
        ISO3166 iso4217 = (ISO3166) arg0.getIn().getBody();
        System.out.println("Unmarshalled Object is: " + iso4217);
        arg0.setOut(arg0.getIn());
        arg0.getOut().setHeaders(arg0.getIn().getHeaders());
    }
}
