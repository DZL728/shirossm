package com.zking.mapper;

import com.zking.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;

@Repository
public interface UserMapper {
    int deleteByPrimaryKey(Integer userid);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer userid);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    public User selectByUserName(String username);

    /**
     *     获取到用户的角色信息
     * @return
     */
    public Set<String>getRoleByUsername(String username);

    /**
     * 权限
     * @return
     */
    public Set<String>getPermissionByUserName(String username);

    List<User>list();
}