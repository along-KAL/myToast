package com.example.mytoast;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.mytoast.ToastUtils.StyleableToast;
import com.example.mytoast.ToastUtils.ToastCustom;

public class MainActivity extends AppCompatActivity {
    StyleableToast st, stBuilder;

    Button btn ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button) findViewById(R.id.button1);


    }


    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    public void Toaster(View v) {

        switch (v.getId()) {
            case R.id.button1:

                st = new StyleableToast(this, "Updating profile", Toast.LENGTH_LONG);
                st.setBackgroundColor(Color.parseColor("#ff5a5f"));
                st.setTextColor(Color.WHITE);
                st.setIcon(R.drawable.ic_autorenew_black_24dp);
                st.spinIcon();
                st.setMaxAlpha();
                st.show();


                break;

            case R.id.button2:

                stBuilder = new StyleableToast
                        .Builder(this, "Turn off fly mode")
                        .withBackgroundColor(Color.parseColor("#865aff"))
                        .withIcon(R.drawable.ic_airplanemode_inactive_black_24dp)
                        .withMaxAlpha()
                        .build();

                stBuilder.show();

                break;

            case R.id.button3:


                st = new StyleableToast(this, "Profile saved", Toast.LENGTH_LONG);
                st.setBackgroundColor(Color.parseColor("#3b5998"));
                st.setMaxAlpha();
               // st.setTextFont(Typeface.createFromAsset(getAssets(), "fonts/dosis.otf"));
                st.show();


                break;

            case R.id.button4:

                st = new StyleableToast(this.getApplicationContext(), "PHONE IS OVERHEATING!", Toast.LENGTH_LONG);
                st.setCornerRadius(5);
                st.setBackgroundColor(Color.BLACK);
                st.setTextColor(Color.RED);
                st.setBoldText();
                st.show();

                break;

            case R.id.button5:

                StyleableToast.makeText(this, "Picture saved in gallery", Toast.LENGTH_LONG, R.style.StyleableToast).show();

                break;

            case R.id.button6:

                st = new StyleableToast(this, "Wrong password/username", Toast.LENGTH_LONG);
                st.setBackgroundColor(Color.parseColor("#2187c6"));
                st.setBoldText();
                st.setTextColor(Color.WHITE);
                st.setCornerRadius(7);
                st.show();
                break;

            //show_forever
            case R.id.button7:

               st = new StyleableToast(MainActivity.this,"Custom Time", true, 5);
                st.setBackgroundColor(Color.parseColor("#ff5a5f"));
                st.setTextColor(Color.WHITE);
                st.setIcon(R.drawable.ic_autorenew_black_24dp);
                st.spinIcon();
                st.setMaxAlpha();
                st.show();

                break;

            case R.id.button8:

                RelativeLayout toastLayout = new RelativeLayout(this.getApplicationContext());
                toastLayout.setPadding(5, 5, 5, 5);
                toastLayout.setBackground(this.getApplicationContext().getResources().getDrawable(R.drawable.ic_airplanemode_inactive_black_24dp));
                TextView t = new TextView(this.getApplicationContext());
                t.setText("fffffffffffffff");
                toastLayout.addView(t);

                 ToastCustom.makeText(this.getApplicationContext(),toastLayout , 5).show();

                break;

            case R.id.button9:

                st.cancel();
                break;
        }
    }
}

