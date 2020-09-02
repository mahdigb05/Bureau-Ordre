package com.bureau_ordre.bureau_ordre.Beans;


import com.sun.istack.NotNull;
import org.springframework.lang.NonNull;
import javax.persistence.*;

@Entity
public class Utilisateur extends Personne {

    @NonNull
    @Column(nullable = false)
    private Role role;
    @NotNull
    @Column(nullable = false)
    private String password;
    @Column(columnDefinition =" tinyint(1) default 1")
    private boolean active;

    public Utilisateur() {
    }

    public Utilisateur(String nom, String prenom, String tel, String email, long matricule, @NonNull Role role, String password) {
        super(nom, prenom, tel, email, matricule);
        this.role = role;

        this.password = password;

    }

    public boolean isActive() {
        return active;
    }

    @NonNull
    public Role getRole() {
        return role;
    }

    public void setRole(@NonNull Role role) {
        this.role = role;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
