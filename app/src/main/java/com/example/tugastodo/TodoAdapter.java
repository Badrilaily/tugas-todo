package com.example.tugastodo;

import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.example.tugastodo.R;
import java.util.List;


public class TodoAdapter extends RecyclerView.Adapter<TodoAdapter.TodoViewHolder> {
    private List<TodoItem> todoItems;

    public TodoAdapter(List<TodoItem> todoItems) {
        this.todoItems = todoItems;
    }

    @NonNull
    @Override
    public TodoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_todo, parent, false);
        return new TodoViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TodoViewHolder holder, int position) {
        TodoItem todoItem = todoItems.get(position);
        holder.textviewTitle.setText(todoItem.getTitle());
        holder.textviewDescription.setText(todoItem.getDescription());
    }

    @Override
    public int getItemCount() {
        return todoItems.size();
    }

    public static class TodoViewHolder extends RecyclerView.ViewHolder {
        public TextView textviewTitle;
        public TextView textviewDescription;

        public TodoViewHolder(@NonNull View itemView) {
            super(itemView);
            textviewTitle = itemView.findViewById(R.id.textview_title);
            textviewDescription = itemView.findViewById(R.id.textview_description);
        }
    }
}
