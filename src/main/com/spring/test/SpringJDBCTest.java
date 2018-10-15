package main.com.spring.test;

import main.com.spring.model.StoreInfo;
import main.com.spring.service.StoreInfoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.sql.DataSource;
import java.sql.Connection;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:resource/spring/spring-config.xml")
public class SpringJDBCTest {

    @Autowired
    private DataSource dataSource;

    @Autowired
    private StoreInfoService storeInfoService;


    @Test
    public void springJdbcConnectionTest(){
        Connection connection = null;
        try {
           connection =   dataSource.getConnection();
           System.out.println("数据可连接成功"+connection);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Test
    public void insertUserName(){
        StoreInfo storeInfo = new StoreInfo();
        storeInfo.setProductname("2号肉");
        storeInfo.setStroway(1);
        storeInfo.setUsername("小杨");
        storeInfoService.insertUserInfo(storeInfo);
    }
}
