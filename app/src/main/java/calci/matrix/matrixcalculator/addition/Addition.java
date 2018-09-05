package calci.matrix.matrixcalculator.addition;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import calci.matrix.matrixcalculator.R;

public class Addition extends AppCompatActivity
{
    String val,one_one,one_two,two_one,two_two,two_three,two_four,two_five,two_six,two_seven,two_eight,
    t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,five,six,seven,a12,a13,a14;
    TextView textView13,textView14,textView15,textView16,textView17,textView18,textView19,textView20,textView21;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.addition);
        Bundle b=getIntent().getExtras();
        val=b.getString("position");
        if (val.equals("1"))
        {
            one_one=b.getString("ets");
            one_two=b.getString("a1");
            //oneAction();
            initparams();
        }
        else if (val.equals("2"))
        {
            two_one=b.getString("one");
            two_two=b.getString("two");
            two_three=b.getString("three");
            two_four=b.getString("four");

            two_five=b.getString("a2");
            two_six=b.getString("a3");
            two_seven=b.getString("a4");
            two_eight=b.getString("a5");
            //secondAction();
            initparams();
        }
        else if (val.equals("3"))
        {
            t1=b.getString("three_one");
            t2=b.getString("three_two");
            t3=b.getString("three_three");
            t4=b.getString("three_four");
            t5=b.getString("three_five");
            t6=b.getString("three_six");
            five=b.getString("five");
            six=b.getString("six");
            seven=b.getString("seven");

            t7=b.getString("a6");
            t8=b.getString("a7");
            t9=b.getString("a8");
            t10=b.getString("a9");
            t11=b.getString("a10");
            t12=b.getString("a11");
            a12=b.getString("a12");
            a13=b.getString("a13");
            a14=b.getString("a14");

            initparams();
        }

    }
    public void initparams()
    {
        textView13=(TextView)findViewById(R.id.textView13);
        textView14=(TextView)findViewById(R.id.textView14);
        textView15=(TextView)findViewById(R.id.textView15);
        textView16=(TextView)findViewById(R.id.textView16);
        textView17=(TextView)findViewById(R.id.textView17);
        textView18=(TextView)findViewById(R.id.textView18);
        textView19=(TextView)findViewById(R.id.textView19);
        textView20=(TextView)findViewById(R.id.textView20);
        textView21=(TextView)findViewById(R.id.textView21);

        if (val.equals("1"))
        {
            oneAction();
        }
        else if (val.equals("2"))
        {
            secondAction();
        }
        else if (val.equals("3"))
        {
            thirdAction();
        }
    }
    public void oneAction()
    {
        int ss=Integer.parseInt(one_one)+Integer.parseInt(one_two);
        textView13.setText(""+ss);
    }

    public void secondAction()
    {
        //here display 2*2 matrix output
        String one=""+Integer.parseInt(two_one)+Integer.parseInt(two_five);
        String two=""+Integer.parseInt(two_two)+Integer.parseInt(two_six);
        String three=""+Integer.parseInt(two_three)+Integer.parseInt(two_seven);
        String four=""+Integer.parseInt(two_four)+Integer.parseInt(two_eight);

        textView13.setText(""+one);
        textView14.setText(""+two);
        textView16.setText(""+three);
        textView17.setText(""+four);
    }
    public void thirdAction()
    {
        String one=""+(Integer.parseInt(t1)+Integer.parseInt(t7));
        String two=""+(Integer.parseInt(t2)+Integer.parseInt(t8));
        String three=""+(Integer.parseInt(t3)+Integer.parseInt(t9));
        String four=""+(Integer.parseInt(t4)+Integer.parseInt(t10));
        String five1=""+(Integer.parseInt(t5)+Integer.parseInt(t11));
        String six1=""+(Integer.parseInt(t6)+Integer.parseInt(t12));
        String seven1=""+(Integer.parseInt(five)+Integer.parseInt(a12));
        String eight=""+(Integer.parseInt(six)+Integer.parseInt(a13));
        String nine=""+(Integer.parseInt(seven)+Integer.parseInt(a14));

        textView13.setText(""+one);
        textView14.setText(""+two);
        textView15.setText(""+three);
        textView16.setText(""+four);
        textView17.setText(""+five1);
        textView18.setText(""+six1);
        textView19.setText(""+seven1);
        textView20.setText(""+eight);
        textView21.setText(""+nine);
    }
}
