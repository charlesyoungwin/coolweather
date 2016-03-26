package com.coolweather.app.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

/**
 * Created by charlesyoung on 2016/3/21.
 */
public class CoolWeatherOpenHelper extends SQLiteOpenHelper {

    /**
     * Province表建表语句
     * @param db
     */
    public static final String CREATE_PROVINCE = "create table Province ("
            + "id integer primary key autoincrement, "
            + "province_name text, "
            + "province_code text) ";

    /**
     * City表建表语句
     * @param db
     */
    public static final String CREATE_CITY = "create table City ( "
            + "id integer primary key autoincrement, "
            + "city_name text, "
            + "city_code text, "
            + "province_id integer) ";

    /**
     * Country表建表语句
     * @param db
     */
    public static final String CREATE_COUNTRY = "create table Country ("
            + "id integer primary key autoincrement, "
            + "country_name text, "
            + "country_code text, "
            + "city_id integer) ";

    private Context mContext;

    public CoolWeatherOpenHelper(Context context, String name, SQLiteDatabase.CursorFactory factory,
                                 int version){
        super(context,name,factory,version);
        mContext = context;
    }


    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL(CREATE_PROVINCE);
        db.execSQL(CREATE_CITY);
        db.execSQL(CREATE_COUNTRY);
        Toast.makeText(mContext,"Create succeeded",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
