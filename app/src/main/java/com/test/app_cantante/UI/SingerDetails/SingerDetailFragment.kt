package com.test.app_cantante.UI.SingerDetails

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import com.test.app_cantante.R
import com.test.app_cantante.UI.viewmodel.SingerViewModel
import com.test.app_cantante.databinding.FragmentHomeBinding
import com.test.app_cantante.databinding.FragmentSingerDetailBinding

/**
This fragment works as details singer view which shows all information from singers
 */
class SingerDetailFragment : Fragment() {

    private lateinit var binding: FragmentSingerDetailBinding

    private val singerViewModel: SingerViewModel by activityViewModels{
        SingerViewModel.Factory
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSingerDetailBinding.inflate(inflater, container, false)
        return binding.root
    }

}