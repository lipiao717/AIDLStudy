package com.example.aidlstudy;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import com.example.aidlstudy.bean.User;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class SecondActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    @Override
    protected void onResume() {
        super.onResume();
        recoverFromFile();
    }

    private void recoverFromFile(){
        new Thread(new Runnable() {
            @Override
            public void run() {
                User user =null;
                File cachedFile = new File(MyConstants.CACHE_FILE_PATH);
                if(cachedFile.exists()){
                    ObjectInputStream inputStream = null;
                    try{
                        inputStream = new ObjectInputStream(new FileInputStream(cachedFile));
                        user = (User) inputStream.readObject();
                        Log.i("123","recover user:"+user);
                    }catch (Exception e){
                        e.printStackTrace();
                    }finally {
                        try {
                            inputStream.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        });
    }
}
