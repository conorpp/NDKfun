

#include <stdio.h>

#include <jni.h>
#include <SLES/OpenSLES.h>
#include <SLES/OpenSLES_Platform.h>
#include <SLES/OpenSLES_Android.h>
#include <SLES/OpenSLES_AndroidConfiguration.h>

/*

    hardware
  libhardware
  include
  hardware
 */

jstring Java_com_example_pp_ndkapp_MainActivity_stringFromJNI( JNIEnv* env, jobject x){
    static char buf[50];
    sprintf(buf, "Param: %d\n",4);
    return (*env)->NewStringUTF(env, buf);
}
