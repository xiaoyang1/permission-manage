package com.provider;

import org.apache.ibatis.jdbc.SQL;

import java.util.Map;

public class UserDynSqlProvider {

    public String insertUserSql(final Map<String,Object> map){
        SQL sql = new SQL(){
            {
                INSERT_INTO("t_user");
                if(map.get("finalExcuteTime") != null){
                    VALUES("finalExcuteTime","#{finalExcuteTime}");
                }
                if(map.get("userName") != null){
                    VALUES("name","#{userName}");
                }
            }
        };
        return sql.toString();
    }

    public String findUserByIdSql(final Map<String,Object> map){
        StringBuilder sql = new StringBuilder();
        sql.append("select id ,name ,created_day ,isdeleted , finalExcuteTime from t_user where isdeleted = 0 ");
        if(map.get("userId") != null){
            sql.append("and id= "+ map.get("userId"));
        }
        if(map.get("userName") != null){
            sql.append("and name="+map.get("userName"));
        }
        return sql.toString();
    }

    public String updateUserByIdSql(final Map<String,Object> map){
        SQL sql = new SQL(){
            {
                UPDATE("t_user");
                if(map.get("userName") != null){
                    SET("name = #{userName}");
                }
                if(map.get("finalExcuteTime") != null){
                    SET("finalExcuteTime = #{finalExcuteTime}");
                }
                WHERE("isdeleted = 0 and id = #{userId}");
            }
        };
        return sql.toString();
    }

    public String softDeleteUserById(final Map<String,Object> map){
        SQL sql =new SQL(){
            {
                UPDATE("t_user");
                SET("isdeleted = 1");
                WHERE("id = #{userId} and isdeleted = 0");
            }
        };
        return sql.toString();
    }

    public String hardDeleteUserById(final Map<String,Object> map){
        SQL sql = new SQL(){
            {
                DELETE_FROM("t_user");
                WHERE("id = #{userId}");
            }
        };
        return sql.toString();
    }
}
