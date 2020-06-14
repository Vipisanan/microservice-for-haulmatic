package com.example.microserviceforhaulmatic.DTO;

public class RoleSpecificDTO {

    private String firstName;

    private String lastName;

    private String NICno;

    public RoleSpecificDTO() {
    }

    public RoleSpecificDTO(String firstName, String lastName, String NICno) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.NICno = NICno;
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
}
