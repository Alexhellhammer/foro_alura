package com.proyectAlex.Challenge_Foro_Alura.security;

import com.proyectAlex.Challenge_Foro_Alura.models.Usuario;
import com.proyectAlex.Challenge_Foro_Alura.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.User.UserBuilder;
import org.springframework.stereotype.Service;

import java.util.Collections;

@Service
@Primary
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UsuarioRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Usuario usuario = userRepository.findByEmail(email)
                .orElseThrow(() -> new UsernameNotFoundException("Usuario no encontrado con email: " + email));

        UserBuilder userBuilder = User.withUsername(usuario.getEmail());
        userBuilder.password(usuario.getPassword());
        userBuilder.authorities(Collections.emptyList());
        return userBuilder.build();
    }
}
