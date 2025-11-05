package com.busmove.api.security;

import com.busmove.api.entity.Usuario;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;

public class SecurityUtils {

    public static Usuario getCurrentUser() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

        if (authentication != null && authentication.getPrincipal() instanceof UserDetails) {
            return (Usuario) authentication.getPrincipal();
        }

        throw new RuntimeException("Usuário não autenticado");
    }

    public static Long getCurrentUserId() {
        return getCurrentUser().getId();
    }

    public static String getCurrentUserEmail() {
        return getCurrentUser().getEmail();
    }

    public static String getCurrentUserRole() {
        return getCurrentUser().getRole().name();
    }

    public static Long getCurrentEmpresaId() {
        Usuario usuario = getCurrentUser();
        return usuario.getEmpresaId();
    }

    public static boolean hasRole(String role) {
        try {
            Usuario usuario = getCurrentUser();
            return usuario.getRole().name().equals(role);
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean isAdmin() {
        return hasRole("ADMIN");
    }

    public static boolean isPassageiro() {
        return hasRole("PASSAGEIRO");
    }

    public static boolean isEmpresa() {
        return hasRole("EMPRESA");
    }

    public static boolean isVeiculo() {
        return hasRole("VEICULO");
    }
}

