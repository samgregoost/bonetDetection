/*
 * Copyright (c) 2014, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.carbon.la.database.internal.constants;

/**
 * A utility class to store SQL prepared statements
 */
public class SQLQueries {

    public static final String CREATE_LOG_GROUP = "INSERT INTO LA_LOG_GROUPS(NAME,TENANT_ID,USER_NAME) VALUES(?, ?, ?)";

    public static final String DELETE_LOG_GROUP = "DELETE FROM LA_LOG_GROUPS WHRE NAME=? AND TENANT_ID=? AND USER_NAME=?";

    public static final String DELETE_DATASET_VERSION = "DELETE FROM ML_DATASET_VERSION WHERE DATASET_VERSION_ID=?";

    public static final String GET_MODEL_STATUS = "SELECT STATUS FROM ML_MODEL WHERE MODEL_ID = ? AND TENANT_ID = ? AND USERNAME = ?";

    /*
     * private Constructor to prevent any other class from instantiating.
     */
    private SQLQueries() {
    }
}
