package no.bouvet.chargen.model;

import javax.xml.bind.annotation.XmlElement;

/**
 * Created with IntelliJ IDEA.
 * User: ronny.ness
 * Date: 06/03/15
 * Time: 14:02
 */
public class CommonWeapon {
    private String name = "no name"; // also id
    private String description = "";
    private int defence = 0;
    private int attack = 0;
    private int weight = 0;
    private int statusInPercent = 100;
    private int price = 0;
    private float bonus = 0.0f;

    public String getName() {
        return name;
    }

    @XmlElement
    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    @XmlElement
    public void setDescription(String description) {
        this.description = description;
    }

    public int getDefence() {
        return defence;
    }

    @XmlElement
    public void setDefence(int defence) {
        this.defence = defence;
    }

    public int getAttack() {
        return attack;
    }

    @XmlElement
    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getWeight() {
        return weight;
    }

    @XmlElement
    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getStatusInPercent() {
        return statusInPercent;
    }


    @XmlElement
    public void setStatusInPercent(int statusInPercent) {
        this.statusInPercent = statusInPercent;
    }

    public int getPrice() {
        return price;
    }


    @XmlElement
    public void setPrice(int price) {
        this.price = price;
    }

    
    public float getBonus() {
        return bonus;
    }


    @XmlElement
    public void setBonus(float bonus) {
        this.bonus = bonus;
    }
}
