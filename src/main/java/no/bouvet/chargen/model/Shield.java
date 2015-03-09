package no.bouvet.chargen.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created with IntelliJ IDEA.
 * User: ronny.ness
 * Date: 06/03/15
 * Time: 14:35
 */
@XmlRootElement
public class Shield extends CommonWeapon {
    private boolean flameResistable = false;

    public boolean isFlameResistable() {
        return flameResistable;
    }

    @XmlElement
    public void setFlameResistable(boolean flameResistable) {
        this.flameResistable = flameResistable;
    }
}
