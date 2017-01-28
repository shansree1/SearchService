package com.shaan.rest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.shaan.rest.dao.SearchDao;
import com.shaan.rest.model.SearchResponceModel;
import com.shaan.rest.service.SearchService;

public class SearchServiceImpl implements SearchService{

	private SearchDao searchDao;
	
	@Autowired
	public void setSearchDao(SearchDao searchDao) {
		this.searchDao = searchDao;
	}
	
	public List<SearchResponceModel> getAllSearch(){
		
		return searchDao.getAll();
	}

}
