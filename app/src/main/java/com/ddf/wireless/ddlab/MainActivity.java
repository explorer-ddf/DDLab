package com.ddf.wireless.ddlab;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

/**
 * MainActivity依赖Province，Province依赖City，City依赖Street；
 */
public class MainActivity extends AppCompatActivity {
    public Street street;
    public City city;
    public Province province;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        street = new Street();
        city = new City(street);
        province = new Province(city);
        Log.d("MainActivity", "onCreate: " + province.showAddress());

    }
}
