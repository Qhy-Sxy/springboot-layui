package com.aaa.service;

import com.aaa.entity.BaseQuery;
import com.aaa.entity.Software;
import com.aaa.mapper.SoftWareMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class SoftwareServiceImpl implements SoftwareService{
    @Autowired
    SoftWareMapper softWareMapper;
    @Override
    public List<Map> selectsoft(BaseQuery baseQuery, Software software) {
        int begin=baseQuery.getLimit()*(baseQuery.getPage()-1);
        int end=baseQuery.getLimit()*baseQuery.getPage()-begin;
        Map<String,Object> map=new HashMap<String,Object>();
        map.put("begin", begin);
        map.put("end", end);
        map.put("name", software.getName());
        return softWareMapper.selectsoft(map);
    }

    @Override
    public int selectCount(Software software) {
        return softWareMapper.selectCount(software);
    }

    @Override
    public void add_do(Software software) {
        softWareMapper.add_do(software);
    }

    @Override
    public Software selectSoftById(Integer id) {
        return softWareMapper.selectSoftById(id);
    }

    @Override
    public void update_do(Software software) {
        softWareMapper.update_do(software);
    }

    @Override
    public void delete(Integer id) {
        softWareMapper.delete(id);
    }
}
