package com.test.app_cantante.UI.NewSinger

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.test.app_cantante.R
import com.test.app_cantante.UI.viewmodel.SingerViewModel
import com.test.app_cantante.databinding.FragmentHomeBinding
import com.test.app_cantante.databinding.FragmentNewSingerBinding

/**
This fragment works as form to add new singers
 */
class NewSingerFragment : Fragment() {

    private lateinit var binding: FragmentNewSingerBinding

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
        binding = FragmentNewSingerBinding.inflate(inflater, container, false)
        return binding.root
    }

}