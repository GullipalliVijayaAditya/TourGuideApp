package com.example.aditya.tourguideapp;

import android.content.Context;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import static android.widget.Toast.LENGTH_SHORT;


public class NightlifeFragment extends Fragment {

    //ArrayList holding Attraction objects
    static ArrayList<Attraction> attractions = new ArrayList<>();

    // RecyclerView object which will manage the list view recycling
    RecyclerView attractionRecyclerView;

    // Listener used to call methods implemented in MainActivity
    AttractionViewHolder.AttractionListener listener;

    // Context which will be used to populate array
    Context mContext;

    /**
     * Called when the fragment is visible to the user and actively running.
     * This is generally
     * tied to onResume() Activity.onResume} of the containing
     * Activity's lifecycle.
     */
    @Override
    public void onResume() {
        super.onResume();
        Log.v("NightlifeFragment", "onResume running");

    }

    public NightlifeFragment() {
        // Required empty public constructor
    }

    public static NightlifeFragment newInstance() {
        NightlifeFragment fragment = new NightlifeFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        mContext = context;

        Log.v("NightlifeFragment", "onAttach running");

        if (context instanceof AttractionViewHolder.AttractionListener) {
            listener = (AttractionViewHolder.AttractionListener) context;
        }
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Log.v("NightlifeFragment", "onCreate running");

        // Populate a list of Nightlife Attractions using the context that was passed in during
        // onAttach method
        attractions = new Attraction().getNightlifeArray(mContext);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_layout, container, false);
        // Inflate the layout for this fragment

        Log.v("NightlifeFragment", "onCreateView running");

        attractionRecyclerView = view.findViewById(R.id.recycler_list);
        attractionRecyclerView.setHasFixedSize(true);

        // Create a new LinearLayoutManager to set up how the recyclerview list will look
        LinearLayoutManager myLinearLayoutManager = new LinearLayoutManager(getActivity());

        //Check if activity is running in landscape mode, if so, do not run the next line(s) of code
        //Tips for creating and using bool resource files found on stackoverflow.com
        boolean isLandscapeMode = getResources().getBoolean(R.bool.is_in_landscape_mode);

        // If in portrait mode, use LinearLayoutManager.VERTICAL
        // If in landscape mode, use LinearLayoutManager.HORIZONTAL
        if (isLandscapeMode) {
            myLinearLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        } else {
            myLinearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        }

        if (attractions.size() > 0 & attractionRecyclerView != null) {
            attractionRecyclerView.setAdapter(new AttractionRecyclerViewAdapter(attractions, R.layout
                    .vertical_one_column_item_list, getActivity(), listener));
        }

        attractionRecyclerView.setLayoutManager(myLinearLayoutManager);

        return view;
    }

    /**
     * Method from superclass. Used for troubleshooting app
     */
    @Override
    public void onDetach() {
        super.onDetach();
        Log.v("NightlifeFrag", "NightlifeFragment detached");
        listener = null;
    }
}
