package calci.matrix.matrixcalculator.multipication;

import android.app.Activity;
import android.content.DialogInterface;
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

public class Multipication extends AppCompatActivity
{
    Spinner spiner_rows1,spiner_columns1;
    Button first_mul_button;
    ArrayAdapter aa,bb;
    String arr[]={"--select row--","2","3"};
    String crr[]={"--select column--","2","3"};
    Button first_button;
    String r1,c1;
    EditText et_1,et_2,et_3,et_4,et_5,et_6,et_7,et_8,et_9,et_10,et_11,et_12,et_13;
    TextView one,two,three,four,five,six,seven,eigt,nine;
    String a1,a2,a3,a4,a11,a12,a13,a21,a22,a23,a31,a32,a33;

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

        spiner_rows1=(Spinner)findViewById(R.id.spinner_rows1);
        spiner_columns1=(Spinner)findViewById(R.id.spinner_columns1);
        first_mul_button=(Button)findViewById(R.id.first_mul_button);

        aa=new ArrayAdapter(this,android.R.layout.simple_spinner_dropdown_item,arr);
        spiner_rows1.setAdapter(aa);

        bb=new ArrayAdapter(this,android.R.layout.simple_spinner_dropdown_item,crr);
        spiner_columns1.setAdapter(aa);

        first_mul_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonLogics();
            }
        });
    }
    public void buttonLogics()
    {
        String r1=spiner_rows1.getSelectedItem().toString().trim();
        String c1=spiner_columns1.getSelectedItem().toString().trim();
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
                //perform 3*3 matrix related operatopns

            }
        }
    }
    public void performBackgrounds()
    {
        
    }
 }