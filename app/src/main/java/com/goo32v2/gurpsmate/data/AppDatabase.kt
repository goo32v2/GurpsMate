package com.goo32v2.gurpsmate.data

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import com.goo32v2.gurpsmate.data.daos.CharacterDao
import com.goo32v2.gurpsmate.data.models.Character

/**
 * @author Alexander Steblin (goo32v2)
 * @date 11.11.2017
 */
@Database(entities = arrayOf(Character::class), version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {

    abstract fun characterDao(): CharacterDao
}