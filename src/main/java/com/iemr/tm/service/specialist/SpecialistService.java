/*
* AMRIT – Accessible Medical Records via Integrated Technology 
* Integrated EHR (Electronic Health Records) Solution 
*
* Copyright (C) "Piramal Swasthya Management and Research Institute" 
*
* This file is part of AMRIT.
*
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
*
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
*
* You should have received a copy of the GNU General Public License
* along with this program.  If not, see https://www.gnu.org/licenses/.
*/
package com.iemr.tm.service.specialist;

import java.util.List;

import com.iemr.tm.data.specialist.M_User;
import com.iemr.tm.data.specialist.Specialist;
import com.iemr.tm.data.specialist.Specialization;
import com.iemr.tm.utils.exception.TMException;

public interface SpecialistService {

	List<Specialization> getspecialization();

	List<Specialist> getspecialistUser(Long providerservicemapID, Long specializationID, Long userID)
			throws TMException;

	M_User getinfo(Long userID);

	public List<Specialist> getAllSpecialist(Long providerservicemapID);

}
