package com.kopoto.yhh.user.base.config;


import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


/**
 * 通用dao配置
 */
public abstract class DaoManagement {
    @Autowired
    @Qualifier(DataSourceConfig.BEANNAME_SQLSESSION_COMMON)
    protected SqlSession sqlSessionCommon;

    @Autowired
    @Qualifier(DataSourceConfig.BEANNAME_SQLSESSION_READONLY)
    protected SqlSession sqlSessionReadonly;


    protected String st(String sqlId) {
        return mapper() + "." + sqlId;
    }

    protected abstract String mapper();
}
