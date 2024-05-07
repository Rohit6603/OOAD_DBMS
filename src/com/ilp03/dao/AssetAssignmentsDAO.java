package com.ilp03.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import com.ilp03.entity.AssetAssignments;
import com.ilp03.entity.Assets;
import com.ilp03.entity.Employees;
import com.ilp03.entity.Locations;
import com.ilp03.entity.Statuses;

public class AssetAssignmentsDAO {

	public static Connection getConnection() {
		String connectionString = "jdbc:mysql://localhost:3306/asset_tracking?useSSL=false";
		String userName = "root";
		String password = "Ro6603hit@123!";
		Connection connection = null;

		try {
			connection = DriverManager.getConnection(connectionString, userName, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return connection;

	}

	public static void closeConnection(Connection connection) {
		try {
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static ArrayList<AssetAssignments> getAssignmentDetailsBasedOnId(Connection connection,
			String inputAssetId) {
		Scanner scanner = new Scanner(System.in);
		PreparedStatement statement = null;
		ArrayList<AssetAssignments> assignmentList = new ArrayList<AssetAssignments>();
		try {
			String query = " select assets.asset_id as 'Asset ID',assets.asset_name as 'Asset Name',\r\n"
					+ "  assets.asset_description as 'Asset Description',assets.asset_type as 'Asset Type',\r\n"
					+ "  assets.purchase_date as 'Purchase Date',assets.purchase_price as 'Purchase Price',\r\n"
					+ "  empcb.emp_firstname as 'Created By (First Name)',empcb.emp_lastname as 'Created by (Last Name)',\r\n"
					+ "  empub.emp_firstname as 'Updated by (First name)',empub.emp_lastname as 'Updated by (Last name)',\r\n"
					+ "  asset_assignments.createdon as 'Entry creation date',asset_assignments.updatedon as 'Entry updation date',\r\n"
					+ "  asset_assignments.assignment_id as 'Assignment ID',emp.emp_firstname as 'Assigned to (First name)',\r\n"
					+ "  emp.emp_lastname as 'Assigned to (Last name)',asset_assignments.assigned_date as 'Assigned Date',\r\n"
					+ "  asset_assignments.return_date as 'Return Date',emp.emp_id as 'Employee ID',\r\n"
					+ "  emp.email as 'Employee Email',emp.sex as 'Employee Gender',statuses.status_name\r\n"
					+ "   as 'Asset Status',statuses.status_description as 'Status Description',\r\n"
					+ "   locations.location_name as 'Asset Location',locations.location_description as \r\n"
					+ "   'Location Description' from assets inner join asset_assignments on \r\n"
					+ "assets.asset_id = asset_assignments.asset_id inner join\r\n"
					+ " employees as emp on asset_assignments.assigned_to = \r\n" + " emp.emp_id inner join\r\n"
					+ " employees as empcb on asset_assignments.createdby = \r\n"
					+ " empcb.emp_id inner join employees as empub on \r\n"
					+ " asset_assignments.updatedby = empub.emp_id \r\n" + " inner join\r\n"
					+ " statuses on statuses.\r\n" + " status_id = assets.status_id inner join locations on\r\n"
					+ "  locations.location_id = assets.location_id where assets.asset_id = ?";
			statement = connection.prepareStatement(query);
			statement.setString(1, inputAssetId);
			ResultSet resultSet = statement.executeQuery();
			while (resultSet.next()) {
				String assetId = resultSet.getString(1);
				String assetName = resultSet.getString(2);
				String assetDescription = resultSet.getString(3);
				String assetType = resultSet.getString(4);
				Date purchaseDate = resultSet.getDate(5);
				float purchasePrice = resultSet.getFloat(6);
				String createdByFirstName = resultSet.getString(7);
				String createdByLastName = resultSet.getString(8);
				String updatedByFirstName = resultSet.getString(9);
				String updatedByLastName = resultSet.getString(10);
				Date createdOn = resultSet.getDate(11);
				Date updatedOn = resultSet.getDate(12);
				String assignmnetId = resultSet.getString(13);
				String assignedToFirstName = resultSet.getString(14);
				String assignedToLastName = resultSet.getString(15);
				Date assignedDate = resultSet.getDate(16);
				Date returnDate = resultSet.getDate(17);
				String empId = resultSet.getString(18);
				String email = resultSet.getString(19);
				String gender = resultSet.getString(20);
				String statusName = resultSet.getString(21);
				String statusDescription = resultSet.getString(22);
				String locationName = resultSet.getString(23);
				String locationDescription = resultSet.getString(24);

				Statuses statusesId = new Statuses(null, statusName, statusDescription);
				Locations locationsId = new Locations(null, locationName, locationDescription);
				Employees employeesAssignedTo = new Employees(empId, assignedToFirstName, assignedToLastName, email,
						gender);
				Employees employeesCreatedBy = new Employees(null, createdByFirstName, createdByLastName, null, null);
				Employees employeesUpdatedBy = new Employees(null, updatedByFirstName, updatedByLastName, null, null);
				Assets assets = new Assets(assetId, assetName, assetDescription, assetType, purchaseDate, purchasePrice,
						employeesCreatedBy, employeesUpdatedBy, null, null, locationsId, statusesId);
				AssetAssignments assetAssignments = new AssetAssignments(assignmnetId, assets, employeesAssignedTo,
						assignedDate, returnDate, employeesCreatedBy, employeesUpdatedBy, createdOn, updatedOn);

				assignmentList.add(assetAssignments);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return assignmentList;
	}

}
