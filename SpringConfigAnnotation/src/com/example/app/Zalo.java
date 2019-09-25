package com.example.app;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 *
 * @author PALT190
 */
@Component
@Scope("prototype")
//@Scope("singleton")
@Primary
public class Zalo implements SharingApp {

    @Override
    public void share() {
        System.out.println("Zalo...");
    }

}
