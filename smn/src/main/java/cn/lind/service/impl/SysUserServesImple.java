package cn.lind.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.lind.bean.SysUser;
import cn.lind.dao.SysUserDao;
import cn.lind.service.SysUserServes;
@Service("SysUserServes")
public class SysUserServesImple implements SysUserServes{
    @Autowired
    private SysUserDao SysUserDao;

    public SysUser getUserIn(String id) {
         SysUser user = SysUserDao.selectByYhid(id);

    	
//    	SysUser user = new SysUser();
//    	user.setname("¹þ¹þ¹þ");
       return user ;
    }
}
