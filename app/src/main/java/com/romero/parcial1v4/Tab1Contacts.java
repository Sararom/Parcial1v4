package com.romero.parcial1v4;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class Tab1Contacts extends Fragment {

    private RecyclerView myRecyclerView;
    private List<Contact> lstContacts;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tab1contacts, container, false);
        myRecyclerView = (RecyclerView) rootView.findViewById(R.id.contact_recycler);
        RecyclerViewAdapter recyclerAdapter = new RecyclerViewAdapter(getContext(),lstContacts);
        myRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        myRecyclerView.setAdapter(recyclerAdapter);

        return rootView;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        lstContacts = new ArrayList<>();
        lstContacts.add(new Contact("Desgraciado 1","22222222",R.drawable.contact_pp));
        lstContacts.add(new Contact("Desgraciado 2","88888888",R.drawable.contact_pp));
        lstContacts.add(new Contact("Desgraciado 3","77777777",R.drawable.contact_pp));

    }
}
