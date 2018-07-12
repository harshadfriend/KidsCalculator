package karjatonline.kidscalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView tvDisplay;
    String s1="0",s2="0";
    double x=0,y=0,result=0;
    int op=0,reset=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvDisplay=findViewById(R.id.tvDisplay);
    }

    public void on_click(View v){

        Button b=(Button)v;
        switch(b.getText().toString()) {
            case "0":
                    s1 = s1 + "0";
                break;
            case "1":
                    s1 = s1 + "1";
                break;
            case "2":
                    s1 = s1 + "2";
                break;
            case "3":
                    s1 = s1 + "3";
                break;
            case "4":
                    s1 = s1 + "4";
                break;
            case "5":
                    s1 = s1 + "5";
                break;
            case "6":
                    s1 = s1 + "6";
                break;
            case "7":
                    s1 = s1 + "7";
                break;
            case "8":
                    s1 = s1 + "8";
                break;
            case "9":
                s1 = s1 + "9";
                break;
            case "+":
                op=1;
                s2=s1;
                s1="";
                break;
            case "-":
                op=2;
                s2=s1;
                s1="";
                break;
            case "*":
                op=3;
                s2=s1;
                s1="";
                break;
            case "/":
                op=4;
                s2=s1;
                s1="";
                break;

            case "DEL":
                if(s1.length()>0)
                    s1=s1.substring(0,s1.length()-1);
                break;

            case "C":
                s1=s2="";
                break;

            case "=":
                y=Double.parseDouble(s1);
                x=Double.parseDouble(s2);
                if(op==1)
                    result=x+y;
                if(op==2)
                    result=x-y;
                if(op==3)
                    result=x*y;
                if(op==4)
                    result=x/y;

                s1=String.valueOf(result);
                reset=1;
                Log.d("abc","="+y);
                break;
            default:

        }
        tvDisplay.setText(s1);

    }
}
