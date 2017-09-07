package com.foo.umbrella.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.foo.umbrella.database.library.Library;

public class UmbrellaConfigDH extends SQLiteOpenHelper{

    public UmbrellaConfigDH(Context context){
        super(context, Library.DB_NAME, null, Library.DB_VERSION);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_CONFIG_TABLE = "CREATE TABLE IF NOT EXISTS " + Library.TABLE_CONFIG + " ( " +
                Library.CONFIG_ATT + "TEXT, " +
                Library.CONFIG_VALUE+ "TEXT)";
        db.execSQL(CREATE_CONFIG_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXIST "+Library.TABLE_CONFIG);
        onCreate(db);
    }

    public void addZipCode(ConfigData configData){
        if(configData.getZipCode() != null){
            SQLiteDatabase db = this.getWritableDatabase();

            ContentValues values = new ContentValues();
            values.put(Library.CONFIG_ATT, Library.ATT_ZIP_CODE);
            values.put(Library.CONFIG_VALUE, configData.getZipCode());

            db.insert(Library.TABLE_CONFIG, null, values);
            db.close();
        }
    }

    public void addUnit(ConfigData configData){
        if(configData.getUnit() != null){
            SQLiteDatabase db = this.getWritableDatabase();

            ContentValues values = new ContentValues();
            values.put(Library.CONFIG_ATT, Library.ATT_UNIT);
            values.put(Library.CONFIG_VALUE, configData.getUnit());

            db.insert(Library.TABLE_CONFIG, null, values);
            db.close();
        }
    }

    public void updateZipCode(ConfigData configData){
        if(configData.getZipCode() != null){
            SQLiteDatabase db = this.getWritableDatabase();

            ContentValues values = new ContentValues();
            values.put(Library.CONFIG_VALUE, configData.getZipCode());

            db.update(Library.TABLE_CONFIG, values, Library.CONFIG_ATT +" = ?",
                    new String[]{Library.ATT_ZIP_CODE});
        }
    }

    public void updateUnit(ConfigData configData){
        if(configData.getZipCode() != null){
            SQLiteDatabase db = this.getWritableDatabase();

            ContentValues values = new ContentValues();
            values.put(Library.CONFIG_VALUE, configData.getUnit());

            db.update(Library.TABLE_CONFIG, values, Library.CONFIG_ATT +" = ?",
                    new String[]{Library.ATT_UNIT});
        }
    }

    public ConfigData selectConfigData(){
        ConfigData configData = new ConfigData();
        String selectUnitQuery = "SELECT " + Library.CONFIG_VALUE + " FROM " + Library.TABLE_CONFIG
                + " WHERE " + Library.CONFIG_ATT + "= " + Library.ATT_UNIT;

        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.query(Library.TABLE_CONFIG,
                new String[]{Library.CONFIG_VALUE},
                Library.CONFIG_ATT + "= ?",
                new String[]{Library.ATT_ZIP_CODE},
                null,null,null,null);

        Cursor cursor1 = db.query(Library.TABLE_CONFIG,
                new String[]{Library.CONFIG_VALUE},
                Library.CONFIG_ATT + "= ?",
                new String[]{Library.ATT_UNIT},
                null,null,null,null);

        if(cursor != null){
            cursor.moveToFirst();
        }

        if(cursor1 != null){
            cursor1.moveToFirst();
        }



        configData.setZipCode(cursor.getString(0));
        configData.setUnit(cursor1.getString(0));

        return configData;
    }
}
