package cn.lind.controller;

import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cn.lind.bean.SysUser;
import cn.lind.config.NacosConfiguration;
import cn.lind.service.SysUserServes;

@Controller
@RequestMapping("/hello")
public class HelloController {
	@Autowired()
	private SysUserServes serves;

	@Autowired()
	private NacosConfiguration configuration;
	
	@Autowired
	private StringRedisTemplate redisTemplate;
	
	@RequestMapping(method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
		
		System.out.println("》》》》》==============================");
		
		SysUser userIn = serves.getUserIn("1");
		System.out.println(userIn.getname());
		String dlm2 = configuration.getDlm();
		
//		String property = System.getProperty("dlm");
		String redis = testRedis();
	
		model.addAttribute("message", "Name:"+userIn.getname()+"\nnacos:"+"_dlm:"+dlm2+"_redis:"+redis);
		
		

		
		//获取系统参数
		
		System.out.println("==============================《《《《《");
		
		return "hello";
	}
	

	    
	    public String  testRedis() {
	        // set key
	        redisTemplate.opsForValue().set("keyname", "value", 10L);
	        String string = redisTemplate.opsForValue().get("keyname");
	        return string ;
	    }
}