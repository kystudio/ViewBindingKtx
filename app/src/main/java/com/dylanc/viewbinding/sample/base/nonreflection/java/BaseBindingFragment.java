package com.dylanc.viewbinding.sample.base.nonreflection.java;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewbinding.ViewBinding;

import com.dylanc.viewbinding.base.ViewBindingUtil;


public abstract class BaseBindingFragment<VB extends ViewBinding> extends Fragment {

  private VB binding;

  @Nullable
  @Override
  public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
    binding = onCreateViewBinding(inflater, container);
    return binding.getRoot();
  }

  @Override
  public void onDestroyView() {
    super.onDestroyView();
    binding = null;
  }

  public VB getBinding() {
    return binding;
  }

  protected abstract VB onCreateViewBinding(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent);
}
