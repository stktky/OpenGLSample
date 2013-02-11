package com.stktky.openglsample;

import android.content.Context;
import android.opengl.GLSurfaceView;

public class SampleGlView extends GLSurfaceView {

	SampleRenderer renderer;

	public SampleGlView(Context context) {
		super(context);
		renderer = new SampleRenderer();
		setRenderer( renderer );
	}

}
