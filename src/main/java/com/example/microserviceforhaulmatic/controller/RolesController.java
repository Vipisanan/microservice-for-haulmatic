package com.example.microserviceforhaulmatic.controller;

import com.example.microserviceforhaulmatic.DTO.RoleDTO;
import com.example.microserviceforhaulmatic.model.RoleModel;
import com.example.microserviceforhaulmatic.service.RoleService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/role")
@Api(value = "microservice", description = "Haulmatic microservice")

public class RolesController {
    private RoleService roleService;

    @Autowired
    public RolesController(RoleService roleService) {
        this.roleService = roleService;
    }

    @ApiOperation(value = "View a list of employees", response = Iterable.class)
    @GetMapping
    public List<RoleModel> getAll() {
        return roleService.getAll();
    }

    @GetMapping("/{id}")
    public RoleModel getById(@PathVariable String id){
        return roleService.getById(id);
    }

    @PostMapping
    public RoleModel addEmployer(@RequestBody RoleDTO roleDTO) {
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
}
