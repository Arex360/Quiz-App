package com.flixberry.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;

public class FeedBack extends AppCompatActivity {
    int starScors;
    ImageView s1,s2,s3,s4,s5;
    ImageView cFace,wFace,hFace;
    ExtendedFloatingActionButton friends,facebook,youtube,ads,twitter,others,submit;
    private void Init(){
        s1 = findViewById(R.id.star1);
        s2 = findViewById(R.id.star2);
        s3 = findViewById(R.id.star3);
        s4 = findViewById(R.id.star4);
        s5 = findViewById(R.id.star5);

        friends = findViewById(R.id.friends);
        facebook = findViewById(R.id.facebook);
        youtube = findViewById(R.id.youtube);
        ads = findViewById(R.id.ads);
        twitter = findViewById(R.id.twitter);
        others = findViewById(R.id.others);

        cFace = findViewById(R.id.creepy);
        wFace = findViewById(R.id.wow);
        hFace = findViewById(R.id.happy);

        submit = findViewById(R.id.submit);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feed_back);
        Init();

        s1.setOnClickListener(v->{
            starScors = 1;
            s5.setImageResource(R.drawable.stard);
            s4.setImageResource(R.drawable.stard);
            s3.setImageResource(R.drawable.stard);
            s1.setImageResource(R.drawable.starte);
            s2.setImageResource(R.drawable.stard);

        });
        s2.setOnClickListener(v->{
            starScors = 2;
            s5.setImageResource(R.drawable.stard);
            s4.setImageResource(R.drawable.stard);
            s3.setImageResource(R.drawable.stard);
            s1.setImageResource(R.drawable.starte);
            s2.setImageResource(R.drawable.starte);
        });
        s3.setOnClickListener(v->{
            starScors = 3;
            s5.setImageResource(R.drawable.stard);
            s4.setImageResource(R.drawable.stard);
            s3.setImageResource(R.drawable.starte);
            s1.setImageResource(R.drawable.starte);
            s2.setImageResource(R.drawable.starte);
        });
        s4.setOnClickListener(v->{
            starScors = 4;
            s5.setImageResource(R.drawable.stard);
            s4.setImageResource(R.drawable.starte);
            s3.setImageResource(R.drawable.starte);
            s1.setImageResource(R.drawable.starte);
            s2.setImageResource(R.drawable.starte);
        });
        s5.setOnClickListener(v->{
            starScors = 5;
            s5.setImageResource(R.drawable.starte);
            s4.setImageResource(R.drawable.starte);
            s3.setImageResource(R.drawable.starte);
            s1.setImageResource(R.drawable.starte);
            s2.setImageResource(R.drawable.starte);
        });
        cFace.setOnClickListener(v->{
            cFace.setImageResource(R.drawable.screep);
            wFace.setImageResource(R.drawable.wow);
            hFace.setImageResource(R.drawable.happy);
        });
        wFace.setOnClickListener(v->{
            cFace.setImageResource(R.drawable.creepy);
            wFace.setImageResource(R.drawable.swow);
            hFace.setImageResource(R.drawable.happy);
        });
        hFace.setOnClickListener(v->{
            cFace.setImageResource(R.drawable.creepy);
            wFace.setImageResource(R.drawable.wow);
            hFace.setImageResource(R.drawable.shappy);
        });
        facebook.setOnClickListener(v->{
            facebook.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#f7194d")));
            friends.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#a2e0fa")));
            youtube.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#a2e0fa")));
            ads.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#a2e0fa")));
            twitter.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#a2e0fa")));
            others.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#a2e0fa")));

        });
        friends.setOnClickListener(v->{
            facebook.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#a2e0fa")));
            friends.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#f7194d")));
            youtube.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#a2e0fa")));
            ads.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#a2e0fa")));
            twitter.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#a2e0fa")));
            others.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#a2e0fa")));

        });
        youtube.setOnClickListener(v->{
            facebook.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#a2e0fa")));
            friends.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#a2e0fa")));
            youtube.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#f7194d")));
            ads.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#a2e0fa")));
            twitter.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#a2e0fa")));
            others.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#a2e0fa")));

        });
        ads.setOnClickListener(v->{
            facebook.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#a2e0fa")));
            friends.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#a2e0fa")));
            youtube.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#a2e0fa")));
            ads.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#f7194d")));
            twitter.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#a2e0fa")));
            others.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#a2e0fa")));

        });
        twitter.setOnClickListener(v->{
            facebook.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#a2e0fa")));
            friends.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#a2e0fa")));
            youtube.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#a2e0fa")));
            ads.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#a2e0fa")));
            twitter.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#f7194d")));
            others.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#a2e0fa")));

        });
        others.setOnClickListener(v->{
            facebook.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#a2e0fa")));
            friends.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#a2e0fa")));
            youtube.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#a2e0fa")));
            ads.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#a2e0fa")));
            twitter.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#a2e0fa")));
            others.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#f7194d")));

        });

        submit.setOnClickListener(v->{
            Toast.makeText(FeedBack.this,"Thanks for the feedback",Toast.LENGTH_LONG).show();
        });
    }
}