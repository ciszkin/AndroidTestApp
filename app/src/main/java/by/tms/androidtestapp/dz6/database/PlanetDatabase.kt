package by.tms.androidtestapp.dz6.database

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [Planet::class], version = 1)
abstract class PlanetDatabase : RoomDatabase() {

    abstract fun getPlanetDao() : PlanetDao
}