package com.zking.service;

import com.zking.model.User;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Set;

@Transactional
public interface IUserService {
    int deleteByPrimaryKey(Integer userid);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer userid);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
    /**
     * 根据用户输入的账号获取到用户的个人信息
     * @param username
     * @return
     */
    public User selectByUserName(String username);

    /**
     *     获取到用户的角色信息
     * @return
     */
    public Set<String> getRoleByUsername(String username);

    /**
     * 权限
     * @return
     */
    public Set<String>getPermissionByUserName(String username);

    List<User> list();
}