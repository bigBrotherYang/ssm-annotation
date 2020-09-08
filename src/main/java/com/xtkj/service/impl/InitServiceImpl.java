package com.xtkj.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xtkj.dao.UserMapper;
import com.xtkj.pojo.User;
import com.xtkj.service.InitService;
import com.xtkj.uilts.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InitServiceImpl implements InitService {
    @Autowired
    private UserMapper mapper;

    @Override
    public JsonResult<PageInfo<User>> getUsers(Integer offset,Integer limit) {
        PageHelper.offsetPage(offset,limit);
        List<User> list = mapper.getUsers();
        PageInfo<User> page = new PageInfo<>(list);
        JsonResult<PageInfo<User>> jsonResult = new JsonResult<>();
        jsonResult.setMsg("OK");
        jsonResult.setObj(page);
        jsonResult.setStateCode(200);
        return jsonResult;
    }
}
