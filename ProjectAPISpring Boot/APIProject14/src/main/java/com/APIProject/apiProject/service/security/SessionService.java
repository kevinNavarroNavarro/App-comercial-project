package com.APIProject.apiProject.service.security;

import com.APIProject.apiProject.domain.business.Supervisor;
import com.APIProject.apiProject.domain.business.Supporter;
import com.APIProject.apiProject.domain.security.Role;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import static com.APIProject.apiProject.commons.Constants.JWT_ID;
import static com.APIProject.apiProject.commons.Constants.SECRET_KEY;

@Service
public class SessionService {

    //SessionService Supporter
    @Autowired
    private SupporterService userService;

    @Autowired
    private PasswordEncoder encoder;

    public boolean validateSupporter(String email, String password) {
        Optional<Supporter> user = userService.findByEmail(email);
        if (user.isPresent()) {
            return encoder.matches(password, user.get().getPassword());
        } else return false;
    }

    public String buildTokenSupporter(String username) {
        Supporter user = userService.findByEmail(username).get();

        List<GrantedAuthority> grantedAuthorities = AuthorityUtils
                .commaSeparatedStringToAuthorityList(user.getRoles().stream()
                        .map(Role::getRole).collect(Collectors.joining(",")));

        String token = Jwts
                .builder()
                .setId(JWT_ID)
                .setSubject(username)
                .claim("authorities",
                        grantedAuthorities.stream()
                                .map(GrantedAuthority::getAuthority)
                                .collect(Collectors.toList()))
                .setIssuedAt(new Date(System.currentTimeMillis()))
                .setExpiration(new Date(System.currentTimeMillis() + 3_600_000))//1 hour
                .signWith(SignatureAlgorithm.HS512,
                        SECRET_KEY.getBytes()).compact();

        return "Bearer " + token;

    }

    //SessionService Supporter
    @Autowired
    private SupervisorService SupervisorService;

    public boolean validateSupervisor(String email, String password) {
        Optional<Supervisor> user = SupervisorService.findByEmail(email);
        if (user.isPresent()) {
            return encoder.matches(password, user.get().getPassword());
        } else return false;
    }

    public String buildTokenSupervisor(String username) {
        Supervisor user = SupervisorService.findByEmail(username).get();

        List<GrantedAuthority> grantedAuthorities = AuthorityUtils
                .commaSeparatedStringToAuthorityList(user.getRoles().stream()
                        .map(Role::getRole).collect(Collectors.joining(",")));
        String token = Jwts
                .builder()
                .setId(JWT_ID)
                .setSubject(username)
                .claim("authorities",
                        grantedAuthorities.stream()
                                .map(GrantedAuthority::getAuthority)
                                .collect(Collectors.toList()))
                .setIssuedAt(new Date(System.currentTimeMillis()))
                .setExpiration(new Date(System.currentTimeMillis() + 3_600_000))//1 hour
                .signWith(SignatureAlgorithm.HS512,
                        SECRET_KEY.getBytes()).compact();

        return "Bearer " + token;

    }
}
