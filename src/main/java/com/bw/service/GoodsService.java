package com.bw.service;





import com.bw.bean.Goods;

import java.util.List;
import java.util.Map;

public interface GoodsService {

    //查询
    public List<Goods> select(Map<String,Object> map);
    //添加
    public int insert(Goods goods);
    //删除
    public int del(int gid);
    //回显
    public Goods hx(int gid);
    //修改
    public int update(Goods goods);
}
