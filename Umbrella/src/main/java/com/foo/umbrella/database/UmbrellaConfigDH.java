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
                Library.CONFIG_ATT + " TEXT, " +
                Library.CONFIG_VALUE+ " TEXT )";
        db.execSQL(CREATE_CONFIG_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXIST "+Library.TABLE_CONFIG);
        onCreate(db);
    }

    public void addZipCode(String zipCode){
        if(zipCode != null){
            SQLiteDatabase db = this.getWritableDatabase();

            ContentValues values = new ContentValues();
            values.put(Library.CONFIG_ATT, Library.ATT_ZIP_CODE);
            values.put(Library.CONFIG_VALUE, zipCode);

            db.insert(Library.TABLE_CONFIG, null, values);
            db.close();
        }
    }

    public void addUnit(String unit){
        if(unit != null){
            SQLiteDatabase db = this.getWritableDatabase();

            ContentValues values = new ContentValues();
            values.put(Library.CONFIG_ATT, Library.ATT_UNIT);
            values.put(Library.CONFIG_VALUE, unit);

            db.insert(Library.TABLE_CONFIG, null, values);
            db.close();
        }
    }

    public void updateZipCode(String zipCode){
        if(zipCode != null){
            SQLiteDatabase db = this.getWritableDatabase();

            ContentValues values = new ContentValues();
            values.put(Library.CONFIG_VALUE, zipCode);

            db.update(Library.TABLE_CONFIG, values, Library.CONFIG_ATT +" = ?",
                    new String[]{Library.ATT_ZIP_CODE});
        }
    }

    public void updateUnit(String unit){
        if(unit != null){
            SQLiteDatabase db = this.getWritableDatabase();

            ContentValues values = new ContentValues();
            values.put(Library.CONFIG_VALUE, unit);

            db.update(Library.TABLE_CONFIG, values, Library.CONFIG_ATT +" = ?",
                    new String[]{Library.ATT_UNIT});
        }
    }

    public ConfigData selectConfigData(){
        ConfigData configData = new ConfigData();

        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.query(Library.TABLE_CONFIG,
                new String[]{Library.CONFIG_VALUE},
                Library.CONFIG_ATT + " = ?",
                new String[]{Library.ATT_ZIP_CODE},
                null,null,null,null);

        Cursor cursor1 = db.query(Library.TABLE_CONFIG,
                new String[]{Library.CONFIG_VALUE},
                Library.CONFIG_ATT + " = ?",
                new String[]{Library.ATT_UNIT},
                null,null,null,null);

        if(cursor != null){
            cursor.moveToFirst();
        }

        if(cursor1 != null){
            cursor1.moveToFirst();
        }
        if(cursor.getCount() != 0){
            configData.setZipCode(cursor.getString(0));
        } else {
            configData.setZipCode(null);
        }

        if(cursor1.getCount() != 0) {
            configData.setUnit(cursor1.getString(0));
        } else {
            configData.setUnit(null);
        }

        return configData;
    }
}
