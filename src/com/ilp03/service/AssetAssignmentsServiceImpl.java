package com.ilp03.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import com.ilp03.dao.AssetAssignmentsDAO;
import com.ilp03.entity.AssetAssignments;

public class AssetAssignmentsServiceImpl implements AssetAssignmentsService {

	@Override
	public void getAssignmentDetailsBasedOnId() {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		char choice = 'y';
		while (choice == 'y') {
			try {
				Connection connection = AssetAssignmentsDAO.getConnection();
				System.out.println();
				System.out.println("Enter the Asset Id");
				String inputAssetId = scanner.nextLine();
				ArrayList<AssetAssignments> assignmentList = AssetAssignmentsDAO
						.getAssignmentDetailsBasedOnId(connection, inputAssetId);
				System.out.println();
				System.out.println(
						"Asset ID || Asset Name || Asset Description || Asset Type || Purchase Date || Purchase Price || Entry Created By || Entry Updated By || Entry Creation Date || Entry Updation Date || Assignment ID || Assigned To || Assigned Date || Return Date || Employee ID || Employee Email || Employee Gender || Asset Status || Status Description || Asset Location || Location Description");
				System.out.println(
						"--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
				for (AssetAssignments assignments : assignmentList) {
					System.out.println(assignments.getAssetId().getAssetId() + " || "
							+ assignments.getAssetId().getAssetName() + " || "
							+ assignments.getAssetId().getAssetDescription() + " || "
							+ assignments.getAssetId().getAssetType() + " || "
							+ assignments.getAssetId().getPurchaseDate() + " || "
							+ assignments.getAssetId().getPurchasePrice() + " || "
							+ assignments.getEmployeesCreatedBy().getEmpFirstName() + " "
							+ assignments.getEmployeesCreatedBy().getEmpLastName() + " || "
							+ assignments.getEmployeesUpdatedBy().getEmpFirstName() + " "
							+ assignments.getEmployeesUpdatedBy().getEmpLastName() + " || " + assignments.getCreatedOn()
							+ " || " + assignments.getUpdatedOn() + " || " + assignments.getAssignmentId() + " || "
							+ assignments.getEmployeesAssignedTo().getEmpFirstName() + " "
							+ assignments.getEmployeesAssignedTo().getEmpLastName() + " || "
							+ assignments.getAssignedDate() + " || " + assignments.getReturnDate() + " || "
							+ assignments.getEmployeesAssignedTo().getEmpId() + " || "
							+ assignments.getEmployeesAssignedTo().getEmail() + " || "
							+ assignments.getEmployeesAssignedTo().getSex() + " || "
							+ assignments.getAssetId().getStatusesId().getStatusName() + " || "
							+ assignments.getAssetId().getStatusesId().getStatusDescription() + " || "
							+ assignments.getAssetId().getLocationsId().getLocationName() + " || "
							+ assignments.getAssetId().getLocationsId().getLocationDescription());
				}
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println();
			System.out.println("Do you want to check another asset's details? (y/n)");
			choice = scanner.nextLine().charAt(0);
		}

	}

}
