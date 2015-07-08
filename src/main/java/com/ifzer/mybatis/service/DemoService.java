package com.ifzer.mybatis.service;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.ifzer.mybatis.mapper.Country2Mapper;
import com.ifzer.mybatis.model.Country2;

/**
 * @author liuzh
 */
@Service
public class DemoService {
//    @Autowired
//    private CountryMapper countryMapper;

//    @Autowired
//    private Country2Mapper mapper;

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public void setDataSource(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

//    public Country selectById(int id) {
//        return countryMapper.selectByPrimaryKey(id);
//    }
//
//    public Country selectById2(int id) {
//        Country country = jdbcTemplate.queryForObject("select * from country where id = :id", new BeanPropertyRowMapper<Country>(Country.class), id);
//        return country;
//    }
//
//    public List<Country> selectPage(int pageNum,int pageSize){
//        PageHelper.startPage(pageNum, pageSize);
//        return countryMapper.select(null);
//    }

//    public List<Country2> selectPage2(int pageNum,int pageSize){
//        PageHelper.startPage(pageNum, pageSize);
//        //Spring4支持泛型注入
//        return mapper.select(null);
//    }
}
