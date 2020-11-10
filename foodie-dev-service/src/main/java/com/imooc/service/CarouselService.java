package com.imooc.service;

import com.imooc.pojo.Carousel;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public interface CarouselService {

    /**
     * 查询所有轮播图列表
     */

    public List<Carousel> queryAll(Integer isShow);
}
