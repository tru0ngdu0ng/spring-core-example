package com.example.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author PALT190
 */
public class TestApp {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("app-config.xml");
        Gallery gallery1 = (Gallery) context.getBean("galleryBean");
        gallery1.share();

        System.out.println(gallery1);

        Gallery gallery2 = (Gallery) context.getBean("galleryBean");
        System.out.println(gallery2);

        Facebook facebook1 = (Facebook) context.getBean("facebookBean");
        System.out.println(facebook1);

        Facebook facebook2 = (Facebook) context.getBean("facebookBean");
        System.out.println(facebook2);

    }

}
