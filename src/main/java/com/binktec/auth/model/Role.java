package com.binktec.auth.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@SequenceGenerator(name="seq", initialValue=1, allocationSize=100)
@Table(name="role")
public class Role implements Serializable {
    @Transient
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "roleId")
    private int roleId;
    @Column(name = "role_name")
    private String roleName;

    public Role() {
    }

    public Role(String rolename) {
        this.roleName = rolename;
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String role) {
        this.roleName = role;
    }
}
