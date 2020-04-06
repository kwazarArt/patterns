package com.kwazartArt.patterns.creational.singelton;

public class Administrator {
    public static Administrator administrator;

    private Administrator() {}

    public static synchronized Administrator getAdministrator() {
        if (administrator == null) {
            administrator = new Administrator();
        }
        return administrator;
    }

}
