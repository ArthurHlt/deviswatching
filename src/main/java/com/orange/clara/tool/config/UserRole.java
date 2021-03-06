package com.orange.clara.tool.config;

import com.orange.clara.tool.model.RoleType;

/**
 * Copyright (C) 2016 Orange
 * <p>
 * This software is distributed under the terms and conditions of the 'Apache-2.0'
 * license which can be found in the file 'LICENSE' in this package distribution
 * or at 'https://opensource.org/licenses/Apache-2.0'.
 * <p>
 * Author: Arthur Halet
 * Date: 01/07/2016
 */
public interface UserRole {
    String ADMIN = RoleType.ADMIN.name();
    String USER = RoleType.USER.name();
}
