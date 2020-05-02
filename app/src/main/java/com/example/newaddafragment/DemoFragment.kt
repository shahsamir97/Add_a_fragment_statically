package com.example.newaddafragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.newaddafragment.databinding.DemoBinding


/**
 * A simple [Fragment] subclass.
 */
class DemoFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       var binding : DemoBinding = DataBindingUtil.inflate(inflater, R.layout.demo , container, false)
        return binding.root
    }

}
