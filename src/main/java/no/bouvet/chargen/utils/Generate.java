package no.bouvet.chargen.utils;

import no.bouvet.chargen.model.Belt;
import no.bouvet.chargen.model.Clazz;
import no.bouvet.chargen.model.Knife;
import no.bouvet.chargen.model.Sword;

import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * User: ronny.ness
 * Date: 06/03/15
 * Time: 14:48
 */
public class Generate {

    private static NameGenerator nameGenerator = new NameGenerator();
    
    public static int randInt(int min, int max) {

        // NOTE: Usually this should be a field rather than a method
        // variable so that it is not re-seeded every call.
        Random rand = new Random();

        // nextInt is normally exclusive of the top value,
        // so add 1 to make it inclusive
        int randomNum = rand.nextInt((max - min) + 1) + min;

        return randomNum;
    }
    
    public static String randName() {        
        return nameGenerator.getName();                
    }
    
    public static float randFloat(float min, float max) {
        Random rand = new Random();
        return rand.nextFloat() * (max - min) + min;
        
    }
    
    public static Belt randBelt() {
        Belt belt = new Belt();
        
        Knife knife = new Knife();
        knife.setAttack(randInt(1,20));
        knife.setDefence(randInt(1, 20));
        knife.setStatusInPercent(randInt(0, 100));
        knife.setBonus(randFloat(0.0f, 2.0f));
        knife.setWeight(5);
        belt.setKnife(knife);
        
        Sword sword = new Sword();
        sword.setAttack(randInt(20,100));
        sword.setDefence(randInt(20, 100));
        sword.setStatusInPercent(randInt(0,100));
        sword.setBonus(randFloat(0.0f, 2.0f));
        sword.setWeight(20);
        
        belt.setSword(sword);
        
        int weightLimit = sword.getWeight() + knife.getWeight() + randInt(5,30);
        belt.setWeightLimit(weightLimit);
        
       
        return belt;
    }
    
    public static Clazz randClazz() {
        Clazz clazz = new Clazz();
        clazz.setHeight(randInt(4, 9));
        clazz.setStrengthPercent(randInt(5, 100));
        clazz.setType("Human"); // should be an object and randomized
        return clazz;
    }
    

    
}
