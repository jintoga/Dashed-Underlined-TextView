package com.dat.DashedUnderlineText;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    private final static String text =
        "In 1933 RCA Communications, New York introduced the first \"telex\" service.[1][not in citation given][2] The first messages over RCA transatlantic circuits went between New York and London. The first year of operation saw seven million words or 300,000 radiograms transmitted.[citation needed] Radio has long sent alphanumeric messages via radiotelegraphy.[3] The University of Hawaii began using radio to send digital information as early as 1971, using ALOHAnet.[citation needed] Okay, today I want to share with you a bug which I had faced about three times in my development. We all know Android use skia as its graphics backend. And that was the reason for a little funny bug when we draw a line in Android’s Canvas.Okay, today I want to share with you a bug which I had faced about three times in my development.";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.textView);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(text);
        int intSpannableStringBuilderLength = spannableStringBuilder.length();
        spannableStringBuilder.setSpan(
            new DashedUnderlineSpan(textView, getResources().getColor(R.color.colorAccent),
                getResources().getDimension(R.dimen.dus_stroke_thickness),
                getResources().getDimension(R.dimen.dus_dash_path),
                getResources().getDimension(R.dimen.dus_offset_y),
                getResources().getDimension(R.dimen.dus_spacing_extra)), 0,
            intSpannableStringBuilderLength, Spanned.SPAN_INCLUSIVE_INCLUSIVE);
        textView.setText(spannableStringBuilder);
    }
}
