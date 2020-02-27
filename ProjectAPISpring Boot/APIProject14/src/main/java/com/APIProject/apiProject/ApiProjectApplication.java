package com.APIProject.apiProject;

import com.APIProject.apiProject.api.IssueClientService;
import com.APIProject.apiProject.configuration.AppConfig;
import com.APIProject.apiProject.exceptions.APIProjectException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class ApiProjectApplication {

	private static final Long INVALID_DRIVER_ID = -1L;

	public static void main(String[] args) {
		SpringApplication.run(ApiProjectApplication.class, args);

		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

		IssueClientService client = applicationContext.getBean(IssueClientService.class);
//
		try {
			print("Getting all Issues:");
			client.finAll().forEach(ApiProjectApplication::print);
//
////			print("Getting Invalid:");
////			gettingInvalidIssue(client);
////
////			print("Adding a new Driver:");
////
////			Driver driver = client.add(newDriver());
////			print("Driver added: " + driver);
////
////			print("Deleting driver with id:" + driver.getId());
////			client.delete(driver.getId());
////			print("Getting deleted driver:" + driver.getId());
////
////			client.findById(driver.getId());


		} catch (
	APIProjectException ex) {
			print(ex.getDetails().getMessage());
		}


		applicationContext.close();
	}

//	private static void gettingInvalidDriver(DriverClientService client) {
//		try {
//			client.findById(INVALID_DRIVER_ID);
//		} catch (FuelControlException ex) {
//			print("Invalid Driver: " + ex.getDetails());
//		}
//	}

	private static void print(Object s) {
		System.out.println(s.toString());
	}
}
