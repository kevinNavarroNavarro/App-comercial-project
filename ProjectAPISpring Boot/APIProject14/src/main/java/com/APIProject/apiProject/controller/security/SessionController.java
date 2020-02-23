package com.APIProject.apiProject.controller.security;

import com.APIProject.apiProject.dto.security.LoginDTO;
import com.APIProject.apiProject.dto.security.RegisterUserDTO;
import com.APIProject.apiProject.dto.security.UserDTO;
import com.APIProject.apiProject.exceptions.security.InvalidCredentialsException;
import com.APIProject.apiProject.service.security.SessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class SessionController {

    @Autowired
    private SessionService sessionService;

    @RequestMapping(method = RequestMethod.POST, path = "/api/login")
    public UserDTO login(@RequestBody LoginDTO user) {

        if (sessionService.validateUser(user.getUserName(), user.getPassword())) {
            String token = sessionService.buildToken(user.getUserName());
            UserDTO result = new UserDTO();
            result.setUser(user.getUserName());
            result.setToken(token);
            return result;
        }
        throw new InvalidCredentialsException();

    }

    @RequestMapping(method = RequestMethod.POST, path = "/api/register")
    public void register(@RequestBody RegisterUserDTO register) {
        sessionService.createUser(register);
    }
}