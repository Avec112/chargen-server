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
public class Belt {
    private int weightLimit = 0;
    private Knife knife;
    private Sword sword;

    public int getWeightLimit() {
        return weightLimit;
    }

    @XmlElement
    public void setWeightLimit(int weightLimit) {
        this.weightLimit = weightLimit;
    }

    public Knife getKnife() {
        return knife;
    }

    @XmlElement
    public void setKnife(Knife knife) {
        this.knife = knife;
    }

    public Sword getSword() {
        return sword;
    }

    @XmlElement
    public void setSword(Sword sword) {
        this.sword = sword;
    }
}
