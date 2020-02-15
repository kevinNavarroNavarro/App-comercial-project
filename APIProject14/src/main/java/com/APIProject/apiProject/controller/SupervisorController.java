//package com.APIProject.apiProject.controller;
//
//
//import com.APIProject.apiProject.converter.SupervisorRestConverter;
//import com.APIProject.apiProject.domain.business.Supervisor;
//import com.APIProject.apiProject.dto.SupervisorDTO;
//import com.APIProject.apiProject.dto.SupporterDTO;
//import com.APIProject.apiProject.service.SupervisorService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//import javax.validation.Valid;
//import java.util.List;
//import java.util.stream.Collectors;
//
//@RestController
//@RequestMapping(path = "/supervisors")
//@CrossOrigin
//public class SupervisorController {
//
//    @Autowired
//    private SupervisorService service;
//
//    @Autowired
//    private SupervisorRestConverter converter;
//
//    @RequestMapping(path = "/{id}", method = RequestMethod.GET)
//    public SupervisorDTO findById(
//            @PathVariable("id") String id) {
//        return converter.toResponse(service.find(Integer.parseInt(id)));
//    }
//
//    @RequestMapping(path = "/", method = RequestMethod.POST)
//    public SupervisorDTO save(@Valid @RequestBody SupervisorDTO.Request  supervisor) {
//        return converter.toResponse(service.save(converter.fromRequest(supervisor)));
//    }
//
//    @RequestMapping(path = "/{id}", method = RequestMethod.PUT)
//    public SupervisorDTO update(@Valid @PathVariable("id") String id,
//                                @RequestBody SupervisorDTO.Request  supervisor) {
//        Supervisor toUpdate = converter.fromRequest(supervisor);
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
//    public List<SupervisorDTO> findAll() {
//        return service.findAll().stream().map(it -> converter.toResponse(it))
//                .collect(Collectors.toList());
//    }
//
//
//}
