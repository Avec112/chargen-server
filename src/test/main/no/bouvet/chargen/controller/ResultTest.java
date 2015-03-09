package no.bouvet.chargen.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.internal.util.reflection.Whitebox;

import javax.servlet.http.HttpServletResponse;

import static org.junit.Assert.*;

public class ResultTest {

    @Mock
    HttpServletResponse response;
    
    private ObjectMapper mapper = new ObjectMapper();
    
    // TODO finish this one...but how to test correct behavior?
    
    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }
    
    @Test
    public void testAsJSON() throws Exception {

        Result.asJSON("blarg", response);
    }
}