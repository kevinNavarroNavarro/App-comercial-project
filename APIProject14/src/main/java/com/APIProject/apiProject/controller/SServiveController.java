//package com.APIProject.apiProject.controller;
//
//
//import com.APIProject.apiProject.converter.SServiveRestConverter;
//import com.APIProject.apiProject.domain.business.Notes;
//import com.APIProject.apiProject.domain.business.SServive;
//import com.APIProject.apiProject.dto.NotesDTO;
//import com.APIProject.apiProject.dto.SServiveDTO;
//import com.APIProject.apiProject.service.SServiveService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import javax.validation.Valid;
//import java.util.List;
//import java.util.stream.Collectors;
//
//@RestController
//@RequestMapping(path = "/sServive")
//@CrossOrigin
//public class SServiveController {
//
//    @Autowired
//    private SServiveService service;
//
//    @Autowired
//    private SServiveRestConverter converter;
//
//
//    @RequestMapping(path = "/{id}", method = RequestMethod.GET)
//    public SServiveDTO findById(
//            @PathVariable ("id") String id) {
//        return converter.toResponse(service.find(Integer.parseInt(id)));
//    }
//
//    @RequestMapping(path = "/", method = RequestMethod.POST)
//    public SServiveDTO save(@Valid @RequestBody SServiveDTO.Request sServiveDTO) {
//        return converter.toResponse(service.save(converter.fromRequest(sServiveDTO)));
//    }
//
//    @RequestMapping(path = "/{id}", method = RequestMethod.PUT)
//    public SServiveDTO update(@Valid @PathVariable("id") String id,
//                              @RequestBody SServiveDTO.Request  sServiveDTO) {
//        SServive toUpdate = converter.fromRequest(sServiveDTO);
//        toUpdate.setId(Integer.parseInt(id));
//        return converter.toResponse(service.update(toUpdate));
//    }
//
//    @RequestMapping(path = "/{id}", method = RequestMethod.DELETE)
//    public void delete(@PathVariable("id") String id) {
//        service.delete(Integer.parseInt(id));
//    }
//
//    @RequestMapping(path = "/", method = RequestMethod.GET)
//    public List<SServiveDTO> findAll() {
//        return service.findAll().stream().map(it -> converter.toResponse(it))
//                .collect(Collectors.toList());
//    }
//
//}
