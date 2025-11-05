package com.busmove.api.enums;

public enum Role {
    ADMIN("ADMIN"),
    PASSAGEIRO("PASSAGEIRO"),
    EMPRESA("EMPRESA"),
    VEICULO("VEICULO");

    private final String role;

    Role(String role) {
        this.role = role;
    }

    public String getRole() {
        return role;
    }
}
