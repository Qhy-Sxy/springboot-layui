package com.aaa.mapper;

import com.aaa.entity.Software;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface SoftWareMapper {
    List<Map> selectsoft(Map<String, Object> map);

    int selectCount(Software software);

    void add_do(Software software);

    Software selectSoftById(Integer id);

    void update_do(Software software);

    void delete(Integer id);
}
