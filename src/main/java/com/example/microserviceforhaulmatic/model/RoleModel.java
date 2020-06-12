package com.example.microserviceforhaulmatic.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("Role")
public class RoleModel {
    @Id
    private String id;

    @Indexed(name = "organization")
    private String organization;

    @Indexed(name = "firstName")
    private String firstName;

    @Indexed(name = "lastName")
    private String lastName;

    @Indexed(name = "NICno")
    private int NICno;

    @Indexed(name = "roleType")
    private String roleType;

    public RoleModel() {
    }

    public RoleModel(String id, String organization, String firstName, String lastName, int NICno, String roleType) {
        this.id = id;
        this.organization = organization;
        this.firstName = firstName;
        this.lastName = lastName;
        this.NICno = NICno;
        this.roleType = roleType;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public int getNICno() {
        return NICno;
    }

    public void setNICno(int NICno) {
        this.NICno = NICno;
    }

    public String getRoleType() {
        return roleType;
    }

    public void setRoleType(String roleType) {
        this.roleType = roleType;
    }
}
