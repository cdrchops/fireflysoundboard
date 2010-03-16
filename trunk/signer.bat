keytool -genkey -v -keystore mykey.keystore -validity 20000
rem -alias alias_name -keyalg RSA 

jarsigner -verbose -keystore mykey.keystore build/src/fireflysounds.apk fireflysounds

rem jarsigner -verify build/src/fireflysounds.apk

rem jarsigner -verify -verbose -certs build/src/fireflysounds.apk

/android/tools/zipalign -v 4 build/src/fireflysounds.apk fireflysounds.apk