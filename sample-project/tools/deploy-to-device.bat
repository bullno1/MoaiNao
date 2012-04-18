@echo off
call settings.bat
7z u -r -tzip %BUNDLE_NAME% -x@exclude.txt @include.txt
adb wait-for-device
adb push %BUNDLE_NAME% /data/local/tmp/%BUNDLE_NAME%
launch-on-device.bat