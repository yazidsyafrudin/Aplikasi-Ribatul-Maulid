package com.example.alribat.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import com.example.alribat.R
import com.example.alribat.adapters.MenuAdapter
import com.example.alribat.databinding.FragmentBerandaBinding
import com.example.alribat.models.MenuItem

class BerandaFragment : Fragment(R.layout.fragment_beranda) {
    private var _binding: FragmentBerandaBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentBerandaBinding.bind(view)

        setupMenu()
    }

    private fun setupMenu() {
        val listMenu = listOf(
            MenuItem("Dalail Khairot", R.drawable.ic_dalail),
            MenuItem("Tahlil", R.drawable.ic_tahlil),
            MenuItem("Dibaan", R.drawable.ic_dibaan),
            MenuItem("Burdah", R.drawable.ic_burdah),
            MenuItem("Manakip", R.drawable.ic_manakip),
            MenuItem("Washilatut Khariah", R.drawable.ic_washila)
        )

        binding.rvMainMenu.layoutManager = GridLayoutManager(requireContext(), 3)
        binding.rvMainMenu.adapter = MenuAdapter(listMenu) { menu ->
            // Logika navigasi saat item diklik
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}