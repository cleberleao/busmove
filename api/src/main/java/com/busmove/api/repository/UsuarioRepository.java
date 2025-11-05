package com.busmove.api.repository;

import com.busmove.api.dto.response.UsuarioResponseDTO;
import com.busmove.api.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    Optional<Usuario> findByEmail(String email);

    boolean existsByEmail(String email);

    Optional<Usuario> findByEmailAndAtivo(String email, Boolean ativo);



}
