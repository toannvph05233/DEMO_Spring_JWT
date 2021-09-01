package codegym.model;

import org.springframework.security.core.GrantedAuthority;

import java.util.Collection;


public class JwtResponse {
    private Long id;

    private String username;

    private String type = "Bearer";

    private String token;

    private Collection<? extends GrantedAuthority> roles;

    public JwtResponse(Long id, String username, String token, Collection<? extends GrantedAuthority> roles) {
        this.id = id;
        this.username = username;
        this.type = type;
        this.token = token;
        this.roles = roles;
    }

    public JwtResponse() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Collection<? extends GrantedAuthority> getRoles() {
        return roles;
    }

    public void setRoles(Collection<? extends GrantedAuthority> roles) {
        this.roles = roles;
    }
}
