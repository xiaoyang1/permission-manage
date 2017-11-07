import com.entity.User;
import com.mapper.UserMapper;
import com.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class MyTest {

    private static SqlSessionFactory sqlSessionFactory = null;
    private static SqlSession session = null;

    static {
        try {
            sqlSessionFactory = MyBatisUtil.getFactory();
        } catch (IOException e) {
            e.printStackTrace();
        }
        session = sqlSessionFactory.openSession(true);
    }

    @Test
    public void testDynInsertUser() {
        UserMapper mapper = session.getMapper(UserMapper.class);
        Map<String,Object> map = new HashMap<String, Object>();
        map.put("userName","shuai");
        map.put("finalExcuteTime",new Date());
        int result = mapper.insertUser(map);
        System.out.println(result);
        session.close();
    }

    @Test
    public void testDynfindUserById() {
        UserMapper mapper = session.getMapper(UserMapper.class);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("userId", 2);
        User user = mapper.findUserById(map);
        System.out.println(user);
        session.close();
    }

    @Test
    public void testDynUpdateUserById(){
        UserMapper mapper = session.getMapper(UserMapper.class);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("userId",5);
        map.put("userName","xuan");
        map.put("finalExcuteTime",new Date());
        int result = mapper.updateUserById(map);
        System.out.println(result);
        session.close();
    }

    @Test
    public void testSoftDelete(){
        UserMapper mapper = session.getMapper(UserMapper.class);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("userId",5);
        int result = mapper.softDeleteById(map);
        System.out.println(result);
        session.close();
    }

}