package com.ontheroad.otrbackend.dao;

import com.ontheroad.otrbackend.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface UserDao {

    @Select("select * from users")
    List<User> getAll();

    @Select("Select * From users Where phonenumber=#{phonenumber}")
    User getUserByUsername(@Param("phonenumber") String phonenumber);

    @Select("select password from users where phonenumber=#{phonenumber}")
    String getPasswordByPhoneNumber(@Param("phonenumber") String phonenumber);
}
