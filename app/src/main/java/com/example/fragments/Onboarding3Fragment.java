package com.example.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.fragments.databinding.FragmentOnboarding1Binding;
import com.example.fragments.databinding.FragmentOnboarding3Binding;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Onboarding3Fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Onboarding3Fragment extends Fragment {

    Button botonSiguiente;
    Button botonSkip;
    NavController navController;
    private FragmentOnboarding3Binding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return (binding = FragmentOnboarding3Binding.inflate(inflater, container, false)).getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        navController = Navigation.findNavController(view);

        binding.botonSiguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.action_onboarding3Fragment_to_onboarding1Fragment);
            }
        });

        binding.botonSkip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.action_onboarding3Fragment_to_homeFragment);
            }
        });
    }
}