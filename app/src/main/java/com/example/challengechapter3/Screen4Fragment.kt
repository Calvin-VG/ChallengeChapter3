package com.example.challengechapter3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_screen4.*

class Screen4Fragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_screen4, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btn_gobackscreen3.setOnClickListener {
            val ambilnamascrn3 = arguments?.getString("NAME_SCRN3")

            val usia = et_masukkanusia.text.toString()
            val alamat = et_masukkanalamat.text.toString()
            val pekerjaan = et_masukkanpekerjaan.text.toString()

            val ganjilgenap = if (usia.toInt() % 2 == 0){
                ", Genap"
            }else{
                ", Ganjil"
            }

            val data = Orang(ambilnamascrn3!!, usia, ganjilgenap, alamat, pekerjaan)
            val dataorang = bundleOf("DATA_ORANG" to data)

//            val dataorang = bundleOf("NAME_SCRN4" to ambilnamascrn3, "USIA" to usia, "GANJILGENAP" to ganjilgenap, "ALAMAT" to alamat, "PEKERJAAN" to pekerjaan)
            Navigation.findNavController(view).navigate(R.id.goback_screen3, dataorang)
        }
    }
}