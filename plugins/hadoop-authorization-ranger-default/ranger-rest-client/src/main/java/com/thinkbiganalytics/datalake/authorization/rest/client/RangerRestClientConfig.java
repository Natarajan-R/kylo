package com.thinkbiganalytics.datalake.authorization.rest.client;

/*-
 * #%L
 * thinkbig-ranger-rest-client
 * %%
 * Copyright (C) 2017 ThinkBig Analytics
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */


import com.thinkbiganalytics.rest.JerseyClientConfig;


/**
 * Setting Ranger REST client configuration.
 *
 * @author sv186029
 * @version 1.0
 * @category ranger security
 */

public class RangerRestClientConfig extends JerseyClientConfig {

    private String apiPath = "/service";

    public RangerRestClientConfig(String apiPath) {
        this.apiPath = apiPath;
    }

    public RangerRestClientConfig() {

    }

    public RangerRestClientConfig(String host, String username, String password) {
        super(host, username, password);
    }

    public RangerRestClientConfig(String host, String username, String password, boolean https, boolean keystoreOnClasspath, String keystorePath, String keystorePassword, String apiPath) {
        super(host, username, password, https, keystoreOnClasspath, keystorePath, keystorePassword);
        this.apiPath = apiPath;
    }

    public String getApiPath() {
        return apiPath;
    }

    public void setApiPath(String apiPath) {
        this.apiPath = apiPath;
    }

}
