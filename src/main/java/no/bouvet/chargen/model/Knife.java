package no.bouvet.chargen.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created with IntelliJ IDEA.
 * User: ronny.ness
 * Date: 06/03/15
 * Time: 14:01
 */
@XmlRootElement
public class Knife extends CommonWeapon {

    private boolean dagger = false; 
    private float daggerBoost = 0.0f;

    public boolean isDagger() {
        return dagger;
    }

    @XmlElement
    public void setDagger(boolean dagger) {
        this.dagger = dagger;
    }

    public float getDaggerBoost() {
        return daggerBoost;
    }

    @XmlElement
    public void setDaggerBoost(float daggerBoost) {
        this.daggerBoost = daggerBoost;
    }
}
