package com.example.diablo.bankbin;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by Diablo on 2017/11/20.
 */

public class MainActivity extends Activity {

    private EditText editText;
    private TextView textView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.edit_num);
        textView = findViewById(R.id.textView);
        findViewById(R.id.button).setOnClickListener(v -> {
            if (!TextUtils.isEmpty(editText.getText())) {
                long start = System.currentTimeMillis();
                String bankNum = editText.getText().toString();
                textView.setText(BankBinCode.getBank(bankNum) + "time" + String.valueOf(System.currentTimeMillis() - start));
            }
        });
    }
}
