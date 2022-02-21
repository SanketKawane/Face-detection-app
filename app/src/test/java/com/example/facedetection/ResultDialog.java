package com.example.facedetection;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

public class ResultDialog extends DialogFragment {
    Button okButton;
    TextView resultTV;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_resultdialog,container,false);

        okButton = view.findViewById(R.id.result_ok_button);
        resultTV = view.findViewById(R.id.result_text_view);

        String resultText = "";
        //Using Bundle coz we aren't getting just a single string but a lot more info which we need to bundle together
        Bundle bundle = getArguments();
        resultText = bundle.getString(com.example.android.facedetection.FaceDetection.RESULT_TEXT);
        resultTV.setText(resultText);

        okButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dismiss();
            }
        });
        return view;
    }
}