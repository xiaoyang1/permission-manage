package com.mapper;

import com.entity.User;
import com.provider.UserDynSqlProvider;
import org.apache.ibatis.annotations.*;

import java.util.Map;

public interface UserMapper {

    @InsertProvider(type = UserDynSqlProvider.class , method = "insertUserSql")
    int insertUser(Map<String,Object> map);

    @SelectProvider(type = UserDynSqlProvider.class , method = "findUserByIdSql")
    User findUserById(Map<String,Object> map);

    @UpdateProvider(type = UserDynSqlProvider.class , method ="updateUserByIdSql")
    int updateUserById(Map<String,Object> map);

    @UpdateProvider(type = UserDynSqlProvider.class , method ="softDeleteUserById")
    int softDeleteById(Map<String,Object> map);

    @DeleteProvider(type = UserDynSqlProvider.class , method ="hardDeleteUserById")
    int hardDeleteById(Map<String,Object> map);

}
