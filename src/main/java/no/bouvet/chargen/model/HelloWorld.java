package no.bouvet.chargen.model;

import org.apache.commons.lang.StringUtils;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created with IntelliJ IDEA.
 * User: ronny.ness
 * Date: 06/03/15
 * Time: 10:33
 */

@XmlRootElement
public class HelloWorld {

    @XmlElement
    private String hello = "Hello";
   
    
    public String hello() {
        return hello + ", World!";
    }

    public String hello(String name) {
        if(StringUtils.isBlank(name)) {
            throw new IllegalArgumentException("Argument 'name' cannot be empty or null");
        }
        return hello + ", " + name + "!";

    }
}
