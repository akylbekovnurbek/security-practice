package kg.itschool.security.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.Random;

@Configuration
    public class PasswordConfig {

        @Bean
        public PasswordEncoder encoder() {
            return new BCryptPasswordEncoder(10);
        }


        @Bean
        public String generatePassword(){
            return GenerateSecurePassword.generatePassword(10);
        }
    }
