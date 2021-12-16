package com.kuang.mapper.impl;

import com.kuang.mapper.UserMapper;
import com.kuang.pojo.User;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

public class UserMapperImpl extends SqlSessionDaoSupport implements UserMapper {


    @Override
    public List<User> selectUser2() {
        return getSqlSession().getMapper(UserMapper.class).selectUser2();
    }
}
