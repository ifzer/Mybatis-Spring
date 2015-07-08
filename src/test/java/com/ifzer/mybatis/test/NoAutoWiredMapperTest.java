package com.ifzer.mybatis.test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.ifzer.mybatis.mapper.CountryMapper;
import com.ifzer.mybatis.model.Country;

/**
 * Created by liuzh on 2015/3/7.
 */
public class NoAutoWiredMapperTest extends BasicTest {

    @Autowired
    private SqlSession sqlSession;

//    @Test
//    public void testUserInfo(){
//        UserInfoMapper userInfoMapper = sqlSession.getMapper(UserInfoMapper.class);
//        int count = userInfoMapper.selectCount(null);
//        System.out.println(count);
//    }

    @Test
    public void testCountry(){
        CountryMapper userInfoMapper = sqlSession.getMapper(CountryMapper.class);
        int count = userInfoMapper.selectCount(null);
        System.out.println("testCountry count is " +count);
    }
    
    @Test
    public void testCountryPage(){
    	Page page = PageHelper.startPage(0, 10, false);
        System.out.println("getTotal - " + page.getTotal());
        CountryMapper m = sqlSession.getMapper(CountryMapper.class);
        List<Country> list = m.select(null);
        System.out.println("getTotal - " + page.getTotal());
        Assert.assertNotNull(list);
        for (Country country : list) {
			System.out.println(country.getCountryname());
		}
    }
}
