package com.example.puskita.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Puskita (
    @StringRes val stringResourceId: Int,
    @DrawableRes val imageResourceId: Int
    )
