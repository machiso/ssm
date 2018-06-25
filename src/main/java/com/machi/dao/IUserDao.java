package com.machi.dao;

import com.machi.model.User;

public interface IUserDao {
    User selectUser(long id);
}
