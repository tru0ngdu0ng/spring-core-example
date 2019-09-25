package com.example.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author PALT190
 */
@Component
public class Gallery {

    private SharingApp sharingApp;

//    @Autowired
//    public Gallery(SharingApp sharingApp) {
//        this.sharingApp = sharingApp;
//    }

    public SharingApp getSharingApp() {
        return sharingApp;
    }

    @Autowired
    public void setSharingApp(SharingApp sharingApp) {
        this.sharingApp = sharingApp;
    }

    public void share() {
        sharingApp.share();
    }

}
