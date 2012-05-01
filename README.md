MoaiNao
=======

How to build
------------

* Prerequisites: an environment which can build an android project from the command line. You need: ant and android script available from the command line.
* One time setup:
	- Execute prebuild.bat to create local.properties files. You will need to do this again if you move your android sdk folder or move the project to a different computer.
	- Get the dependencies (Moai's and MoaiNao's git folders will be refered to as Moai-git and MoaiNao-git respectively): 
		- Copy folder Moai-git/ant/untitled-host/host-source/project/libs to MoaiNao-git/project/MoaiNao
		- Copy Moai-git/ant/host-source/source/project/external/crittercism/lib/crittercism_v1_3_0.jar to MoaiNao-git/project/MoaiNao/libs
* cd into MoaiNao-git/project/MoaiNao
* Execute "ant debug"
* Your apk will be created at MoaiNao-git/project/MoaiNao/bin/MoaiNao-debug.apk

Usage
-----

Please refer to this [forum thread](http://getmoai.com/forums/moainao-run-your-script-on-android-without-building-t695/).
