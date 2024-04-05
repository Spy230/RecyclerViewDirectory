package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class SecondActivity extends AppCompatActivity {
    List<Books> books = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        setInitialData();
        RecyclerView recyclerView = findViewById(R.id.recyclerview);

        // создадим адаптер и загрузим в него контейнер с данными
        BooksAdapter booksAdapter = new BooksAdapter(this, books);

        // на recyclerView подадим адаптер
        recyclerView.setAdapter(booksAdapter);
    }

    private void setInitialData() {
        // добавление в контейнер books объектов сущности Books
        books.add(new Books("Видоизмененный углерод", "научно-фантастический роман Ричарда К. Моргана.",
                R.drawable.altered_carbon));
        books.add(new Books("нейромант", "Нейромант - роман Уильяма Гибсона.",
                R.drawable.neiromant));
        books.add(new Books("Зов Ктулху", "рассказ Говарда Филлипса Лавкрафта в жанре ужасов, написанный в 1926 году.",
                R.drawable.ktulhu));
    }
}