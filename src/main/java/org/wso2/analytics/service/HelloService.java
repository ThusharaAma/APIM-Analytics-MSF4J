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

import java.util.Date;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.wso2.analytics.model.TopAPIUserRequest;
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
public class HelloService {
	@Autowired
	private ApiRequestSummaryDao apiRequestSummaryDao;

	@GET
	@Path("/")
	public String get() {
		// TODO: Implementation for HTTP GET request
		System.out.println("GET invoked");
		apiRequestSummaryDao.test();
		return "Hello from WSO2 MSF4J";
	}

	@GET
	@Path("/topAPIUsers")
	public String myAction(@PathParam("apiName") String apiName) {
		return apiName;
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
}
