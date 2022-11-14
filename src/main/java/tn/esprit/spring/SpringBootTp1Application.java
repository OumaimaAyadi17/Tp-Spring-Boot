package tn.esprit.spring;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import tn.esprit.spring.controller.ITeamMember;

@SpringBootApplication
public class SpringBootTp1Application {
private static final Logger logger = Logger.getLogger(SpringBootTp1Application.class);
public static void main(String[] args) throws Exception {
ApplicationContext applicationContext
=SpringApplication.run(SpringBootTp1Application.class, args);
ITeamMember bean1 = (ITeamMember)applicationContext.getBean("teamMember");
bean1.setName("Ali Ben Salah");
bean1.setRole("developer");
logger.debug("developper : " + bean1.getName());
logger.debug("Out of createScrumTeam() : ");
}
}