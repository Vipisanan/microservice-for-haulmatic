package com.example.microserviceforhaulmatic.service;

import com.example.microserviceforhaulmatic.DTO.RoleDTO;
import com.example.microserviceforhaulmatic.model.RoleModel;
import com.example.microserviceforhaulmatic.repository.RoleRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    public void deleteEmployerById(String id) {
        roleRepository.deleteById(id);
    }

    public RoleModel updateEmployer(String id, RoleDTO roleDTO) {
        RoleModel roleModel;
        roleModel = roleRepository.findFirstById(id);
        BeanUtils.copyProperties(roleDTO , roleModel);
        return roleRepository.save(roleModel);
    }

    public RoleModel getById(String id) {
        return roleRepository.findFirstById(id);
    }

    public RoleModel getByNic(String nic) {
        return roleRepository.findFirstByNICno(nic);
    }

    public RoleModel getByRoleTypeAndOrganization(String roleType, String organization) {
        return roleRepository.findFirstByRoleTypeAndOrganization(roleType ,organization);
    }
}
