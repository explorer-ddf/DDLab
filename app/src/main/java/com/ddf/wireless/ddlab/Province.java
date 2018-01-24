package com.ddf.wireless.ddlab;

/**
 * Created by ddf on 18/1/24.
 */

public class Province {
    public City mCity;

    public Province(City city) {
        mCity = city;
    }

    public String showAddress() {
        return "四川省" + mCity.show();
    }
}
