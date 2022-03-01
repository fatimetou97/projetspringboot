package com.projetspring.controller;

import com.projetspring.Model.AppelOffre;
import com.projetspring.Model.PersonneMorale;
import com.projetspring.Model.PersonnePhisique;
import com.projetspring.Model.Reference;
import com.projetspring.Repository.AppelOffreRepository;
import com.projetspring.Repository.PersonneMoraleRepository;
import com.projetspring.Repository.PersonnePhisiqueRepository;
import com.projetspring.Repository.ReferenceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class AppeloffreService {
    @Autowired
    private PersonnePhisiqueRepository personnePhisiqueRepository;
    @Autowired
    private PersonneMoraleRepository personneMoraleRepository;
    @Autowired
    private ReferenceRepository referenceRepository;
    @Autowired
    private AppelOffreRepository appelOffreRepository;

    @GetMapping("/getpersonnePH/{id}")
    public ResponseEntity<PersonnePhisique> getpersonneph(@PathVariable Integer id){
        try {
            PersonnePhisique ph = new PersonnePhisique();
            ph=personnePhisiqueRepository.findById(id).get();
            return new ResponseEntity<>(ph,HttpStatus.FOUND);
        }
        catch (Exception e){
            return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/updatePP/{id}")
    public ResponseEntity<Object> updatePH(@RequestBody PersonnePhisique ph, @PathVariable Integer id) {

        Optional<PersonnePhisique> phOptional = personnePhisiqueRepository.findById(id);
        try {
            ph.setId(id);
            personnePhisiqueRepository.save(ph);
            return new ResponseEntity<>(ph,HttpStatus.ACCEPTED);
        }
        catch (Exception e){
            return new ResponseEntity<>(null,HttpStatus.NOT_MODIFIED);

        }
    }
    @DeleteMapping("/deleteRef/{id}")
    public ResponseEntity<HttpStatus> deleteTutorial(@PathVariable("id") Integer id) {
        try {
            referenceRepository.deleteById(id);
            return new ResponseEntity<>(null,HttpStatus.GONE);
        } catch (Exception e) {
            return new ResponseEntity<>(null,HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @GetMapping("/getRef/{id}")
    public ResponseEntity<Reference> getRef(@PathVariable Integer id){
        try {
            Reference ref=new Reference();
            ref=referenceRepository.findById(id).get();
            return new ResponseEntity<>(ref,HttpStatus.FOUND);
        }
        catch (Exception e){
            return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
        }
    }
    @PutMapping("/updateRef/{id}")
    public ResponseEntity<Object> updatePH(@RequestBody Reference ref, @PathVariable Integer id) {

        Optional<Reference> phOptional = referenceRepository.findById(id);
        try {
            ref.setId(id);
            referenceRepository.save(ref);
            return new ResponseEntity<>(ref, HttpStatus.ACCEPTED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.NOT_MODIFIED);

        }
    }
    @GetMapping("/getAppelOffre/{id}")
    public ResponseEntity<AppelOffre> getAppelOffre(@PathVariable Integer id){
        try {
            AppelOffre ao=new AppelOffre();
            ao=appelOffreRepository.findById(id).get();
            return new ResponseEntity<>(ao,HttpStatus.FOUND);
        }
        catch (Exception e){
            return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
        }
    }
    @PostMapping("/saveAO")
    public AppelOffre saveAO(@RequestBody AppelOffre ao){
        return appelOffreRepository.save(ao);
    }
    @PutMapping("/updateAO/{id}")
    public ResponseEntity<Object> updatePH(@RequestBody AppelOffre ao, @PathVariable Integer id) {

        Optional<Reference> phOptional = referenceRepository.findById(id);
        try {
            ao.setId(id);
            appelOffreRepository.save(ao);
            return new ResponseEntity<>(ao, HttpStatus.ACCEPTED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.NOT_MODIFIED);

        }
    }
    @GetMapping("/findAllAO")
    public List<AppelOffre> findAllAO(){
        return appelOffreRepository.findAll();
    }
    @DeleteMapping("/deleteAO/{id}")
    public ResponseEntity<HttpStatus> deleteAO(@PathVariable("id") Integer id) {
        try {
            appelOffreRepository.deleteById(id);
            return new ResponseEntity<>(null,HttpStatus.GONE);
        } catch (Exception e) {
            return new ResponseEntity<>(null,HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @PostMapping("/savePP")
    public PersonnePhisique placeRef(@RequestBody PersonnePhisique pp) {
        return personnePhisiqueRepository.save(pp);
    }
    @GetMapping("/findAllPP")
    public List<PersonnePhisique> findAllPP(){
        return personnePhisiqueRepository.findAll();
    }
    @DeleteMapping("/deletePP/{id}")
    public ResponseEntity<HttpStatus> deletePP(@PathVariable("id") Integer id) {
        try {
            personnePhisiqueRepository.deleteById(id);
            return new ResponseEntity<>(null,HttpStatus.GONE);
        } catch (Exception e) {
            return new ResponseEntity<>(null,HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @PostMapping("/saveRef")
    public Reference saveR(@RequestBody Reference reference){
        return referenceRepository.save(reference);
    }

    @GetMapping("/findAllRef")
    public List<Reference> findAllRef(){
        return referenceRepository.findAll();
    }

    @GetMapping("/findAllPM")
    public List<PersonneMorale> findAllPM(){
        return personneMoraleRepository.findAll();
    }

    @DeleteMapping("/deletePM/{id}")
    public ResponseEntity<HttpStatus> deletePM(@PathVariable("id") Integer id) {
        try {
            personneMoraleRepository.deleteById(id);
            return new ResponseEntity<>(null,HttpStatus.GONE);
        } catch (Exception e) {
            return new ResponseEntity<>(null,HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @PostMapping("/savePM")
    public PersonneMorale savepm(@RequestBody PersonneMorale personneMorale){
        return personneMoraleRepository.save(personneMorale);
    }
    @PutMapping("/updatePM/{id}")
    public ResponseEntity<Object> updatePH(@RequestBody PersonneMorale pm, @PathVariable Integer id) {

        Optional<PersonneMorale> phOptional = personneMoraleRepository.findById(id);
        try {
            pm.setId(id);
            personneMoraleRepository.save(pm);
            return new ResponseEntity<>(pm, HttpStatus.ACCEPTED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.NOT_MODIFIED);

        }
    }
    @GetMapping("/getPM/{id}")
    public ResponseEntity<PersonneMorale> getpersonnepm(@PathVariable Integer id){
        try {
            PersonneMorale pm = new PersonneMorale();
            pm=personneMoraleRepository.findById(id).get();
            return new ResponseEntity<>(pm,HttpStatus.FOUND);
        }
        catch (Exception e){
            return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
        }
    }
}
