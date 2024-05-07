-- MySQL dump 10.13  Distrib 8.0.34, for Win64 (x86_64)
--
-- Host: localhost    Database: asset_tracking
-- ------------------------------------------------------
-- Server version	8.0.35

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `asset_assignments`
--

DROP TABLE IF EXISTS `asset_assignments`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `asset_assignments` (
  `assignment_id` varchar(50) NOT NULL,
  `asset_id` varchar(50) DEFAULT NULL,
  `assigned_to` varchar(100) DEFAULT NULL,
  `assigned_date` date DEFAULT NULL,
  `return_date` date DEFAULT NULL,
  `createdby` varchar(50) DEFAULT NULL,
  `updatedby` varchar(50) DEFAULT NULL,
  `createdon` date DEFAULT NULL,
  `updatedon` date DEFAULT NULL,
  PRIMARY KEY (`assignment_id`),
  KEY `asset_id` (`asset_id`),
  KEY `createdby` (`createdby`),
  KEY `updatedby` (`updatedby`),
  KEY `assigned_to` (`assigned_to`),
  CONSTRAINT `asset_assignments_ibfk_1` FOREIGN KEY (`asset_id`) REFERENCES `assets` (`asset_id`),
  CONSTRAINT `asset_assignments_ibfk_2` FOREIGN KEY (`createdby`) REFERENCES `employees` (`emp_id`),
  CONSTRAINT `asset_assignments_ibfk_3` FOREIGN KEY (`updatedby`) REFERENCES `employees` (`emp_id`),
  CONSTRAINT `asset_assignments_ibfk_4` FOREIGN KEY (`assigned_to`) REFERENCES `employees` (`emp_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `asset_assignments`
--

LOCK TABLES `asset_assignments` WRITE;
/*!40000 ALTER TABLE `asset_assignments` DISABLE KEYS */;
INSERT INTO `asset_assignments` VALUES ('AA001','A001','E001','2024-04-17',NULL,'E004','E004','2024-04-18','2024-04-18'),('AA002','A002','E002','2024-04-17',NULL,'E004','E004','2024-04-18','2024-04-18'),('AA003','A003','E003','2024-04-17','2024-04-24','E004','E004','2024-04-18','2024-04-25');
/*!40000 ALTER TABLE `asset_assignments` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `assets`
--

DROP TABLE IF EXISTS `assets`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `assets` (
  `asset_id` varchar(50) NOT NULL,
  `asset_name` varchar(100) NOT NULL,
  `asset_description` text,
  `asset_type` varchar(50) DEFAULT NULL,
  `purchase_date` date DEFAULT NULL,
  `purchase_price` decimal(10,2) DEFAULT NULL,
  `createdby` varchar(50) DEFAULT NULL,
  `updatedby` varchar(50) DEFAULT NULL,
  `createdon` date DEFAULT NULL,
  `updatedon` date DEFAULT NULL,
  `location_id` varchar(50) DEFAULT NULL,
  `status_id` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`asset_id`),
  KEY `createdby` (`createdby`),
  KEY `updatedby` (`updatedby`),
  KEY `location_id` (`location_id`),
  KEY `status_id` (`status_id`),
  CONSTRAINT `assets_ibfk_1` FOREIGN KEY (`createdby`) REFERENCES `employees` (`emp_id`),
  CONSTRAINT `assets_ibfk_2` FOREIGN KEY (`updatedby`) REFERENCES `employees` (`emp_id`),
  CONSTRAINT `assets_ibfk_3` FOREIGN KEY (`location_id`) REFERENCES `locations` (`location_id`),
  CONSTRAINT `assets_ibfk_4` FOREIGN KEY (`status_id`) REFERENCES `statuses` (`status_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `assets`
--

LOCK TABLES `assets` WRITE;
/*!40000 ALTER TABLE `assets` DISABLE KEYS */;
INSERT INTO `assets` VALUES ('A001','HP Probook','A silver HP \nProbook laptop with model number: 440 G8','Laptop','2024-03-15',70000.00,'E004','E004','2024-03-16','2024-03-16','L001','S002'),('A002','HP Probook','A silver HP Probook laptop with model number: 430 G6','Laptop','2024-03-15',68000.00,'E004','E004','2024-03-16','2024-03-16','L002','S002'),('A003','Dell Latitude','A black Dell Latitude laptop with \nmodel number : 3420','Laptop','2024-03-17',65000.00,'E004','E004','2024-03-18','2024-03-18','L003','S003');
/*!40000 ALTER TABLE `assets` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `employees`
--

DROP TABLE IF EXISTS `employees`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `employees` (
  `emp_id` varchar(50) NOT NULL,
  `emp_firstname` varchar(50) DEFAULT NULL,
  `emp_lastname` varchar(50) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `sex` enum('M','F') DEFAULT NULL,
  PRIMARY KEY (`emp_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employees`
--

LOCK TABLES `employees` WRITE;
/*!40000 ALTER TABLE `employees` DISABLE KEYS */;
INSERT INTO `employees` VALUES ('E001','Rohit','Sudevkumar','rohit@gmail.com','M'),('E002','Edwin','Benny','edwin@gmail.com','M'),('E003','Anish','Korah','anish@gmail.com','M'),('E004','Joel','Joseph','joel@gmail.com','M');
/*!40000 ALTER TABLE `employees` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `locations`
--

DROP TABLE IF EXISTS `locations`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `locations` (
  `location_id` varchar(50) NOT NULL,
  `location_name` varchar(100) NOT NULL,
  `location_description` text,
  PRIMARY KEY (`location_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `locations`
--

LOCK TABLES `locations` WRITE;
/*!40000 ALTER TABLE `locations` DISABLE KEYS */;
INSERT INTO `locations` VALUES ('L001','Gayathri building','The asset is currently at Gayathri building, Technopark \nPhase 1, Kazhakkoottam'),('L002','Tejaswini building','The asset is currently at Tejaswini building, Technopark\n Phase 1, Kazhakkoottam'),('L003','Athulya building','The asset is currently at Athulya building, Infopark \n Phase 1, Kakkanad');
/*!40000 ALTER TABLE `locations` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `maintenance_logs`
--

DROP TABLE IF EXISTS `maintenance_logs`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `maintenance_logs` (
  `log_id` varchar(50) NOT NULL,
  `asset_id` varchar(50) DEFAULT NULL,
  `maintenance_date` date DEFAULT NULL,
  `maintenance_description` text,
  `maintenance_cost` decimal(10,2) DEFAULT NULL,
  `createdby` varchar(50) DEFAULT NULL,
  `updatedby` varchar(50) DEFAULT NULL,
  `createdon` date DEFAULT NULL,
  `updatedon` date DEFAULT NULL,
  PRIMARY KEY (`log_id`),
  KEY `asset_id` (`asset_id`),
  KEY `createdby` (`createdby`),
  KEY `updatedby` (`updatedby`),
  CONSTRAINT `maintenance_logs_ibfk_1` FOREIGN KEY (`asset_id`) REFERENCES `assets` (`asset_id`),
  CONSTRAINT `maintenance_logs_ibfk_2` FOREIGN KEY (`createdby`) REFERENCES `employees` (`emp_id`),
  CONSTRAINT `maintenance_logs_ibfk_3` FOREIGN KEY (`updatedby`) REFERENCES `employees` (`emp_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `maintenance_logs`
--

LOCK TABLES `maintenance_logs` WRITE;
/*!40000 ALTER TABLE `maintenance_logs` DISABLE KEYS */;
INSERT INTO `maintenance_logs` VALUES ('M001','A003','2024-04-26','The charging port has been damaged',5000.00,'E004','E004','2024-04-26','2024-04-26');
/*!40000 ALTER TABLE `maintenance_logs` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `statuses`
--

DROP TABLE IF EXISTS `statuses`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `statuses` (
  `status_id` varchar(50) NOT NULL,
  `status_name` varchar(50) NOT NULL,
  `status_description` text,
  PRIMARY KEY (`status_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `statuses`
--

LOCK TABLES `statuses` WRITE;
/*!40000 ALTER TABLE `statuses` DISABLE KEYS */;
INSERT INTO `statuses` VALUES ('S001','In Storage','The asset has\nnot been deployed'),('S002','Deployed','The asset has been \ndeployed'),('S003','In maintenance','The asset is undergoing\n maintenance');
/*!40000 ALTER TABLE `statuses` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-05-07 11:59:09
