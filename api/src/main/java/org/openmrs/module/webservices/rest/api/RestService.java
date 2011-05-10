/**
 * The contents of this file are subject to the OpenMRS Public License
 * Version 1.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 * http://license.openmrs.org
 *
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
 * License for the specific language governing rights and limitations
 * under the License.
 *
 * Copyright (C) OpenMRS, LLC.  All Rights Reserved.
 */
package org.openmrs.module.webservices.rest.api;

import org.openmrs.OpenmrsObject;
import org.openmrs.module.webservices.rest.Representation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Database related methods for the Rest Web Services
 */
public interface RestService {
	
	/**
	 * Gets any type of OpenmrsObject given a class and a UUID
	 * 
	 * @param <T> works for any OpenmrsObject subclass
	 * @param clazz
	 * @param uuid
	 * @return
	 * @should get any openmrs object by its uuid
	 */
	@Transactional(readOnly = true)
	public <T extends OpenmrsObject> T getOpenmrsObjectByUuid(Class<T> clazz, String uuid);
	
	/**
	 * Parses a representation requested by the client via the http request
	 * @param requested
	 * @return
	 */
	public Representation getRepresentation(String requested);
	
}