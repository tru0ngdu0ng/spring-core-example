package com.example.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author PALT190
 */
public class TestApp {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Gallery gallery = context.getBean(Gallery.class);
        gallery.share();

        Zalo zalo = (Zalo) gallery.getSharingApp();
        System.out.println(zalo);

        Zalo zalo1 = (Zalo) context.getBean("zalo");
        zalo1.share();
        System.out.println(zalo1);

        Zalo zalo2 = (Zalo) context.getBean("zalo");
        zalo2.share();
        System.out.println(zalo2);
        
        Facebook facebook1 = (Facebook) context.getBean("facebook");
        System.out.println(facebook1);
        
        gallery.setSharingApp(facebook1);
        gallery.share();
        
        Facebook facebook2 = (Facebook) context.getBean("facebook");
        System.out.println(facebook2);
    }

}
