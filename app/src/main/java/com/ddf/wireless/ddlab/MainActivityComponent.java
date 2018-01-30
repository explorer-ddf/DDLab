package com.ddf.wireless.ddlab;

import dagger.Component;

/**
 * Created by ddf on 18/1/24.
 */

@Component
public interface MainActivityComponent {
    void inject(MainActivity activity);
}
