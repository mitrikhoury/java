package com.axsos.ProjectManger.Repositiory;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.axsos.ProjectManger.models.Project;
import com.axsos.ProjectManger.models.User;

@Repository
public interface ProjectRepository extends CrudRepository<Project, Long> {
    List<Project> findAll();
    List<Project> findByTeamMembersNotContains(User user);
    List<Project> findByTeamMembersContains(User user);
}