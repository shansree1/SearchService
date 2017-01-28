package com.shaan.rest.dao.impl;

import java.util.ArrayList;
import java.util.List;

import com.shaan.rest.dao.SearchDao;
import com.shaan.rest.model.SearchResponceModel;

public class SearchDaoImpl implements SearchDao{

	@Override
	public List<SearchResponceModel> getAll() {
		SearchResponceModel model = new SearchResponceModel();
		model.setTitle("Test1");
		model.setDescription("Descripton1");
		model.setUrl("www.google.com");
		SearchResponceModel model1 = new SearchResponceModel();
		model1.setTitle("Test1");
		model1.setDescription("Descripton1");
		model1.setUrl("www.google.com");
		
		List<SearchResponceModel> modelList= new ArrayList<SearchResponceModel>();
		modelList.add(model);
		modelList.add(model1);
		
		return modelList;
	}

}
