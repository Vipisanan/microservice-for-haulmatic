package com.example.microserviceforhaulmatic.repository;

import com.example.microserviceforhaulmatic.model.RoleModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends MongoRepository<RoleModel , String> {
    RoleModel findFirstById(String id);
    RoleModel findFirstByNICno(String id);
    RoleModel findFirstByRoleTypeAndOrganization(String roleType , String organization);
}
