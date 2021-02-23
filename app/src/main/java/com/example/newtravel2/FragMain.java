package com.example.newtravel2;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

//frag_main이랑 연결하는 코드
public class FragMain extends Fragment {
    //선언
    ImageButton image_plus;
    private View view;

    //상태 저장(어댑터랑 통신하는 구문)
    public static FragMain newInstance() {
        FragMain fragMain = new FragMain();
        return fragMain;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.frag_main, container, false);
        return view;
    }

    //여정 추가(플러스)창 띄우기
    image_plus = findViewById(R.id.image_plus);
    image_plus.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(MainActivity.this, AddActivity.class);
            startActivity(intent);
        }
    });
}
