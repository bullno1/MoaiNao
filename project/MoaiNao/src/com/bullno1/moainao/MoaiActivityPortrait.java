package com.bullno1.moainao;

import android.os.Bundle;
import com.ziplinegames.moai.*;

public class MoaiActivityPortrait extends MoaiActivity {
	@Override
    protected void onCreate ( Bundle savedInstanceState ) {
		mIsLandscape = false;
		super.onCreate(savedInstanceState);
    }
}