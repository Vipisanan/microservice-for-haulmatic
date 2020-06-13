package com.example.microserviceforhaulmatic.service;

import com.example.microserviceforhaulmatic.DTO.RoleDTO;
import com.example.microserviceforhaulmatic.model.RoleModel;
import com.example.microserviceforhaulmatic.repository.RoleRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleService {
    private RoleRepository roleRepository;

    @Autowired
    public RoleService(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    public List<RoleModel> getAll() {
        List<RoleModel> roleModels = roleRepository.findAll();
        return roleModels;
    }

    public RoleModel addEmployer(RoleDTO roleDTO) {
        RoleModel roleModel = new RoleModel();
        BeanUtils.copyProperties(roleDTO , roleModel);
        return roleRepository.save(roleModel);
    }
}
