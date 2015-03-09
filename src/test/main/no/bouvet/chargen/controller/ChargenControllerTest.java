package no.bouvet.chargen.controller;

import no.bouvet.chargen.service.ChargenService;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.WordUtils;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;
import org.mockito.internal.util.reflection.Whitebox;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.result.ContentResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.junit.Assert.*;

public class ChargenControllerTest {

    @Mock
    private ChargenService chargenService;

    private MockMvc mockMvc;
    
    
    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        
        ChargenController controller = new ChargenController();

//        setInternalState(controller, chargenService);

        mockMvc = MockMvcBuilders.standaloneSetup(controller).build();
        
        int i;
    }

    /**
     * The declared service is added as state in the controller. It is done with reflection (Whitbox)
     */
    private void setInternalState(ChargenController controller, Object service) {
        setInternalState(controller, service, null);
    }

    private void setInternalState(ChargenController controller, Object service, String fieldName) {

        String fn = fieldName;

        if(StringUtils.isBlank(fieldName)) {
            fn = service.getClass().getSimpleName();
            fn = fn.substring(0, fn.indexOf("$"));
            fn = WordUtils.uncapitalize(fn);
        }
//            System.out.println("fieldName " +  fn);
        try {
            Whitebox.setInternalState(controller, fn, service);
        } catch(Exception e) {
            System.err.println("Cannot set field " + fieldName);
            e.printStackTrace();
        }
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }
    
    @Test
    public void testStatus() throws Exception {
         mockMvc.perform(get("/admin/status")).andExpect(MockMvcResultMatchers.content().json("\"Hello, World!\""));
        
    }
    
    
    
}