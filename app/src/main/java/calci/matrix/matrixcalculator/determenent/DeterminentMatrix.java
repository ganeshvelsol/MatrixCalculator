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
    EditText et_7,et_8,et_9,et_10;
    TextView one,two,three,four,five,six,seven,eigt,nine;
    String a2,a3,a4,a5;
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

            }
        }
    }
    public void performBackgrounds()
    {
        int  ad=(Integer.parseInt(a2)*Integer.parseInt(a5));
        int bc= (Integer.parseInt(a3)*Integer.parseInt(a4));
        int s=ad-bc;
        one.setText(""+(Integer.parseInt(a5)/s));
        two.setText("-"+(Integer.parseInt(a3)/s));
        four.setText("-"+(Integer.parseInt(a4)/s));
        five.setText(""+(Integer.parseInt(a2)/s));

    }
}
