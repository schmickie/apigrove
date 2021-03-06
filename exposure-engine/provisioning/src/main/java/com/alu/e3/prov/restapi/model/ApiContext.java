/**
 * Copyright © 2012 Alcatel-Lucent.
 *
 * See the NOTICE file distributed with this work for additional
 * information regarding copyright ownership.
 * Licensed to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *          http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-27 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.03.19 at 02:26:27 PM CET 
//


package com.alu.e3.prov.restapi.model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlType;


/**
 * Defines an environment data model.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "context", propOrder = {
    "status",
    "loadBalancing",
    "targetHosts",
    "maxRateLimitTPSThreshold",
    "maxRateLimitTPSWarning",
    "maxRateLimitTPMThreshold",
    "maxRateLimitTPMWarning"
})
public class ApiContext {
	
	/**
	 * The context id.
	 */	
	@XmlAttribute(required = true)
	protected String id;
	
	/**
	 * Specifies if this context is the default context.
	 */	
	@XmlAttribute(required = true, name = "default")
	protected boolean defaultContext;
    
    /**
     * The environment status: active, inactive, pending
     */
    @XmlElement(required = true)
    protected Status status;

    /**
     * The strategy to load balance on multiple target hosts: unmanaged, heartbeatedAffinity
     */
    @XmlElement(required = false)
    protected LoadBalancing loadBalancing;
    
    /**
     * The target hosts defined for the environment.
     */
    @XmlElementWrapper(name="targetHosts", required = true)
    @XmlElement(name="targetHost", required = true)
    protected List<TargetHost> targetHosts;
    
    /**
     * Max Rate Limit Transaction Per Second (TPS) Threshold
     */
    @XmlElement(required = true)
    protected int maxRateLimitTPSThreshold;
    
    /**
     * Max Rate Limit Transaction Per Second (TPS) Warning
     */
    @XmlElement(required = true)
    protected float maxRateLimitTPSWarning;
    
    /**
     * Max Rate Limit Transaction per Minute (TPM) Threshold
     */
    @XmlElement(required = true)
    protected int maxRateLimitTPMThreshold;
    
    /**
     * Max Rate Limit TPM Warning
     */
    @XmlElement(required = true)
    protected float maxRateLimitTPMWarning;

    /**
     * Gets the value of the id attribute.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
      return id;
    }
    
    /**
     * Sets the value of the id property.
     * 
     * @param id
     *     allowed object is
     *     {@link EnvType }
     *     
     */
	public void setId(String id) {
		this.id = id;
	}
	
	/**
	 * Sets the value of the defaultContext property.
	 * @param defaultContext the defaultContext to set
	 */
	public void setDefaultContext(boolean defaultContext) {
		this.defaultContext = defaultContext;
	}
	
	/**
	 * Gets the value of the defaultContext property.
	 * @return the defaultContext
	 */
	public boolean isDefaultContext() {
		return defaultContext;
	}

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link Status }
     *     
     */
    public Status getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link Status }
     *     
     */
    public void setStatus(Status value) {
        this.status = value;
    }
    
    /**
     * Gets the value of the Load Balancing property.
     * 
     * @return
     *     possible object is
     *     {@link LoadBalancing }
     *     
     */
    public LoadBalancing getLoadBalancing() {
        return loadBalancing;
    }

    /**
     * Sets the value of the Load Balancing property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoadBalancing }
     *     
     */
    public void setLoadBalancing(LoadBalancing value) {
        this.loadBalancing = value;
    }

    public List<TargetHost> getTargetHosts() {
        if (targetHosts == null) {
            targetHosts = new ArrayList<TargetHost>();
        }
        return this.targetHosts;
    }

    /**
     * Sets the value of the targetHosts property.
     * 
     * @param value
     *     allowed object is
     *     {@link TargetHosts }
     *     
     */
    public void setTargetHosts(List<TargetHost> value) {
        this.targetHosts = value;
    }

    /**
     * Gets the value of the maxRateLimitTPSThreshold property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public int getMaxRateLimitTPSThreshold() {
        return maxRateLimitTPSThreshold;
    }

    /**
     * Sets the value of the maxRateLimitTPSThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxRateLimitTPSThreshold(int value) {
        this.maxRateLimitTPSThreshold = value;
    }

    /**
     * Gets the value of the maxRateLimitTPSWarning property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public float getMaxRateLimitTPSWarning() {
        return maxRateLimitTPSWarning;
    }

    /**
     * Sets the value of the maxRateLimitTPSWarning property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxRateLimitTPSWarning(float value) {
        this.maxRateLimitTPSWarning = value;
    }

    /**
     * Gets the value of the maxRateLimitTPMThreshold property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public int getMaxRateLimitTPMThreshold() {
        return maxRateLimitTPMThreshold;
    }

    /**
     * Sets the value of the maxRateLimitTPMThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxRateLimitTPMThreshold(int value) {
        this.maxRateLimitTPMThreshold = value;
    }

    /**
     * Gets the value of the maxRateLimitTPMWarning property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public float getMaxRateLimitTPMWarning() {
        return maxRateLimitTPMWarning;
    }

    /**
     * Sets the value of the maxRateLimitTPMWarning property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxRateLimitTPMWarning(float value) {
        this.maxRateLimitTPMWarning = value;
    }
      
   
}
