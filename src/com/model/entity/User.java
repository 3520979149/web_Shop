package com.model.entity;



public class User {
    private int userId;
    private String userName;
    private String userEmail;
    private String userPwd;
    private String addRess;

    public User(String userName, String userEmail, String userPwd, String addRess) {
        this.userName = userName;
        this.userEmail = userEmail;
        this.userPwd = userPwd;
        this.addRess = addRess;
    }


    public User(int userId, String userName, String userEmail, String userPwd, String addRess) {
        this.userId = userId;
        this.userName = userName;
        this.userEmail = userEmail;
        this.userPwd = userPwd;
        this.addRess = addRess;
    }

    public User(String userName, String userPwd) {
        this.userName = userName;
        this.userPwd = userPwd;
    }

    public User() {
    }


    public String getAddRess() {
        return addRess;
    }

    public void setAddRess(String addRess) {
        this.addRess = addRess;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }
}
