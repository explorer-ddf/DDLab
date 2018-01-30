package com.ddf.wireless.ddlab;

import javax.inject.Inject;

/**
 * Created by ddf on 18/1/24.
 */

public class City {
    @Inject
    public Street mStreet;

    @Inject
    public City(Street street) {
        mStreet = street;
    }

    public String show() {
        return "成都市" + mStreet.show();
    }
}
