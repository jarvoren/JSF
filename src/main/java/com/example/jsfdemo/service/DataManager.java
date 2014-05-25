package com.example.jsfdemo.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;






import com.example.jsfdemo.domain.Reservation;
import com.example.jsfdemo.domain.Service;
import com.example.jsfdemo.domain.User;

@ManagedBean
@ApplicationScoped
public class DataManager {


	
	public List<User> userDb = new ArrayList<User>();
	public List<Service> serviceDb = new ArrayList<Service>();
	
	public String reserve(Service s ,Date data , User uzytkownik){
		for(Service serv : serviceDb){
			
			if(s.equals(serv)){
				
				Reservation r = new Reservation();
				r.d=data;
				r.u=uzytkownik;
				r.n=serv.getName();
				serv.reservationList.add(r);
				return "listReservations?faces-redirect=true";
			}
		}
		return "listReservations?faces-redirect=true";
		
	}
	
	public User pobierzPoName(String Name){
		for(User u : userDb){
			if(u.getName() == Name){return u;}
		}
		return new User();
	}
	public List<Reservation> getUserReservations(User uzytkownik){
		List<Reservation> res = new ArrayList<Reservation>();
		for(Service s : serviceDb){
			for(Reservation r: s.reservationList){
				if(r.u.getName().equals(uzytkownik.getName())){
					res.add(r);
				}
			}
		}
		return res;
		
		
	}
	public List<Service> allReservations(){return serviceDb;}
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
	public String saveService(String serviceName){
		Service usluga = new Service();
		usluga.setName(serviceName);
		addService(usluga);
		return "home?faces-redirect=true";
	}
	public void addService( Service service){serviceDb.add(service);}
	public List<User> getUserDb() {
		return userDb;
	}
	public List<Service> getserviceDb() {
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
