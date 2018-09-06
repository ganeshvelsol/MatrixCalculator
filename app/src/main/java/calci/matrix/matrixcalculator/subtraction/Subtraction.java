package calci.matrix.matrixcalculator.subtraction;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import calci.matrix.matrixcalculator.R;

public class Subtraction extends AppCompatActivity
{
    TextView s1,s2,s3,s4,s5,s6,s7,s8,s9;
    String pos,one,one_one,two1,two2,two3,two4,two5,two6,two7,two8,
    three1,three2,three3,three4,three5,three6,three7,three8,three9,three10,
            three11,three12,three13,three14,three15,three16,three17,three18;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.subtraction);
        Bundle b=getIntent().getExtras();
        pos=b.getString("position");
        if (pos.equals("1"))
        {
            one=b.getString("ets");
            one_one=b.getString("a1");
            initParams();
        }
        else if (pos.equals("2"))
        {
            two1=b.getString("sone");
            two2=b.getString("stwo");
            two3=b.getString("sthree");
            two4=b.getString("sfour");


            two5=b.getString("sua2");
            two6=b.getString("sua3");
            two7=b.getString("sua4");
            two8=b.getString("sua5");
            initParams();
        }
        else if (pos.equals("3"))
        {
            three1=b.getString("sthree_one");
            three2=b.getString("sthree_two");
            three3=b.getString("sthree_three");
            three4=b.getString("sthree_four");
            three5=b.getString("sthree_five");
            three6=b.getString("sthree_six");
            three7=b.getString("sthree_seven");
            three8=b.getString("sthree_eight");
            three9=b.getString("sthree_nine");

            three10=b.getString("sua6");
            three11=b.getString("sua7");
            three12=b.getString("sua8");
            three13=b.getString("sua9");
            three14=b.getString("sua10");
            three15=b.getString("sua11");
            three16=b.getString("sua12");
            three17=b.getString("sua13");
            three18=b.getString("sua14");

            initParams();
        }
    }
    public void initParams()
    {
        s1=(TextView)findViewById(R.id.s1);
        s2=(TextView)findViewById(R.id.s2);
        s3=(TextView)findViewById(R.id.s3);
        s4=(TextView)findViewById(R.id.s4);
        s5=(TextView)findViewById(R.id.s5);
        s6=(TextView)findViewById(R.id.s6);
        s7=(TextView)findViewById(R.id.s7);
        s8=(TextView)findViewById(R.id.s8);
        s9=(TextView)findViewById(R.id.s9);

        if (pos.equals("1"))
        {
            oneAction();
        }
        else if (pos.equals("2"))
        {
            secondAction();
        }
        else if (pos.equals("3"))
        {
            thirdAction();
        }
    }
    public void oneAction()
    {
        int ss=Integer.parseInt(one)-Integer.parseInt(one_one);
        s1.setText(""+ss);
    }
    public void secondAction()
    {
        //here display 2*2 matrix output
        String one=""+(Integer.parseInt(two1)-Integer.parseInt(two5));
        String two=""+(Integer.parseInt(two2)-Integer.parseInt(two6));
        String three=""+(Integer.parseInt(two3)-Integer.parseInt(two7));
        String four=""+(Integer.parseInt(two4)-Integer.parseInt(two8));

        s1.setText(""+one);
        s2.setText(""+two);
        s4.setText(""+three);
        s5.setText(""+four);
    }
    public void thirdAction()
    {
        String one=""+(Integer.parseInt(three1)-Integer.parseInt(three10));
        String two=""+(Integer.parseInt(three2)-Integer.parseInt(three11));
        String three=""+(Integer.parseInt(three3)-Integer.parseInt(three12));
        String four=""+(Integer.parseInt(three4)-Integer.parseInt(three13));
        String five1=""+(Integer.parseInt(three5)-Integer.parseInt(three14));
        String six1=""+(Integer.parseInt(three6)-Integer.parseInt(three15));
        String seven1=""+(Integer.parseInt(three7)-Integer.parseInt(three16));
        String eight=""+(Integer.parseInt(three8)-Integer.parseInt(three17));
        String nine=""+(Integer.parseInt(three9)-Integer.parseInt(three18));
        s1.setText(""+one);
        s2.setText(""+two);
        s3.setText(""+three);
        s4.setText(""+four);
        s5.setText(""+five1);
        s6.setText(""+six1);
        s7.setText(""+seven1);
        s8.setText(""+eight);
        s9.setText(""+nine);
    }
}
