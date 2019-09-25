package com.example.app;

import org.springframework.stereotype.Component;

/**
 *
 * @author PALT190
 */
@Component
public class Facebook implements SharingApp {

    @Override
    public void share() {
        System.out.println("Facebook...");
    }

}
