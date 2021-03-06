package org.gluu.oxtrust.model.scim2.provider;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.gluu.oxtrust.model.scim2.Meta;
import org.gluu.oxtrust.model.scim2.Resource;

/**
 * This class represents a ServiceProviderConfig.
 * 
 * <p>
 * For more detailed information please look at the <a
 * href="https://tools.ietf.org/html/draft-ietf-scim-core-schema-20#section-5"
 * >SCIM core schema 20.0, section 5</a>
 * </p>
 */
public class ServiceProviderConfig extends Resource{

	private String documentationUrl = "http://www.gluu.org/docs/";
	private PatchConfig patch = new PatchConfig(false);
	private FilterConfig filter = new FilterConfig(false, 0);
	private BulkConfig bulk = new BulkConfig(true, 10, 100);
	private SortConfig sort = new SortConfig(false);
	private ChangePasswordConfig changePassword = new ChangePasswordConfig(false);
	private ETagConfig etag = new ETagConfig(false); 
	private Collection<AuthenticationScheme> authenticationSchemes;

	public ServiceProviderConfig() {
		Meta userMeta = new Meta();
    	userMeta.setResourceType("ServiceProviderConfig");
    	setMeta(userMeta);
    	Set<String> userSchemas = new HashSet<String>();
    	userSchemas.add("urn:ietf:params:scim:schemas:core:2.0:ServiceProviderConfig");    	
		setSchemas(userSchemas );
		authenticationSchemes = new ArrayList<AuthenticationScheme>();
		authenticationSchemes.add(AuthenticationScheme.createBasic(true));
		authenticationSchemes.add(AuthenticationScheme.createOAuth2(true));
		
	}


	public String getDocumentationUrl() {
		return documentationUrl;
	}

	public void setDocumentationUrl(String documentationUrl) {
		this.documentationUrl = documentationUrl;
	}


	public PatchConfig getPatch() {
		return patch;
	}


	public void setPatch(PatchConfig patch) {
		this.patch = patch;
	}


	public FilterConfig getFilter() {
		return filter;
	}


	public void setFilter(FilterConfig filter) {
		this.filter = filter;
	}


	public BulkConfig getBulk() {
		return bulk;
	}


	public void setBulk(BulkConfig bulk) {
		this.bulk = bulk;
	}


	public SortConfig getSort() {
		return sort;
	}


	public void setSort(SortConfig sort) {
		this.sort = sort;
	}


	public ChangePasswordConfig getChangePassword() {
		return changePassword;
	}


	public void setChangePassword(ChangePasswordConfig changePassword) {
		this.changePassword = changePassword;
	}


	public ETagConfig getEtag() {
		return etag;
	}


	public void setEtag(ETagConfig etag) {
		this.etag = etag;
	}

}
