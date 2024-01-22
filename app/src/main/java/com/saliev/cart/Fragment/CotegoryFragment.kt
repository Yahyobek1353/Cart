package com.saliev.cart.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.saliev.cart.R
import com.saliev.cart.databinding.FragmentCotegoryBinding


class CotegoryFragment : Fragment() {
    private lateinit var binding: FragmentCotegoryBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding = FragmentCotegoryBinding.inflate(inflater,container,false)
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnFrCategori.setOnClickListener {
            findNavController().navigateUp()
        }
    }

}