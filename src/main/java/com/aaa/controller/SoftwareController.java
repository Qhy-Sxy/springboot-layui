package com.aaa.controller;

import com.aaa.entity.BaseQuery;
import com.aaa.entity.LayuiResult;
import com.aaa.entity.Software;
import com.aaa.service.SoftwareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
public class SoftwareController {
    @Autowired
    SoftwareService softwareService;
    //首先跳转进入页面
    @RequestMapping("/selectSoft")
    public String selectSoft()
    {
        return "selectSoft";
    }
    @RequestMapping("/selectSoft2")
    @ResponseBody
    public LayuiResult<Map> selectQiFeng(BaseQuery baseQuery, Software software){
        LayuiResult<Map> result=new LayuiResult<Map>();
        //查询数据
        List<Map> list=softwareService.selectsoft(baseQuery,software);
        //总条数
        int count=softwareService.selectCount(software);
        result.setData(list);
        result.setCount(count);
        return result;
    }
    @RequestMapping("/add")
    public String add(){
        return "add";
    }
    @RequestMapping("/add_do")
    @ResponseBody
    public LayuiResult<Software> add_do(Software software){
        softwareService.add_do(software);
        LayuiResult result = new LayuiResult();
        //添加成功页面显示
        result.setMsg("添加成功");
        return result;
    }
    //修改   进入页面 回显数据
    @RequestMapping("/selectSoftById")
    public String selectSoftById(Integer id, Model model){
        Software software =softwareService.selectSoftById(id);
        model.addAttribute("software",software);
        return "update";
    }
    @RequestMapping("/update_do")
    @ResponseBody
    public LayuiResult<Software> update_do(Software software){
        softwareService.update_do(software);
        LayuiResult result = new LayuiResult();
        //修改成功页面显示
        result.setMsg("修改成功");
        return result;
    }
    @RequestMapping("/delete")
    @ResponseBody
    public LayuiResult<Software> delete(Integer id){
        System.out.println(id);
        softwareService.delete(id);
        LayuiResult result = new LayuiResult();
        //删除成功页面显示
        result.setMsg("删除成功");
        return result;
    }
}
