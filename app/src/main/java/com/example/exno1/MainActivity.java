package com.example.exno1;
import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v8.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity
{
    int ch=1;
    float font=30;
    Typeface typeface;
    TextView txtInfo;
    Button btnFonts;
    int k;

    protected void onCreate(Bundle savedInstanceState)
    {
        super.OnCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        k = 1;
        typeface = Typeface.createFromAsset(getAssets(), "fonts/montserrat.otf");
        TextView t = (TextView) findViewById(R.id.textView);
        btnFonts = (Button) findViewById(R.id.btnFonts);

        txtInfo.setTypeface(typeface);
        btnFonts.setTypeface(typeface);

        btnFonts.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                ChangeFont(k++);
            }
        });
    }

    private void setContentView(int activity_main) {
    }

    public void ChangeFont(int i) {
        if (i > 5) {
            i = 0;
            k = i;
        }

        switch (i) {
            case 0:
                typeface = Typeface.createFromAsset(getAssets(), "fonts/greatvibes.otf");
                break;
            case 1:
                typeface = Typeface.createFromAsset(getAssets(), "fonts/montserrat.otf");
                break;
            case 2:
                typeface = Typeface.createFromAsset(getAssets(), "fonts/opensans.ttf");
                break;
            case 3:
                typeface = Typeface.createFromAsset(getAssets(), "fonts/pacifico.ttf");
                break;
            case 4:
                typeface = Typeface.createFromAsset(getAssets(), "fonts/raleway.ttf");
                break;
            case 5:
                typeface = Typeface.createFromAsset(getAssets(), "fonts/roboto.ttf");
                break;
        }

        txtInfo.setTypeface(typeface);
        btnFonts.setTypeface(typeface);
    }
        }
        final TextView t= (TextView) findViewById(R.id.textView);
        Button b1= (Button) findViewById(R.id.button1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t.setTextSize(font);
                font = font + 5;
                if (font == 50)
                    font = 30;
            }
        });
        Button b2= (Button) findViewById(R.id.button2);
        b2.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                switch (ch) {
                    case 1:
                        t.setTextColor(Color.RED);
                        break;
                    case 2:
                        t.setTextColor(Color.GREEN);
                        break;
                    case 3:
                        t.setTextColor(Color.BLUE);
                        break;
                    case 4:
                        t.setTextColor(Color.CYAN);
                        break;
                    case 5:
                        t.setTextColor(Color.YELLOW);
                        break;
                    case 6:
                        t.setTextColor(Color.MAGENTA);
                        break;
                }
                ch++;
                if (ch == 7)
                    ch = 1;
            }
        });
    }

    public Object findViewById(int button2) {

    }

    public void setContentView(int activity_main) {
    }
}
