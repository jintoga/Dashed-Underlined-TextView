package com.dat.DashedUnderlineText;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    private final static String text =
        "EDIT: I have updated solution. Sometimes that drawBackground method in solution with LineBackgroundSpanjust haven't been called for no reasons. New version works all the time and looks much clearer.";

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
                getResources().getDimension(R.dimen.dus_spacing_extra)), 0, intSpannableStringBuilderLength,
            Spanned.SPAN_INCLUSIVE_INCLUSIVE);
        //turn off hardwareAccelerated to use DashPathEffect
        textView.setLayerType(View.LAYER_TYPE_SOFTWARE, null);
        textView.setText(spannableStringBuilder);
    }
}
