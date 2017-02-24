package steps;

import cucumber.api.java.zh_cn.假如;
import cucumber.api.java.zh_cn.当;
import cucumber.api.java.zh_cn.那么;

import java.net.URL;

/**
 * Created by X Rebecca on 2017/2/20.
 */
public class Steps {
    @假如("^我用账号\"test1\"，密码\"test2\"登录$")
       public void loginTest1(){
        System.out.println("用账号test1，密码test2登录");
    }

    @那么("^我能登录成功$")
      public void loginTest2(){
        System.out.println("我能登录成功");
    }
    @假如("^我打开\"(.*?)\"页面$")
    public void loginTest3(String URL) {
        System.out.println("打开"+URL);
    }
    @当("^我用账号\"(.*?)\"，和密码\"(.*?)\"登录$")
    public void loginTest4(String username,String pwd) {
        System.out.println("我是账号："+username);
        System.out.println("我是密码："+pwd);
    }
    @当("^我点击登录按钮$")
    public void loginTest5(){
        System.out.println("我点击登录按钮");
    }
}

