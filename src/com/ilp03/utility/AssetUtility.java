package com.ilp03.utility;

import com.ilp03.service.AssetAssignmentsService;
import com.ilp03.service.AssetAssignmentsServiceImpl;

public class AssetUtility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AssetAssignmentsService assetAssignmentsService = new AssetAssignmentsServiceImpl();
		assetAssignmentsService.getAssignmentDetailsBasedOnId();

	}

}
