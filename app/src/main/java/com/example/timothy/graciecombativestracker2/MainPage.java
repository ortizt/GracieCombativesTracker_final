package com.example.timothy.graciecombativestracker2;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View.OnClickListener;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.ToggleButton;
import android.content.Intent;
import android.content.ActivityNotFoundException;
import android.widget.ImageView;



public class MainPage extends AppCompatActivity {

    private ProgressBar beltstripe1 = null;
    private ProgressBar beltstripe2 = null;
    private ProgressBar beltstripe3 = null;
    private ProgressBar beltstripe4 = null;
    private ToggleButton c1button1 = null;
    private ToggleButton c1button2 = null;
    private ToggleButton c2button1 = null;
    private ToggleButton c2button2 = null;
    private ToggleButton c3button1 = null;
    private ToggleButton c3button2 = null;
    private ToggleButton c4button1 = null;
    private ToggleButton c4button2 = null;
    private ToggleButton c5button1 = null;
    private ToggleButton c5button2 = null;
    private ToggleButton c6button1 = null;
    private ToggleButton c6button2 = null;
    private ToggleButton c7button1 = null;
    private ToggleButton c7button2 = null;
    private ToggleButton c8button1 = null;
    private ToggleButton c8button2 = null;
    private ToggleButton c9button1 = null;
    private ToggleButton c9button2 = null;
    private ToggleButton c10button1 = null;
    private ToggleButton c10button2 = null;
    private ToggleButton c11button1 = null;
    private ToggleButton c11button2 = null;
    private ToggleButton c12button1 = null;
    private ToggleButton c12button2 = null;
    private ToggleButton c13button1 = null;
    private ToggleButton c13button2 = null;
    private ToggleButton c14button1 = null;
    private ToggleButton c14button2 = null;
    private ToggleButton c15button1 = null;
    private ToggleButton c15button2 = null;
    private ToggleButton c16button1 = null;
    private ToggleButton c16button2 = null;
    private ToggleButton c17button1 = null;
    private ToggleButton c17button2 = null;
    private ToggleButton c18button1 = null;
    private ToggleButton c18button2 = null;
    private ToggleButton c19button1 = null;
    private ToggleButton c19button2 = null;
    private ToggleButton c20button1 = null;
    private ToggleButton c20button2 = null;
    private ToggleButton c21button1 = null;
    private ToggleButton c21button2 = null;
    private ToggleButton c22button1 = null;
    private ToggleButton c22button2 = null;
    private ToggleButton c23button1 = null;
    private ToggleButton c23button2 = null;
    private ToggleButton cs1 = null;
    private ToggleButton cs2 = null;
    private ToggleButton cs3 = null;
    private ToggleButton cs4 = null;
    private ToggleButton cs5 = null;
    private ToggleButton cs6 = null;
    private ToggleButton cs7 = null;
    private ToggleButton cs8 = null;
    private ToggleButton cs9 = null;
    private ToggleButton cs10 = null;
    private ToggleButton cs11 = null;
    private ToggleButton cs12 = null;
    private ToggleButton cs13 = null;
    private ToggleButton cs14 = null;
    private ToggleButton cs15 = null;
    private ToggleButton cs16 = null;
    private ToggleButton cs17 = null;
    private ToggleButton cs18 = null;
    private ToggleButton cs19 = null;
    private ToggleButton cs20 = null;
    private ToggleButton cs21 = null;
    private ToggleButton cs22 = null;
    private ToggleButton cs23 = null;
    private ImageView calendar = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);
        findViewById(R.id.c1button1).setOnClickListener(mGlobal_OnClickListener);
        findViewById(R.id.c1button2).setOnClickListener(mGlobal_OnClickListener);
        findViewById(R.id.c2button1).setOnClickListener(mGlobal_OnClickListener);
        findViewById(R.id.c2button2).setOnClickListener(mGlobal_OnClickListener);
        findViewById(R.id.c3button1).setOnClickListener(mGlobal_OnClickListener);
        findViewById(R.id.c3button2).setOnClickListener(mGlobal_OnClickListener);
        findViewById(R.id.c4button1).setOnClickListener(mGlobal_OnClickListener);
        findViewById(R.id.c4button2).setOnClickListener(mGlobal_OnClickListener);
        findViewById(R.id.c5button1).setOnClickListener(mGlobal_OnClickListener);
        findViewById(R.id.c5button2).setOnClickListener(mGlobal_OnClickListener);
        findViewById(R.id.c6button1).setOnClickListener(mGlobal_OnClickListener);
        findViewById(R.id.c6button2).setOnClickListener(mGlobal_OnClickListener);
        findViewById(R.id.c7button1).setOnClickListener(mGlobal_OnClickListener);
        findViewById(R.id.c7button2).setOnClickListener(mGlobal_OnClickListener);
        findViewById(R.id.c8button1).setOnClickListener(mGlobal_OnClickListener);
        findViewById(R.id.c8button2).setOnClickListener(mGlobal_OnClickListener);
        findViewById(R.id.c9button1).setOnClickListener(mGlobal_OnClickListener);
        findViewById(R.id.c9button2).setOnClickListener(mGlobal_OnClickListener);
        findViewById(R.id.c10button1).setOnClickListener(mGlobal_OnClickListener);
        findViewById(R.id.c10button2).setOnClickListener(mGlobal_OnClickListener);
        findViewById(R.id.c11button1).setOnClickListener(mGlobal_OnClickListener);
        findViewById(R.id.c11button2).setOnClickListener(mGlobal_OnClickListener);
        findViewById(R.id.c12button1).setOnClickListener(mGlobal_OnClickListener);
        findViewById(R.id.c12button2).setOnClickListener(mGlobal_OnClickListener);
        findViewById(R.id.c13button1).setOnClickListener(mGlobal_OnClickListener);
        findViewById(R.id.c13button2).setOnClickListener(mGlobal_OnClickListener);
        findViewById(R.id.c14button1).setOnClickListener(mGlobal_OnClickListener);
        findViewById(R.id.c14button2).setOnClickListener(mGlobal_OnClickListener);
        findViewById(R.id.c15button1).setOnClickListener(mGlobal_OnClickListener);
        findViewById(R.id.c15button2).setOnClickListener(mGlobal_OnClickListener);
        findViewById(R.id.c16button1).setOnClickListener(mGlobal_OnClickListener);
        findViewById(R.id.c16button2).setOnClickListener(mGlobal_OnClickListener);
        findViewById(R.id.c17button1).setOnClickListener(mGlobal_OnClickListener);
        findViewById(R.id.c17button2).setOnClickListener(mGlobal_OnClickListener);
        findViewById(R.id.c18button1).setOnClickListener(mGlobal_OnClickListener);
        findViewById(R.id.c18button2).setOnClickListener(mGlobal_OnClickListener);
        findViewById(R.id.c19button1).setOnClickListener(mGlobal_OnClickListener);
        findViewById(R.id.c19button2).setOnClickListener(mGlobal_OnClickListener);
        findViewById(R.id.c20button1).setOnClickListener(mGlobal_OnClickListener);
        findViewById(R.id.c20button2).setOnClickListener(mGlobal_OnClickListener);
        findViewById(R.id.c21button1).setOnClickListener(mGlobal_OnClickListener);
        findViewById(R.id.c21button2).setOnClickListener(mGlobal_OnClickListener);
        findViewById(R.id.c22button1).setOnClickListener(mGlobal_OnClickListener);
        findViewById(R.id.c22button2).setOnClickListener(mGlobal_OnClickListener);
        findViewById(R.id.c23button1).setOnClickListener(mGlobal_OnClickListener);
        findViewById(R.id.c23button2).setOnClickListener(mGlobal_OnClickListener);
        findViewById(R.id.c1_traproll).setOnClickListener(mGlobal_OnClickListener);
        findViewById(R.id.c1_leghook).setOnClickListener(mGlobal_OnClickListener);
        findViewById(R.id.c2_americana).setOnClickListener(mGlobal_OnClickListener);
        findViewById(R.id.c2_clinch).setOnClickListener(mGlobal_OnClickListener);
        findViewById(R.id.c3_pos).setOnClickListener(mGlobal_OnClickListener);
        findViewById(R.id.c3_body).setOnClickListener(mGlobal_OnClickListener);
        findViewById(R.id.c4_take).setOnClickListener(mGlobal_OnClickListener);
        findViewById(R.id.c4_clinch).setOnClickListener(mGlobal_OnClickListener);
        findViewById(R.id.c5_punchblock).setOnClickListener(mGlobal_OnClickListener);
        findViewById(R.id.c5_guillotinech).setOnClickListener(mGlobal_OnClickListener);
        findViewById(R.id.c6_straightAl).setOnClickListener(mGlobal_OnClickListener);
        findViewById(R.id.c6_guillotineDef).setOnClickListener(mGlobal_OnClickListener);
        findViewById(R.id.c7_trichoke).setOnClickListener(mGlobal_OnClickListener);
        findViewById(R.id.c7_hpDef).setOnClickListener(mGlobal_OnClickListener);
        findViewById(R.id.c8_elevsweep).setOnClickListener(mGlobal_OnClickListener);
        findViewById(R.id.c8_reartd).setOnClickListener(mGlobal_OnClickListener);
        findViewById(R.id.c9_elbowesc).setOnClickListener(mGlobal_OnClickListener);
        findViewById(R.id.c9_pullguard).setOnClickListener(mGlobal_OnClickListener);
        findViewById(R.id.c10_dltd).setOnClickListener(mGlobal_OnClickListener);
        findViewById(R.id.c10_poscont).setOnClickListener(mGlobal_OnClickListener);
        findViewById(R.id.c11_headlockc).setOnClickListener(mGlobal_OnClickListener);
        findViewById(R.id.c11_stheadlockdef).setOnClickListener(mGlobal_OnClickListener);
        findViewById(R.id.c12_starmlock).setOnClickListener(mGlobal_OnClickListener);
        findViewById(R.id.c12_hlesc).setOnClickListener(mGlobal_OnClickListener);
        findViewById(R.id.c13_clinch).setOnClickListener(mGlobal_OnClickListener);
        findViewById(R.id.c13_straight).setOnClickListener(mGlobal_OnClickListener);
        findViewById(R.id.c14_dbl).setOnClickListener(mGlobal_OnClickListener);
        findViewById(R.id.c14_guil).setOnClickListener(mGlobal_OnClickListener);
        findViewById(R.id.c15_clinch).setOnClickListener(mGlobal_OnClickListener);
        findViewById(R.id.c15_head).setOnClickListener(mGlobal_OnClickListener);
        findViewById(R.id.c16_body).setOnClickListener(mGlobal_OnClickListener);
        findViewById(R.id.c16_shrmp).setOnClickListener(mGlobal_OnClickListener);
        findViewById(R.id.c17_kim).setOnClickListener(mGlobal_OnClickListener);
        findViewById(R.id.c17_leg).setOnClickListener(mGlobal_OnClickListener);
        findViewById(R.id.c18_hay).setOnClickListener(mGlobal_OnClickListener);
        findViewById(R.id.c18_punsh).setOnClickListener(mGlobal_OnClickListener);
        findViewById(R.id.c19_guil).setOnClickListener(mGlobal_OnClickListener);
        findViewById(R.id.c19_hook).setOnClickListener(mGlobal_OnClickListener);
        findViewById(R.id.c20_stand).setOnClickListener(mGlobal_OnClickListener);
        findViewById(R.id.c20_take).setOnClickListener(mGlobal_OnClickListener);
        findViewById(R.id.c21_elbow).setOnClickListener(mGlobal_OnClickListener);
        findViewById(R.id.c21_pull).setOnClickListener(mGlobal_OnClickListener);
        findViewById(R.id.c22_rear).setOnClickListener(mGlobal_OnClickListener);
        findViewById(R.id.c22_twist).setOnClickListener(mGlobal_OnClickListener);
        findViewById(R.id.c23_dblleg).setOnClickListener(mGlobal_OnClickListener);
        findViewById(R.id.c23_dblunder).setOnClickListener(mGlobal_OnClickListener);
        findViewById(R.id.clndr).setOnClickListener(mGlobal_OnClickListener);
        findViewById(R.id.c1).setOnClickListener(mGlobal_OnClickListener);
        findViewById(R.id.c2).setOnClickListener(mGlobal_OnClickListener);
        findViewById(R.id.c3).setOnClickListener(mGlobal_OnClickListener);
        findViewById(R.id.c4).setOnClickListener(mGlobal_OnClickListener);
        findViewById(R.id.c5).setOnClickListener(mGlobal_OnClickListener);
        findViewById(R.id.c6).setOnClickListener(mGlobal_OnClickListener);
        findViewById(R.id.c7).setOnClickListener(mGlobal_OnClickListener);
        findViewById(R.id.c8).setOnClickListener(mGlobal_OnClickListener);
        findViewById(R.id.c9).setOnClickListener(mGlobal_OnClickListener);
        findViewById(R.id.c10).setOnClickListener(mGlobal_OnClickListener);
        findViewById(R.id.c11).setOnClickListener(mGlobal_OnClickListener);
        findViewById(R.id.c12).setOnClickListener(mGlobal_OnClickListener);
        findViewById(R.id.c13).setOnClickListener(mGlobal_OnClickListener);
        findViewById(R.id.c14).setOnClickListener(mGlobal_OnClickListener);
        findViewById(R.id.c15).setOnClickListener(mGlobal_OnClickListener);
        findViewById(R.id.c16).setOnClickListener(mGlobal_OnClickListener);
        findViewById(R.id.c17).setOnClickListener(mGlobal_OnClickListener);
        findViewById(R.id.c18).setOnClickListener(mGlobal_OnClickListener);
        findViewById(R.id.c19).setOnClickListener(mGlobal_OnClickListener);
        findViewById(R.id.c20).setOnClickListener(mGlobal_OnClickListener);
        findViewById(R.id.c21).setOnClickListener(mGlobal_OnClickListener);
        findViewById(R.id.c22).setOnClickListener(mGlobal_OnClickListener);
        findViewById(R.id.c23).setOnClickListener(mGlobal_OnClickListener);
        beltstripe1 = (ProgressBar)findViewById(R.id.beltstripe1);
        beltstripe2 = (ProgressBar)findViewById(R.id.beltstripe2);
        beltstripe3 = (ProgressBar)findViewById(R.id.beltstripe3);
        beltstripe4 = (ProgressBar)findViewById(R.id.beltstripe4);
        c1button1 = (ToggleButton)findViewById(R.id.c1button1);
        c1button2 = (ToggleButton)findViewById(R.id.c1button2);
        c2button1 = (ToggleButton)findViewById(R.id.c2button1);
        c2button2 = (ToggleButton)findViewById(R.id.c2button2);
        c3button1 = (ToggleButton)findViewById(R.id.c3button1);
        c3button2 = (ToggleButton)findViewById(R.id.c3button2);
        c4button1 = (ToggleButton)findViewById(R.id.c4button1);
        c4button2 = (ToggleButton)findViewById(R.id.c4button2);
        c5button1 = (ToggleButton)findViewById(R.id.c5button1);
        c5button2 = (ToggleButton)findViewById(R.id.c5button2);
        c6button1 = (ToggleButton)findViewById(R.id.c6button1);
        c6button2 = (ToggleButton)findViewById(R.id.c6button2);
        c7button1 = (ToggleButton)findViewById(R.id.c7button1);
        c7button2 = (ToggleButton)findViewById(R.id.c7button2);
        c8button1 = (ToggleButton)findViewById(R.id.c8button1);
        c8button2 = (ToggleButton)findViewById(R.id.c8button2);
        c9button1 = (ToggleButton)findViewById(R.id.c9button1);
        c9button2 = (ToggleButton)findViewById(R.id.c9button2);
        c10button1 = (ToggleButton)findViewById(R.id.c10button1);
        c10button2 = (ToggleButton)findViewById(R.id.c10button2);
        c11button1 = (ToggleButton)findViewById(R.id.c11button1);
        c11button2 = (ToggleButton)findViewById(R.id.c11button2);
        c12button1 = (ToggleButton)findViewById(R.id.c12button1);
        c12button2 = (ToggleButton)findViewById(R.id.c12button2);
        c13button1 = (ToggleButton)findViewById(R.id.c13button1);
        c13button2 = (ToggleButton)findViewById(R.id.c13button2);
        c14button1 = (ToggleButton)findViewById(R.id.c14button1);
        c14button2 = (ToggleButton)findViewById(R.id.c14button2);
        c15button1 = (ToggleButton)findViewById(R.id.c15button1);
        c15button2 = (ToggleButton)findViewById(R.id.c15button2);
        c16button1 = (ToggleButton)findViewById(R.id.c16button1);
        c16button2 = (ToggleButton)findViewById(R.id.c16button2);
        c17button1 = (ToggleButton)findViewById(R.id.c17button1);
        c17button2 = (ToggleButton)findViewById(R.id.c17button2);
        c18button1 = (ToggleButton)findViewById(R.id.c18button1);
        c18button2 = (ToggleButton)findViewById(R.id.c18button2);
        c19button1 = (ToggleButton)findViewById(R.id.c19button1);
        c19button2 = (ToggleButton)findViewById(R.id.c19button2);
        c20button1 = (ToggleButton)findViewById(R.id.c20button1);
        c20button2 = (ToggleButton)findViewById(R.id.c20button2);
        c21button1 = (ToggleButton)findViewById(R.id.c21button1);
        c21button2 = (ToggleButton)findViewById(R.id.c21button2);
        c22button1 = (ToggleButton)findViewById(R.id.c22button1);
        c22button2 = (ToggleButton)findViewById(R.id.c22button2);
        c23button1 = (ToggleButton)findViewById(R.id.c23button1);
        c23button2 = (ToggleButton)findViewById(R.id.c23button2);
        cs1 = (ToggleButton)findViewById(R.id.c1);
        cs2 = (ToggleButton)findViewById(R.id.c2);
        cs3 = (ToggleButton)findViewById(R.id.c3);
        cs4 = (ToggleButton)findViewById(R.id.c4);
        cs5 = (ToggleButton)findViewById(R.id.c5);
        cs6 = (ToggleButton)findViewById(R.id.c6);
        cs7 = (ToggleButton)findViewById(R.id.c7);
        cs8 = (ToggleButton)findViewById(R.id.c8);
        cs9 = (ToggleButton)findViewById(R.id.c9);
        cs10 = (ToggleButton)findViewById(R.id.c10);
        cs11 = (ToggleButton)findViewById(R.id.c11);
        cs12 = (ToggleButton)findViewById(R.id.c12);
        cs13 = (ToggleButton)findViewById(R.id.c13);
        cs14 = (ToggleButton)findViewById(R.id.c14);
        cs15 = (ToggleButton)findViewById(R.id.c15);
        cs16 = (ToggleButton)findViewById(R.id.c16);
        cs17 = (ToggleButton)findViewById(R.id.c17);
        cs18 = (ToggleButton)findViewById(R.id.c18);
        cs19 = (ToggleButton)findViewById(R.id.c19);
        cs20 = (ToggleButton)findViewById(R.id.c20);
        cs21 = (ToggleButton)findViewById(R.id.c21);
        cs22 = (ToggleButton)findViewById(R.id.c22);
        cs23 = (ToggleButton)findViewById(R.id.c23);

    }
    void redButton(ToggleButton rdbttn1, ToggleButton rdbttn2, ToggleButton clss, ProgressBar blt1, ProgressBar blt2,
                   ProgressBar blt3, ProgressBar blt4,  int int1, int int2, int int3, int int4){
        if(rdbttn1.isChecked() && int1 < 100) {
            blt1.incrementProgressBy(5);
        }
        else if(rdbttn1.isChecked() && int1 == 100 && int2 < 100) {
            blt2.incrementProgressBy(5);
        }
        else if(rdbttn1.isChecked() && int2 == 100 && int3 < 100) {
            blt3.incrementProgressBy(5);
        }
        else if(rdbttn1.isChecked() && int3 == 100 && int4 < 100) {
            blt4.incrementProgressBy(5);
        }
        else if(!rdbttn1.isChecked() && int1 > 0 && int1 <=100 && int2 == 0) {
            blt1.incrementProgressBy(-5);
        }
        else if(!rdbttn1.isChecked() && int2 > 0 && int2 <=100 && int3 == 0) {
            blt2.incrementProgressBy(-5);
        }
        else if(!rdbttn1.isChecked() && int3 > 0 && int3 <=100 && int4 == 0) {
            blt3.incrementProgressBy(-5);
        }
        else if(!rdbttn1.isChecked() && int4 > 0 && int4 <=100) {
            blt4.incrementProgressBy(-5);
        }
        if(rdbttn1.isChecked() && rdbttn2.isChecked()){
            clss.setBackgroundResource(R.drawable.classcheck0);
            clss.setClickable(true);
        }
        else {
            clss.setBackgroundResource(R.drawable.bordershape);
            clss.setClickable(false);
        }
    }

    void redButton2(ToggleButton rdbttn1, ToggleButton rdbttn2, ToggleButton clss, ProgressBar blt1, ProgressBar blt2,
                   ProgressBar blt3, ProgressBar blt4,  int int1, int int2, int int3, int int4){
        if(rdbttn1.isChecked() && int1 < 100) {
            blt1.incrementProgressBy(5);
        }
        else if(rdbttn1.isChecked() && int1 == 100 && int2 < 100) {
            blt2.incrementProgressBy(5);
        }
        else if(rdbttn1.isChecked() && int2 == 100 && int3 < 100) {
            blt3.incrementProgressBy(5);
        }
        else if(rdbttn1.isChecked() && int3 == 100 && int4 < 100) {
            blt4.incrementProgressBy(5);
        }
        else if(!rdbttn1.isChecked() && int1 > 0 && int1 <=100 && int2 == 0) {
            blt1.incrementProgressBy(-5);
        }
        else if(!rdbttn1.isChecked() && int2 > 0 && int2 <=100 && int3 == 0) {
            blt2.incrementProgressBy(-5);
        }
        else if(!rdbttn1.isChecked() && int3 > 0 && int3 <=100 && int4 == 0) {
            blt3.incrementProgressBy(-5);
        }
        else if(!rdbttn1.isChecked() && int4 > 0 && int4 <=100) {
            blt4.incrementProgressBy(-5);
        }
        if(rdbttn1.isChecked() && rdbttn2.isChecked()){
            clss.setBackgroundResource(R.drawable.classcheck2);
            clss.setClickable(true);
        }
        else {
            clss.setBackgroundResource(R.drawable.bordershapedark);
            clss.setClickable(false);
        }
    }

    void classButton(ToggleButton clss, ProgressBar blt1, ProgressBar blt2,
                     ProgressBar blt3, ProgressBar blt4,  int int1, int int2, int int3, int int4){
        if(clss.isChecked()){
            clss.setBackgroundResource(R.drawable.classcheck1);
        }
        else if (!clss.isChecked()){
            clss.setBackgroundResource(R.drawable.classcheck0);
        }
        if(clss.isChecked() && int1 < 100){
            blt1.incrementProgressBy(5);
        }
        else if(clss.isChecked() && int1 == 100 && int2 < 100) {
            blt2.incrementProgressBy(5);
        }
        else if(clss.isChecked() && int2 == 100 && int3 < 100) {
            blt3.incrementProgressBy(5);
        }
        else if(clss.isChecked() && int3 == 100 && int4 < 100) {
            blt4.incrementProgressBy(5);
        }
        else if(!clss.isChecked() && int1 > 0 && int1 <=100 && int2 == 0) {
            blt1.incrementProgressBy(-5);
        }
        else if(!clss.isChecked() && int2 > 0 && int2 <=100 && int3 == 0) {
            blt2.incrementProgressBy(-5);
        }
        else if(!clss.isChecked() && int3 > 0 && int3 <=100 && int4 == 0) {
            blt3.incrementProgressBy(-5);
        }
        else if(!clss.isChecked() && int4 > 0 && int4 <=100) {
            blt4.incrementProgressBy(-5);
        }
    }

    void classButton2(ToggleButton clss, ProgressBar blt1, ProgressBar blt2,
                     ProgressBar blt3, ProgressBar blt4,  int int1, int int2, int int3, int int4){
        if(clss.isChecked()){
            clss.setBackgroundResource(R.drawable.classcheck3);
        }
        else if (!clss.isChecked()){
            clss.setBackgroundResource(R.drawable.classcheck2);
        }
        if(clss.isChecked() && int1 < 100){
            blt1.incrementProgressBy(5);
        }
        else if(clss.isChecked() && int1 == 100 && int2 < 100) {
            blt2.incrementProgressBy(5);
        }
        else if(clss.isChecked() && int2 == 100 && int3 < 100) {
            blt3.incrementProgressBy(5);
        }
        else if(clss.isChecked() && int3 == 100 && int4 < 100) {
            blt4.incrementProgressBy(5);
        }
        else if(!clss.isChecked() && int1 > 0 && int1 <=100 && int2 == 0) {
            blt1.incrementProgressBy(-5);
        }
        else if(!clss.isChecked() && int2 > 0 && int2 <=100 && int3 == 0) {
            blt2.incrementProgressBy(-5);
        }
        else if(!clss.isChecked() && int3 > 0 && int3 <=100 && int4 == 0) {
            blt3.incrementProgressBy(-5);
        }
        else if(!clss.isChecked() && int4 > 0 && int4 <=100) {
            blt4.incrementProgressBy(-5);
        }
    }

    void openUrlInChrome(String url) {
        try {
            try {
                Uri uri = Uri.parse("googlechrome://navigate?url="+ url);
                Intent i = new Intent(Intent.ACTION_VIEW, uri);
                i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(i);
            } catch (ActivityNotFoundException e) {
                Uri uri = Uri.parse(url);
                // Chrome is probably not installed
                // OR not selected as default browser OR if no Browser is selected as default browser
                Intent i = new Intent(Intent.ACTION_VIEW, uri);
                i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(i);
            }
        } catch (Exception ex) {
        }
    }

    //Global On click listener for all views
    final OnClickListener mGlobal_OnClickListener = new OnClickListener() {
        public void onClick(final View v) {
                int progress1 = beltstripe1.getProgress();
                int progress2 = beltstripe2.getProgress();
                int progress3 = beltstripe3.getProgress();
                int progress4 = beltstripe4.getProgress();
            switch(v.getId()) {

                case R.id.clndr:
                    openUrlInChrome("http://www.gracieacademy.com/training_centers.asp?s=545#l");
                    break;


                case R.id.c1button1:
                    redButton(c1button1, c1button2, cs1, beltstripe1, beltstripe2,
                            beltstripe3, beltstripe4,progress1,progress2,progress3,progress4);
                    break;
                case R.id.c1button2:
                    redButton(c1button2, c1button1, cs1, beltstripe1, beltstripe2,
                            beltstripe3, beltstripe4,progress1,progress2,progress3,progress4);
                    break;
                case R.id.c1:
                    classButton(cs1, beltstripe1, beltstripe2,
                            beltstripe3, beltstripe4,progress1,progress2,progress3,progress4);
                    break;
                case R.id.c1_traproll:
                    openUrlInChrome("www.gracieuniversity.com/mobile/lessons.aspx?enc=MhEfILAfdnhgTBe9W6i%2bPQ%3d%3d");
                    break;
                case R.id.c1_leghook:
                    openUrlInChrome("www.gracieuniversity.com/mobile/lessons.aspx?enc=0A0xm2Fjkj%2bhWYfuqYtD6A%3d%3d");
                    break;


                case R.id.c2button1:
                    redButton2(c2button1, c2button2, cs2, beltstripe1, beltstripe2,
                            beltstripe3, beltstripe4,progress1,progress2,progress3,progress4);
                    break;
                case R.id.c2button2:
                    redButton2(c2button2, c2button1, cs2, beltstripe1, beltstripe2,
                            beltstripe3, beltstripe4,progress1,progress2,progress3,progress4);
                    break;
                case R.id.c2:
                    classButton2(cs2, beltstripe1, beltstripe2,
                            beltstripe3, beltstripe4,progress1,progress2,progress3,progress4);
                    break;
                case R.id.c2_americana:
                    openUrlInChrome("www.gracieuniversity.com/mobile/lessons.aspx?enc=dkG2PaKrWHkbW%2bHxxa7%2bXA%3d%3d");
                    break;
                case R.id.c2_clinch:
                    openUrlInChrome("www.gracieuniversity.com/mobile/lessons.aspx?enc=d9COFgiEGp0ucINiM6G08w%3d%3d");
                    break;


                case R.id.c3button1:
                    redButton(c3button1, c3button2, cs3, beltstripe1, beltstripe2,
                            beltstripe3, beltstripe4,progress1,progress2,progress3,progress4);
                    break;
                case R.id.c3button2:
                    redButton(c3button2, c3button1, cs3, beltstripe1, beltstripe2,
                            beltstripe3, beltstripe4,progress1,progress2,progress3,progress4);
                    break;
                case R.id.c3:
                    classButton(cs3, beltstripe1, beltstripe2,
                            beltstripe3, beltstripe4,progress1,progress2,progress3,progress4);
                    break;
                case R.id.c3_pos:
                    openUrlInChrome("www.gracieuniversity.com/mobile/lessons.aspx?enc=E34hsiuYxJBoYG1ZYMYFqg%3d%3d");
                    break;
                case R.id.c3_body:
                    openUrlInChrome("www.gracieuniversity.com/mobile/lessons.aspx?enc=KQ%2fzpRulN869kg1ln0vjcA%3d%3d");
                    break;


                case R.id.c4button1:
                    redButton2(c4button1, c4button2, cs4, beltstripe1, beltstripe2,
                            beltstripe3, beltstripe4,progress1,progress2,progress3,progress4);
                    break;
                case R.id.c4button2:
                    redButton2(c4button2, c4button1, cs4, beltstripe1, beltstripe2,
                            beltstripe3, beltstripe4,progress1,progress2,progress3,progress4);
                    break;
                case R.id.c4:
                    classButton2(cs4, beltstripe1, beltstripe2,
                            beltstripe3, beltstripe4,progress1,progress2,progress3,progress4);
                    break;
                case R.id.c4_take:
                    openUrlInChrome("www.gracieuniversity.com/mobile/lessons.aspx?enc=Hr2JJ9XHJ4SOr78tucuRHQ%3d%3d");
                    openUrlInChrome("www.gracieuniversity.com/mobile/lessons.aspx?enc=%2fK0yibt2OqvBNyMjUfU2MQ%3d%3d");
                    break;
                case R.id.c4_clinch:
                    openUrlInChrome("www.gracieuniversity.com/mobile/lessons.aspx?enc=bTfyoi6fu9KXANIKX8tzcw%3d%3d");
                    break;


                case R.id.c5button1:
                    redButton(c5button1, c5button2, cs5, beltstripe1, beltstripe2,
                            beltstripe3, beltstripe4,progress1,progress2,progress3,progress4);
                    break;
                case R.id.c5button2:
                    redButton(c5button2, c5button1, cs5, beltstripe1, beltstripe2,
                            beltstripe3, beltstripe4,progress1,progress2,progress3,progress4);
                    break;
                case R.id.c5:
                    classButton(cs5, beltstripe1, beltstripe2,
                            beltstripe3, beltstripe4,progress1,progress2,progress3,progress4);
                    break;
                case R.id.c5_punchblock:
                    openUrlInChrome("www.gracieuniversity.com/mobile/lessons.aspx?enc=Ki5CHRbu984jOKpGeVjNQQ%3d%3d");
                    break;
                case R.id.c5_guillotinech:
                    openUrlInChrome("www.gracieuniversity.com/mobile/lessons.aspx?enc=wwdk8YvcbA8flaDWSHo0qA%3d%3d");
                    break;


                case R.id.c6button1:
                    redButton2(c6button1, c6button2, cs6, beltstripe1, beltstripe2,
                            beltstripe3, beltstripe4,progress1,progress2,progress3,progress4);
                    break;
                case R.id.c6button2:
                    redButton2(c6button2, c6button1, cs6, beltstripe1, beltstripe2,
                            beltstripe3, beltstripe4,progress1,progress2,progress3,progress4);
                    break;
                case R.id.c6:
                    classButton2(cs6, beltstripe1, beltstripe2,
                            beltstripe3, beltstripe4,progress1,progress2,progress3,progress4);
                    break;
                case R.id.c6_straightAl:
                    openUrlInChrome("www.gracieuniversity.com/mobile/lessons.aspx?enc=2KgTQAJgcbccBk9xaEP7VQ%3d%3d");
                    break;
                case R.id.c6_guillotineDef:
                    openUrlInChrome("www.gracieuniversity.com/mobile/lessons.aspx?enc=AHuIdS%2bryMj2F66mF4tcxg%3d%3d");
                    break;


                case R.id.c7button1:
                    redButton(c7button1, c7button2, cs7, beltstripe1, beltstripe2,
                            beltstripe3, beltstripe4,progress1,progress2,progress3,progress4);
                    break;
                case R.id.c7button2:
                    redButton(c7button2, c7button1, cs7, beltstripe1, beltstripe2,
                            beltstripe3, beltstripe4,progress1,progress2,progress3,progress4);
                    break;
                case R.id.c7:
                    classButton(cs7, beltstripe1, beltstripe2,
                            beltstripe3, beltstripe4,progress1,progress2,progress3,progress4);
                    break;
                case R.id.c7_trichoke:
                    openUrlInChrome("www.gracieuniversity.com/mobile/lessons.aspx?enc=QiCe%2fLoUmhHHliAppVPDtQ%3d%3d");
                    break;
                case R.id.c7_hpDef:
                    openUrlInChrome("www.gracieuniversity.com/mobile/lessons.aspx?enc=6y6XlTHBe1lGplav2reRMg%3d%3d");
                    break;


                case R.id.c8button1:
                    redButton2(c8button1, c8button2, cs8, beltstripe1, beltstripe2,
                            beltstripe3, beltstripe4,progress1,progress2,progress3,progress4);
                    break;
                case R.id.c8button2:
                    redButton2(c8button2, c8button1, cs8, beltstripe1, beltstripe2,
                            beltstripe3, beltstripe4,progress1,progress2,progress3,progress4);
                    break;
                case R.id.c8:
                    classButton2(cs8, beltstripe1, beltstripe2,
                            beltstripe3, beltstripe4,progress1,progress2,progress3,progress4);
                    break;
                case R.id.c8_elevsweep:
                    openUrlInChrome("www.gracieuniversity.com/mobile/lessons.aspx?enc=y3d1ZdpD9gBGMD9tpU5Z%2fg%3d%3d");
                    break;
                case R.id.c8_reartd:
                    openUrlInChrome("www.gracieuniversity.com/mobile/lessons.aspx?enc=N3xVPK9Jl9gANgAyTnIKag%3d%3d");
                    break;


                case R.id.c9button1:
                    redButton(c9button1, c9button2, cs9, beltstripe1, beltstripe2,
                            beltstripe3, beltstripe4,progress1,progress2,progress3,progress4);
                    break;
                case R.id.c9button2:
                    redButton(c9button2, c9button1, cs9, beltstripe1, beltstripe2,
                            beltstripe3, beltstripe4,progress1,progress2,progress3,progress4);
                    break;
                case R.id.c9:
                    classButton(cs9, beltstripe1, beltstripe2,
                            beltstripe3, beltstripe4,progress1,progress2,progress3,progress4);
                    break;
                case R.id.c9_elbowesc:
                    openUrlInChrome("www.gracieuniversity.com/mobile/lessons.aspx?enc=y3d1ZdpD9gBGMD9tpU5Z%2fg%3d%3d");
                    break;
                case R.id.c9_pullguard:
                    openUrlInChrome("www.gracieuniversity.com/mobile/lessons.aspx?enc=UO5ZLgtutOHKPrjfAjCtXg%3d%3d");
                    break;


                case R.id.c10button1:
                    redButton2(c10button1, c10button2, cs10, beltstripe1, beltstripe2,
                            beltstripe3, beltstripe4,progress1,progress2,progress3,progress4);
                    break;
                case R.id.c10button2:
                    redButton2(c10button2, c10button1, cs10, beltstripe1, beltstripe2,
                            beltstripe3, beltstripe4,progress1,progress2,progress3,progress4);
                    break;
                case R.id.c10:
                    classButton2(cs10, beltstripe1, beltstripe2,
                            beltstripe3, beltstripe4,progress1,progress2,progress3,progress4);
                    break;
                case R.id.c10_poscont:
                    openUrlInChrome("www.gracieuniversity.com/mobile/lessons.aspx?enc=JSrlOmvn%2f1wMgxZGzlpSlQ%3d%3d");
                    break;
                case R.id.c10_dltd:
                    openUrlInChrome("www.gracieuniversity.com/mobile/lessons.aspx?enc=lxa4RKypSG1YuBKdqrEmvg%3d%3d");
                    break;


                case R.id.c11button1:
                    redButton(c11button1, c11button2, cs11, beltstripe1, beltstripe2,
                            beltstripe3, beltstripe4,progress1,progress2,progress3,progress4);
                    break;
                case R.id.c11button2:
                    redButton(c11button2, c11button1, cs11, beltstripe1, beltstripe2,
                            beltstripe3, beltstripe4,progress1,progress2,progress3,progress4);
                    break;
                case R.id.c11:
                    classButton(cs11, beltstripe1, beltstripe2,
                            beltstripe3, beltstripe4,progress1,progress2,progress3,progress4);
                    break;
                case R.id.c11_headlockc:
                    openUrlInChrome("www.gracieuniversity.com/mobile/lessons.aspx?enc=SBisFKCMRngOP4KmRQGIpQ%3d%3d");
                    break;
                case R.id.c11_stheadlockdef:
                    openUrlInChrome("www.gracieuniversity.com/mobile/lessons.aspx?enc=LiKf9bZRnl%2bNw%2b9heBUG2Q%3d%3d");
                    break;


                case R.id.c12button1:
                    redButton2(c12button1, c12button2, cs12, beltstripe1, beltstripe2,
                            beltstripe3, beltstripe4,progress1,progress2,progress3,progress4);
                    break;
                case R.id.c12button2:
                    redButton2(c12button2, c12button1, cs12, beltstripe1, beltstripe2,
                            beltstripe3, beltstripe4,progress1,progress2,progress3,progress4);
                    break;
                case R.id.c12:
                    classButton2(cs12, beltstripe1, beltstripe2,
                            beltstripe3, beltstripe4,progress1,progress2,progress3,progress4);
                    break;
                case R.id.c12_hlesc:
                    openUrlInChrome("www.gracieuniversity.com/mobile/lessons.aspx?enc=zh4zbMirWKwxlzSw%2bbL%2fbw%3d%3d");
                    break;
                case R.id.c12_starmlock:
                    openUrlInChrome("www.gracieuniversity.com/mobile/lessons.aspx?enc=Q6v0kI1B1DG6DjGXG7dUIA%3d%3d");
                    break;


                case R.id.c13button1:
                    redButton(c13button1, c13button2, cs13, beltstripe1, beltstripe2,
                            beltstripe3, beltstripe4,progress1,progress2,progress3,progress4);
                    break;
                case R.id.c13button2:
                    redButton(c13button2, c13button1, cs13, beltstripe1, beltstripe2,
                            beltstripe3, beltstripe4,progress1,progress2,progress3,progress4);
                    break;
                case R.id.c13:
                    classButton(cs13, beltstripe1, beltstripe2,
                            beltstripe3, beltstripe4,progress1,progress2,progress3,progress4);
                    break;
                case R.id.c13_straight:
                    openUrlInChrome("www.gracieuniversity.com/mobile/lessons.aspx?enc=Ad1fZriwRTYZNUliAbpvQg%3d%3d");
                    break;
                case R.id.c13_clinch:
                    openUrlInChrome("www.gracieuniversity.com/mobile/lessons.aspx?enc=d9COFgiEGp0ucINiM6G08w%3d%3d");
                    break;


                case R.id.c14button1:
                    redButton2(c14button1, c14button2, cs14, beltstripe1, beltstripe2,
                            beltstripe3, beltstripe4,progress1,progress2,progress3,progress4);
                    break;
                case R.id.c14button2:
                    redButton2(c14button2, c14button1, cs14, beltstripe1, beltstripe2,
                            beltstripe3, beltstripe4,progress1,progress2,progress3,progress4);
                    break;
                case R.id.c14:
                    classButton2(cs14, beltstripe1, beltstripe2,
                            beltstripe3, beltstripe4,progress1,progress2,progress3,progress4);
                    break;
                case R.id.c14_dbl:
                    openUrlInChrome("www.gracieuniversity.com/mobile/lessons.aspx?enc=TylWH8yjaRYpd6xRPULVfQ%3d%3d");
                    break;
                case R.id.c14_guil:
                    openUrlInChrome("www.gracieuniversity.com/mobile/lessons.aspx?enc=wwdk8YvcbA8flaDWSHo0qA%3d%3d");
                    break;


                case R.id.c15button1:
                    redButton(c15button1, c15button2, cs15, beltstripe1, beltstripe2,
                            beltstripe3, beltstripe4,progress1,progress2,progress3,progress4);
                    break;
                case R.id.c15button2:
                    redButton(c15button2, c15button1, cs15, beltstripe1, beltstripe2,
                            beltstripe3, beltstripe4,progress1,progress2,progress3,progress4);
                    break;
                case R.id.c15:
                    classButton(cs15, beltstripe1, beltstripe2,
                            beltstripe3, beltstripe4,progress1,progress2,progress3,progress4);
                    break;
                case R.id.c15_head:
                    openUrlInChrome("www.gracieuniversity.com/mobile/lessons.aspx?enc=iOOIXE6NqBVabG3bgvehUQ%3d%3d");
                    break;
                case R.id.c15_clinch:
                    openUrlInChrome("www.gracieuniversity.com/mobile/lessons.aspx?enc=bTfyoi6fu9KXANIKX8tzcw%3d%3d");
                    break;


                case R.id.c16button1:
                    redButton2(c16button1, c16button2, cs16, beltstripe1, beltstripe2,
                            beltstripe3, beltstripe4,progress1,progress2,progress3,progress4);
                    break;
                case R.id.c16button2:
                    redButton2(c16button2, c16button1, cs16, beltstripe1, beltstripe2,
                            beltstripe3, beltstripe4,progress1,progress2,progress3,progress4);
                    break;
                case R.id.c16:
                    classButton2(cs16, beltstripe1, beltstripe2,
                            beltstripe3, beltstripe4,progress1,progress2,progress3,progress4);
                    break;
                case R.id.c16_shrmp:
                    openUrlInChrome("www.gracieuniversity.com/mobile/lessons.aspx?enc=WYRi6LPGXft8yOanN2O2UQ%3d%3d");
                    break;
                case R.id.c16_body:
                    openUrlInChrome("www.gracieuniversity.com/mobile/lessons.aspx?enc=KQ%2fzpRulN869kg1ln0vjcA%3d%3d");
                    break;


                case R.id.c17button1:
                    redButton(c17button1, c17button2, cs17, beltstripe1, beltstripe2,
                            beltstripe3, beltstripe4,progress1,progress2,progress3,progress4);
                    break;
                case R.id.c17button2:
                    redButton(c17button2, c17button1, cs17, beltstripe1, beltstripe2,
                            beltstripe3, beltstripe4,progress1,progress2,progress3,progress4);
                    break;
                case R.id.c17:
                    classButton(cs17, beltstripe1, beltstripe2,
                            beltstripe3, beltstripe4,progress1,progress2,progress3,progress4);
                    break;
                case R.id.c17_kim:
                    openUrlInChrome("www.gracieuniversity.com/mobile/lessons.aspx?enc=jMw%2bO47%2bDd%2fu5xh2%2f69HTg%3d%3d");
                    break;
                case R.id.c17_leg:
                    openUrlInChrome("www.gracieuniversity.com/mobile/lessons.aspx?enc=0A0xm2Fjkj%2bhWYfuqYtD6A%3d%3d");
                    break;


                case R.id.c18button1:
                    redButton2(c18button1, c18button2, cs18, beltstripe1, beltstripe2,
                            beltstripe3, beltstripe4,progress1,progress2,progress3,progress4);
                    break;
                case R.id.c18button2:
                    redButton2(c18button2, c18button1, cs18, beltstripe1, beltstripe2,
                            beltstripe3, beltstripe4,progress1,progress2,progress3,progress4);
                    break;
                case R.id.c18:
                    classButton2(cs18, beltstripe1, beltstripe2,
                            beltstripe3, beltstripe4,progress1,progress2,progress3,progress4);
                    break;
                case R.id.c18_punsh:
                    openUrlInChrome("www.gracieuniversity.com/mobile/lessons.aspx?enc=wa78CzlxPEWkdOZi2kKR1Q%3d%3d");
                    break;
                case R.id.c18_hay:
                    openUrlInChrome("www.gracieuniversity.com/mobile/lessons.aspx?enc=6y6XlTHBe1lGplav2reRMg%3d%3d");
                    break;


                case R.id.c19button1:
                    redButton(c19button1, c19button2, cs19, beltstripe1, beltstripe2,
                            beltstripe3, beltstripe4,progress1,progress2,progress3,progress4);
                    break;
                case R.id.c19button2:
                    redButton(c19button2, c19button1, cs19, beltstripe1, beltstripe2,
                            beltstripe3, beltstripe4,progress1,progress2,progress3,progress4);
                    break;
                case R.id.c19:
                    classButton(cs19, beltstripe1, beltstripe2,
                            beltstripe3, beltstripe4,progress1,progress2,progress3,progress4);
                    break;
                case R.id.c19_hook:
                    openUrlInChrome("www.gracieuniversity.com/mobile/lessons.aspx?enc=0YVoZ9G50MRK6vQxviNaVA%3d%3d");
                    break;
                case R.id.c19_guil:
                    openUrlInChrome("www.gracieuniversity.com/mobile/lessons.aspx?enc=AHuIdS%2bryMj2F66mF4tcxg%3d%3d");
                    break;


                case R.id.c20button1:
                    redButton2(c20button1, c20button2, cs20, beltstripe1, beltstripe2,
                            beltstripe3, beltstripe4,progress1,progress2,progress3,progress4);
                    break;
                case R.id.c20button2:
                    redButton2(c20button2, c20button1, cs20, beltstripe1, beltstripe2,
                            beltstripe3, beltstripe4,progress1,progress2,progress3,progress4);
                    break;
                case R.id.c20:
                    classButton2(cs20, beltstripe1, beltstripe2,
                            beltstripe3, beltstripe4,progress1,progress2,progress3,progress4);
                    break;
                case R.id.c20_take:
                    openUrlInChrome("www.gracieuniversity.com/mobile/lessons.aspx?enc=hwRYyECMiti%2brJhq2mdwJg%3d%3d");
                    break;
                case R.id.c20_stand:
                    openUrlInChrome("www.gracieuniversity.com/mobile/lessons.aspx?enc=LiKf9bZRnl%2bNw%2b9heBUG2Q%3d%3d");
                    break;


                case R.id.c21button1:
                    redButton(c21button1, c21button2, cs21, beltstripe1, beltstripe2,
                            beltstripe3, beltstripe4,progress1,progress2,progress3,progress4);
                    break;
                case R.id.c21button2:
                    redButton(c21button2, c21button1, cs21, beltstripe1, beltstripe2,
                            beltstripe3, beltstripe4,progress1,progress2,progress3,progress4);
                    break;
                case R.id.c21:
                    classButton(cs21, beltstripe1, beltstripe2,
                            beltstripe3, beltstripe4,progress1,progress2,progress3,progress4);
                    break;
                case R.id.c21_elbow:
                    openUrlInChrome("www.gracieuniversity.com/mobile/lessons.aspx?enc=czMv7cHyDukpMxhKnkAaXA%3d%3d");
                    break;
                case R.id.c21_pull:
                    openUrlInChrome("www.gracieuniversity.com/mobile/lessons.aspx?enc=UO5ZLgtutOHKPrjfAjCtXg%3d%3d");
                    break;


                case R.id.c22button1:
                    redButton2(c22button1, c22button2, cs22, beltstripe1, beltstripe2,
                            beltstripe3, beltstripe4,progress1,progress2,progress3,progress4);
                    break;
                case R.id.c22button2:
                    redButton2(c22button2, c22button1, cs22, beltstripe1, beltstripe2,
                            beltstripe3, beltstripe4,progress1,progress2,progress3,progress4);
                    break;
                case R.id.c22:
                    classButton2(cs22, beltstripe1, beltstripe2,
                            beltstripe3, beltstripe4,progress1,progress2,progress3,progress4);
                    break;
                case R.id.c22_twist:
                    openUrlInChrome("www.gracieuniversity.com/mobile/lessons.aspx?enc=TeKM88ZBkw8NCEgNtvdASg%3d%3d");
                    break;
                case R.id.c22_rear:
                    openUrlInChrome("www.gracieuniversity.com/mobile/lessons.aspx?enc=N3xVPK9Jl9gANgAyTnIKag%3d%3d");
                    break;


                case R.id.c23button1:
                    redButton(c23button1, c23button2, cs23, beltstripe1, beltstripe2,
                            beltstripe3, beltstripe4,progress1,progress2,progress3,progress4);
                    break;
                case R.id.c23button2:
                    redButton(c23button2, c23button1, cs23, beltstripe1, beltstripe2,
                            beltstripe3, beltstripe4,progress1,progress2,progress3,progress4);
                    break;
                case R.id.c23:
                    classButton(cs23, beltstripe1, beltstripe2,
                            beltstripe3, beltstripe4,progress1,progress2,progress3,progress4);
                    break;
                case R.id.c23_dblunder:
                    openUrlInChrome("www.gracieuniversity.com/mobile/lessons.aspx?enc=bzfsCCRQgks9F8jaP1UzUA%3d%3d");
                    break;
                case R.id.c23_dblleg:
                    openUrlInChrome("www.gracieuniversity.com/mobile/lessons.aspx?enc=lxa4RKypSG1YuBKdqrEmvg%3d%3d");
                    break;
            }
        }
    };

}
