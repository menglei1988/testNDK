//
// Created by mengl on 2016/4/15.
//
#include "com_testndk_mengl_testndk_Load.h"


JNIEXPORT jint JNICALL Java_com_testndk_mengl_testndk_Load_addInt (JNIEnv *, jobject, jint a, jint b) {
    return a - b;
}


