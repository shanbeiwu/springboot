package com.example.shiro;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.config.IniSecurityManagerFactory;
import org.apache.shiro.util.Factory;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.realm.Realm;
import org.apache.shiro.subject.Subject;
import org.junit.Test;

import junit.framework.Assert;

public class LoginLogoutTest {
	int array[] = {1, 2, 3};
	@Test
	public void testHelloworld() {
		//1,获取SecurityManager工厂，此处使用ini配置文件初始化SecurityManager
		Factory<SecurityManager> factory = new IniSecurityManagerFactory("classpath:shiro-realm.ini");
		//2,得到SecurityManager实例，并绑定给SecurityUtils
		SecurityManager securityManager = factory.getInstance();
		SecurityUtils.setSecurityManager(securityManager);
		//3,得到subjiect及创建用户名、密码身份验证Token（即用户身份/凭证）
		Subject subject = SecurityUtils.getSubject();
		UsernamePasswordToken token = new UsernamePasswordToken("liu", "123");
		
		try {
			System.out.println("username:" + token.getUsername());
			System.out.println("password:" + token.getPassword());
			//4,登录，即身份验证
			subject.login(token);
			System.out.println("用户登录");
		} catch (AuthenticationException e) {
			//5,身份验证失败
			e.printStackTrace();
			System.err.println("登录失败");
		}
		
		Assert.assertEquals(true, subject.isAuthenticated());//断言用户已经登录
		
		
		//6.退出
		subject.logout();
	}
}
