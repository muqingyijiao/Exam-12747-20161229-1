package cn.yijiao.sm.service;

import org.springframework.stereotype.Service;

import cn.yijiao.sm.mapper.FilmMapper;
import cn.yijiao.sm.po.Film;

@Service
public class FilmServiceImpl implements FilmService{
	
	private FilmMapper filmMapper;

	public FilmMapper getFilmMapper() {
		return filmMapper;
	}

	public void setFilmMapper(FilmMapper filmMapper) {
		this.filmMapper = filmMapper;
	}

	@Override
	public int insertSelective(Film record) {
		// TODO Auto-generated method stub
		return filmMapper.insertSelective(record);
	}

}
