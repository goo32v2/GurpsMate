package com.goo32v2.gurpsmate.data.daos

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.OnConflictStrategy.REPLACE
import android.arch.persistence.room.Query
import com.goo32v2.gurpsmate.data.models.Character

/**
 * @author Alexander Steblin (goo32v2)
 * @date 11.11.2017
 */
@Dao
interface CharacterDao {

    @Query("SELECT * FROM character")
    fun getAllCharacters(): List<Character>

    @Query("SELECT * FROM character WHERE id = :id")
    fun getCharacterById(id: Long): Character

    @Insert(onConflict = REPLACE)
    fun createCharacter(character: Character)

}