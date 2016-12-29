package cn.yijiao.sm.mapper;

import cn.yijiao.sm.po.Film;

public interface FilmMapper {
    int insertSelective(Film record);
}