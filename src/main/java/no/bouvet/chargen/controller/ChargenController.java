package no.bouvet.chargen.controller;

import com.wordnik.swagger.annotations.ApiOperation;
import no.bouvet.chargen.model.MyCharacter;
import no.bouvet.chargen.model.MyCharacterResponse;
import no.bouvet.chargen.service.ChargenService;
import org.apache.commons.lang.math.NumberUtils;
import org.apache.commons.lang.time.StopWatch;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: ronny.ness
 * Date: 06/03/15
 * Time: 09:59
 */
@Controller
//@RequestMapping("/chargen")
public class ChargenController {

    private static final Logger log = LoggerFactory.getLogger(ChargenController.class);
    
    @Autowired private ChargenService chargenService;
    
    @RequestMapping(method = RequestMethod.GET, value = "/status", headers = "Accept=application/json,text/xml")
    @ApiOperation(value="/status", notes = "Whats up?")
    public void getStatus(
            @RequestParam(value = "format", required = false) String format, 
            HttpServletResponse response) {
        
        log.info("/status is called!");
        try {
            Result.asFormat("The REST service is up!", response, format);
        } catch (IOException e) {
            log.error("Oh, snap!", e);
            // todo returner noe til klienten?
        }

    }


    @RequestMapping(method = RequestMethod.GET, value = "/hello", headers = "Accept=application/json")
    @ApiOperation(value="/hello", notes = "Hello, World!")
    public void hello(HttpServletResponse response) {
        try {
            Result.asJSON(chargenService.hello(), response);
        } catch (IOException e) {
            log.error("Oh, snap!", e);
            // todo returner noe til klienten?
        }
           
    }


//    @RequestMapping(method = RequestMethod.GET, value = "/character")
//    @RequestMapping(method = RequestMethod.GET, value = "/character/{amount:\\d+}/{format}")
    @RequestMapping(method = RequestMethod.GET, value = "/character/{amount:\\d+}")
    @ApiOperation(value="/character/:amount?(format=json|xml)", notes = "Say the amount and you will receive!")
    public void generateCharacters(
//            @RequestParam(value = "amount") Integer amount,
            @PathVariable(value = "amount") Integer amount,
            @RequestParam(value = "format", required = false) String format,
//            @PathVariable(value = "format") String format,
            HttpServletResponse response) {

        log.info("/character/{} is accessed.", amount);
        log.debug("format=" + format);
        
        try {
            
            if(amount.intValue() <= 10000) {
                StopWatch watch = new StopWatch();
                watch.start();
                Result.asFormat(chargenService.getRandomCharacters(amount), response, format);
                watch.stop();
                log.debug("Creating {} {} objects took {}", amount, (format == null)?"json":format, watch.toString());
            } else {
                Result.asFormat("Sorry, 10000 is max amount for character generation", response, format);
            }
        } catch (IOException e) {
            log.error("Oh, snap!", e);
            // todo returner noe til klienten?
        }
        
    }
}
