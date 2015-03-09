package no.bouvet.chargen.model;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.UUID;

/**
 * Created with IntelliJ IDEA.
 * User: ronny.ness
 * Date: 06/03/15
 * Time: 14:25
 */

@XmlRootElement(name="character")
@XmlType(propOrder = {"name","age","attack","defence","clazz","belt"})
@JsonPropertyOrder({"id","name","age","attack","defence","clazz","belt"})
public class MyCharacter {
    @XmlAttribute
    private String id = UUID.randomUUID().toString();
    private String name = "No name";
    private int age = 25;
    private Clazz clazz;
    private Belt belt;
    private int defence = 50;
    private int attack = 50;

    public String getId() {
        return id;
    }

    public Belt getBelt() {
        return belt;
    }

    @XmlElement
    public void setBelt(Belt belt) {
        this.belt = belt;
    }

    public Clazz getClazz() {
        return clazz;
    }

    @XmlElement
    public void setClazz(Clazz clazz) {
        this.clazz = clazz;
    }

    public String getName() {
        return name;
    }

    @XmlElement
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    @XmlElement
    public void setAge(int age) {
        this.age = age;
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
}
