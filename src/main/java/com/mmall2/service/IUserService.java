package com.mmall2.service;

import com.mmall2.common.ServerResponse;
import com.mmall2.pojo.User;

/**
 * Created by zhw on 2020/2/20.
 */
public interface IUserService {

    ServerResponse<User> login(String username, String password);
    ServerResponse<String> register(User user);
    ServerResponse<String> checkValid(String str,String type);
    ServerResponse selectQuestion(String username);
    ServerResponse<String> checkAnswer(String username, String question, String answer);
    ServerResponse<String> forgetResetPassword(String username, String passwordNew, String forgetToken);
    ServerResponse<String> resetPassword(String passwordOld, String passwordNew, User user);
    ServerResponse<User> updateInformation(User user);
    ServerResponse<User> getInformation(Integer userId);
    ServerResponse checkAdminRole(User user);
}
