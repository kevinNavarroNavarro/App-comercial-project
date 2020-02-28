package com.APIProject.apiProject.controller.security;

import com.APIProject.apiProject.dto.SupervisorDTO;
import com.APIProject.apiProject.dto.SupporterDTO;
import com.APIProject.apiProject.dto.security.LoginDTO;
import com.APIProject.apiProject.exceptions.security.InvalidCredentialsException;
import com.APIProject.apiProject.service.security.SessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class SessionController {

    @Autowired
    private SessionService sessionService;

    @RequestMapping(method = RequestMethod.POST, path = "/api/loginSupporter")
    public SupporterDTO.Response loginSupporter(@RequestBody LoginDTO user) {
        if (sessionService.validateSupporter(user.getUserName(), user.getPassword())) {
            String token = sessionService.buildTokenSupporter(user.getUserName());
            SupporterDTO.Response result = new SupporterDTO.Response();
            result.setEmail(user.getUserName());
            result.setToken(token);
            return result;
        }
        throw new InvalidCredentialsException();
    }

    @RequestMapping(method = RequestMethod.POST, path = "/api/loginSupervisor")
    public SupervisorDTO.Response loginSupervisor(@RequestBody LoginDTO user) {
        if (sessionService.validateSupporter(user.getUserName(), user.getPassword())) {
            String token = sessionService.buildTokenSupervisor(user.getUserName());
            SupervisorDTO.Response result = new SupervisorDTO.Response();
            result.setEmail(user.getUserName());
            result.setToken(token);
            return result;
        }
        throw new InvalidCredentialsException();
    }
}