/*******************************************************************************
 * Copyright (c) 2014 Agnie Technologies.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Public License v3.0
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/gpl.html
 * 
 * Contributors:
 *     Agnie Technologies - initial API and implementation
 ******************************************************************************/
package com.agnie.useradmin.common.client;

import com.google.gwt.core.client.GWT;

public interface I18 {
	static final Messages		messages		= GWT.create(Messages.class);
	static final ErrorMessages	errorMessages	= GWT.create(ErrorMessages.class);
}
