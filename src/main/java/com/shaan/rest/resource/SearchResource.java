package com.shaan.rest.resource;

import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.shaan.rest.dto.SearchDto;
import com.shaan.rest.service.SearchService;

@Component
@Path("/search")
public class SearchResource {

	private SearchService searchService;

	@Autowired
	public void setSearchService(SearchService searchService) {
		this.searchService = searchService;
	}

	@GET
	@Path("getAll")
	@Produces({ MediaType.APPLICATION_XML })
	public SearchDto getname() {

		SearchDto searchDto = new SearchDto();

		try {

			searchDto.setData(searchService.getAllSearch());

		} catch (Exception e) {
			searchDto.setException(true);
			e.printStackTrace();
		}

		return searchDto;

	}

}
