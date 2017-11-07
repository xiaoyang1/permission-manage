package com.provider;

import com.entity.User;
import org.apache.ibatis.jdbc.SQL;

import java.util.Map;

public class UserDynSqlProvider {

    public String insertUserSql(final User user){
        SQL sql = new SQL(){
            {
                INSERT_INTO("t_user");
                if(user.getFinalExcuteTime() != null){
                    VALUES("finalExcuteTime","#{finalExcuteTime}");
                }
                if(user.getName() != null){
                    VALUES("name","#{name}");
                }
            }
        };
        return sql.toString();
    }

    public String findUserByIdSql(final Map map){
        SQL sql = new SQL(){
            {
                SELECT("id ,name ,created_day ,isdeleted , finalExcuteTime");
                FROM("t_user");
                WHERE("id = "+ map.get("userId"));
            }
        };
        return sql.toString();
    }

}
