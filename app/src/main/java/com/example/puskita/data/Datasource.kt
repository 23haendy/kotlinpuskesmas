package com.example.puskita.data

import com.example.puskita.R
import com.example.puskita.model.Puskita

class Datasource {

    fun loadPuskitas(): List<Puskita>{
        return listOf<Puskita>(
            Puskita(R.string.puskita1, R.drawable.image1),
            Puskita(R.string.puskita2, R.drawable.image2),
            Puskita(R.string.puskita3, R.drawable.image3),
            Puskita(R.string.puskita4, R.drawable.image4),
            Puskita(R.string.puskita5, R.drawable.image5)
        )
    }
}