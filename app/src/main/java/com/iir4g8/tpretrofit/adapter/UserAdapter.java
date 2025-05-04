package com.iir4g8.tpretrofit.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.iir4g8.tpretrofit.model.User;
import com.iir4g8.tpretrofit.R;
import java.util.List;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.UserViewHolder> {
    private List<User> userList;

    public void setUserList(List<User> users) {
        this.userList = users;
        notifyDataSetChanged();
    }

    public static class UserViewHolder extends RecyclerView.ViewHolder {
        TextView name, email, phone;

        public UserViewHolder(View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.userName);
            email = itemView.findViewById(R.id.userEmail);
            phone = itemView.findViewById(R.id.userPhone);
        }
    }

    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_user, parent, false);
        return new UserViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull UserViewHolder holder, int position) {
        User user = userList.get(position);
        holder.name.setText(user.getName());
        holder.email.setText(user.getEmail());
        holder.phone.setText(user.getPhone());
    }

    @Override
    public int getItemCount() {
        return (userList == null) ? 0 : userList.size();
    }
}
