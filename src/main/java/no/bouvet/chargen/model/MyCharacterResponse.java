package no.bouvet.chargen.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: ronny.ness
 * Date: 06/03/15
 * Time: 16:06
 */

@XmlRootElement(name="characters")
public class MyCharacterResponse {
    
    @XmlElement(name="character")
    private List<MyCharacter> characters;
    
    public MyCharacterResponse() {}

    public MyCharacterResponse(List<MyCharacter> characters) {
        this.characters = characters;
        
    }
}
