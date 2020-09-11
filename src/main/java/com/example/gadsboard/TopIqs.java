package com.example.gadsboard;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class TopIqs extends Fragment {

    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;

    private ArrayList<DataList> dataLists;

    public TopIqs(){}

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.iq_fragment, container, false);
        recyclerView = view.findViewById(R.id.iq_recycler);

        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        dataLists = new ArrayList<>();
        adapter = new RecyclerAdapter(dataLists);
        recyclerView.setAdapter(adapter);

        dataLists.add(new DataList(R.drawable.star, "moker mau", "300 skill iq","ghana"));
        dataLists.add(new DataList(R.drawable.star, "moker mau", "300 skill iq","ghana"));
        dataLists.add(new DataList(R.drawable.star, "moker mau", "300 skill iq","ghana"));
        dataLists.add(new DataList(R.drawable.star, "moker mau", "300 skill iq","ghana"));
        dataLists.add(new DataList(R.drawable.star, "moker mau", "300 skill iq","ghana"));
        dataLists.add(new DataList(R.drawable.star, "moker mau", "300 skill iq","ghana"));
        dataLists.add(new DataList(R.drawable.star, "moker mau", "300 skill iq","ghana"));
        dataLists.add(new DataList(R.drawable.star, "moker mau", "300 skill iq","ghana"));
        dataLists.add(new DataList(R.drawable.star, "moker mau", "300 skill iq","ghana"));
        dataLists.add(new DataList(R.drawable.star, "moker mau", "300 skill iq","ghana"));
        dataLists.add(new DataList(R.drawable.star, "moker mau", "300 skill iq","ghana"));
        dataLists.add(new DataList(R.drawable.star, "moker mau", "300 skill iq","ghana"));
        dataLists.add(new DataList(R.drawable.star, "moker mau", "300 skill iq","ghana"));
        dataLists.add(new DataList(R.drawable.star, "moker mau", "300 skill iq","ghana"));
        dataLists.add(new DataList(R.drawable.star, "moker mau", "300 skill iq","ghana"));
        dataLists.add(new DataList(R.drawable.star, "moker mau", "300 skill iq","ghana"));
        dataLists.add(new DataList(R.drawable.star, "moker mau", "300 skill iq","ghana"));
        dataLists.add(new DataList(R.drawable.star, "moker mau", "300 skill iq","ghana"));
        dataLists.add(new DataList(R.drawable.star, "moker mau", "300 skill iq","ghana"));
        dataLists.add(new DataList(R.drawable.star, "moker mau", "300 skill iq","ghana"));


        return view;
    }
}
