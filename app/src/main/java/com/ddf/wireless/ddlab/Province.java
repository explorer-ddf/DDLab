package com.ddf.wireless.ddlab;

import javax.inject.Inject;

/**
 * Created by ddf on 18/1/24.
 */

public class Province {
    @Inject
    public City mCity;

    @Inject
    public Province(City city) {
        mCity = city;
    }

    public String showAddress() {
        return "四川省" + mCity.show();
    }
}
