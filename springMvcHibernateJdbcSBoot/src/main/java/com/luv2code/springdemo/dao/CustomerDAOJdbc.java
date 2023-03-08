package com.luv2code.springdemo.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.luv2code.springdemo.entity.Customer;

@Repository
public class CustomerDAOJdbc implements CustomerDAO {
	
	@Autowired
	DataSource dataSource;

	@Override
	public List<Customer> getCustomers() {
		
		System.out.println("PASO POR CustomerDAOJdbc");
		List<Customer> customers = new ArrayList<>();

		// create sql statement
		String sql = "select * from customer order by last_name";

		try (Connection myConn = dataSource.getConnection();
				Statement myStmt = myConn.createStatement();
				ResultSet myRs = myStmt.executeQuery(sql)) {

			// process result set
			while (myRs.next()) {

				// retrieve data from result set row
				int id = myRs.getInt("id");
				String firstName = myRs.getString("first_name");
				String lastName = myRs.getString("last_name");
				String email = myRs.getString("email");

				// create new student object
				Customer tempCustomer = new Customer(id, firstName, lastName, email);

				// add it to the list of students
				customers.add(tempCustomer);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return customers;
		
		
	}

	@Override
	public void saveCustomer(Customer theCustomer) {
		
	}

	@Override
	public Customer getCustomer(int theId) {
		return null;
	}

	@Override
	public void deleteCustomer(int theId) {
		
	}

}
