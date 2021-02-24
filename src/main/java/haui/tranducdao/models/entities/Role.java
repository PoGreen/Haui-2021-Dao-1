package haui.tranducdao.models.entities;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity(name = "role")
public class Role extends  BaseEntity {

    @Column(name = "roleName")
    private String roleName;

    @Column(name = "roleCode")
    private String roleCode;

    @ManyToMany
    @JoinTable(name = "permission",joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set< User> users = new HashSet<>();

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleCode() {
        return roleCode;
    }

    public void setRoleCode(String roleCode) {
        this.roleCode = roleCode;
    }

    public Set< User> getUsers() {
        return users;
    }

    public void setUsers(Set< User> users) {
        this.users = users;
    }
}
