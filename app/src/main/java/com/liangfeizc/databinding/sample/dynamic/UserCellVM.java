package com.liangfeizc.databinding.sample.dynamic;

import android.view.View;
import android.widget.Toast;

import com.liangfeizc.databinding.model.User;

/**
 * Created by Android Studio.
 * ProjectName: MasteringAndroidDataBinding
 * Author:  Lena.t.Yan
 * Date: 1/11/16
 * Time: 14:53
 * \ ___________________
 * \| Happy New Year!  |
 * \ -------------------
 * \  \
 * \   \   \_\_    _/_/
 * \    \      \__/
 * \           (oo)\_______
 * \           (__)\       )\/\
 * \               ||----w |
 * \               ||     ||
 */
public class UserCellVM {

    private User user;
    private int position;

    public UserCellVM(User user, int position) {
        this.user = user;
        this.position = position;
    }

    public void onContentClicked(View view) {
        Toast.makeText(view.getContext(), "onContentClicked Position " + position, Toast.LENGTH_SHORT).show();
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
