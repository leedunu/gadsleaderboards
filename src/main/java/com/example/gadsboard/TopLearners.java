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

public class TopLearners extends Fragment {

    private ArrayList<DataList> dataLists;

    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;

    public TopLearners(){}

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.learners_fragment, container, false);
        recyclerView = view.findViewById(R.id.learners_recycler);

        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        dataLists = new ArrayList<>();
        adapter = new RecyclerAdapter(dataLists);
        recyclerView.setAdapter(adapter);

        dataLists.add(new DataList(R.drawable.batch,"jonh","200 learning hours","nigeria"));
        dataLists.add(new DataList(R.drawable.batch,"jonh","200 learning hours","nigeria"));
        dataLists.add(new DataList(R.drawable.batch,"jonh","200 learning hours","nigeria"));
        dataLists.add(new DataList(R.drawable.batch,"jonh","200 learning hours","nigeria"));
        dataLists.add(new DataList(R.drawable.batch,"jonh","200 learning hours","nigeria"));
        dataLists.add(new DataList(R.drawable.batch,"jonh","200 learning hours","nigeria"));
        dataLists.add(new DataList(R.drawable.batch,"jonh","200 learning hours","nigeria"));
        dataLists.add(new DataList(R.drawable.batch,"jonh","200 learning hours","nigeria"));
        dataLists.add(new DataList(R.drawable.batch,"jonh","200 learning hours","nigeria"));
        dataLists.add(new DataList(R.drawable.batch,"jonh","200 learning hours","nigeria"));
        dataLists.add(new DataList(R.drawable.batch,"jonh","200 learning hours","nigeria"));
        dataLists.add(new DataList(R.drawable.batch,"jonh","200 learning hours","nigeria"));
        dataLists.add(new DataList(R.drawable.batch,"jonh","200 learning hours","nigeria"));
        dataLists.add(new DataList(R.drawable.batch,"jonh","200 learning hours","nigeria"));
        dataLists.add(new DataList(R.drawable.batch,"jonh","200 learning hours","nigeria"));
        dataLists.add(new DataList(R.drawable.batch,"jonh","200 learning hours","nigeria"));
        dataLists.add(new DataList(R.drawable.batch,"jonh","200 learning hours","nigeria"));
        dataLists.add(new DataList(R.drawable.batch,"jonh","200 learning hours","nigeria"));
        dataLists.add(new DataList(R.drawable.batch,"jonh","200 learning hours","nigeria"));
        dataLists.add(new DataList(R.drawable.batch,"jonh","200 learning hours","nigeria"));
        dataLists.add(new DataList(R.drawable.batch,"jonh","200 learning hours","nigeria"));
        dataLists.add(new DataList(R.drawable.batch,"jonh","200 learning hours","nigeria"));


        return view;
    }


}
