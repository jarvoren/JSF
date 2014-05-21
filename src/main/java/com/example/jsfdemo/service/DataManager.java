package com.example.jsfdemo.service;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;


import com.example.jsfdemo.domain.Service;
import com.example.jsfdemo.domain.User;

@ManagedBean
@ApplicationScoped
public class DataManager {


	
	private List<User> userDb = new ArrayList<User>();
	private List<Service> serviceDb = new ArrayList<Service>();

	public DataManager()
	{
		
		User[] z = new User[] {new User()};
		z[0].setPassword("a");
		z[0].setName("admin");
		z[0].setAdmin(true);
		z[0].setSurname("admin");
		userDb.add(z[0]);
		
	}
	
	public String addUser(String name, String surname , String password, boolean isAdmin){
		
		User jakis = new User();
		jakis.setName(name);
		jakis.setPassword(password);
		jakis.setSurname(surname);
		jakis.setAdmin(isAdmin);
		userDb.add(jakis);
		return "home?faces-redirect=true";
		
	}
	public void addService( Service service){serviceDb.add(service);}
	public List<User> getUserDb() {
		return userDb;
	}
	public List<Service> getServiceDb() {
		return serviceDb;
	}
	public String CheckLogin(User user)
	{
		for(User u: userDb)
		{
			if(user.getName().equals(u.getName()) && user.getPassword().equals(u.getPassword()))
			{
				user.setLogedIn(true);
				if(u.isAdmin()){user.setAdmin(true);}
			}
		}
		return "index.jsp";
		
	}

	
	
}
