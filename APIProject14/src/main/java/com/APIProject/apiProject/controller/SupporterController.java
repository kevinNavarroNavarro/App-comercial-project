//package com.APIProject.apiProject.controller;
//
//
//import com.APIProject.apiProject.converter.SupporterRestConverter;
//import com.APIProject.apiProject.domain.business.Supporter;
//import com.APIProject.apiProject.dto.SupporterDTO;
//import com.APIProject.apiProject.service.SupporterService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import javax.validation.Valid;
//import java.util.List;
//import java.util.stream.Collectors;
//
//@RestController
//@RequestMapping(path = "/supporters")
//@CrossOrigin
//public class SupporterController {
//
//    @Autowired
//    private SupporterService service;
//
//    @Autowired
//    private SupporterRestConverter converter;
//
//    @RequestMapping(path = "/{id}", method = RequestMethod.GET)
//    public SupporterDTO findById(
//            @PathVariable("id") String id) {
//        return converter.toResponse(service.find(Integer.parseInt(id)));
//    }
//
//    @RequestMapping(path = "/", method = RequestMethod.POST)
//    public SupporterDTO save(@Valid @RequestBody SupporterDTO.Request  supporterDTO) {
//        return converter.toResponse(service.save(converter.fromRequest(supporterDTO)));
//    }
//
//    @RequestMapping(path = "/{id}", method = RequestMethod.PUT)
//    public SupporterDTO update(@Valid @PathVariable("id") String id,
//                               @RequestBody SupporterDTO.Request  supporterDTO) {
//        Supporter toUpdate = converter.fromRequest(supporterDTO);
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
//    public List<SupporterDTO> findAll() {
//        return service.findAll().stream().map(it -> converter.toResponse(it))
//                .collect(Collectors.toList());
//    }
//
//
//}
