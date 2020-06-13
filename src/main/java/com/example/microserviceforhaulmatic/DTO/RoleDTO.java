package com.example.microserviceforhaulmatic.DTO;

import org.springframework.data.mongodb.core.index.Indexed;

public class RoleDTO {

    private String organization;

    private String firstName;

    private String lastName;

    private String NICno;

    private String roleType;

    public RoleDTO() {
    }

    public RoleDTO(String organization, String firstName, String lastName, String NICno, String roleType) {
        this.organization = organization;
        this.firstName = firstName;
        this.lastName = lastName;
        this.NICno = NICno;
        this.roleType = roleType;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNICno() {
        return NICno;
    }

    public void setNICno(String NICno) {
        this.NICno = NICno;
    }

    public String getRoleType() {
        return roleType;
    }

    public void setRoleType(String roleType) {
        this.roleType = roleType;
    }
}
