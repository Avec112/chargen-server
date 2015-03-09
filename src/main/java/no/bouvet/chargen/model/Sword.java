package no.bouvet.chargen.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created with IntelliJ IDEA.
 * User: ronny.ness
 * Date: 06/03/15
 * Time: 14:23
 */
@XmlRootElement
public class Sword extends CommonWeapon {
 
    private boolean longsword = false; // two handed ( = now shield)

    public boolean isLongsword() {
        return longsword;
    }

    @XmlElement
    public void setLongsword(boolean longsword) {
        this.longsword = longsword;
    }
}
