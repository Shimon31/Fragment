package com.example.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class OneFragment extends Fragment {

    EditText editTextOne,editTextTwo,email,pass;
    Button button;



    public OneFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_one, container, false);

        editTextOne = view.findViewById(R.id.editTextOne);
        editTextTwo = view.findViewById(R.id.editTextTwo);
        email = view.findViewById(R.id.email);
        pass = view.findViewById(R.id.Pass);

        button = view.findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Button Clicked", Toast.LENGTH_SHORT).show();
            }
        });




        return view;
    }
}