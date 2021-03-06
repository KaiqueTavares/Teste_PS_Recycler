package com.tavares.kaique.teste_ps_recycler.model

import android.os.Parcel
import android.os.Parcelable

/**
 * Created by kaique on 15/06/2018.
 */

data class Heroi (
        val titulo : String,
        val resourceId: Int,
        val descricao: String,
        val forca: Int,
        val velocidade: Int):Parcelable {
    constructor(parcel: Parcel) : this(
            parcel.readString(),
            parcel.readInt(),
            parcel.readString(),
            parcel.readInt(),
            parcel.readInt()) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(titulo)
        parcel.writeInt(resourceId)
        parcel.writeString(descricao)
        parcel.writeInt(forca)
        parcel.writeInt(velocidade)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Heroi> {
        override fun createFromParcel(parcel: Parcel): Heroi {
            return Heroi(parcel)
        }

        override fun newArray(size: Int): Array<Heroi?> {
            return arrayOfNulls(size)
        }
    }
}
