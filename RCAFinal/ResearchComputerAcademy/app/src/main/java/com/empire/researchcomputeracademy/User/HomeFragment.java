package com.empire.researchcomputeracademy.User;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import com.empire.researchcomputeracademy.Authentication.LoginActivity;
import com.empire.researchcomputeracademy.Authentication.RegisterActivity;
import com.empire.researchcomputeracademy.CccActivity;
import com.empire.researchcomputeracademy.CccplusActivity;
import com.empire.researchcomputeracademy.DciaActivity;
import com.empire.researchcomputeracademy.DcimActivity;
import com.empire.researchcomputeracademy.DoaActivity;
import com.empire.researchcomputeracademy.ProgrammingActivity;
import com.empire.researchcomputeracademy.R;
import com.empire.researchcomputeracademy.adapter.SliderAdapterExample;
import com.empire.researchcomputeracademy.dialog.AdtllyDialog;
import com.empire.researchcomputeracademy.dialog.AutocadDialog;
import com.empire.researchcomputeracademy.dialog.DoaDialog;
import com.empire.researchcomputeracademy.dialog.EnglishDialog;
import com.empire.researchcomputeracademy.dialog.GraphicsDialog;
import com.empire.researchcomputeracademy.dialog.HardwareDialog;
import com.empire.researchcomputeracademy.dialog.MoDialoug;
import com.empire.researchcomputeracademy.dialog.ProgDailog;
import com.empire.researchcomputeracademy.dialog.TallyDialog;
import com.smarteist.autoimageslider.IndicatorAnimations;
import com.smarteist.autoimageslider.IndicatorView.draw.controller.DrawController;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;


public class HomeFragment extends Fragment {

    SliderView sliderView;
    private TextView prog,ccc, cccPlus, doa, dcim, dcia;
    public ImageButton doabtn , tallybtn , adtallybtnn, autocadbtn, hardwarebtn, graphicsbtn, englishbtn, progBtn, mo;
    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        dcim = view.findViewById(R.id.dcim);
        ccc = view.findViewById(R.id.ccc);
        cccPlus = view.findViewById(R.id.cccplus);
        doa = view.findViewById(R.id.doa);
        prog = view.findViewById(R.id.programming);
        dcia = view.findViewById(R.id.dcia);

        doa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getContext(), DoaActivity.class));

            }
        });

        cccPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(getContext(), CccplusActivity.class));
            }
        });
        dcia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getContext(), DciaActivity.class));
            }
        });

        dcim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getContext(), DcimActivity.class));
            }
        });

        prog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getContext(), ProgrammingActivity.class));
            }
        });

        ccc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getContext(), CccActivity.class));
            }
        });



        sliderView = view.findViewById(R.id.imageSlider);

        final SliderAdapterExample adapter = new SliderAdapterExample(getContext());
        adapter.setCount(4);
        sliderView.setSliderAdapter(adapter);

        sliderView.setIndicatorAnimation(IndicatorAnimations.SLIDE); //set indicator animation by using SliderLayout.IndicatorAnimations. :WORM or THIN_WORM or COLOR or DROP or FILL or NONE or SCALE or SCALE_DOWN or SLIDE and SWAP!!
        sliderView.setSliderTransformAnimation(SliderAnimations.FADETRANSFORMATION);
        sliderView.setAutoCycleDirection(SliderView.LAYOUT_DIRECTION_INHERIT);
        sliderView.setIndicatorSelectedColor(Color.WHITE);
        sliderView.setIndicatorUnselectedColor(Color.GRAY);
        sliderView.setScrollTimeInSec(3);
        sliderView.startAutoCycle();

        sliderView.setOnIndicatorClickListener(new DrawController.ClickListener() {
            @Override
            public void onIndicatorClicked(int position) {
                sliderView.setCurrentPagePosition(position);
            }
        });

        doabtn=(ImageButton)view.findViewById(R.id.doabutton);
        doabtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DoaDialog doa = new DoaDialog(getActivity());
                doa.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                doa.setCancelable(true);
                doa.show();

            }
        });

        tallybtn=(ImageButton) view.findViewById(R.id.tallybutton);
        tallybtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TallyDialog td = new TallyDialog(getActivity());
                td.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                td.setCancelable(true);
                td.show();

            }
        });

        adtallybtnn=(ImageButton) view.findViewById(R.id.adtallybutton);
        adtallybtnn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AdtllyDialog atd = new AdtllyDialog(getActivity());
                atd.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                atd.setCancelable(true);
                atd.show();

            }
        });

        autocadbtn=(ImageButton) view.findViewById(R.id.autocadbutton);
        autocadbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AutocadDialog actd = new AutocadDialog(getActivity());
                actd.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                actd.setCancelable(true);
                actd.show();

            }
        });

        hardwarebtn=(ImageButton) view.findViewById(R.id.hardwarebutton);
        hardwarebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                HardwareDialog hd = new HardwareDialog(getActivity());
                hd.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                hd.setCancelable(true);
                hd.show();
            }
        });

        graphicsbtn=(ImageButton) view.findViewById(R.id.graphicsbutton);
        graphicsbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GraphicsDialog gd = new GraphicsDialog(getActivity());
                gd.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                gd.setCancelable(true);
                gd.show();
            }
        });

        englishbtn=(ImageButton) view.findViewById(R.id.englishbutton);
        englishbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EnglishDialog ed = new EnglishDialog(getActivity());
                ed.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                ed.setCancelable(true);
                ed.show();
            }
        });

        progBtn = view.findViewById(R.id.progbutton);
        progBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ProgDailog ed = new ProgDailog(getActivity());
                ed.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                ed.setCancelable(true);
                ed.show();
            }
        });


        mo = view.findViewById(R.id.mobutton);
        mo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MoDialoug ed = new MoDialoug(getActivity());
                ed.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                ed.setCancelable(true);
                ed.show();
            }
        });
        return view;
    }
}