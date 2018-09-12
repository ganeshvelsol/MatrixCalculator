package calci.matrix.matrixcalculator.addition;

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
import android.widget.Toast;

import calci.matrix.matrixcalculator.R;

public class AdditionExample extends AppCompatActivity
{
    Button proceed,first_button,second_button;
    Spinner spinner_rows1,spinner_columns1,spinner_rows2,spinner_columns2;
    String vals1[]={"--select row1--","1","2","3"};
    String vals2[]={"select row2","1","2","3"};
    String col1[]={"select col1","1","2","3"};
    String col2[]={"select col2","1","2","3"};
    String r1,c1,r2,c2,ets,one,two,three,four,three_one,three_two,three_three,three_four,three_five,three_six,a1,a2,a3,a4,a5,a6,a7,a8,a9,a10,a11,a12,a13,a14
            ,five,six,seven;
    EditText et1,et2,et3,et4,et_1,et_2,et_3,et_4,et_5,et_6,et_7,et_8,et_9,et_10,et_11,et_12,et_13,et_14,et_15,et_16,et_17,et_18,et_19,
            fifth_et12,fifth_et13,fifth_et14;
    ArrayAdapter aa,bb,cc,dd;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        getSupportActionBar().hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.addition_example);
        initParameterss();
    }
    public void initParameterss()
    {
        spinner_rows1=(Spinner)findViewById(R.id.spinner_rows1);
        spinner_columns1=(Spinner)findViewById(R.id.spinner_columns1);
        spinner_rows2=(Spinner)findViewById(R.id.spinner_rows2);
        spinner_columns2=(Spinner)findViewById(R.id.spinner_columns2);

        aa=new ArrayAdapter(this,android.R.layout.simple_spinner_dropdown_item,vals1);
        spinner_rows1.setAdapter(aa);
        bb=new ArrayAdapter(this,android.R.layout.simple_spinner_dropdown_item,col1);
        spinner_columns1.setAdapter(bb);
        cc=new ArrayAdapter(this,android.R.layout.simple_spinner_dropdown_item,vals2);
        spinner_rows2.setAdapter(cc);
        dd=new ArrayAdapter(this,android.R.layout.simple_spinner_dropdown_item,col2);
        spinner_columns2.setAdapter(dd);

        first_button=(Button)findViewById(R.id.first_button);
        second_button=(Button)findViewById(R.id.second_button);
        first_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                //calling the first matrices for reading the values
                firstMatrixex();
            }
        });

        second_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                secondMatrices();
            }
        });

    }
    public void performActions()
    {

    }
    public void firstMatrixex()
    {
        r1=spinner_rows1.getSelectedItem().toString().trim();
        c1=spinner_columns1.getSelectedItem().toString().trim();
        if (r1.equals("--select row1--"))
        {
            Toast.makeText(this, "please select valid rows numbers", Toast.LENGTH_SHORT).show();
        }
        else if (c1.equals("select col1"))
        {
            Toast.makeText(this, "please select valid columns numbers", Toast.LENGTH_SHORT).show();
        }
        else if (r1=="1")
        {
            if (c1=="1")
            {
                //do code for 1*1 matrix like layout having  1 element
                final View v6=((Activity)this).getLayoutInflater().inflate(R.layout.one_element,null);
                AlertDialog.Builder al=new AlertDialog.Builder(this);
                al.setView(v6);
                al.setCancelable(false);
                al.setTitle("Enter element");
                al.setPositiveButton("ok", new DialogInterface.OnClickListener()
                {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i)
                    {
                        EditText et1=(EditText)v6.findViewById(R.id.one_et1);
                        ets=et1.getText().toString().trim();
                    }
                });
                al.show();
            }

        }else if (r1=="2")
        {
            if (c1=="2")
            {
                //do code for 2*2 matrix layout having  4 element
                final View v6=((Activity)this).getLayoutInflater().inflate(R.layout.second_element,null);
                AlertDialog.Builder al=new AlertDialog.Builder(this);
                al.setTitle("enter values");
                al.setView(v6);
                al.setCancelable(false);
                al.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i)
                    {

                        et1=(EditText)v6.findViewById(R.id.second_et2);
                        one=et1.getText().toString().trim();

                        et2=(EditText)v6.findViewById(R.id.third_et3);
                        two=et2.getText().toString().trim();

                        et3=(EditText)v6.findViewById(R.id.fourth_et4);
                        three=et3.getText().toString().trim();

                        et4=(EditText)v6.findViewById(R.id.fifth_et5);
                        four=et4.getText().toString().trim();
                    }
                });
                al.show();
            }

        }else if (r1=="3")
        {
            if (c1=="3")
            {
                //do code for 3*3 matrixes layout having  9 element
                final View v6=((Activity)this).getLayoutInflater().inflate(R.layout.three_element,null);
                AlertDialog.Builder al=new AlertDialog.Builder(this);
                al.setTitle("enter a value");
                al.setCancelable(false);
                al.setView(v6);
                al.setPositiveButton("ok", new DialogInterface.OnClickListener()
                {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i)
                    {
                        //inflating the third layout for 3*3 elements
                        et_1=(EditText)v6.findViewById(R.id.third_et6);
                        three_one=et_1.getText().toString().trim();

                        et_2=(EditText)v6.findViewById(R.id.third_et7);
                        three_two=et_2.getText().toString().trim();

                        et_3=(EditText)v6.findViewById(R.id.third_et8);
                        three_three=et_3.getText().toString().trim();

                        et_4=(EditText)v6.findViewById(R.id.fourth_et9);
                        three_four=et_4.getText().toString().trim();

                        et_5=(EditText)v6.findViewById(R.id.fifth_et10);
                        three_five=et_5.getText().toString().trim();

                        et_6=(EditText)v6.findViewById(R.id.fifth_et11);
                        three_six=et_6.getText().toString().trim();

                        fifth_et12=(EditText)v6.findViewById(R.id.fourth_et12);
                        five=fifth_et12.getText().toString().trim();

                        fifth_et13=(EditText)v6.findViewById(R.id.fifth_et13);
                        six=fifth_et13.getText().toString().trim();

                        fifth_et13=(EditText)v6.findViewById(R.id.fifth_et14);
                        seven=fifth_et13.getText().toString().trim();

                    }
                });
                al.show();
            }
        }
    }
    public void secondMatrices()
    {
        r2=spinner_rows2.getSelectedItem().toString().trim();
        c2=spinner_columns2.getSelectedItem().toString().trim();

        if (c1==r2)
        {
            if (r2.equals("select row2"))
            {
                Toast.makeText(this, "select valid row2 numbers", Toast.LENGTH_SHORT).show();
            }
            else if (c2.equals("select col2"))
            {
                Toast.makeText(this, "select valid colum2 numbers", Toast.LENGTH_SHORT).show();
            }
            else if (r2=="1")
            {
                if (c2=="1")
                {
                    //inflate 1*1 layout for second matrix
                    final View v6=((Activity)this).getLayoutInflater().inflate(R.layout.fourth_element,null);
                    AlertDialog.Builder al=new AlertDialog.Builder(this);
                    al.setCancelable(false);
                    al.setView(v6);
                    al.setTitle("enter values");
                    al.setPositiveButton("ok", new DialogInterface.OnClickListener()
                    {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i)
                        {
                            EditText et1=(EditText)v6.findViewById(R.id.four_et1);
                            a1=et1.getText().toString().trim();

                            //and pass data to next activities
                            Intent ss=new Intent(AdditionExample.this,Addition.class);
                            ss.putExtra("position","1");

                            ss.putExtra("ets",ets);
                            ss.putExtra("a1",a1);

                            startActivity(ss);
                        }
                    });
                    al.show();
                }
            }
            else if (r2=="2")
            {
                if (c2=="2")
                {
                    //inflate 2*2 layout for second matrix
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
                            et_7=(EditText)v6.findViewById(R.id.five_et1);
                            a2=et_7.getText().toString().trim();

                            et_8=(EditText)v6.findViewById(R.id.five_et2);
                            a3=et_8.getText().toString().trim();

                            et_9=(EditText)v6.findViewById(R.id.five_et3);
                            a4=et_9.getText().toString().trim();

                            et_10=(EditText)v6.findViewById(R.id.five_et4);
                            a5=et_10.getText().toString().trim();
                            //and pass values to next activities

                            Intent ss=new Intent(AdditionExample.this,Addition.class);
                            ss.putExtra("position","2");
                            ss.putExtra("one",one);
                            ss.putExtra("two",two);
                            ss.putExtra("three",three);
                            ss.putExtra("four",four);


                            ss.putExtra("a2",a2);
                            ss.putExtra("a3",a3);
                            ss.putExtra("a4",a4);
                            ss.putExtra("a5",a5);
                            startActivity(ss);
                        }
                    });
                    al.show();
                }
            }
            else if (r2=="3")
            {

                if (c2=="3")
                {
                    //inflate 1*1 layout for second matrix
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

                            et_11=(EditText)v6.findViewById(R.id.six_et1);
                            a6=et_11.getText().toString().trim();

                            et_12=(EditText)v6.findViewById(R.id.six_et2);
                            a7=et_12.getText().toString().trim();

                            et_13=(EditText)v6.findViewById(R.id.six_et3);
                            a8=et_13.getText().toString().trim();

                            et_14=(EditText)v6.findViewById(R.id.six_et4);
                            a9=et_14.getText().toString().trim();

                            et_15=(EditText)v6.findViewById(R.id.six_et5);
                            a10=et_15.getText().toString().trim();

                            et_16=(EditText)v6.findViewById(R.id.six_et6);
                            a11=et_16.getText().toString().trim();

                            et_17=(EditText)v6.findViewById(R.id.six_et7);
                            a12=et_17.getText().toString().trim();

                            et_18=(EditText)v6.findViewById(R.id.six_et8);
                            a13=et_18.getText().toString().trim();

                            et_19=(EditText)v6.findViewById(R.id.six_et9);
                            a14=et_19.getText().toString().trim();
                            //three_one,three_two,three_three,three_four,three_five,three_six

                            //and pass data values to next activities
                            Intent ss=new Intent(AdditionExample.this,Addition.class);
                            ss.putExtra("position","3");
                            ss.putExtra("three_one",three_one);
                            ss.putExtra("three_two",three_two);
                            ss.putExtra("three_three",three_three);
                            ss.putExtra("three_four",three_four);
                            ss.putExtra("three_five",three_five);
                            ss.putExtra("three_six",three_six);
                            ss.putExtra("five",five);
                            ss.putExtra("six",six);
                            ss.putExtra("seven",seven);


                            ss.putExtra("a6",a6);
                            ss.putExtra("a7",a7);
                            ss.putExtra("a8",a8);
                            ss.putExtra("a9",a9);
                            ss.putExtra("a10",a10);
                            ss.putExtra("a11",a11);
                            ss.putExtra("a12",a12);
                            ss.putExtra("a13",a13);
                            ss.putExtra("a14",a14);
                            startActivity(ss);
                        }
                    });
                    al.show();
                }
            }
        }
        else
        {
            Toast.makeText(this, "entered matrix is not possible", Toast.LENGTH_SHORT).show();
        }
    }
}

