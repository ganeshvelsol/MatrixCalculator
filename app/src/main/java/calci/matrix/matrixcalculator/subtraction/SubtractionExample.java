package calci.matrix.matrixcalculator.subtraction;

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
import calci.matrix.matrixcalculator.addition.Addition;
import calci.matrix.matrixcalculator.addition.AdditionExample;

public class SubtractionExample extends AppCompatActivity
{
    Spinner sub_spinner_rows1,sub_spinner_columns1,sub_spinner_rows2,sub_spinner_columns2;
    Button sub_first_button,sub_second_button;

    String vals1[]={"--select row1--","1","2","3"};
    String vals2[]={"select row2","1","2","3"};
    String col1[]={"select col1","1","2","3"};
    String col2[]={"select col2","1","2","3"};

    EditText set1,set2,set3,set4,set_1,set_2,set_3,set_4,set_5,set_6,set_7,set_8,set_9,suet_7,suet_8,suet_9,suet_10,
            suet_11,suet_12,suet_13,suet_14,suet_15,suet_16,suet_17,suet_18,suet_19;
    String r1,c1,ets,sone,stwo,sthree,sfour,sthree_one,sthree_two,sthree_three,sthree_four,sthree_five,sthree_six,sthree_seven,sthree_eight,
            sthree_nine,a1,sua2,sua3,sua4,sua5,sua6,sua7,sua8,sua9,sua10,sua11,sua12,sua13,sua14;
    ArrayAdapter aa,bb,cc,dd;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.subtraction_example);

        initParameters();
    }
    public void initParameters()
    {
        sub_spinner_rows1=(Spinner)findViewById(R.id.sub_spinner_rows1);
        sub_spinner_columns1=(Spinner)findViewById(R.id.sub_spinner_columns1);
        sub_spinner_rows2=(Spinner)findViewById(R.id.sub_spinner_rows2);
        sub_spinner_columns2=(Spinner)findViewById(R.id.sub_spinner_columns2);

        sub_first_button=(Button)findViewById(R.id.sub_first_button);
        sub_second_button=(Button)findViewById(R.id.sub_second_button);

        aa=new ArrayAdapter(this,android.R.layout.simple_spinner_dropdown_item,vals1);
        sub_spinner_rows1.setAdapter(aa);

        bb=new ArrayAdapter(this,android.R.layout.simple_spinner_dropdown_item,col1);
        sub_spinner_columns1.setAdapter(bb);

        cc=new ArrayAdapter(this,android.R.layout.simple_spinner_dropdown_item,vals2);
        sub_spinner_rows2.setAdapter(cc);


        dd=new ArrayAdapter(this,android.R.layout.simple_spinner_dropdown_item,col2);
        sub_spinner_columns2.setAdapter(dd);


        sub_first_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                firstRowSelection();
            }
        });

        sub_second_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                secondMatrix();
            }
        });
    }
    public void firstRowSelection()
    {
         r1=sub_spinner_rows1.getSelectedItem().toString().trim();
         c1=sub_spinner_columns1.getSelectedItem().toString().trim();

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
                //selected matrix is 1*1 display single element edittexts

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
        }
        else if (r1=="2")
        {
            if (c1=="2")
            {
                //display 2*2 matrix layut
                final View v6=((Activity)this).getLayoutInflater().inflate(R.layout.second_element,null);
                AlertDialog.Builder al=new AlertDialog.Builder(this);
                al.setTitle("enter values");
                al.setView(v6);
                al.setCancelable(false);
                al.setPositiveButton("ok", new DialogInterface.OnClickListener()
                {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i)
                    {

                        set1=(EditText)v6.findViewById(R.id.second_et2);
                        sone=set1.getText().toString().trim();

                        set2=(EditText)v6.findViewById(R.id.third_et3);
                        stwo=set2.getText().toString().trim();

                        set3=(EditText)v6.findViewById(R.id.fourth_et4);
                        sthree=set3.getText().toString().trim();

                        set4=(EditText)v6.findViewById(R.id.fifth_et5);
                        sfour=set4.getText().toString().trim();
                    }
                });
                al.show();
            }

        }
        else if (r1=="3")
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
                        set_1=(EditText)v6.findViewById(R.id.third_et6);
                        sthree_one=set_1.getText().toString().trim();

                        set_2=(EditText)v6.findViewById(R.id.third_et7);
                        sthree_two=set_2.getText().toString().trim();

                        set_3=(EditText)v6.findViewById(R.id.third_et8);
                        sthree_three=set_3.getText().toString().trim();

                        set_4=(EditText)v6.findViewById(R.id.fourth_et9);
                        sthree_four=set_4.getText().toString().trim();

                        set_5=(EditText)v6.findViewById(R.id.fifth_et10);
                        sthree_five=set_5.getText().toString().trim();

                        set_6=(EditText)v6.findViewById(R.id.fifth_et11);
                        sthree_six=set_6.getText().toString().trim();

                        set_7=(EditText)v6.findViewById(R.id.fourth_et12);
                        sthree_seven=set_7.getText().toString().trim();

                        set_8=(EditText)v6.findViewById(R.id.fifth_et13);
                        sthree_eight=set_8.getText().toString().trim();

                        set_9=(EditText)v6.findViewById(R.id.fifth_et14);
                        sthree_nine=set_9.getText().toString().trim();

                    }
                });
                al.show();
            }
        }
    }
    public void secondMatrix()
    {
        String r2=sub_spinner_rows2.getSelectedItem().toString().trim();
        String c2=sub_spinner_columns2.getSelectedItem().toString().trim();

        if (c1==r2)
        {
            if (r2.equals("select row2"))
            {
                Toast.makeText(this, "select valid row2 numbers", Toast.LENGTH_SHORT).show();
            } else if (c2.equals("select col2"))
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
                            Intent ss=new Intent(SubtractionExample.this,Subtraction.class);
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
                    //inflate 1*1 layout for second matrix
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
                            suet_7=(EditText)v6.findViewById(R.id.five_et1);
                            sua2=suet_7.getText().toString().trim();

                            suet_8=(EditText)v6.findViewById(R.id.five_et2);
                            sua3=suet_8.getText().toString().trim();

                            suet_9=(EditText)v6.findViewById(R.id.five_et3);
                            sua4=suet_9.getText().toString().trim();

                            suet_10=(EditText)v6.findViewById(R.id.five_et4);
                            sua5=suet_10.getText().toString().trim();
                            //and pass values to next activities

                            Intent ss=new Intent(SubtractionExample.this,Subtraction.class);
                            ss.putExtra("position","2");
                            ss.putExtra("sone",sone);
                            ss.putExtra("stwo",stwo);
                            ss.putExtra("sthree",sthree);
                            ss.putExtra("sfour",sfour);


                            ss.putExtra("sua2",sua2);
                            ss.putExtra("sua3",sua3);
                            ss.putExtra("sua4",sua4);
                            ss.putExtra("sua5",sua5);
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

                            suet_11=(EditText)v6.findViewById(R.id.six_et1);
                            sua6=suet_11.getText().toString().trim();

                            suet_12=(EditText)v6.findViewById(R.id.six_et2);
                            sua7=suet_12.getText().toString().trim();

                            suet_13=(EditText)v6.findViewById(R.id.six_et3);
                            sua8=suet_13.getText().toString().trim();

                            suet_14=(EditText)v6.findViewById(R.id.six_et4);
                            sua9=suet_14.getText().toString().trim();

                            suet_15=(EditText)v6.findViewById(R.id.six_et5);
                            sua10=suet_15.getText().toString().trim();

                            suet_16=(EditText)v6.findViewById(R.id.six_et6);
                            sua11=suet_16.getText().toString().trim();

                            suet_17=(EditText)v6.findViewById(R.id.six_et7);
                            sua12=suet_17.getText().toString().trim();

                            suet_18=(EditText)v6.findViewById(R.id.six_et8);
                            sua13=suet_18.getText().toString().trim();

                            suet_19=(EditText)v6.findViewById(R.id.six_et9);
                            sua14=suet_19.getText().toString().trim();
                            //three_one,three_two,three_three,three_four,three_five,three_six

                            //and pass data values to next activities
                            Intent ss=new Intent(SubtractionExample.this,Subtraction.class);
                            ss.putExtra("position","3");
                            ss.putExtra("sthree_one",sthree_one);
                            ss.putExtra("sthree_two",sthree_two);
                            ss.putExtra("sthree_three",sthree_three);
                            ss.putExtra("sthree_four",sthree_four);
                            ss.putExtra("sthree_five",sthree_five);
                            ss.putExtra("sthree_six",sthree_six);
                            ss.putExtra("sthree_seven",sthree_seven);
                            ss.putExtra("sthree_eight",sthree_eight);
                            ss.putExtra("sthree_nine",sthree_nine);


                            ss.putExtra("sua6",sua6);
                            ss.putExtra("sua7",sua7);
                            ss.putExtra("sua8",sua8);
                            ss.putExtra("sua9",sua9);
                            ss.putExtra("sua10",sua10);
                            ss.putExtra("sua11",sua11);
                            ss.putExtra("sua12",sua12);
                            ss.putExtra("sua13",sua13);
                            ss.putExtra("sua14",sua14);
                            startActivity(ss);
                        }
                    });
                    al.show();
                }
            }
        }
        else
        {

        }
    }
}
