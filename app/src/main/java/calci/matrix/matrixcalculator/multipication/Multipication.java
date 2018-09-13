package calci.matrix.matrixcalculator.multipication;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import calci.matrix.matrixcalculator.R;
import calci.matrix.matrixcalculator.addition.Addition;
import calci.matrix.matrixcalculator.addition.AdditionExample;

public class Multipication extends AppCompatActivity
{
    Spinner spiner_rows1,spiner_columns1,spiner_rows2,spiner_columns2;
    Button first_mul_button,first_mul_button2;
    ArrayAdapter aa,bb,cc,dd;
    String arr[]={"--select row--","2","3"};
    String crr[]={"--select column--","2","3"};
    String r1,c1,r2,c2;
    EditText et_1,et_2,et_3,et_4,et_5,et_6,et_7,et_8,et_9,et_10,et_11,et_12,et_13,et_14,et_15,et_16,et_17,
            et_18,et_19,et_20,et_21,et_22,et_23,et_24,et_25,et_26,two_one,two_two,two_three,two_four,two_five,two_six,
            three_one,three_two,three_three,three_four,three_five,three_six;
    TextView one,two,three,four,five,six,seven,eigt,nine;
    String a1,a2,a3,a4,a5,a6,a7,a8,A1,A2,A3,A4,A5,A6,A7,A8,A9,A10,A11,A12,A13,A14,A15,A16,A17,A18,
    tone,ttwo,tthree,tfour,tfive,tsix,thone,thtwo,ththree,thfour,thfive,thsix;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.multipication);
        initParams();
    }
    public void initParams()
    {
        one=(TextView)findViewById(R.id.one);
        two=(TextView)findViewById(R.id.two);
        three=(TextView)findViewById(R.id.three);
        four=(TextView)findViewById(R.id.four);
        five=(TextView)findViewById(R.id.five);
        six=(TextView)findViewById(R.id.six);
        seven=(TextView)findViewById(R.id.seven);
        eigt=(TextView)findViewById(R.id.eigt);
        nine=(TextView)findViewById(R.id.nine);

        spiner_rows1=(Spinner)findViewById(R.id.spiner_rows1);
        spiner_columns1=(Spinner)findViewById(R.id.spiner_columns1);
        first_mul_button=(Button)findViewById(R.id.first_mul_button);
        first_mul_button2=(Button)findViewById(R.id.first_mul_button2);

        spiner_rows2=(Spinner)findViewById(R.id.spiner_rows2);
        spiner_columns2=(Spinner)findViewById(R.id.spiner_columns2);

        aa=new ArrayAdapter(this,android.R.layout.simple_spinner_dropdown_item,arr);
        spiner_rows1.setAdapter(aa);

        bb=new ArrayAdapter(this,android.R.layout.simple_spinner_dropdown_item,crr);
        spiner_columns1.setAdapter(bb);

        cc=new ArrayAdapter(this,android.R.layout.simple_spinner_dropdown_item,arr);
        spiner_rows2.setAdapter(cc);

        dd=new ArrayAdapter(this,android.R.layout.simple_spinner_dropdown_item,crr);
        spiner_columns2.setAdapter(dd);

        first_mul_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonLogics();
            }
        });
        first_mul_button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                performSecondButtons();
            }
        });
    }
    public void buttonLogics()
    {
         r1=spiner_rows1.getSelectedItem().toString().trim();
         c1=spiner_columns1.getSelectedItem().toString().trim();
        if (r1.equals("--select row--"))
        {
            Toast.makeText(this, "select valid rows", Toast.LENGTH_SHORT).show();
        }
        else if (c1.equals("--select column--"))
        {
            Toast.makeText(this, "select valid columns", Toast.LENGTH_SHORT).show();
        }
        else
        {
            performLog();
        }
    }
    public void performLog()
    {
        if (r1=="2")
        {
            if (c1=="2")
            {
                //perform 2*2 matrix related operatopns
                final View v6=((Activity)this).getLayoutInflater().inflate(R.layout.five_elements,null);
                AlertDialog.Builder al=new AlertDialog.Builder(this);
                al.setCancelable(false);
                al.setView(v6);
                al.setTitle("enter values");
                al.setPositiveButton("ok", new DialogInterface.OnClickListener()
                {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i)
                    {
                        et_1=(EditText)v6.findViewById(R.id.five_et1);
                        a1=et_1.getText().toString().trim();

                        et_2=(EditText)v6.findViewById(R.id.five_et2);
                        a2=et_2.getText().toString().trim();

                        et_3=(EditText)v6.findViewById(R.id.five_et3);
                        a3=et_3.getText().toString().trim();

                        et_4=(EditText)v6.findViewById(R.id.five_et4);
                        a4=et_4.getText().toString().trim();
                        //and pass values to next activities
                    }
                });
                al.show();

            }
        }
        else if (r1=="2")
        {
            if (c1=="3")
            {
                //inflate 2*3 layouts
                final View v6=((Activity)this).getLayoutInflater().inflate(R.layout.two_to_three,null);
                AlertDialog.Builder al=new AlertDialog.Builder(this);
                al.setCancelable(false);
                al.setView(v6);
                al.setTitle("enter values");
                al.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i)
                    {
                        two_one=(EditText)v6.findViewById(R.id.two_one);
                        tone=two_one.getText().toString().trim();
                        two_two=(EditText)v6.findViewById(R.id.two_two);
                        ttwo=two_two.getText().toString().trim();
                        two_three=(EditText)v6.findViewById(R.id.two_three);
                        tthree=two_three.getText().toString().trim();
                        two_four=(EditText)v6.findViewById(R.id.two_four);
                        tfour=two_four.getText().toString().trim();
                        two_five=(EditText)v6.findViewById(R.id.two_five);
                        tfive=two_five.getText().toString().trim();
                        two_six=(EditText)v6.findViewById(R.id.two_six);
                        tsix=two_six.getText().toString().trim();

                    }
                });
                al.show();
            }
        }
        else if (r1=="3")
        {
            if (c1=="3")
            {
                //perform 3*3 matrix related operatopns
                final View v6=((Activity)this).getLayoutInflater().inflate(R.layout.six_elements,null);
                AlertDialog.Builder al=new AlertDialog.Builder(this);
                al.setCancelable(false);
                al.setView(v6);
                al.setTitle("enter values");
                al.setPositiveButton("ok", new DialogInterface.OnClickListener()
                {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i)
                    {

                        et_9=(EditText)v6.findViewById(R.id.six_et1);
                        A1=et_9.getText().toString().trim();

                        et_10=(EditText)v6.findViewById(R.id.six_et2);
                        A2=et_10.getText().toString().trim();

                        et_11=(EditText)v6.findViewById(R.id.six_et3);
                        A3=et_11.getText().toString().trim();

                        et_12=(EditText)v6.findViewById(R.id.six_et4);
                        A4=et_12.getText().toString().trim();

                        et_13=(EditText)v6.findViewById(R.id.six_et5);
                        A5=et_13.getText().toString().trim();

                        et_14=(EditText)v6.findViewById(R.id.six_et6);
                        A6=et_14.getText().toString().trim();

                        et_15=(EditText)v6.findViewById(R.id.six_et7);
                        A7=et_15.getText().toString().trim();

                        et_16=(EditText)v6.findViewById(R.id.six_et8);
                        A8=et_16.getText().toString().trim();

                        et_17=(EditText)v6.findViewById(R.id.six_et9);
                        A9=et_17.getText().toString().trim();
                        //three_one,three_two,three_three,three_four,three_five,three_six

                        //and pass data values to next activities

                    }
                });
                al.show();
            }
        }else if (r1=="3")
        {
            if (c1=="2")
            {
                //inflate 3*2 matrix latut

            }
        }



    }

    public void performSecondButtons()
    {
         r2=spiner_rows2.getSelectedItem().toString().trim();
         c2=spiner_columns2.getSelectedItem().toString().trim();
        if (r2.equals("--select row--"))
        {
            Toast.makeText(this, "select valid rows", Toast.LENGTH_SHORT).show();
        }
        else if (c2.equals("--select column--"))
        {
            Toast.makeText(this, "select valid columns", Toast.LENGTH_SHORT).show();
        }
        else
        {
            displayLayouts();
        }
    }
    public void displayLayouts()
    {
        if (r2=="2")
        {
            if(c2=="2")
            {
                //perfome 2*2 matrix calculation here

                //perform 2*2 matrix related operatopns
                final View v6=((Activity)this).getLayoutInflater().inflate(R.layout.five_elements,null);
                AlertDialog.Builder al=new AlertDialog.Builder(this);
                al.setCancelable(false);
                al.setView(v6);
                al.setTitle("enter values");
                al.setPositiveButton("ok", new DialogInterface.OnClickListener()
                {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i)
                    {
                        et_5=(EditText)v6.findViewById(R.id.five_et1);
                        a5=et_5.getText().toString().trim();

                        et_6=(EditText)v6.findViewById(R.id.five_et2);
                        a6=et_6.getText().toString().trim();

                        et_7=(EditText)v6.findViewById(R.id.five_et3);
                        a7=et_7.getText().toString().trim();

                        et_8=(EditText)v6.findViewById(R.id.five_et4);
                        a8=et_8.getText().toString().trim();
                        //and pass values to next activities

                        //performBackgrounds();
                        int oneee=(Integer.parseInt(a1)*Integer.parseInt(a5))+(Integer.parseInt(a2)*Integer.parseInt(a7));
                        int too=(Integer.parseInt(a1)*Integer.parseInt(a6))+(Integer.parseInt(a2)*Integer.parseInt(a8));
                        int tree=(Integer.parseInt(a3)*Integer.parseInt(a5))+(Integer.parseInt(a4)*Integer.parseInt(a7));
                        int frr=(Integer.parseInt(a3)*Integer.parseInt(a6))+(Integer.parseInt(a4)*Integer.parseInt(a8));

                        two.setText(""+oneee);
                        three.setText(""+too);
                        five.setText(""+tree);
                        six.setText(""+frr);

                    }
                });
                al.show();
            }
        }
        else if (r2=="3")
        {
            if (c2=="3")
            {
                //perfome 3*3 matrix calculation here

                final View v6=((Activity)this).getLayoutInflater().inflate(R.layout.six_elements,null);
                AlertDialog.Builder al=new AlertDialog.Builder(this);
                al.setCancelable(false);
                al.setView(v6);
                al.setTitle("enter values");
                al.setPositiveButton("ok", new DialogInterface.OnClickListener()
                {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i)
                    {

                        et_18=(EditText)v6.findViewById(R.id.six_et1);
                        A10=et_18.getText().toString().trim();

                        et_19=(EditText)v6.findViewById(R.id.six_et2);
                        A11=et_19.getText().toString().trim();

                        et_20=(EditText)v6.findViewById(R.id.six_et3);
                        A12=et_20.getText().toString().trim();

                        et_21=(EditText)v6.findViewById(R.id.six_et4);
                        A13=et_21.getText().toString().trim();

                        et_22=(EditText)v6.findViewById(R.id.six_et5);
                        A14=et_22.getText().toString().trim();

                        et_23=(EditText)v6.findViewById(R.id.six_et6);
                        A15=et_23.getText().toString().trim();

                        et_24=(EditText)v6.findViewById(R.id.six_et7);
                        A16=et_24.getText().toString().trim();

                        et_25=(EditText)v6.findViewById(R.id.six_et8);
                        A17=et_25.getText().toString().trim();

                        et_26=(EditText)v6.findViewById(R.id.six_et9);
                        A18=et_26.getText().toString().trim();
                        //three_one,three_two,three_three,three_four,three_five,three_six

                        //and pass data values to next activities
                        int o=(Integer.parseInt(A1)*Integer.parseInt(A10))+(Integer.parseInt(A2)*Integer.parseInt(A13))+(Integer.parseInt(A3)*Integer.parseInt(A16));
                        int t=(Integer.parseInt(A1)*Integer.parseInt(A11))+(Integer.parseInt(A2)*Integer.parseInt(A14))+(Integer.parseInt(A3)*Integer.parseInt(A17));
                        int tr=(Integer.parseInt(A1)*Integer.parseInt(A12))+(Integer.parseInt(A2)*Integer.parseInt(A15))+(Integer.parseInt(A3)*Integer.parseInt(A18));

                        int fi=(Integer.parseInt(A4)*Integer.parseInt(A10))+(Integer.parseInt(A5)*Integer.parseInt(A13))+(Integer.parseInt(A6)*Integer.parseInt(A16));
                        int si=(Integer.parseInt(A4)*Integer.parseInt(A11))+(Integer.parseInt(A5)*Integer.parseInt(A14))+(Integer.parseInt(A6)*Integer.parseInt(A17));
                        int se=(Integer.parseInt(A4)*Integer.parseInt(A12))+(Integer.parseInt(A5)*Integer.parseInt(A15))+(Integer.parseInt(A6)*Integer.parseInt(A18));

                        int ei=(Integer.parseInt(A7)*Integer.parseInt(A10))+(Integer.parseInt(A8)*Integer.parseInt(A13))+(Integer.parseInt(A9)*Integer.parseInt(A16));
                        int ni=(Integer.parseInt(A7)*Integer.parseInt(A11))+(Integer.parseInt(A8)*Integer.parseInt(A14))+(Integer.parseInt(A9)*Integer.parseInt(A17));
                        int te=(Integer.parseInt(A7)*Integer.parseInt(A12))+(Integer.parseInt(A8)*Integer.parseInt(A15))+(Integer.parseInt(A9)*Integer.parseInt(A18));

                        one.setText(""+o);
                        two.setText(""+t);
                        three.setText(""+tr);
                        four.setText(""+fi);
                        five.setText(""+si);
                        six.setText(""+se);
                        seven.setText(""+ei);
                        eigt.setText(""+ni);
                        nine.setText(""+te);
                    }
                });
                al.show();
            }
        }
        else if (r2=="3")
        {
            if (c2=="2")
            {
                //displaying the 3*2 layouts
                final View v6=((Activity)this).getLayoutInflater().inflate(R.layout.three_to_two,null);
                AlertDialog.Builder al=new AlertDialog.Builder(this);
                al.setCancelable(false);
                al.setView(v6);
                al.setTitle("enter values");
                al.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i)
                    {
                        three_one=(EditText)v6.findViewById(R.id.three_one);
                        thone=three_one.getText().toString().trim();
                        three_two=(EditText)v6.findViewById(R.id.three_two);
                        thtwo=three_two.getText().toString().trim();
                        three_three=(EditText)v6.findViewById(R.id.three_three);
                        ththree=three_three.getText().toString().trim();
                        three_four=(EditText)v6.findViewById(R.id.three_four);
                        thfour=three_four.getText().toString().trim();
                        three_five=(EditText)v6.findViewById(R.id.three_five);
                        thfive=three_five.getText().toString().trim();
                        three_six=(EditText)v6.findViewById(R.id.three_six);
                        thsix=three_six.getText().toString().trim();

                        int on=(Integer.parseInt(tone)*Integer.parseInt(thone))+(Integer.parseInt(ttwo)*Integer.parseInt(ththree))+(Integer.parseInt(tthree)*Integer.parseInt(thfive));
                        int twosss=(Integer.parseInt(tone)*Integer.parseInt(thtwo))+(Integer.parseInt(ttwo)*Integer.parseInt(thfour))+(Integer.parseInt(tthree)*Integer.parseInt(thsix));

                        int threes=(Integer.parseInt(tfour)*Integer.parseInt(thone))+(Integer.parseInt(tfive)*Integer.parseInt(ththree))+(Integer.parseInt(tsix)*Integer.parseInt(thfive));
                        int foursss=(Integer.parseInt(tfour)*Integer.parseInt(thtwo))+(Integer.parseInt(tfive)*Integer.parseInt(thfour))+(Integer.parseInt(tsix)*Integer.parseInt(thsix));


                        two.setText(""+on);
                        three.setText(""+twosss);
                        five.setText(""+threes);
                        six.setText(""+foursss);
                    }
                });
                al.show();
            }
        }
        else if (r2=="3")
        {
            if (c2=="2")
            {
                //inflate 3*2 matrix displaying layout

            }
        }
    }
 }