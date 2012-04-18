package com.bullno1.moainao;

import android.os.Bundle;
import com.ziplinegames.moai.*;

public class MoaiActivityLandscape extends MoaiActivity {
	@Override
    protected void onCreate ( Bundle savedInstanceState ) {
		mIsLandscape = true;
		super.onCreate(savedInstanceState);
    }
}