package com.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class MyBatisUtil {

    public static SqlSessionFactory getFactory() throws IOException{

        String resource = "conf.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);

        //构建sqlsession工厂
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        return sessionFactory;
    }

}
