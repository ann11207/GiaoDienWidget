package com.example.giaodien;

        import androidx.appcompat.app.AppCompatActivity;

        import android.os.Bundle;
        import android.widget.ArrayAdapter;
        import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity {
    //edit text
    AutoCompleteTextView autoComplete;
    String[] MucDich ={"bán vật liệu", "thuê để ở", "làm kho"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);






//edit text
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this ,android.R.layout.simple_dropdown_item_1line,MucDich);
        AutoCompleteTextView autoCompleteTextView = findViewById(R.id.Autocomplete_MucDichThueKhac);
        autoCompleteTextView.setAdapter(adapter);

    }
}