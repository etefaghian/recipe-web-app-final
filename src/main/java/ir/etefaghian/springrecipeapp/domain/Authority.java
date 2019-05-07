package ir.etefaghian.springrecipeapp.domain;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@Builder

public class Authority implements GrantedAuthority
{
    @Id
    @GeneratedValue
    private Long id;

    @ManyToMany(fetch = FetchType.LAZY,mappedBy = "authorities")
    private Set<User>users;

    @Column()
    private String authority;


    @Override
    public String getAuthority() {
        return authority;
    }

    public Authority(Long id,Set<User> users, String authority) {
        this.id = id;
        this.users = users;
        this.authority = authority;
    }
}
