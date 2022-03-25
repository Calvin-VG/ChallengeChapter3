package com.example.challengechapter3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_screen2.*
import kotlinx.android.synthetic.main.fragment_screen3.*

class Screen3Fragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_screen3, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val ambilnama = arguments?.getString("NAME")
        tv_namasatu.text = ambilnama

        btn_gotoscreen4.setOnClickListener {
            val datanama = bundleOf("NAME_SCRN3" to ambilnama)
            Navigation.findNavController(view).navigate(R.id.goto_screen4, datanama)
        }

//        val ambilnamascrn4 = arguments?.getString("NAME_SCRN4")
//        val ambilusia = arguments?.getString("USIA")
//        val ganjilgenap = arguments?.getString("GANJILGENAP")
//        val ambilalamat = arguments?.getString("ALAMAT")
//        val ambilpekerjaan = arguments?.getString("PEKERJAAN")

        val ambildataorang = arguments?.getParcelable<Orang>("DATA_ORANG")
        tv_namadua.text = ambildataorang?.nama
        tv_usia.text = ambildataorang?.usia
        tv_ganjilgenap.text = ambildataorang?.ganjilgenap
        tv_alamat.text = ambildataorang?.alamat
        tv_pekerjaan.text = ambildataorang?.pekerjaan
    }
}