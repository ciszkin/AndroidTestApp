package by.tms.androidtestapp.dz6.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface PlanetDao {
    @Insert
    suspend fun addPlanet(planet: Planet)

    @Query("SELECT * FROM Planet")
    suspend fun getPlanets() : List<Planet>

    @Query("SELECT * FROM Planet WHERE name = :name")
    suspend fun findByName(name: String) : Planet
}