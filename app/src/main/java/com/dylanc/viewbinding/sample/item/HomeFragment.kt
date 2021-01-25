package com.dylanc.viewbinding.sample.item

import android.os.Bundle
import android.view.View
import com.dylanc.viewbinding.sample.base.nonreflection.kotlin.BaseBindingFragment
import com.dylanc.viewbinding.sample.databinding.FragmentHomeBinding

class HomeFragment : BaseBindingFragment<FragmentHomeBinding>(FragmentHomeBinding::inflate) {

  override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    super.onViewCreated(view, savedInstanceState)

    binding.tvInfo.text = "hello"
  }
}