package person.test;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import model.Address;
import model.Person;

@Path("personInfo")
public class PersonInfo {

	static final Logger logger = Logger.getLogger("LOG");

	@Inject
	private Person person;
	@Inject
	private Address address;

	@PostConstruct
	public void init() {
		this.person.setAddress(this.address);
		
		logger.log(Level.WARNING, "**************");
		logger.log(Level.WARNING, "PERSON initialized");
		logger.log(Level.WARNING, "**************");
	}
	
	@PreDestroy
	public void destroy() {
		logger.log(Level.WARNING, "**************");
		logger.log(Level.WARNING, "PERSON is ready to be destroy");
		logger.log(Level.WARNING, "**************");
	}

	@GET
	@Path("address")
	public String testAddres() {
		return person.toString() + "\n" + person.getAddress().toString();
	}

}
