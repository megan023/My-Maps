package edu.stanford.meganliu.mymaps.models

import java.io.Serializable

class Place(val title:String, val description: String, val latitude: Double, val longitude: Double) : Serializable {
}