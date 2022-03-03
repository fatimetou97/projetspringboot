package com.projetspring.JubitWithMockito.Controller;

import static org.mockito.ArgumentMatchers.any;

import static org.mockito.Mockito.when;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.projetspring.Model.PersonneMorale;
import com.projetspring.Model.PersonnePhisique;
import com.projetspring.Model.Reference;
import com.projetspring.Repository.PersonnePhisiqueRepository;
import com.projetspring.controller.AppeloffreService;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;

import org.springframework.test.web.servlet.MockMvc;

import org.springframework.web.context.WebApplicationContext;

import java.util.*;


@SpringBootTest
@WebMvcTest(AppeloffreService.class)
public class AppelOffreControllerTest {
    @Autowired
    private MockMvc mockMvc;
    @Autowired
    private WebApplicationContext wc;

    @MockBean
    private AppeloffreService appeloffreService;
    PersonnePhisique ph;
    @Mock
    PersonnePhisiqueRepository personnePhisiqueRepository;
    private ArrayList<PersonnePhisique> ppList;
    private ArrayList<PersonnePhisique> ppListV;

     @BeforeEach
     void setUp() {

    this.ppList = new ArrayList<>();
    this.ppList.add(PersonnePhisique.builder()
            .nom("sidi")
            .prenom("mama")
            .adresse("ndb")
            .telephone("465646")
            .mail("sisi@gmail")
            .build());
    this.ppList.add(PersonnePhisique.builder()
            .nom("ali")
            .prenom("deda")
            .adresse("nktt")
            .telephone("676555")
            .mail("ali@gmail.com")
            .build());
    }
    @Test
    public void findAllppTest() throws Exception {
         when(appeloffreService.findAllPP()).thenReturn(ppListV);
        Assertions.assertEquals(ppListV, appeloffreService.findAllPP());
     }

    public static final Reference ref= Reference.builder()
            .objet("projet")
            .entite("gti")
            .datereference(new Date("2022/02/03"))
            .montant(4500)
            .build();

    public static final PersonnePhisique pp= PersonnePhisique.builder()

            .nom("sidi")
            .prenom("ali")
            .adresse("nktt")
            .telephone("65687")
            .mail("sidi@gmail.com")
            .build();
    ObjectMapper om = new ObjectMapper();

    @Test
    public void testSavePPMock(){
        AppeloffreService service = Mockito.mock(AppeloffreService.class);
        when(service.savePP(any(PersonnePhisique.class))).thenReturn(ph);
        Assertions.assertEquals(ph, service.savePP(ph));
    }
    @Test
    public void deletePPtest() throws  Exception{
        Mockito.when(appeloffreService.deletePP(1)).thenReturn(null);
        Assertions.assertEquals(HttpStatus.GONE,appeloffreService.deletePP(1));

    }
    @Test
    public void testSaveRefMock(){
        AppeloffreService service = Mockito.mock(AppeloffreService.class);
        when(service.saveR(any(Reference.class))).thenReturn(ref);
        Assertions.assertEquals(ref, service.saveR(ref));
    }



}
