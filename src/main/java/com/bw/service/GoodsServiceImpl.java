package com.bw.service;


import com.bw.bean.Goods;
import com.bw.mapper.GoodsMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class GoodsServiceImpl implements GoodsService {

    @Resource
    GoodsMapper gm;


    @Override
    public List<Goods> select(Map<String, Object> map) {
        return gm.select(map);
    }

    @Override
    public int insert(Goods goods) {
        return gm.insert(goods);
    }

    @Override
    public int del(int gid) {
        return gm.del(gid);
    }

    @Override
    public Goods hx(int gid) {
        return gm.hx(gid);
    }

    @Override
    public int update(Goods goods) {
        return gm.update(goods);
    }
}
