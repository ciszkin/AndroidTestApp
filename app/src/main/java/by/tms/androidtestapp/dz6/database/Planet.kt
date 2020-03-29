package by.tms.androidtestapp.dz6.database

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Planet(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val name: String,
    val radius: Int,
    val mass: Double,
    val imageUrl: String
)