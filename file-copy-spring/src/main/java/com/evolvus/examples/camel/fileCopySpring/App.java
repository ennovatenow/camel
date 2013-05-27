package com.evolvus.examples.camel.fileCopySpring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(final String[] args) throws Exception {
        new ClassPathXmlApplicationContext("application-context.xml");
        Thread.sleep(5000);
    }
}
