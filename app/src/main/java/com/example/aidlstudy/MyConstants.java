package com.example.aidlstudy;

import android.os.Environment;

import java.io.File;

/**
 * Created by lipiao on 2017/9/20.
 */

public class MyConstants {
    public static final String CHAPTER_2_PATH = Environment.getExternalStorageDirectory().getAbsolutePath()
            + File.separator + "CATCH";
    public static final String CACHE_FILE_PATH = CHAPTER_2_PATH + File.separator + "cached.txt";
    public static final int MSG_FROM_CLIENT = 0x3443;
}
