/*
 * oxTrust is available under the MIT License (2008). See http://opensource.org/licenses/MIT for full text.
 *
 * Copyright (c) 2014, Gluu
 */

package org.gluu.oxauth.client.conf;

import java.io.Serializable;
import java.util.List;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * Base application configuration
 * 
 * @author Yuriy Movchan
 * @version 0.1, 11/02/2015
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class AppConfiguration implements Serializable {

	private static final long serialVersionUID = -587414854758989561L;

	private String applicationName;
	private String openIdProviderUrl;
	private String openIdClientId;
	private String openIdClientPassword;
	private List<String> openIdScopes;
	private String openIdRedirectUrl;

	public String getApplicationName() {
		return applicationName;
	}

	public void setApplicationName(String applicationName) {
		this.applicationName = applicationName;
	}

	public String getOpenIdProviderUrl() {
		return openIdProviderUrl;
	}

	public void setOpenIdProviderUrl(String openIdProviderUrl) {
		this.openIdProviderUrl = openIdProviderUrl;
	}

	public String getOpenIdClientId() {
		return openIdClientId;
	}

	public void setOpenIdClientId(String openIdClientId) {
		this.openIdClientId = openIdClientId;
	}

	public String getOpenIdClientPassword() {
		return openIdClientPassword;
	}

	public void setOpenIdClientPassword(String openIdClientPassword) {
		this.openIdClientPassword = openIdClientPassword;
	}

	public List<String> getOpenIdScopes() {
		return openIdScopes;
	}

	public void setOpenIdScopes(List<String> openIdScopes) {
		this.openIdScopes = openIdScopes;
	}

	public String getOpenIdRedirectUrl() {
		return openIdRedirectUrl;
	}

	public void setOpenIdRedirectUrl(String openIdRedirectUrl) {
		this.openIdRedirectUrl = openIdRedirectUrl;
	}

}
