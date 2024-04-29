package com.example.carroeletrico.prestation.data.local

import android.provider.BaseColumns

object CarrosContract {

    const val DATABASE_NAME = "db_car"

    object CarEntry : BaseColumns {


        const val TABLE_NAME = "car"
        const val COLUMN_NAME_CAR_ID = "car_id"
        const val COLUMN_NAME_PRECO = "preco"
        const val COLUMN_NAME_BACTERIA = "bacteria"
        const val COLUMN_NAME_POTENTIATE = "potentiate"
        const val COLUMN_NAME_RECARGO = "recharger"
        const val COLUMN_NAME_URL_PHOTO = "url_photo"

    }

    const val TABLE_CAR =
        "CREATE TABLE ${CarEntry.TABLE_NAME} (" +
                "${BaseColumns._ID} INTEGER PRIMARY KEY," +
                "${CarEntry.COLUMN_NAME_CAR_ID} TEXT," +
                "${CarEntry.COLUMN_NAME_PRECO} TEXT," +
                "${CarEntry.COLUMN_NAME_BACTERIA} TEXT," +
                "${CarEntry.COLUMN_NAME_POTENTIATE} TEXT," +
                "${CarEntry.COLUMN_NAME_RECARGO} TEXT," +
                "${CarEntry.COLUMN_NAME_URL_PHOTO} TEXT"

    const val SQL_DELETE_ENTRIES =
        "DROP TABLE IF EXISTS ${CarEntry.TABLE_NAME}"


}