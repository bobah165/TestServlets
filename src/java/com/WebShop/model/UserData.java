package com.WebShop.model;

import java.util.ArrayList;
import java.util.List;

public class UserData {
    private final List<User> store = new ArrayList<>();

    public boolean add (final User user){

        for (User u: store){
            if (u.getLogin().equals(user.getLogin()) && u.getPassword().equals(user.getPassword())){
                return false;
            }
        }
        return store.add(user);
    }

    public boolean userIsExist (final String login, final String password) {
        boolean res = false;

        for (User user:store){
            if(user.getLogin().equals(login) && user.getPassword().equals(password)){
                res = true;
                break;
            }
        }
        return res;
    }

}
