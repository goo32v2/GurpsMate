package com.goo32v2.gurpsmate

import android.app.Application
import android.arch.persistence.db.SupportSQLiteDatabase
import android.arch.persistence.room.Room
import android.arch.persistence.room.RoomDatabase
import android.util.Log
import com.goo32v2.gurpsmate.data.AppDatabase

/**
 * @author Alexander Steblin (goo32v2)
 * @date 11.11.2017
 */
class GurpsMateApp : Application() {

    companion object {
        lateinit var database: AppDatabase
            private set
    }

    override fun onCreate() {
        super.onCreate()
        database = createDatabase()
    }

    private fun createDatabase() =
            Room.databaseBuilder(this, AppDatabase::class.java, "gurps-db")
                    .allowMainThreadQueries()
                    .addCallback(object : RoomDatabase.Callback() {
                        override fun onCreate(db: SupportSQLiteDatabase) {
                            Log.d("RoomDatabase", "onCreate method called")
                        }

                        override fun onOpen(db: SupportSQLiteDatabase) {
                            Log.d("RoomDatabase", "onOpen method called")
                        }
                    })
                    .build()

}