package com.yuzumin.ayamenoises;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.TableRow;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import butterknife.BindView;

public class ClickerSettings extends AppCompatActivity {

    ImageView back_btn;

    TableRow AyameIMG0Row;
    TableRow AyameIMG1Row;
    TableRow AyameIMG2Row;
    TableRow AyameIMG3Row;
    TableRow AyameIMG4Row;
    TableRow AyameIMG5Row;
    RadioButton AyameIMG0;
    RadioButton AyameIMG1;
    RadioButton AyameIMG2;
    RadioButton AyameIMG3;
    RadioButton AyameIMG4;
    RadioButton AyameIMG5;

    Integer charavalue;

    CardView toggle_btn;

    Switch switch0;
    Switch switch1;
    Switch switch2;


    Switch switch3;
    Switch switch4;
    Switch switch5;
    Switch switch6;
    Switch switch7;
    Switch switch8;
    Switch switch9;
    Switch switch10;
    Switch switch11;
    Switch switch12;
    Switch switch13;
    Switch switch14;
    Switch switch15;
    Switch switch16;
    Switch switch17;
    Switch switch18;
    Switch switch19;
    Switch switch20;
    Switch switch21;
    Switch switch22;
    Switch switch23;
    Switch switch24;
    Switch switch25;
    Switch switch26;
    Switch switch27;
    Switch switch28;
    Switch switch29;
    Switch switch30;
    Switch switch31;
    Switch switch32;
    Switch switch33;
    Switch switch34;
    Switch switch35;
    Switch switch36;
    Switch switch37;
    Switch switch38;
    Switch switch39;
    Switch switch40;
    Switch switch41;
    Switch switch42;
    Switch switch43;
    Switch switch44;
    Switch switch45;
    Switch switch46;
    Switch switch47;



    SharedPreferences SoundSettings;
    SharedPreferences.Editor SoundSettingsEditor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.clicker_settings);
        getSupportActionBar().hide();

        back_btn=findViewById(R.id.back_btn);
        back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });


        AyameIMG0=findViewById(R.id.ayame0_img);
        AyameIMG0Row=findViewById(R.id.ayame0_img_row);
        AyameIMG1=findViewById(R.id.ayame1_img);
        AyameIMG1Row=findViewById(R.id.ayame1_img_row);
        AyameIMG2=findViewById(R.id.ayame2_img);
        AyameIMG2Row=findViewById(R.id.ayame2_img_row);
        AyameIMG3=findViewById(R.id.ayame3_img);
        AyameIMG3Row=findViewById(R.id.ayame3_img_row);
        AyameIMG4=findViewById(R.id.ayame4_img);
        AyameIMG4Row=findViewById(R.id.ayame4_img_row);
        AyameIMG5=findViewById(R.id.ayame5_img);
        AyameIMG5Row=findViewById(R.id.ayame5_img_row);


        AyameIMG0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                charavalue=0;
                SoundSettingsEditor =getSharedPreferences("Chara",MODE_PRIVATE).edit();
                SoundSettingsEditor.putInt("CharaValue",charavalue);
                SoundSettingsEditor.apply();
                AyameIMG0.setChecked(true);
                AyameIMG1.setChecked(false);
                AyameIMG2.setChecked(false);
                AyameIMG3.setChecked(false);
                AyameIMG4.setChecked(false);
                AyameIMG5.setChecked(false);
            }
        });
        AyameIMG0Row.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                charavalue=0;
                SoundSettingsEditor =getSharedPreferences("Chara",MODE_PRIVATE).edit();
                SoundSettingsEditor.putInt("CharaValue",charavalue);
                SoundSettingsEditor.apply();
                AyameIMG0.setChecked(true);
                AyameIMG1.setChecked(false);
                AyameIMG2.setChecked(false);
                AyameIMG3.setChecked(false);
                AyameIMG4.setChecked(false);
                AyameIMG5.setChecked(false);
            }
        });
        AyameIMG1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                charavalue=1;
                SoundSettingsEditor =getSharedPreferences("Chara",MODE_PRIVATE).edit();
                SoundSettingsEditor.putInt("CharaValue",charavalue);
                SoundSettingsEditor.apply();
                AyameIMG0.setChecked(false);
                AyameIMG1.setChecked(true);
                AyameIMG2.setChecked(false);
                AyameIMG3.setChecked(false);
                AyameIMG4.setChecked(false);
                AyameIMG5.setChecked(false);
            }
        });
        AyameIMG1Row.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                charavalue=1;
                SoundSettingsEditor =getSharedPreferences("Chara",MODE_PRIVATE).edit();
                SoundSettingsEditor.putInt("CharaValue",charavalue);
                SoundSettingsEditor.apply();
                AyameIMG0.setChecked(false);
                AyameIMG1.setChecked(true);
                AyameIMG2.setChecked(false);
                AyameIMG3.setChecked(false);
                AyameIMG4.setChecked(false);
                AyameIMG5.setChecked(false);
            }
        });
        AyameIMG2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                charavalue=2;
                SoundSettingsEditor =getSharedPreferences("Chara",MODE_PRIVATE).edit();
                SoundSettingsEditor.putInt("CharaValue",charavalue);
                SoundSettingsEditor.apply();
                AyameIMG0.setChecked(false);
                AyameIMG1.setChecked(false);
                AyameIMG2.setChecked(true);
                AyameIMG3.setChecked(false);
                AyameIMG4.setChecked(false);
                AyameIMG5.setChecked(false);
            }
        });
        AyameIMG2Row.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                charavalue=2;
                SoundSettingsEditor =getSharedPreferences("Chara",MODE_PRIVATE).edit();
                SoundSettingsEditor.putInt("CharaValue",charavalue);
                SoundSettingsEditor.apply();
                AyameIMG0.setChecked(false);
                AyameIMG1.setChecked(false);
                AyameIMG2.setChecked(true);
                AyameIMG3.setChecked(false);
                AyameIMG4.setChecked(false);
                AyameIMG5.setChecked(false);
            }
        });
        AyameIMG3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                charavalue=3;
                SoundSettingsEditor =getSharedPreferences("Chara",MODE_PRIVATE).edit();
                SoundSettingsEditor.putInt("CharaValue",charavalue);
                SoundSettingsEditor.apply();
                AyameIMG0.setChecked(false);
                AyameIMG1.setChecked(false);
                AyameIMG2.setChecked(false);
                AyameIMG3.setChecked(true);
                AyameIMG4.setChecked(false);
                AyameIMG5.setChecked(false);
            }
        });
        AyameIMG3Row.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                charavalue=3;
                SoundSettingsEditor =getSharedPreferences("Chara",MODE_PRIVATE).edit();
                SoundSettingsEditor.putInt("CharaValue",charavalue);
                SoundSettingsEditor.apply();
                AyameIMG0.setChecked(false);
                AyameIMG1.setChecked(false);
                AyameIMG2.setChecked(false);
                AyameIMG3.setChecked(true);
                AyameIMG4.setChecked(false);
                AyameIMG5.setChecked(false);
            }
        });
        AyameIMG4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                charavalue=4;
                SoundSettingsEditor =getSharedPreferences("Chara",MODE_PRIVATE).edit();
                SoundSettingsEditor.putInt("CharaValue",charavalue);
                SoundSettingsEditor.apply();
                AyameIMG0.setChecked(false);
                AyameIMG1.setChecked(false);
                AyameIMG2.setChecked(false);
                AyameIMG3.setChecked(false);
                AyameIMG4.setChecked(true);
                AyameIMG5.setChecked(false);
            }
        });
        AyameIMG4Row.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                charavalue=4;
                SoundSettingsEditor =getSharedPreferences("Chara",MODE_PRIVATE).edit();
                SoundSettingsEditor.putInt("CharaValue",charavalue);
                SoundSettingsEditor.apply();
                AyameIMG0.setChecked(false);
                AyameIMG1.setChecked(false);
                AyameIMG2.setChecked(false);
                AyameIMG3.setChecked(false);
                AyameIMG4.setChecked(true);
                AyameIMG5.setChecked(false);
            }
        });
        AyameIMG5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                charavalue=5;
                SoundSettingsEditor =getSharedPreferences("Chara",MODE_PRIVATE).edit();
                SoundSettingsEditor.putInt("CharaValue",charavalue);
                SoundSettingsEditor.apply();
                AyameIMG0.setChecked(false);
                AyameIMG1.setChecked(false);
                AyameIMG2.setChecked(false);
                AyameIMG3.setChecked(false);
                AyameIMG4.setChecked(false);
                AyameIMG5.setChecked(true);
            }
        });
        AyameIMG5Row.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                charavalue=5;
                SoundSettingsEditor =getSharedPreferences("Chara",MODE_PRIVATE).edit();
                SoundSettingsEditor.putInt("CharaValue",charavalue);
                SoundSettingsEditor.apply();
                AyameIMG0.setChecked(false);
                AyameIMG1.setChecked(false);
                AyameIMG2.setChecked(false);
                AyameIMG3.setChecked(false);
                AyameIMG4.setChecked(false);
                AyameIMG5.setChecked(true);
            }
        });


        retrievedata();





        toggle_btn=findViewById(R.id.toggle_btn);
        toggle_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch3.isChecked()&&switch4.isChecked()){

                    SoundSettingsEditor =getSharedPreferences("save3",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value3",false);
                    SoundSettingsEditor.apply();
                    switch3.setChecked(false);

                    SoundSettingsEditor =getSharedPreferences("save4",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value4",false);
                    SoundSettingsEditor.apply();
                    switch4.setChecked(false);

                    SoundSettingsEditor =getSharedPreferences("save5",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value5",false);
                    SoundSettingsEditor.apply();
                    switch5.setChecked(false);

                    SoundSettingsEditor =getSharedPreferences("save6",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value6",false);
                    SoundSettingsEditor.apply();
                    switch6.setChecked(false);

                    SoundSettingsEditor =getSharedPreferences("save7",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value7",false);
                    SoundSettingsEditor.apply();
                    switch7.setChecked(false);

                    SoundSettingsEditor =getSharedPreferences("save8",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value8",false);
                    SoundSettingsEditor.apply();
                    switch8.setChecked(false);

                    SoundSettingsEditor =getSharedPreferences("save9",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value9",false);
                    SoundSettingsEditor.apply();
                    switch9.setChecked(false);

                    SoundSettingsEditor =getSharedPreferences("save10",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value10",false);
                    SoundSettingsEditor.apply();
                    switch10.setChecked(false);

                    SoundSettingsEditor =getSharedPreferences("save11",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value11",false);
                    SoundSettingsEditor.apply();
                    switch11.setChecked(false);

                    SoundSettingsEditor =getSharedPreferences("save12",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value12",false);
                    SoundSettingsEditor.apply();
                    switch12.setChecked(false);

                    SoundSettingsEditor =getSharedPreferences("save13",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value13",false);
                    SoundSettingsEditor.apply();
                    switch13.setChecked(false);

                    SoundSettingsEditor =getSharedPreferences("save14",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value14",false);
                    SoundSettingsEditor.apply();
                    switch14.setChecked(false);

                    SoundSettingsEditor =getSharedPreferences("save15",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value15",false);
                    SoundSettingsEditor.apply();
                    switch15.setChecked(false);

                    SoundSettingsEditor =getSharedPreferences("save16",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value16",false);
                    SoundSettingsEditor.apply();
                    switch16.setChecked(false);

                    SoundSettingsEditor =getSharedPreferences("save17",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value17",false);
                    SoundSettingsEditor.apply();
                    switch17.setChecked(false);

                    SoundSettingsEditor =getSharedPreferences("save18",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value18",false);
                    SoundSettingsEditor.apply();
                    switch18.setChecked(false);

                    SoundSettingsEditor =getSharedPreferences("save19",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value19",false);
                    SoundSettingsEditor.apply();
                    switch19.setChecked(false);

                    SoundSettingsEditor =getSharedPreferences("save20",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value20",false);
                    SoundSettingsEditor.apply();
                    switch20.setChecked(false);

                    SoundSettingsEditor =getSharedPreferences("save21",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value21",false);
                    SoundSettingsEditor.apply();
                    switch21.setChecked(false);

                    SoundSettingsEditor =getSharedPreferences("save22",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value22",false);
                    SoundSettingsEditor.apply();
                    switch22.setChecked(false);

                    SoundSettingsEditor =getSharedPreferences("save23",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value23",false);
                    SoundSettingsEditor.apply();
                    switch23.setChecked(false);

                    SoundSettingsEditor =getSharedPreferences("save24",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value24",false);
                    SoundSettingsEditor.apply();
                    switch24.setChecked(false);

                    SoundSettingsEditor =getSharedPreferences("save25",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value25",false);
                    SoundSettingsEditor.apply();
                    switch25.setChecked(false);

                    SoundSettingsEditor =getSharedPreferences("save26",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value26",false);
                    SoundSettingsEditor.apply();
                    switch26.setChecked(false);

                    SoundSettingsEditor =getSharedPreferences("save27",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value27",false);
                    SoundSettingsEditor.apply();
                    switch27.setChecked(false);

                    SoundSettingsEditor =getSharedPreferences("save28",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value28",false);
                    SoundSettingsEditor.apply();
                    switch28.setChecked(false);

                    SoundSettingsEditor =getSharedPreferences("save29",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value29",false);
                    SoundSettingsEditor.apply();
                    switch29.setChecked(false);

                    SoundSettingsEditor =getSharedPreferences("save30",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value30",false);
                    SoundSettingsEditor.apply();
                    switch30.setChecked(false);

                    SoundSettingsEditor =getSharedPreferences("save31",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value31",false);
                    SoundSettingsEditor.apply();
                    switch31.setChecked(false);

                    SoundSettingsEditor =getSharedPreferences("save32",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value32",false);
                    SoundSettingsEditor.apply();
                    switch32.setChecked(false);

                    SoundSettingsEditor =getSharedPreferences("save33",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value33",false);
                    SoundSettingsEditor.apply();
                    switch33.setChecked(false);

                    SoundSettingsEditor =getSharedPreferences("save34",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value34",false);
                    SoundSettingsEditor.apply();
                    switch34.setChecked(false);

                    SoundSettingsEditor =getSharedPreferences("save35",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value35",false);
                    SoundSettingsEditor.apply();
                    switch35.setChecked(false);

                    SoundSettingsEditor =getSharedPreferences("save36",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value36",false);
                    SoundSettingsEditor.apply();
                    switch36.setChecked(false);

                    SoundSettingsEditor =getSharedPreferences("save37",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value37",false);
                    SoundSettingsEditor.apply();
                    switch37.setChecked(false);

                    SoundSettingsEditor =getSharedPreferences("save38",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value38",false);
                    SoundSettingsEditor.apply();
                    switch38.setChecked(false);

                    SoundSettingsEditor =getSharedPreferences("save39",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value39",false);
                    SoundSettingsEditor.apply();
                    switch39.setChecked(false);

                    SoundSettingsEditor =getSharedPreferences("save40",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value40",false);
                    SoundSettingsEditor.apply();
                    switch40.setChecked(false);

                    SoundSettingsEditor =getSharedPreferences("save41",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value41",false);
                    SoundSettingsEditor.apply();
                    switch41.setChecked(false);

                    SoundSettingsEditor =getSharedPreferences("save42",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value42",false);
                    SoundSettingsEditor.apply();
                    switch42.setChecked(false);

                    SoundSettingsEditor =getSharedPreferences("save43",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value43",false);
                    SoundSettingsEditor.apply();
                    switch43.setChecked(false);

                    SoundSettingsEditor =getSharedPreferences("save44",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value44",false);
                    SoundSettingsEditor.apply();
                    switch44.setChecked(false);

                    SoundSettingsEditor =getSharedPreferences("save45",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value45",false);
                    SoundSettingsEditor.apply();
                    switch45.setChecked(false);

                    SoundSettingsEditor =getSharedPreferences("save46",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value46",false);
                    SoundSettingsEditor.apply();
                    switch46.setChecked(false);

                    SoundSettingsEditor =getSharedPreferences("save47",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value47",false);
                    SoundSettingsEditor.apply();
                    switch47.setChecked(false);


                }else{

                    SoundSettingsEditor =getSharedPreferences("save3",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value3",true);
                    SoundSettingsEditor.apply();
                    switch3.setChecked(true);

                    SoundSettingsEditor =getSharedPreferences("save4",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value4",true);
                    SoundSettingsEditor.apply();
                    switch4.setChecked(true);

                    SoundSettingsEditor =getSharedPreferences("save5",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value5",true);
                    SoundSettingsEditor.apply();
                    switch5.setChecked(true);

                    SoundSettingsEditor =getSharedPreferences("save6",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value6",true);
                    SoundSettingsEditor.apply();
                    switch6.setChecked(true);

                    SoundSettingsEditor =getSharedPreferences("save7",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value7",true);
                    SoundSettingsEditor.apply();
                    switch7.setChecked(true);

                    SoundSettingsEditor =getSharedPreferences("save8",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value8",true);
                    SoundSettingsEditor.apply();
                    switch8.setChecked(true);

                    SoundSettingsEditor =getSharedPreferences("save9",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value9",true);
                    SoundSettingsEditor.apply();
                    switch9.setChecked(true);

                    SoundSettingsEditor =getSharedPreferences("save10",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value10",true);
                    SoundSettingsEditor.apply();
                    switch10.setChecked(true);

                    SoundSettingsEditor =getSharedPreferences("save11",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value11",true);
                    SoundSettingsEditor.apply();
                    switch11.setChecked(true);

                    SoundSettingsEditor =getSharedPreferences("save12",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value12",true);
                    SoundSettingsEditor.apply();
                    switch12.setChecked(true);

                    SoundSettingsEditor =getSharedPreferences("save13",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value13",true);
                    SoundSettingsEditor.apply();
                    switch13.setChecked(true);

                    SoundSettingsEditor =getSharedPreferences("save14",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value14",true);
                    SoundSettingsEditor.apply();
                    switch14.setChecked(true);

                    SoundSettingsEditor =getSharedPreferences("save15",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value15",true);
                    SoundSettingsEditor.apply();
                    switch15.setChecked(true);

                    SoundSettingsEditor =getSharedPreferences("save16",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value16",true);
                    SoundSettingsEditor.apply();
                    switch16.setChecked(true);

                    SoundSettingsEditor =getSharedPreferences("save17",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value17",true);
                    SoundSettingsEditor.apply();
                    switch17.setChecked(true);

                    SoundSettingsEditor =getSharedPreferences("save18",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value18",true);
                    SoundSettingsEditor.apply();
                    switch18.setChecked(true);

                    SoundSettingsEditor =getSharedPreferences("save19",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value19",true);
                    SoundSettingsEditor.apply();
                    switch19.setChecked(true);

                    SoundSettingsEditor =getSharedPreferences("save20",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value20",true);
                    SoundSettingsEditor.apply();
                    switch20.setChecked(true);

                    SoundSettingsEditor =getSharedPreferences("save21",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value21",true);
                    SoundSettingsEditor.apply();
                    switch21.setChecked(true);

                    SoundSettingsEditor =getSharedPreferences("save22",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value22",true);
                    SoundSettingsEditor.apply();
                    switch22.setChecked(true);

                    SoundSettingsEditor =getSharedPreferences("save23",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value23",true);
                    SoundSettingsEditor.apply();
                    switch23.setChecked(true);

                    SoundSettingsEditor =getSharedPreferences("save24",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value24",true);
                    SoundSettingsEditor.apply();
                    switch24.setChecked(true);

                    SoundSettingsEditor =getSharedPreferences("save25",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value25",true);
                    SoundSettingsEditor.apply();
                    switch25.setChecked(true);

                    SoundSettingsEditor =getSharedPreferences("save26",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value26",true);
                    SoundSettingsEditor.apply();
                    switch26.setChecked(true);

                    SoundSettingsEditor =getSharedPreferences("save27",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value27",true);
                    SoundSettingsEditor.apply();
                    switch27.setChecked(true);

                    SoundSettingsEditor =getSharedPreferences("save28",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value28",true);
                    SoundSettingsEditor.apply();
                    switch28.setChecked(true);

                    SoundSettingsEditor =getSharedPreferences("save29",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value29",true);
                    SoundSettingsEditor.apply();
                    switch29.setChecked(true);

                    SoundSettingsEditor =getSharedPreferences("save30",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value30",true);
                    SoundSettingsEditor.apply();
                    switch30.setChecked(true);

                    SoundSettingsEditor =getSharedPreferences("save31",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value31",true);
                    SoundSettingsEditor.apply();
                    switch31.setChecked(true);

                    SoundSettingsEditor =getSharedPreferences("save32",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value32",true);
                    SoundSettingsEditor.apply();
                    switch32.setChecked(true);

                    SoundSettingsEditor =getSharedPreferences("save33",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value33",true);
                    SoundSettingsEditor.apply();
                    switch33.setChecked(true);

                    SoundSettingsEditor =getSharedPreferences("save34",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value34",true);
                    SoundSettingsEditor.apply();
                    switch34.setChecked(true);

                    SoundSettingsEditor =getSharedPreferences("save35",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value35",true);
                    SoundSettingsEditor.apply();
                    switch35.setChecked(true);

                    SoundSettingsEditor =getSharedPreferences("save36",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value36",true);
                    SoundSettingsEditor.apply();
                    switch36.setChecked(true);

                    SoundSettingsEditor =getSharedPreferences("save37",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value37",true);
                    SoundSettingsEditor.apply();
                    switch37.setChecked(true);

                    SoundSettingsEditor =getSharedPreferences("save38",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value38",true);
                    SoundSettingsEditor.apply();
                    switch38.setChecked(true);

                    SoundSettingsEditor =getSharedPreferences("save39",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value39",true);
                    SoundSettingsEditor.apply();
                    switch39.setChecked(true);

                    SoundSettingsEditor =getSharedPreferences("save40",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value40",true);
                    SoundSettingsEditor.apply();
                    switch40.setChecked(true);

                    SoundSettingsEditor =getSharedPreferences("save41",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value41",true);
                    SoundSettingsEditor.apply();
                    switch41.setChecked(true);

                    SoundSettingsEditor =getSharedPreferences("save42",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value42",true);
                    SoundSettingsEditor.apply();
                    switch42.setChecked(true);

                    SoundSettingsEditor =getSharedPreferences("save43",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value43",true);
                    SoundSettingsEditor.apply();
                    switch43.setChecked(true);

                    SoundSettingsEditor =getSharedPreferences("save44",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value44",true);
                    SoundSettingsEditor.apply();
                    switch44.setChecked(true);

                    SoundSettingsEditor =getSharedPreferences("save45",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value45",true);
                    SoundSettingsEditor.apply();
                    switch45.setChecked(true);

                    SoundSettingsEditor =getSharedPreferences("save46",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value46",true);
                    SoundSettingsEditor.apply();
                    switch46.setChecked(true);

                    SoundSettingsEditor =getSharedPreferences("save47",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value47",true);
                    SoundSettingsEditor.apply();
                    switch47.setChecked(true);

                }
            }
        });
        toggle_btn.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_UP) {
                    toggle_btn.setCardBackgroundColor(getResources().getColor(R.color.button));
                } else if(event.getAction() == MotionEvent.ACTION_DOWN) {
                    toggle_btn.setCardBackgroundColor(getResources().getColor(R.color.clearbutton));
                }
                return false;
            }
        });



        // for switch 0 to activate
        switch0=findViewById(R.id.switch0);
        SoundSettings =getSharedPreferences("save0",MODE_PRIVATE);
        switch0.setChecked(SoundSettings.getBoolean("value0",false));
        switch0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch0.isChecked()){
                    SoundSettingsEditor =getSharedPreferences("save0",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value0",true);
                    SoundSettingsEditor.apply();
                    switch0.setChecked(true);
                }else{
                    SoundSettingsEditor =getSharedPreferences("save0",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value0",false);
                    SoundSettingsEditor.apply();
                    switch0.setChecked(false);
                }
            }
        });

        // for switch 1 to activate
        switch1=findViewById(R.id.switch1);
        SoundSettings =getSharedPreferences("save1",MODE_PRIVATE);
        switch1.setChecked(SoundSettings.getBoolean("value1",true));
        switch1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch1.isChecked()){
                    SoundSettingsEditor =getSharedPreferences("save1",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value1",true);
                    SoundSettingsEditor.apply();
                    switch1.setChecked(true);
                }else{
                    SoundSettingsEditor =getSharedPreferences("save1",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value1",false);
                    SoundSettingsEditor.apply();
                    switch1.setChecked(false);
                }
            }
        });

        // for switch 2 to activate
        switch2=findViewById(R.id.switch2);
        SoundSettings =getSharedPreferences("save2",MODE_PRIVATE);
        switch2.setChecked(SoundSettings.getBoolean("value2",true));
        switch2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch2.isChecked()){
                    SoundSettingsEditor =getSharedPreferences("save2",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value2",true);
                    SoundSettingsEditor.apply();
                    switch2.setChecked(true);
                }else{
                    SoundSettingsEditor =getSharedPreferences("save2",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value2",false);
                    SoundSettingsEditor.apply();
                    switch2.setChecked(false);
                }
            }
        });

        // for switch 3 to activate
        switch3=findViewById(R.id.switch3);
        SoundSettings =getSharedPreferences("save3",MODE_PRIVATE);
        switch3.setChecked(SoundSettings.getBoolean("value3",true));
        switch3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch3.isChecked()){
                    SoundSettingsEditor =getSharedPreferences("save3",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value3",true);
                    SoundSettingsEditor.apply();
                    switch3.setChecked(true);
                }else{
                    SoundSettingsEditor =getSharedPreferences("save3",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value3",false);
                    SoundSettingsEditor.apply();
                    switch3.setChecked(false);
                }
            }
        });

// for switch 4 to activate
        switch4=findViewById(R.id.switch4);
        SoundSettings =getSharedPreferences("save4",MODE_PRIVATE);
        switch4.setChecked(SoundSettings.getBoolean("value4",true));
        switch4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch4.isChecked()){
                    SoundSettingsEditor =getSharedPreferences("save4",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value4",true);
                    SoundSettingsEditor.apply();
                    switch4.setChecked(true);
                }else{
                    SoundSettingsEditor =getSharedPreferences("save4",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value4",false);
                    SoundSettingsEditor.apply();
                    switch4.setChecked(false);
                }
            }
        });

// for switch 5 to activate
        switch5=findViewById(R.id.switch5);
        SoundSettings =getSharedPreferences("save5",MODE_PRIVATE);
        switch5.setChecked(SoundSettings.getBoolean("value5",true));
        switch5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch5.isChecked()){
                    SoundSettingsEditor =getSharedPreferences("save5",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value5",true);
                    SoundSettingsEditor.apply();
                    switch5.setChecked(true);
                }else{
                    SoundSettingsEditor =getSharedPreferences("save5",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value5",false);
                    SoundSettingsEditor.apply();
                    switch5.setChecked(false);
                }
            }
        });

// for switch 6 to activate
        switch6=findViewById(R.id.switch6);
        SoundSettings =getSharedPreferences("save6",MODE_PRIVATE);
        switch6.setChecked(SoundSettings.getBoolean("value6",true));
        switch6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch6.isChecked()){
                    SoundSettingsEditor =getSharedPreferences("save6",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value6",true);
                    SoundSettingsEditor.apply();
                    switch6.setChecked(true);
                }else{
                    SoundSettingsEditor =getSharedPreferences("save6",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value6",false);
                    SoundSettingsEditor.apply();
                    switch6.setChecked(false);
                }
            }
        });

// for switch 7 to activate
        switch7=findViewById(R.id.switch7);
        SoundSettings =getSharedPreferences("save7",MODE_PRIVATE);
        switch7.setChecked(SoundSettings.getBoolean("value7",true));
        switch7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch7.isChecked()){
                    SoundSettingsEditor =getSharedPreferences("save7",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value7",true);
                    SoundSettingsEditor.apply();
                    switch7.setChecked(true);
                }else{
                    SoundSettingsEditor =getSharedPreferences("save7",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value7",false);
                    SoundSettingsEditor.apply();
                    switch7.setChecked(false);
                }
            }
        });

// for switch 8 to activate
        switch8=findViewById(R.id.switch8);
        SoundSettings =getSharedPreferences("save8",MODE_PRIVATE);
        switch8.setChecked(SoundSettings.getBoolean("value8",true));
        switch8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch8.isChecked()){
                    SoundSettingsEditor =getSharedPreferences("save8",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value8",true);
                    SoundSettingsEditor.apply();
                    switch8.setChecked(true);
                }else{
                    SoundSettingsEditor =getSharedPreferences("save8",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value8",false);
                    SoundSettingsEditor.apply();
                    switch8.setChecked(false);
                }
            }
        });

// for switch 9 to activate
        switch9=findViewById(R.id.switch9);
        SoundSettings =getSharedPreferences("save9",MODE_PRIVATE);
        switch9.setChecked(SoundSettings.getBoolean("value9",true));
        switch9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch9.isChecked()){
                    SoundSettingsEditor =getSharedPreferences("save9",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value9",true);
                    SoundSettingsEditor.apply();
                    switch9.setChecked(true);
                }else{
                    SoundSettingsEditor =getSharedPreferences("save9",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value9",false);
                    SoundSettingsEditor.apply();
                    switch9.setChecked(false);
                }
            }
        });

// for switch 10 to activate
        switch10=findViewById(R.id.switch10);
        SoundSettings =getSharedPreferences("save10",MODE_PRIVATE);
        switch10.setChecked(SoundSettings.getBoolean("value10",true));
        switch10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch10.isChecked()){
                    SoundSettingsEditor =getSharedPreferences("save10",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value10",true);
                    SoundSettingsEditor.apply();
                    switch10.setChecked(true);
                }else{
                    SoundSettingsEditor =getSharedPreferences("save10",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value10",false);
                    SoundSettingsEditor.apply();
                    switch10.setChecked(false);
                }
            }
        });

// for switch 11 to activate
        switch11=findViewById(R.id.switch11);
        SoundSettings =getSharedPreferences("save11",MODE_PRIVATE);
        switch11.setChecked(SoundSettings.getBoolean("value11",true));
        switch11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch11.isChecked()){
                    SoundSettingsEditor =getSharedPreferences("save11",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value11",true);
                    SoundSettingsEditor.apply();
                    switch11.setChecked(true);
                }else{
                    SoundSettingsEditor =getSharedPreferences("save11",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value11",false);
                    SoundSettingsEditor.apply();
                    switch11.setChecked(false);
                }
            }
        });

// for switch 12 to activate
        switch12=findViewById(R.id.switch12);
        SoundSettings =getSharedPreferences("save12",MODE_PRIVATE);
        switch12.setChecked(SoundSettings.getBoolean("value12",true));
        switch12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch12.isChecked()){
                    SoundSettingsEditor =getSharedPreferences("save12",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value12",true);
                    SoundSettingsEditor.apply();
                    switch12.setChecked(true);
                }else{
                    SoundSettingsEditor =getSharedPreferences("save12",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value12",false);
                    SoundSettingsEditor.apply();
                    switch12.setChecked(false);
                }
            }
        });

// for switch 13 to activate
        switch13=findViewById(R.id.switch13);
        SoundSettings =getSharedPreferences("save13",MODE_PRIVATE);
        switch13.setChecked(SoundSettings.getBoolean("value13",true));
        switch13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch13.isChecked()){
                    SoundSettingsEditor =getSharedPreferences("save13",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value13",true);
                    SoundSettingsEditor.apply();
                    switch13.setChecked(true);
                }else{
                    SoundSettingsEditor =getSharedPreferences("save13",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value13",false);
                    SoundSettingsEditor.apply();
                    switch13.setChecked(false);
                }
            }
        });

// for switch 14 to activate
        switch14=findViewById(R.id.switch14);
        SoundSettings =getSharedPreferences("save14",MODE_PRIVATE);
        switch14.setChecked(SoundSettings.getBoolean("value14",true));
        switch14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch14.isChecked()){
                    SoundSettingsEditor =getSharedPreferences("save14",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value14",true);
                    SoundSettingsEditor.apply();
                    switch14.setChecked(true);
                }else{
                    SoundSettingsEditor =getSharedPreferences("save14",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value14",false);
                    SoundSettingsEditor.apply();
                    switch14.setChecked(false);
                }
            }
        });

// for switch 15 to activate
        switch15=findViewById(R.id.switch15);
        SoundSettings =getSharedPreferences("save15",MODE_PRIVATE);
        switch15.setChecked(SoundSettings.getBoolean("value15",true));
        switch15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch15.isChecked()){
                    SoundSettingsEditor =getSharedPreferences("save15",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value15",true);
                    SoundSettingsEditor.apply();
                    switch15.setChecked(true);
                }else{
                    SoundSettingsEditor =getSharedPreferences("save15",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value15",false);
                    SoundSettingsEditor.apply();
                    switch15.setChecked(false);
                }
            }
        });

// for switch 16 to activate
        switch16=findViewById(R.id.switch16);
        SoundSettings =getSharedPreferences("save16",MODE_PRIVATE);
        switch16.setChecked(SoundSettings.getBoolean("value16",true));
        switch16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch16.isChecked()){
                    SoundSettingsEditor =getSharedPreferences("save16",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value16",true);
                    SoundSettingsEditor.apply();
                    switch16.setChecked(true);
                }else{
                    SoundSettingsEditor =getSharedPreferences("save16",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value16",false);
                    SoundSettingsEditor.apply();
                    switch16.setChecked(false);
                }
            }
        });

// for switch 17 to activate
        switch17=findViewById(R.id.switch17);
        SoundSettings =getSharedPreferences("save17",MODE_PRIVATE);
        switch17.setChecked(SoundSettings.getBoolean("value17",true));
        switch17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch17.isChecked()){
                    SoundSettingsEditor =getSharedPreferences("save17",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value17",true);
                    SoundSettingsEditor.apply();
                    switch17.setChecked(true);
                }else{
                    SoundSettingsEditor =getSharedPreferences("save17",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value17",false);
                    SoundSettingsEditor.apply();
                    switch17.setChecked(false);
                }
            }
        });

// for switch 18 to activate
        switch18=findViewById(R.id.switch18);
        SoundSettings =getSharedPreferences("save18",MODE_PRIVATE);
        switch18.setChecked(SoundSettings.getBoolean("value18",true));
        switch18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch18.isChecked()){
                    SoundSettingsEditor =getSharedPreferences("save18",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value18",true);
                    SoundSettingsEditor.apply();
                    switch18.setChecked(true);
                }else{
                    SoundSettingsEditor =getSharedPreferences("save18",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value18",false);
                    SoundSettingsEditor.apply();
                    switch18.setChecked(false);
                }
            }
        });

// for switch 19 to activate
        switch19=findViewById(R.id.switch19);
        SoundSettings =getSharedPreferences("save19",MODE_PRIVATE);
        switch19.setChecked(SoundSettings.getBoolean("value19",true));
        switch19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch19.isChecked()){
                    SoundSettingsEditor =getSharedPreferences("save19",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value19",true);
                    SoundSettingsEditor.apply();
                    switch19.setChecked(true);
                }else{
                    SoundSettingsEditor =getSharedPreferences("save19",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value19",false);
                    SoundSettingsEditor.apply();
                    switch19.setChecked(false);
                }
            }
        });

// for switch 20 to activate
        switch20=findViewById(R.id.switch20);
        SoundSettings =getSharedPreferences("save20",MODE_PRIVATE);
        switch20.setChecked(SoundSettings.getBoolean("value20",true));
        switch20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch20.isChecked()){
                    SoundSettingsEditor =getSharedPreferences("save20",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value20",true);
                    SoundSettingsEditor.apply();
                    switch20.setChecked(true);
                }else{
                    SoundSettingsEditor =getSharedPreferences("save20",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value20",false);
                    SoundSettingsEditor.apply();
                    switch20.setChecked(false);
                }
            }
        });

// for switch 21 to activate
        switch21=findViewById(R.id.switch21);
        SoundSettings =getSharedPreferences("save21",MODE_PRIVATE);
        switch21.setChecked(SoundSettings.getBoolean("value21",true));
        switch21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch21.isChecked()){
                    SoundSettingsEditor =getSharedPreferences("save21",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value21",true);
                    SoundSettingsEditor.apply();
                    switch21.setChecked(true);
                }else{
                    SoundSettingsEditor =getSharedPreferences("save21",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value21",false);
                    SoundSettingsEditor.apply();
                    switch21.setChecked(false);
                }
            }
        });

// for switch 22 to activate
        switch22=findViewById(R.id.switch22);
        SoundSettings =getSharedPreferences("save22",MODE_PRIVATE);
        switch22.setChecked(SoundSettings.getBoolean("value22",true));
        switch22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch22.isChecked()){
                    SoundSettingsEditor =getSharedPreferences("save22",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value22",true);
                    SoundSettingsEditor.apply();
                    switch22.setChecked(true);
                }else{
                    SoundSettingsEditor =getSharedPreferences("save22",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value22",false);
                    SoundSettingsEditor.apply();
                    switch22.setChecked(false);
                }
            }
        });

// for switch 23 to activate
        switch23=findViewById(R.id.switch23);
        SoundSettings =getSharedPreferences("save23",MODE_PRIVATE);
        switch23.setChecked(SoundSettings.getBoolean("value23",true));
        switch23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch23.isChecked()){
                    SoundSettingsEditor =getSharedPreferences("save23",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value23",true);
                    SoundSettingsEditor.apply();
                    switch23.setChecked(true);
                }else{
                    SoundSettingsEditor =getSharedPreferences("save23",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value23",false);
                    SoundSettingsEditor.apply();
                    switch23.setChecked(false);
                }
            }
        });

// for switch 24 to activate
        switch24=findViewById(R.id.switch24);
        SoundSettings =getSharedPreferences("save24",MODE_PRIVATE);
        switch24.setChecked(SoundSettings.getBoolean("value24",true));
        switch24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch24.isChecked()){
                    SoundSettingsEditor =getSharedPreferences("save24",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value24",true);
                    SoundSettingsEditor.apply();
                    switch24.setChecked(true);
                }else{
                    SoundSettingsEditor =getSharedPreferences("save24",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value24",false);
                    SoundSettingsEditor.apply();
                    switch24.setChecked(false);
                }
            }
        });

// for switch 25 to activate
        switch25=findViewById(R.id.switch25);
        SoundSettings =getSharedPreferences("save25",MODE_PRIVATE);
        switch25.setChecked(SoundSettings.getBoolean("value25",true));
        switch25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch25.isChecked()){
                    SoundSettingsEditor =getSharedPreferences("save25",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value25",true);
                    SoundSettingsEditor.apply();
                    switch25.setChecked(true);
                }else{
                    SoundSettingsEditor =getSharedPreferences("save25",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value25",false);
                    SoundSettingsEditor.apply();
                    switch25.setChecked(false);
                }
            }
        });

// for switch 26 to activate
        switch26=findViewById(R.id.switch26);
        SoundSettings =getSharedPreferences("save26",MODE_PRIVATE);
        switch26.setChecked(SoundSettings.getBoolean("value26",true));
        switch26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch26.isChecked()){
                    SoundSettingsEditor =getSharedPreferences("save26",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value26",true);
                    SoundSettingsEditor.apply();
                    switch26.setChecked(true);
                }else{
                    SoundSettingsEditor =getSharedPreferences("save26",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value26",false);
                    SoundSettingsEditor.apply();
                    switch26.setChecked(false);
                }
            }
        });

// for switch 27 to activate
        switch27=findViewById(R.id.switch27);
        SoundSettings =getSharedPreferences("save27",MODE_PRIVATE);
        switch27.setChecked(SoundSettings.getBoolean("value27",true));
        switch27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch27.isChecked()){
                    SoundSettingsEditor =getSharedPreferences("save27",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value27",true);
                    SoundSettingsEditor.apply();
                    switch27.setChecked(true);
                }else{
                    SoundSettingsEditor =getSharedPreferences("save27",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value27",false);
                    SoundSettingsEditor.apply();
                    switch27.setChecked(false);
                }
            }
        });

// for switch 28 to activate
        switch28=findViewById(R.id.switch28);
        SoundSettings =getSharedPreferences("save28",MODE_PRIVATE);
        switch28.setChecked(SoundSettings.getBoolean("value28",true));
        switch28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch28.isChecked()){
                    SoundSettingsEditor =getSharedPreferences("save28",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value28",true);
                    SoundSettingsEditor.apply();
                    switch28.setChecked(true);
                }else{
                    SoundSettingsEditor =getSharedPreferences("save28",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value28",false);
                    SoundSettingsEditor.apply();
                    switch28.setChecked(false);
                }
            }
        });

// for switch 29 to activate
        switch29=findViewById(R.id.switch29);
        SoundSettings =getSharedPreferences("save29",MODE_PRIVATE);
        switch29.setChecked(SoundSettings.getBoolean("value29",true));
        switch29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch29.isChecked()){
                    SoundSettingsEditor =getSharedPreferences("save29",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value29",true);
                    SoundSettingsEditor.apply();
                    switch29.setChecked(true);
                }else{
                    SoundSettingsEditor =getSharedPreferences("save29",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value29",false);
                    SoundSettingsEditor.apply();
                    switch29.setChecked(false);
                }
            }
        });

// for switch 30 to activate
        switch30=findViewById(R.id.switch30);
        SoundSettings =getSharedPreferences("save30",MODE_PRIVATE);
        switch30.setChecked(SoundSettings.getBoolean("value30",true));
        switch30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch30.isChecked()){
                    SoundSettingsEditor =getSharedPreferences("save30",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value30",true);
                    SoundSettingsEditor.apply();
                    switch30.setChecked(true);
                }else{
                    SoundSettingsEditor =getSharedPreferences("save30",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value30",false);
                    SoundSettingsEditor.apply();
                    switch30.setChecked(false);
                }
            }
        });

// for switch 31 to activate
        switch31=findViewById(R.id.switch31);
        SoundSettings =getSharedPreferences("save31",MODE_PRIVATE);
        switch31.setChecked(SoundSettings.getBoolean("value31",true));
        switch31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch31.isChecked()){
                    SoundSettingsEditor =getSharedPreferences("save31",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value31",true);
                    SoundSettingsEditor.apply();
                    switch31.setChecked(true);
                }else{
                    SoundSettingsEditor =getSharedPreferences("save31",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value31",false);
                    SoundSettingsEditor.apply();
                    switch31.setChecked(false);
                }
            }
        });

// for switch 32 to activate
        switch32=findViewById(R.id.switch32);
        SoundSettings =getSharedPreferences("save32",MODE_PRIVATE);
        switch32.setChecked(SoundSettings.getBoolean("value32",true));
        switch32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch32.isChecked()){
                    SoundSettingsEditor =getSharedPreferences("save32",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value32",true);
                    SoundSettingsEditor.apply();
                    switch32.setChecked(true);
                }else{
                    SoundSettingsEditor =getSharedPreferences("save32",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value32",false);
                    SoundSettingsEditor.apply();
                    switch32.setChecked(false);
                }
            }
        });

// for switch 33 to activate
        switch33=findViewById(R.id.switch33);
        SoundSettings =getSharedPreferences("save33",MODE_PRIVATE);
        switch33.setChecked(SoundSettings.getBoolean("value33",true));
        switch33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch33.isChecked()){
                    SoundSettingsEditor =getSharedPreferences("save33",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value33",true);
                    SoundSettingsEditor.apply();
                    switch33.setChecked(true);
                }else{
                    SoundSettingsEditor =getSharedPreferences("save33",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value33",false);
                    SoundSettingsEditor.apply();
                    switch33.setChecked(false);
                }
            }
        });

// for switch 34 to activate
        switch34=findViewById(R.id.switch34);
        SoundSettings =getSharedPreferences("save34",MODE_PRIVATE);
        switch34.setChecked(SoundSettings.getBoolean("value34",true));
        switch34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch34.isChecked()){
                    SoundSettingsEditor =getSharedPreferences("save34",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value34",true);
                    SoundSettingsEditor.apply();
                    switch34.setChecked(true);
                }else{
                    SoundSettingsEditor =getSharedPreferences("save34",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value34",false);
                    SoundSettingsEditor.apply();
                    switch34.setChecked(false);
                }
            }
        });

// for switch 35 to activate
        switch35=findViewById(R.id.switch35);
        SoundSettings =getSharedPreferences("save35",MODE_PRIVATE);
        switch35.setChecked(SoundSettings.getBoolean("value35",true));
        switch35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch35.isChecked()){
                    SoundSettingsEditor =getSharedPreferences("save35",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value35",true);
                    SoundSettingsEditor.apply();
                    switch35.setChecked(true);
                }else{
                    SoundSettingsEditor =getSharedPreferences("save35",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value35",false);
                    SoundSettingsEditor.apply();
                    switch35.setChecked(false);
                }
            }
        });

// for switch 36 to activate
        switch36=findViewById(R.id.switch36);
        SoundSettings =getSharedPreferences("save36",MODE_PRIVATE);
        switch36.setChecked(SoundSettings.getBoolean("value36",true));
        switch36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch36.isChecked()){
                    SoundSettingsEditor =getSharedPreferences("save36",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value36",true);
                    SoundSettingsEditor.apply();
                    switch36.setChecked(true);
                }else{
                    SoundSettingsEditor =getSharedPreferences("save36",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value36",false);
                    SoundSettingsEditor.apply();
                    switch36.setChecked(false);
                }
            }
        });

// for switch 37 to activate
        switch37=findViewById(R.id.switch37);
        SoundSettings =getSharedPreferences("save37",MODE_PRIVATE);
        switch37.setChecked(SoundSettings.getBoolean("value37",true));
        switch37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch37.isChecked()){
                    SoundSettingsEditor =getSharedPreferences("save37",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value37",true);
                    SoundSettingsEditor.apply();
                    switch37.setChecked(true);
                }else{
                    SoundSettingsEditor =getSharedPreferences("save37",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value37",false);
                    SoundSettingsEditor.apply();
                    switch37.setChecked(false);
                }
            }
        });

// for switch 38 to activate
        switch38=findViewById(R.id.switch38);
        SoundSettings =getSharedPreferences("save38",MODE_PRIVATE);
        switch38.setChecked(SoundSettings.getBoolean("value38",true));
        switch38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch38.isChecked()){
                    SoundSettingsEditor =getSharedPreferences("save38",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value38",true);
                    SoundSettingsEditor.apply();
                    switch38.setChecked(true);
                }else{
                    SoundSettingsEditor =getSharedPreferences("save38",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value38",false);
                    SoundSettingsEditor.apply();
                    switch38.setChecked(false);
                }
            }
        });

// for switch 39 to activate
        switch39=findViewById(R.id.switch39);
        SoundSettings =getSharedPreferences("save39",MODE_PRIVATE);
        switch39.setChecked(SoundSettings.getBoolean("value39",true));
        switch39.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch39.isChecked()){
                    SoundSettingsEditor =getSharedPreferences("save39",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value39",true);
                    SoundSettingsEditor.apply();
                    switch39.setChecked(true);
                }else{
                    SoundSettingsEditor =getSharedPreferences("save39",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value39",false);
                    SoundSettingsEditor.apply();
                    switch39.setChecked(false);
                }
            }
        });

// for switch 40 to activate
        switch40=findViewById(R.id.switch40);
        SoundSettings =getSharedPreferences("save40",MODE_PRIVATE);
        switch40.setChecked(SoundSettings.getBoolean("value40",true));
        switch40.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch40.isChecked()){
                    SoundSettingsEditor =getSharedPreferences("save40",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value40",true);
                    SoundSettingsEditor.apply();
                    switch40.setChecked(true);
                }else{
                    SoundSettingsEditor =getSharedPreferences("save40",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value40",false);
                    SoundSettingsEditor.apply();
                    switch40.setChecked(false);
                }
            }
        });

// for switch 41 to activate
        switch41=findViewById(R.id.switch41);
        SoundSettings =getSharedPreferences("save41",MODE_PRIVATE);
        switch41.setChecked(SoundSettings.getBoolean("value41",true));
        switch41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch41.isChecked()){
                    SoundSettingsEditor =getSharedPreferences("save41",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value41",true);
                    SoundSettingsEditor.apply();
                    switch41.setChecked(true);
                }else{
                    SoundSettingsEditor =getSharedPreferences("save41",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value41",false);
                    SoundSettingsEditor.apply();
                    switch41.setChecked(false);
                }
            }
        });

// for switch 42 to activate
        switch42=findViewById(R.id.switch42);
        SoundSettings =getSharedPreferences("save42",MODE_PRIVATE);
        switch42.setChecked(SoundSettings.getBoolean("value42",true));
        switch42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch42.isChecked()){
                    SoundSettingsEditor =getSharedPreferences("save42",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value42",true);
                    SoundSettingsEditor.apply();
                    switch42.setChecked(true);
                }else{
                    SoundSettingsEditor =getSharedPreferences("save42",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value42",false);
                    SoundSettingsEditor.apply();
                    switch42.setChecked(false);
                }
            }
        });

// for switch 43 to activate
        switch43=findViewById(R.id.switch43);
        SoundSettings =getSharedPreferences("save43",MODE_PRIVATE);
        switch43.setChecked(SoundSettings.getBoolean("value43",true));
        switch43.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch43.isChecked()){
                    SoundSettingsEditor =getSharedPreferences("save43",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value43",true);
                    SoundSettingsEditor.apply();
                    switch43.setChecked(true);
                }else{
                    SoundSettingsEditor =getSharedPreferences("save43",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value43",false);
                    SoundSettingsEditor.apply();
                    switch43.setChecked(false);
                }
            }
        });

// for switch 44 to activate
        switch44=findViewById(R.id.switch44);
        SoundSettings =getSharedPreferences("save44",MODE_PRIVATE);
        switch44.setChecked(SoundSettings.getBoolean("value44",true));
        switch44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch44.isChecked()){
                    SoundSettingsEditor =getSharedPreferences("save44",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value44",true);
                    SoundSettingsEditor.apply();
                    switch44.setChecked(true);
                }else{
                    SoundSettingsEditor =getSharedPreferences("save44",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value44",false);
                    SoundSettingsEditor.apply();
                    switch44.setChecked(false);
                }
            }
        });

// for switch 45 to activate
        switch45=findViewById(R.id.switch45);
        SoundSettings =getSharedPreferences("save45",MODE_PRIVATE);
        switch45.setChecked(SoundSettings.getBoolean("value45",true));
        switch45.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch45.isChecked()){
                    SoundSettingsEditor =getSharedPreferences("save45",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value45",true);
                    SoundSettingsEditor.apply();
                    switch45.setChecked(true);
                }else{
                    SoundSettingsEditor =getSharedPreferences("save45",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value45",false);
                    SoundSettingsEditor.apply();
                    switch45.setChecked(false);
                }
            }
        });

// for switch 46 to activate
        switch46=findViewById(R.id.switch46);
        SoundSettings =getSharedPreferences("save46",MODE_PRIVATE);
        switch46.setChecked(SoundSettings.getBoolean("value46",true));
        switch46.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch46.isChecked()){
                    SoundSettingsEditor =getSharedPreferences("save46",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value46",true);
                    SoundSettingsEditor.apply();
                    switch46.setChecked(true);
                }else{
                    SoundSettingsEditor =getSharedPreferences("save46",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value46",false);
                    SoundSettingsEditor.apply();
                    switch46.setChecked(false);
                }
            }
        });

// for switch 47 to activate
        switch47=findViewById(R.id.switch47);
        SoundSettings =getSharedPreferences("save47",MODE_PRIVATE);
        switch47.setChecked(SoundSettings.getBoolean("value47",true));
        switch47.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch47.isChecked()){
                    SoundSettingsEditor =getSharedPreferences("save47",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value47",true);
                    SoundSettingsEditor.apply();
                    switch47.setChecked(true);
                }else{
                    SoundSettingsEditor =getSharedPreferences("save47",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value47",false);
                    SoundSettingsEditor.apply();
                    switch47.setChecked(false);
                }
            }
        });



    }

    private void retrievedata(){
        SoundSettings=getSharedPreferences("Chara",MODE_PRIVATE);
        charavalue=SoundSettings.getInt("CharaValue",0);

        switch (charavalue) {
            case 0:
                AyameIMG0.setChecked(true);
                break;
            case 1:
                AyameIMG1.setChecked(true);
                break;
            case 2:
                AyameIMG2.setChecked(true);
                break;
            case 3:
                AyameIMG3.setChecked(true);
                break;
            case 4:
                AyameIMG4.setChecked(true);
                break;
            default:
                AyameIMG5.setChecked(true);
                break;
        }
    }
}