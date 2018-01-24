package com.ddf.wireless.ddlab;

/**
 * Created by ddf on 18/1/24.
 */

public class City {
    public Street mStreet;

    public City(Street street) {
        mStreet = street;
    }

    public String show() {
        return "成都市" + mStreet.show();
    }
}
