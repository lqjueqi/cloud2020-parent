package com.springboot.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * @author: Admin
 * @create: 2020/7/13 18:00
 */
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        //super.configure(http);
        http.formLogin()
                .usernameParameter("user")
                .passwordParameter("pwd")
                //自定义登陆处理
                .loginPage("/userlogin")
                .and()
                .authorizeRequests().antMatchers("/").permitAll()
                .antMatchers("/level1/**").hasRole("VIP1")
                .antMatchers("/level2/**").hasRole("VIP2")
                .antMatchers("/level3/**").hasRole("VIP3")
                .and()
                //注销
                .logout().logoutSuccessUrl("/")
                //添加记住我功能
                .and()
                .rememberMe().rememberMeParameter("remeber");
    }

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception{
//        auth.userDetailsService((username)-> {
//            return null;
//            //return new User();
//        }).passwordEncoder(passwordEncoder());
        auth.inMemoryAuthentication()
                .withUser("zs").password(passwordEncoder().encode("123")).roles("VIP1","VIP2")
                .and()
                .withUser("ls").password(passwordEncoder().encode("123")).roles("VIP2","VIP3")
                .and()
                .withUser("ww").password(passwordEncoder().encode("123")).roles("VIP1","VIP3");
    }
}
