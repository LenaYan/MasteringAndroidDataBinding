package com.liangfeizc.databinding.sample.dynamic;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.liangfeizc.databinding.databinding.UserItemBinding;
import com.liangfeizc.databinding.model.User;
import com.liangfeizc.databinding.utils.Randoms;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rufi on 6/5/15.
 */
public class UserAdapter extends RecyclerView.Adapter<UserAdapter.UserHolder> {
    private static final int USER_COUNT = 10;

    private List<User> mUsers = new ArrayList<>();

    public UserAdapter() {
        for (int i = 0; i < USER_COUNT; i++) {
            User user = new User(Randoms.nextFirstName(), Randoms.nextLastName());
            mUsers.add(user);
        }
    }

    public static class UserHolder extends RecyclerView.ViewHolder {
        private UserItemBinding mBinding;

        public UserHolder(@NonNull UserItemBinding binding) {
            super(binding.getRoot());
            mBinding = binding;
        }

        public void bind(@NonNull User user) {
            mBinding.setViewModel(new UserCellVM(user, getAdapterPosition()));
            mBinding.executePendingBindings();
        }

    }

    @Override
    public UserHolder onCreateViewHolder(ViewGroup viewGroup, int position) {
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        UserItemBinding binding = UserItemBinding.inflate(inflater, viewGroup, false);
        return new UserHolder(binding);
    }

    @Override
    public void onBindViewHolder(UserHolder holder, int position) {
        holder.bind(mUsers.get(position));
    }

    @Override
    public int getItemCount() {
        return mUsers.size();
    }
}

