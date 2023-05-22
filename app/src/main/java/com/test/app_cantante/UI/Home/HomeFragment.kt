package com.test.app_cantante.UI.Home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.test.app_cantante.R
import com.test.app_cantante.UI.viewmodel.SingerViewModel
import com.test.app_cantante.databinding.FragmentHomeBinding

/**
 This fragment works as home view from the application
 */
class HomeFragment : Fragment() {
    private lateinit var binding: FragmentHomeBinding

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
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

}