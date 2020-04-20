package com.cg.flight.dao;

import java.time.LocalDate;
import java.util.List;

import com.cg.flight.entity.Booking;
import com.cg.flight.entity.Passenger;
import com.cg.flight.entity.ScheduledFlight;
import com.cg.flight.entity.User;

public interface FlightDao {

	public boolean addUser(User user);
	public boolean editUser(User user);
	public User viewUser(long userId);
	
	public boolean addFlightSchedule(ScheduledFlight schedule);
	public boolean editFlightSchedule(ScheduledFlight schedule);
	public ScheduledFlight viewFlightSchedule(int scheduleId);
	public List<ScheduledFlight> getFlightSchedule(String src, String dest);
	
	public boolean addBooking(Booking booking);
	public Booking viewBooking(String bookId);
	public List<Booking> viewBookingBySchedule(String scheduleId);
	public List<Booking> viewBookingByContact(long contact);
	
	public boolean addPassenger(Passenger passenger);
	public List<Passenger> viewPassengers(String bookId);
	public boolean deleteBooking(Booking booking);
	public boolean deletePassenger(String bookingId);
	public int countBookingForSchedule(int scheduleId);
	public int countMaxSchedule();
	
}
