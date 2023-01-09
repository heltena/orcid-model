//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.08.09 at 01:52:56 PM BST 
//

package org.orcid.jaxb.model.v3.release.record;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.orcid.jaxb.model.v3.release.common.LastModifiedDate;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Java class for anonymous complex type.
 * 
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = { "lastModifiedDate", "fundings" })
@XmlRootElement(name = "fundingList")
@Schema(description = "FundingListV3_0")
public class FundingList implements ActivitiesContainer, Serializable {

    private static final long serialVersionUID = 1L;
    @XmlElement(namespace = "http://www.orcid.org/ns/common", name = "last-modified-date")
    protected LastModifiedDate lastModifiedDate;
    @XmlElement
    protected List<Funding> fundings;

    /**
     * Gets the value of the Fundings property.
     * 
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the Fundings property.
     * 
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getFundings().add(newItem);
     * </pre>
     * 
     * 
     * Objects of the following type(s) are allowed in the list {@link Funding }
     * 
     * @return a List of Funding objects
     * 
     */
    public List<Funding> getFundings() {
        if (fundings == null) {
            fundings = new ArrayList<Funding>();
        }
        return this.fundings;
    }

    public void setFundings(List<Funding> fundings) {
        this.fundings = fundings;
    }

    @Override
    public Map<Long, ? extends Activity> retrieveActivitiesAsMap() {
        Map<Long, Funding> map = new HashMap<>();
        if (fundings != null) {
            for (Funding f : fundings) {
                if (f.putCode != null) {
                    map.put(f.putCode, f);
                }
            }
        }
        return map;
    }

    @Override
    public Collection<? extends Activity> retrieveActivities() {
        return getFundings();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof FundingList)) {
            return false;
        }

        FundingList that = (FundingList) o;

        if (fundings != null ? !fundings.equals(that.fundings) : that.fundings != null) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = fundings != null ? fundings.hashCode() : 0;
        return result;
    }

    @Override
    public void setLastModifiedDate(LastModifiedDate lastModifiedDate) {
        // TODO Auto-generated method stub

    }
}
