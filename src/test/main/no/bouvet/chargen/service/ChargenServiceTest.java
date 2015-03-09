package no.bouvet.chargen.service;

import org.junit.Before;
import org.junit.Test;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;

import static org.junit.Assert.*;

public class ChargenServiceTest {

    @Spy
    private ChargenService service;
    
    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
        
    }
    
    @Test
    public void testHello() throws Exception {
        assertEquals("Hello, World!", service.hello());
    }

    @Test
    public void testHello1() throws Exception {
        assertEquals("Hello, Gandalf!", service.hello("Gandalf"));
    }
}