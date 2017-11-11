package com.goo32v2.gurpsmate.data.models

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

/**
 * @author Alexander Steblin (goo32v2)
 * @date 11.11.2017
 */
@Entity(tableName = "character")
data class Character(@ColumnInfo(name = "name") var name: String = "") {
    @ColumnInfo(name = "id")
    @PrimaryKey(autoGenerate = true)
    var id: Long = 0
}