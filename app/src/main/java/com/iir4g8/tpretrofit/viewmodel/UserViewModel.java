package com.iir4g8.tpretrofit.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.iir4g8.tpretrofit.model.User;
import com.iir4g8.tpretrofit.repository.UserRepository;
import java.util.List;

public class UserViewModel extends ViewModel {
    private MutableLiveData<List<User>> users;
    private UserRepository repository;

    public UserViewModel() {
        repository = new UserRepository();
        users = new MutableLiveData<>();
        loadUsers();
    }

    public LiveData<List<User>> getUsers() {
        return users;
    }

    private void loadUsers() {
        repository.fetchUsers(users);
    }
}