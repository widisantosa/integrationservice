package com.investasikita.integration.client;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.security.oauth2.client.feign.OAuth2FeignRequestInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.security.oauth2.client.DefaultOAuth2ClientContext;
import org.springframework.security.oauth2.client.OAuth2ClientContext;
import org.springframework.security.oauth2.client.resource.OAuth2ProtectedResourceDetails;
import org.springframework.security.oauth2.client.token.grant.password.ResourceOwnerPasswordResourceDetails;

import feign.RequestInterceptor;
import io.github.jhipster.security.uaa.LoadBalancedResourceDetails;

public class OAuth2InterceptedFeignConfiguration {
 

	private final LoadBalancedResourceDetails loadBalancedResourceDetails;

	public OAuth2InterceptedFeignConfiguration(LoadBalancedResourceDetails loadBalancedResourceDetails) {
		this.loadBalancedResourceDetails = loadBalancedResourceDetails;
	}

	@Bean(name = "oauth2RequestInterceptor")
	public RequestInterceptor getOAuth2RequestInterceptor() throws IOException {
		OAuth2ClientContext clientContext = new DefaultOAuth2ClientContext();
		//OAuth2ProtectedResourceDetails resourceDetails = new ResourceOwnerPasswordResourceDetails();
		
		  ResourceOwnerPasswordResourceDetails resourceDetails = new ResourceOwnerPasswordResourceDetails(); 
		  resourceDetails.setUsername("admin");
		  resourceDetails.setPassword("admin");
		  resourceDetails.setGrantType("password");
		  //resourceDetails.setScope(Arrays.asList("read")); 
		  //OAuth2RestTemplate restTemplate = new OAuth2RestTemplate(resourceDetails, clientContext);
		 //restTemplate.setMessageConverters(Arrays.asList(new
		 //MappingJackson2HttpMessageConverter()));
		 
		return new OAuth2FeignRequestInterceptor(clientContext, resourceDetails);
		 //return new OAuth2FeignRequestInterceptor(new DefaultOAuth2ClientContext(),
		 //loadBalancedResourceDetails);
	}

	/*
	 * private OAuth2ProtectedResourceDetails resource() {
	 * ResourceOwnerPasswordResourceDetails resourceDetails = new
	 * ResourceOwnerPasswordResourceDetails(); resourceDetails.setUsername("admin");
	 * resourceDetails.setPassword("admin");
	 * resourceDetails.setAccessTokenUri(accessTokenUri);
	 * resourceDetails.setClientId(clientId);
	 * resourceDetails.setClientSecret("mftransactionservice");
	 * resourceDetails.setGrantType("password");
	 * resourceDetails.setScope(Arrays.asList(scope)); return resourceDetails; }
	 */
}
