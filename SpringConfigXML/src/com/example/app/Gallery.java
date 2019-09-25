package com.example.app;

/**
 *
 * @author PALT190
 */
public class Gallery {

    private SharingApp sharingApp;

    public Gallery(SharingApp sharingApp) {
        this.sharingApp = sharingApp;
    }

    public SharingApp getSharingApp() {
        return sharingApp;
    }

    public void setSharingApp(SharingApp sharingApp) {
        this.sharingApp = sharingApp;
    }

    public void share() {
        sharingApp.share();
    }

}
