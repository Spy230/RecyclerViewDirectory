package com.example.myapplication;
import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class BooksAdapter extends RecyclerView.Adapter<BooksAdapter.ViewHolder> {

    private final LayoutInflater inflater;
    private final List<Books> books;

    public BooksAdapter(Context context, List<Books> books) {
        this.inflater = LayoutInflater.from(context);
        this.books = books;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.book_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Books book = books.get(position);
        holder.bookView.setImageResource(book.getBookResource());
        holder.nameView.setText(book.getName());
        holder.bookDescriptionView.setText(book.getBookDescription());
    }

    @Override
    public int getItemCount() {
        return books.size();
    }
    public static class ViewHolder extends RecyclerView.ViewHolder {

        final ImageView bookView;
        final TextView nameView, bookDescriptionView;

        ViewHolder(View view) {
            super(view);
            bookView = view.findViewById(R.id.BookResource);
            nameView = view.findViewById(R.id.name);
            bookDescriptionView = view.findViewById(R.id.BookDescription);
        }
    }
}