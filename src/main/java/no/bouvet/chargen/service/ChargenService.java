package no.bouvet.chargen.service;

import no.bouvet.chargen.model.HelloWorld;
import no.bouvet.chargen.model.MyCharacter;
import no.bouvet.chargen.utils.Generate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * User: bouvet.ness
 * Date: 06/03/15
 * Time: 10:18
 */

@Service("ChargenService")
public class ChargenService {

    private static final Logger log = LoggerFactory.getLogger(ChargenService.class);
    
    private HelloWorld helloWorld = new HelloWorld();
    
    public String hello() {
        log.debug("hello()");
        return helloWorld.hello();
    }

    public String hello(String name) {
        log.debug("hello('{0}')", name);
        return helloWorld.hello(name);
    }
    

    public List<MyCharacter> getRandomCharacters(int amount) {
        
        List<MyCharacter> characters = new ArrayList<MyCharacter>();
        
        for(int i=0;i < amount;i++) {
            characters.add(getRandomCharacter());
        }
        
        return characters;
    }
    
    public MyCharacter getRandomCharacter() {
        MyCharacter character = new MyCharacter();
        character.setName(Generate.randName());
        character.setClazz(Generate.randClazz());
        character.setAge(Generate.randInt(17, 55));
        character.setBelt(Generate.randBelt());
        character.setAttack(Generate.randInt(0, 100));
        character.setDefence(Generate.randInt(0, 100));
        return character;        
    }
}
