package com.mapper;

import com.entity.User;
import com.provider.UserDynSqlProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.SelectProvider;

import java.util.Map;

public interface UserMapper {

    @InsertProvider(type = UserDynSqlProvider.class , method = "insertUserSql")
    int insertUser(User user);

    @SelectProvider(type = UserDynSqlProvider.class , method = "findUserByIdSql")
    User findUserById(Map map);

}
