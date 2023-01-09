package org.orcid.jaxb.model.v3.rc1.record.summary;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

import io.swagger.v3.oas.annotations.media.Schema;

@XmlRootElement(name = "invited-position-summary", namespace = "http://www.orcid.org/ns/invited-position")
@Schema(description = "InvitedPositionSummaryV3_0_rc1")
public class InvitedPositionSummary extends AffiliationSummary implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 5195707602485199190L;

}
