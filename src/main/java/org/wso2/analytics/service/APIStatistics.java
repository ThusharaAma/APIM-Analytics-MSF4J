/*
 * Copyright (c) 2016, WSO2 Inc. (http://wso2.com) All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.wso2.analytics.service;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.wso2.analytics.domain.ApiRequestSummary;
import org.wso2.analytics.model.APIResponse;
import org.wso2.analytics.model.TopAPIUser;
import org.wso2.analytics.repo.ApiRequestSummaryDao;

/**
 * This is the Microservice resource class. See <a href=
 * "https://github.com/wso2/msf4j#getting-started">https://github.com/wso2/msf4j#getting-started</a>
 * for the usage of annotations.
 *
 * @since 0.1-SNAPSHOT
 */
@Component
@Path("/service")
public class APIStatistics {
	@Autowired
	private ApiRequestSummaryDao apiRequestSummaryDao;

	@GET
	@Path("/")
	public String get() {
		// TODO: Implementation for HTTP GET request
		System.out.println("GET invoked");
		return "Hello from WSO2 MSF4J";
	}

	@GET
	@Path("/topAPIUsers")
	@Produces({ "application/json" })
	public APIResponse getTopAPIUsers(@QueryParam("apiName") String apiName, @QueryParam("version") String apiVersion,
			@QueryParam("fromDate") String stringfromDate, @QueryParam("toDate") String stringToDate,
			@QueryParam("apiFilter") String apiFilter, @QueryParam("start") int start, @QueryParam("limit") int limit,
			@QueryParam("orderBy") String orderBy, @QueryParam("orderByOrder") String orderByOrder)
			throws ParseException {

		// this needs to be taken from the backend
		String userId = "wso2mentor@carbon.super";
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		Date fromDate = sdf.parse(stringfromDate);

		Date toDate = sdf.parse(stringToDate);
		List<ApiRequestSummary> apiRequestSummaryList = apiRequestSummaryDao.getApiRequestSummary(apiName, apiVersion,
				userId, fromDate, toDate, start, limit, orderBy, orderByOrder);
		List<TopAPIUser> topAPIUsers = new ArrayList<TopAPIUser>();
		for (ApiRequestSummary apiRequestSummary : apiRequestSummaryList) {

			topAPIUsers.add(
					new TopAPIUser(apiRequestSummary.getId().getUserId(), apiRequestSummary.getTotalRequestCount()));
		}

		APIResponse apiResponse = new APIResponse(topAPIUsers.size());
		Object[] array = topAPIUsers.toArray(apiResponse.getData());
		apiResponse.setData(array);
		return apiResponse;
	}

	@POST
	@Path("/")
	public void post() {
		// TODO: Implementation for HTTP POST request
		System.out.println("POST invoked");
	}

	@PUT
	@Path("/")
	public void put() {
		// TODO: Implementation for HTTP PUT request
		System.out.println("PUT invoked");
	}

	@DELETE
	@Path("/")
	public void delete() {
		// TODO: Implementation for HTTP DELETE request
		System.out.println("DELETE invoked");
	}

	@InitBinder
	public void binder(WebDataBinder binder) {
		DateFormat dateOnlyFormat = new SimpleDateFormat("yyyy-MM-dd");
		dateOnlyFormat.setLenient(true);
		binder.registerCustomEditor(Date.class, "dataInicio", new CustomDateEditor(dateOnlyFormat, true));
	}
}
