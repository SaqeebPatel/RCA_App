package com.empire.researchcomputeracademy;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.ViewFlipper;

import androidx.fragment.app.Fragment;

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
import com.empire.researchcomputeracademy.dialog.ppsdDialog;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.smarteist.autoimageslider.IndicatorAnimations;
import com.smarteist.autoimageslider.IndicatorView.draw.controller.DrawController;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {
    FirebaseAuth firebaseAuth;
    FirebaseUser firebaseUser;
    public Button today, listofinfo, create;
    ViewFlipper viewFlipper;
    SliderView sliderView;
    TextView typing,ccc, doa,dcim, programming, history,cccplus, trending;
    public ImageButton doabtn , tallybtn , adtallybtnn, autocadbtn, hardwarebtn, graphicsbtn, englishbtn;
    ImageButton mobutton ,progbutton, ppsdbutton;


    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        firebaseAuth = FirebaseAuth.getInstance();
        firebaseUser = firebaseAuth.getCurrentUser();



        doa= (TextView) view.findViewById(R.id.doa);
        doa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(),doaFragment.class));
            }
        });



        typing= (TextView) view.findViewById(R.id.dcia);
        typing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(),TypingActivity.class));
            }
        });


        ccc= (TextView) view.findViewById(R.id.ccc);
        ccc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(),cccFragment.class));
            }
        });



        programming= (TextView) view.findViewById(R.id.programming);
        programming.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(),ProgramFragment.class));
            }
        });




       /*istory = (TextView) view.findViewById(R.id.history);
        history.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://besthistorysites.net/")));
            }
        });*/

        cccplus= (TextView) view.findViewById(R.id.cccplus);
        cccplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(),cccplusFragment.class));
            }
        });


        dcim = (TextView) view.findViewById(R.id.dcim);
        dcim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(),dcimFragment.class));
            }
        });

       /* trending = (TextView) view.findViewById(R.id.trending);
        trending.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.ndtv.com/trends/trends")));
            }
        });*/


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



      //  ppsdbutton = (ImageButton)view.findViewById(R.id.ppsdbutton);
       // ppsdbutton.setOnClickListener(new View.OnClickListener() {
       //     @Override
        //    public void onClick(View v) {

              //  ppsdDialog ppd = new ppsdDialog(getActivity());
              //  ppd.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
              //  ppd.setCancelable(true);
     //     }
      //  });


        progbutton = (ImageButton)view.findViewById(R.id.progbutton);
        progbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ProgDailog pgd = new ProgDailog(getActivity());
                pgd.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                pgd.setCancelable(true);
                pgd.show();

            }
        });


        mobutton = (ImageButton) view.findViewById(R.id.mobutton);
        mobutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MoDialoug md = new MoDialoug(getActivity());
                md.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                md.setCancelable(true);
                md.show();

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

        return view;

    }

}
