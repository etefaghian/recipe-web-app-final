package ir.etefaghian.springrecipeapp.domain;



import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Collection;
import java.util.Date;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@Builder
public class User implements UserDetails {
    public User(Long id,String firstName, String lastName, Date dateCreated, String username, String password, Set<Authority> authorities) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateCreated = dateCreated;
        this.username = username;
        this.password = password;
        this.authorities = authorities;
    }

    @Id
    @GeneratedValue
    private Long id;
    private String firstName;
    private String lastName;
    @Temporal(value = TemporalType.DATE)
    @Column(updatable =  false)
    private Date dateCreated;


    private String username;
    private String password;

    @ManyToMany(cascade =  CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(joinColumns = @JoinColumn(name = "user"),inverseJoinColumns = @JoinColumn(name = "authority") ,name = "authority_user")

    private Set<Authority> authorities;





    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
