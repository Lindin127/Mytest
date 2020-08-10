package cn.lind.dao;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import cn.lind.bean.SysUser;

/**
 * Created by lind on 2020/7/31.
 */
@Repository
public interface SysUserDao{
	 
	@Select("select * from sys_user where yhid =#{yhid} ")
	SysUser selectByYhid(String yhid);
}
