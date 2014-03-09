package com.gsm.user.model;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * Created by Michael Zhao on 3/9/14.
 *
 * @author Michael Zhao
 * @since 2014-03-10
 * 用于测试git&maven&springmvc的使用操作
 */
public class BasicUser implements Serializable{

    public static enum UserType{
        TYPE1(1 , "student"),
        TYPE2(2 , "teacher"),
        TYPE3(3 , "admin");

        private final int index;
        private final String type;

        private UserType(int index , String type){
            this.index = index;
            this.type = type;
        }

        public static UserType getUserType(String type){
            for(UserType userType : UserType.values()){
                if(userType.type.equals(type)){
                    return userType;
                }
            }

            return null;
        }

        public static UserType getUserType(int index){
            for(UserType userType : UserType.values()){
                if(userType.index == index){
                    return userType;
                }
            }

            return null;
        }

        public int getIndex(){
            return index;
        }

        public String getType(){
            return type;
        }
    }

    @Setter
    @Getter
    private int userId;

    @Setter
    @Getter
    private String userName;

    @Setter
    @Getter
    private String passwd;

    @Setter
    @Getter
    private int userIndex;

    private UserType userType;

    public BasicUser(){}

    public BasicUser(int userId, String userName, String passwd, int userIndex){
        this.userId = userId;
        this.userName = userName;
        this.passwd = passwd;
        this.userIndex = userIndex;

        this.userType = UserType.getUserType(userIndex);
    }
}
