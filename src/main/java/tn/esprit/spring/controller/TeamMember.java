package tn.esprit.spring.controller;

import org.springframework.stereotype.Controller;

@Controller
public class TeamMember implements ITeamMember {
private String role = "po1";
private String name ="nom1";
private int nbYearExperence;

public String getRole() {return role;}
public void setRole(String role) {this.role = role;}
public String getName() {return name;}
public void setName(String name) {
this.name = name;
}
public int getNbYearExperence() {
return nbYearExperence;
}
public void setNbYearExperence(int nbYearExperence) {
this.nbYearExperence = nbYearExperence;
}
@Override
public String[] getMemberDetails() {
return null;
}
}
