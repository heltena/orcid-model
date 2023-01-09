package org.orcid.jaxb.model.v3.rc1.common;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

import io.swagger.v3.oas.annotations.media.Schema;

@XmlRootElement(name = "sourceClientId")
@Schema(description = "SourceClientIdV3_0_rc1")
public class SourceClientId extends OrcidIdBase implements Serializable {
    private static final long serialVersionUID = 3941977086034590626L;

    public SourceClientId() {
        super();
    }

    public SourceClientId(String path) {
        super(path);
    }

    public SourceClientId(OrcidIdBase other) {
        super(other);
    }

}
