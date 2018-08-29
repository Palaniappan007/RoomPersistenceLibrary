package com.example.yogeshwaraass.roompersistencelibrary;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

/**
 * Created by Yogeshwaraa.ss on 8/29/2018.
 */
@Database(entities = {Task.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase{
    public abstract TaskDao taskDao();

}
