package com.gsm.user.dao;

import com.gsm.user.model.BasicUser;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by zero on 3/9/14.
 *
 * @author Michael Zhao
 * @since 2014-03-10
 * 用于测试mybatis mapper的使用操作
 */
@Repository
@Transactional
public interface UserMapper {
    public List<BasicUser> queryAllUser();
}
