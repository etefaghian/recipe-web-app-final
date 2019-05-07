package ir.etefaghian.springrecipeapp.configuration;

import ir.etefaghian.springrecipeapp.services.CustomUserDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.core.token.TokenService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.jwt.Jwt;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.oauth2.common.OAuth2RefreshToken;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.oauth2.provider.token.AccessTokenConverter;
import org.springframework.security.oauth2.provider.token.DefaultTokenServices;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.oauth2.provider.token.store.InMemoryTokenStore;
import org.springframework.security.oauth2.provider.token.store.JwtAccessTokenConverter;
import org.springframework.security.oauth2.provider.token.store.JwtTokenStore;

import java.util.Collection;

@Configuration
public class AppConfiguration {


    @Autowired
    CustomUserDetailService  userDetailService;

    @Bean
    public PasswordEncoder passwordEncoder()
    {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public JwtAccessTokenConverter accessTokenConverter()
    {
        JwtAccessTokenConverter accessTokenConverter = new JwtAccessTokenConverter();
        accessTokenConverter.setSigningKey("123");
        return  accessTokenConverter;
    }

    @Bean
    public JwtTokenStore jwtTokenStore(JwtAccessTokenConverter accessTokenConverter)
    {
        return new JwtTokenStore(accessTokenConverter);
    }

    @Bean
    public TokenStore inMemoryTokenStore()
    {
        return new InMemoryTokenStore();
    }


    @Bean
    public DefaultTokenServices JwtTokenService(TokenStore jwtTokenStore)
    {
        DefaultTokenServices defaultTokenServices = new DefaultTokenServices();
        defaultTokenServices.setTokenStore(jwtTokenStore);
        defaultTokenServices.setSupportRefreshToken(true);
        return  defaultTokenServices;
    }

   /* @Bean
    public AuthenticationManager authenticationManager(AuthenticationManagerBuilder authenticationManagerBuilder) throws Exception {
        authenticationManagerBuilder.userDetailsService(userDetailService);
        return  authenticationManagerBuilder.build();
    }
    */


    @Bean
    @Primary
    public AuthenticationManager inMemoryAuthenticationManager(AuthenticationManagerBuilder authenticationManagerBuilder) throws Exception {
        authenticationManagerBuilder.userDetailsService(userDetailService);
        return  authenticationManagerBuilder.build();
    }



}
