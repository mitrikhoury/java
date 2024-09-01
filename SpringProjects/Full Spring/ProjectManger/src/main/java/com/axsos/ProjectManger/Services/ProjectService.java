package com.axsos.ProjectManger.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.axsos.ProjectManger.Repositiory.ProjectRepository;
import com.axsos.ProjectManger.models.Project;
import com.axsos.ProjectManger.models.User;


@Service
public class ProjectService {
    @Autowired
    private ProjectRepository projectRepo;

    public List<Project> allProjects() {
        return projectRepo.findAll();
    }

    public List<Project> unassignedProjects(User user) {
        return projectRepo.findByTeamMembersNotContains(user);
    }

    public List<Project> assignedProjects(User user) {
        return projectRepo.findByTeamMembersContains(user);
    }

    public Project createProject(Project project) {
        return projectRepo.save(project);
    }

    public Project findProject(Long id) {
        Optional<Project> optionalProject = projectRepo.findById(id);
        return optionalProject.isPresent() ? optionalProject.get() : null;
    }

    public Project updateProject(Project project) {
        return projectRepo.save(project);
    }

    public void deleteProject(Project project) {
        projectRepo.delete(project);
    }

    public void joinTeam(Project project, User user) {
        project.getTeamMembers().add(user);
        projectRepo.save(project);
    }

    public void leaveTeam(Project project, User user) {
        project.getTeamMembers().remove(user);
        projectRepo.save(project);
    }
}