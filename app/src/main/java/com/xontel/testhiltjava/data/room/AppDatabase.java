package com.xontel.testhiltjava.data.room;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import com.xontel.testhiltjava.data.room.dao.WeatherDao;
import com.xontel.testhiltjava.data.room.model.WeatherDataDB;


@Database(entities = {WeatherDataDB.class}, version = 3, exportSchema = false)
public abstract class AppDatabase extends RoomDatabase {
    private static final String DATABASE_NAME = "weather-database";
    private static AppDatabase mInstance;

    public synchronized static AppDatabase getDatabaseInstance(Context context) {
        if (mInstance == null) {
            mInstance = Room.databaseBuilder(context.getApplicationContext(), AppDatabase.class, DATABASE_NAME)
                    .allowMainThreadQueries()
                    .fallbackToDestructiveMigration()
                    .build();
        }
        return mInstance;
    }

    public static void destroyInstance() {
        mInstance = null;
    }

    public abstract WeatherDao weatherDao();

}