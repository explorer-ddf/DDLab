package com.ddf.wireless.ddlab;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.ddf.wireless.ddlab.provider.UserProvider;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        testProvider();
    }

    private void testProvider() {

        Uri uri = Uri.parse("content://" + UserProvider.AUTOHORITY + "/user");
        ContentValues values = new ContentValues();
        values.put("_id", 3);
        values.put("name", "Iverson");

        ContentResolver resolver = getContentResolver();
        resolver.insert(uri, values);

        // 通过ContentResolver 向ContentProvider中查询数据
        Cursor cursor = resolver.query(uri, new String[]{"_id","name"}, null, null, null);
        while (cursor.moveToNext()){
            System.out.println("query book:" + cursor.getInt(0) +" "+ cursor.getString(1));
            // 将表中数据全部输出
        }
        cursor.close();
        // 关闭游标

    }
}
