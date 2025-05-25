package ouammou.digital_banking.security;

import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
RequestMapping("/auth")
public class SecurityController {
        @GetMapping("/profile")
    public Authentication authentification(Authentication authentication) {
            return authentication;
        }
}
