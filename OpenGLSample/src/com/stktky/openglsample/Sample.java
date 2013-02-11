package com.stktky.openglsample;

import android.os.Bundle;
import android.app.Activity;

public class Sample extends Activity {

	SampleGlView glView;

	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);

	    glView = new SampleGlView(this);
	    setContentView(glView);
	}

	@Override
	protected void onResume(){
	  super.onResume();
	  glView.onResume();
	}

	@Override
	protected void onPause(){
	  super.onPause();
	  glView.onPause();
	}


}
