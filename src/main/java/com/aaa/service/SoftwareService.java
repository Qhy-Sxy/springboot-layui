package com.aaa.service;

import com.aaa.entity.BaseQuery;
import com.aaa.entity.Software;

import java.util.List;
import java.util.Map;

public interface SoftwareService {
    List<Map> selectsoft(BaseQuery baseQuery, Software software);

    int selectCount(Software software);

    void add_do(Software software);

    Software selectSoftById(Integer id);

    void update_do(Software software);

    void delete(Integer id);
}
