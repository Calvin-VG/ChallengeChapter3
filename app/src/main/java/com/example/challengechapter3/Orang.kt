package com.example.challengechapter3

import android.os.Parcel
import android.os.Parcelable

data class Orang(val nama: String?, val usia: String?, val ganjilgenap: String?, val alamat: String?, val pekerjaan: String?): Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(nama)
        parcel.writeString(usia)
        parcel.writeString(ganjilgenap)
        parcel.writeString(alamat)
        parcel.writeString(pekerjaan)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Orang> {
        override fun createFromParcel(parcel: Parcel): Orang {
            return Orang(parcel)
        }

        override fun newArray(size: Int): Array<Orang?> {
            return arrayOfNulls(size)
        }
    }
}