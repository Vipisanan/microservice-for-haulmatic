package com.example.microserviceforhaulmatic.controller;

import com.example.microserviceforhaulmatic.DTO.RoleDTO;
import com.example.microserviceforhaulmatic.DTO.RoleSpecificDTO;
import com.example.microserviceforhaulmatic.model.RoleModel;
import com.example.microserviceforhaulmatic.service.RoleService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/role")
@Api(value = "microservice", description = "Haulmatic microservice")

public class RolesController extends Exception {
    private RoleService roleService;

    @Autowired
    public RolesController(RoleService roleService) {
        this.roleService = roleService;
    }

    @ApiOperation(value = "View a list of employees")
    @GetMapping
    public List<RoleModel> getAll() {
        return roleService.getAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getById(@PathVariable String id) {
        RoleModel roleModel = roleService.getById(id);
        if (roleModel == null) {
            return new ResponseEntity<>("NO content", HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(roleModel, HttpStatus.OK);
        }
    }

    @PostMapping
    public RoleModel addEmployer(@Valid @RequestBody RoleDTO roleDTO) {
        return roleService.addEmployer(roleDTO);
    }

    @DeleteMapping("/{id}")
    public String deleteEmployerById(@PathVariable String id) {
        roleService.deleteEmployerById(id);
        return "deleted";
    }

    @PutMapping("/{id}")
    public RoleModel updateEmployer(@PathVariable String id, @RequestBody RoleDTO roleDTO) {
        return roleService.updateEmployer(id, roleDTO);
    }

    @ApiOperation(value = "Retrieve a role from the NIC no")
    @GetMapping("nic/{nic}")
    public RoleModel getByNic(@PathVariable String nic) {
        return roleService.getByNic(nic);
    }

    @ApiOperation(value = "A list of roles retrieve by the organization and the role type.")
    @GetMapping("/role-type/{roleType}/organization/{organization}")
    public RoleSpecificDTO getByRoleTypeAndOrganization(@PathVariable String roleType, @PathVariable String organization) {
        return roleService.getByRoleTypeAndOrganization(roleType, organization);
    }
}
