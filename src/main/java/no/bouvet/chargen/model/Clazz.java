package no.bouvet.chargen.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created with IntelliJ IDEA.
 * User: ronny.ness
 * Date: 06/03/15
 * Time: 14:26
 */
@XmlRootElement
public class Clazz {
    private String type = "Human"; // dwarf, human, etc
    private int height = 7; // feet
    private int strengthPercent = 50; //

    public String getType() {
        return type;
    }

    @XmlElement
    public void setType(String type) {
        this.type = type;
    }

    public int getHeight() {
        return height;
    }

    @XmlElement
    public void setHeight(int height) {
        this.height = height;
    }

    public int getStrengthPercent() {
        return strengthPercent;
    }
    
    @XmlElement
    public void setStrengthPercent(int strengthPercent) {
        this.strengthPercent = strengthPercent;
    }
}
