package calci.matrix.matrixcalculator.inverse;

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

import calci.matrix.matrixcalculator.R;

public class InverseMatrix extends AppCompatActivity
{
    Spinner spinner_row1,spinner_column1;
    Button first_buttons;
    TextView ones,twos,threes,fours,fives,sixs,sevens,eigts,nines;
    String a11,a12,a13,a21,a22,a23,a31,a32,a33;
    EditText et1,et2,et3,et4,et5,et6,et7,et8,et9;
    String arr[]={"--select row--","2","3"};
    String crr[]={"--select column--","2","3"};
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inverse_matrix);
        initparams();
    }
    public void initparams()
    {
        spinner_row1=(Spinner)findViewById(R.id.spinner_row1);
        spinner_column1=(Spinner)findViewById(R.id.spinner_column1);
        first_buttons=(Button)findViewById(R.id.first_buttons);

        ones=(TextView)findViewById(R.id.ones);
        twos=(TextView)findViewById(R.id.twos);
        threes=(TextView)findViewById(R.id.threes);
        fours=(TextView)findViewById(R.id.fours);
        fives=(TextView)findViewById(R.id.fives);
        sixs=(TextView)findViewById(R.id.sixs);
        sevens=(TextView)findViewById(R.id.sevens);
        eigts=(TextView)findViewById(R.id.eigts);
        nines=(TextView)findViewById(R.id.nines);

        ArrayAdapter aa=new ArrayAdapter(this,android.R.layout.simple_spinner_dropdown_item,arr);
        spinner_row1.setAdapter(aa);

        ArrayAdapter bb=new ArrayAdapter(this,android.R.layout.simple_spinner_dropdown_item,crr);
        spinner_column1.setAdapter(bb);

        first_buttons.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                dataForCalci();
            }
        });
    }
    public void dataForCalci()
    {
        String r1=spinner_row1.getSelectedItem().toString().trim();
        String c1=spinner_column1.getSelectedItem().toString().trim();

        if (r1=="2")
        {
            if (c1=="2")
            {
                //write here for 2*2 matrix transpose
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
                        et1=(EditText)v6.findViewById(R.id.five_et1);
                        a11=et1.getText().toString().trim();

                        et2=(EditText)v6.findViewById(R.id.five_et2);
                        a12=et2.getText().toString().trim();

                        et3=(EditText)v6.findViewById(R.id.five_et3);
                        a21=et3.getText().toString().trim();

                        et4=(EditText)v6.findViewById(R.id.five_et4);
                        a22=et4.getText().toString().trim();
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
                //write here for 3*3 matrix transpose
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

                        et1=(EditText)v6.findViewById(R.id.six_et1);
                        a11=et1.getText().toString().trim();

                        et2=(EditText)v6.findViewById(R.id.six_et2);
                        a12=et2.getText().toString().trim();

                        et3=(EditText)v6.findViewById(R.id.six_et3);
                        a13=et3.getText().toString().trim();

                        et4=(EditText)v6.findViewById(R.id.six_et4);
                        a21=et4.getText().toString().trim();

                        et5=(EditText)v6.findViewById(R.id.six_et5);
                        a22=et5.getText().toString().trim();

                        et6=(EditText)v6.findViewById(R.id.six_et6);
                        a23=et6.getText().toString().trim();

                        et7=(EditText)v6.findViewById(R.id.six_et7);
                        a31=et7.getText().toString().trim();

                        et8=(EditText)v6.findViewById(R.id.six_et8);
                        a32=et8.getText().toString().trim();

                        et9=(EditText)v6.findViewById(R.id.six_et9);
                        a33=et9.getText().toString().trim();
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
        int  ad=(Integer.parseInt(a11)*Integer.parseInt(a22));
        int bc= (Integer.parseInt(a12)*Integer.parseInt(a21));
        int s=ad-bc;

        ones.setText(""+(Integer.parseInt(a21))/s);
        twos.setText(""+(-1*Integer.parseInt(a12))/s);
        fours.setText(""+(Integer.parseInt(a21))/s);
        fives.setText(""+(Integer.parseInt(a11))/s);
    }
    public void performThreethree()
    {
        int A11=Integer.parseInt(a11);
        int A12=Integer.parseInt(a12);
        int A13=Integer.parseInt(a13);
        int A21=Integer.parseInt(a21);
        int A22=Integer.parseInt(a22);
        int A23=Integer.parseInt(a23);
        int A31=Integer.parseInt(a31);
        int A32=Integer.parseInt(a32);
        int A33=Integer.parseInt(a33);

        ones.setText(""+(A11*(A12*A13-A32*A23)));
        twos.setText(""+-1*(A12*(A21*A33-A31*A23)));
        threes.setText(""+(A13*(A21*A32-A31*A12)));

        fours.setText(""+(A21*(A12*A33-A32*A13)));
        fives.setText(""+(A22*(A11*A33-A31*A13)));
        sixs.setText(""+(A23*(A11*A32-A31*A12)));

        sevens.setText(""+(A31*(A12*A23-A22*A13)));
        eigts.setText(""+(A32*(A11*A23-A21*A13)));
        nines.setText(""+(A33*(A11*A12-A21*A12)));
    }

}
