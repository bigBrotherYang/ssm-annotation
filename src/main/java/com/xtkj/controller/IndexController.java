package com.xtkj.controller;

import com.github.pagehelper.PageInfo;
import com.xtkj.pojo.User;
import com.xtkj.service.InitService;
import com.xtkj.uilts.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("init")
public class IndexController {
    @Autowired
    private InitService service;
    @RequestMapping("/main")
    public @ResponseBody JsonResult<PageInfo<User>> main(@RequestParam(value = "pageNumber") Integer offset,@RequestParam(value = "pageSize")  Integer limit){
        JsonResult<PageInfo<User>> users = service.getUsers(offset, limit);
        return users;
    }
}
