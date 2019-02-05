package com.myflappy.jemozstudio;

import android.os.Bundle;

import com.badlogic.gdx.backends.android.AndroidApplication;
import com.badlogic.gdx.backends.android.AndroidApplicationConfiguration;
import com.myflappy.jemozstudio.States.V;

public class AndroidLauncher extends AndroidApplication {
	@Override
	protected void onCreate (Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		AndroidApplicationConfiguration config = new AndroidApplicationConfiguration();
		V.WIDTH = getApplicationContext().getResources().getDisplayMetrics().widthPixels;
		V.HEIGHT = getApplicationContext().getResources().getDisplayMetrics().heightPixels;
		initialize(new Main(), config);
	}
}
