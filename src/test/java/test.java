import com.bjpowernode.crm.settings.dao.UserDao;
import com.bjpowernode.crm.settings.domain.User;
import com.bjpowernode.crm.utils.SqlSessionUtil;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Miaocunfu
 * @Description
 * @Classname test
 * @date 2022/1/10 17:33
 */

public class test {
    @Test
    public void testConnection(){
       UserDao userDao = SqlSessionUtil.getSqlSession().getMapper(UserDao.class);
       Map<String,String> map = new HashMap<>();
       map.put("loginAct","ls");
       map.put("loginPwd","202cb962ac59075b964b07152d234b70");
        User login = userDao.login(map);
        System.out.println(login.getName());
    }
}
