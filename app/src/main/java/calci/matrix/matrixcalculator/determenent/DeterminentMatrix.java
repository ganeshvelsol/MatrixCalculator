package calci.matrix.matrixcalculator.determenent;

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

public class DeterminentMatrix extends AppCompatActivity {

    Spinner spinner_rows1,spinner_columns1;
    ArrayAdapter aa,bb;
    String arr[]={"--select row--","2","3"};
    String crr[]={"--select column--","2","3"};
    Button first_button;
    String r1,c1;
    EditText et_7,et_8,et_9,et_10,et_11,et_12,et_13,et_14,et_15,et_16,et_17,et_18,et_19;
    TextView one,two,three,four,five,six,seven,eigt,nine;
    String a2,a3,a4,a5,a11,a12,a13,a21,a22,a23,a31,a32,a33;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.determinent_matrix);
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

        spinner_rows1=(Spinner)findViewById(R.id.spinner_rows1);
        spinner_columns1=(Spinner)findViewById(R.id.spinner_columns1);
        first_button=(Button)findViewById(R.id.first_button);

        aa=new ArrayAdapter(this,android.R.layout.simple_spinner_dropdown_item,arr);
        spinner_rows1.setAdapter(aa);

        bb=new ArrayAdapter(this,android.R.layout.simple_spinner_dropdown_item,crr);
        spinner_columns1.setAdapter(aa);

        first_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                performLogics();
            }
        });
    }
    public void performLogics()
    {
         r1=spinner_rows1.getSelectedItem().toString().trim();
         c1=spinner_columns1.getSelectedItem().toString().trim();

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
                //inflate 2*2 matrix layout
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

                        performBackgrounds();
                    }
                });
                al.show();

            }
        }
        else if (r1=="3")
        {
            if (c1=="3")
            {
                //inflate 3*3 matrix layout here
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
                        a11=et_11.getText().toString().trim();

                        et_12=(EditText)v6.findViewById(R.id.six_et2);
                        a12=et_12.getText().toString().trim();

                        et_13=(EditText)v6.findViewById(R.id.six_et3);
                        a13=et_13.getText().toString().trim();

                        et_14=(EditText)v6.findViewById(R.id.six_et4);
                        a21=et_14.getText().toString().trim();

                        et_15=(EditText)v6.findViewById(R.id.six_et5);
                        a22=et_15.getText().toString().trim();

                        et_16=(EditText)v6.findViewById(R.id.six_et6);
                        a23=et_16.getText().toString().trim();

                        et_17=(EditText)v6.findViewById(R.id.six_et7);
                        a31=et_17.getText().toString().trim();

                        et_18=(EditText)v6.findViewById(R.id.six_et8);
                        a32=et_18.getText().toString().trim();

                        et_19=(EditText)v6.findViewById(R.id.six_et9);
                        a33=et_19.getText().toString().trim();
                        //three_one,three_two,three_three,three_four,three_five,three_six
                        performThreethree();
                        //and pass data values to next activities

                    }
                });
                al.show();
            }
        }
    }
    public void performBackgrounds()
    {
        int  ad=(Integer.parseInt(a2)*Integer.parseInt(a5));
        int bc= (Integer.parseInt(a3)*Integer.parseInt(a4));
        int s=ad-bc;
        one.setText("det matrix of 2*2 is "+s);

    }
    public void performThreethree()
    {
        int one1=Integer.parseInt(a11)*((Integer.parseInt(a22)*Integer.parseInt(a33))-(Integer.parseInt(a32)*Integer.parseInt(a23)));
        int two=Integer.parseInt(a12)*((Integer.parseInt(a21)*Integer.parseInt(a33))-(Integer.parseInt(a23)*Integer.parseInt(a31)));
        int thre=Integer.parseInt(a13)*((Integer.parseInt(a21)*Integer.parseInt(a32))-(Integer.parseInt(a31)*Integer.parseInt(a22)));
        int tot=one1-two+thre;
        one.setText("det matrix of 3*3 matrix is "+tot);
    }
}
