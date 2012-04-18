package com.bullno1.moainao;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.net.Uri;

public class MoaiNao extends Activity {
	@Override
    protected void onCreate ( Bundle savedInstanceState ) {
		super.onCreate(savedInstanceState);
		
		startActivity(
			new Intent(
				android.provider.Settings.ACTION_APPLICATION_DETAILS_SETTINGS,
				Uri.parse("package:com.bullno1.moainao")
			)
		);
		finish();
    }
}