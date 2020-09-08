package com.xtkj.service;

import com.github.pagehelper.PageInfo;
import com.xtkj.pojo.User;
import com.xtkj.uilts.JsonResult;

public interface InitService {

    public JsonResult<PageInfo<User>> getUsers(Integer offset,Integer limit);
}
