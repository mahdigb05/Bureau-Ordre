package com.bureau_ordre.bureau_ordre.Controlleurs;

import com.bureau_ordre.bureau_ordre.Beans.AuthenticationRequest;
import com.bureau_ordre.bureau_ordre.Beans.AuthenticationResponse;
import com.bureau_ordre.bureau_ordre.Beans.BoUserDetail;
import com.bureau_ordre.bureau_ordre.Gestionnaires.BoDetailService;
import com.bureau_ordre.bureau_ordre.Utils.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private BoDetailService boDetailService;
    @Autowired
    private JwtUtil jwtUtil;

    @PostMapping("/login")
    public ResponseEntity<?> createAuthenticationToken(@RequestBody AuthenticationRequest authenticationRequest) throws Exception {
        try{
            authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(authenticationRequest.getEmail(),authenticationRequest.getPassword())
            );

        }catch (BadCredentialsException e)
        {
            throw new Exception("incorect email or password",e);
        }
        System.out.println("ok");
        final BoUserDetail userDetail = boDetailService.loadUserByUsername(authenticationRequest.getEmail());
        final String jwt = jwtUtil.generateToken(userDetail);

        return ResponseEntity.ok(new AuthenticationResponse(jwt));

    }

}
