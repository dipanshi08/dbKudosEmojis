-- MySQL dump 10.13  Distrib 8.0.26, for Win64 (x86_64)
--
-- Host: localhost    Database: kudos_emoji
-- ------------------------------------------------------
-- Server version	8.0.26

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
-- Table structure for table `emp`
--

DROP TABLE IF EXISTS `emp`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `emp` (
  `email_id` varchar(100) NOT NULL,
  `name` varchar(100) NOT NULL,
  `dept` varchar(100) DEFAULT NULL,
  `position` varchar(100) DEFAULT NULL,
  `bio` varchar(255) DEFAULT NULL,
  `kudos_points` int DEFAULT '0',
  `kudos_spent` int NOT NULL,
  PRIMARY KEY (`email_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `emp`
--

LOCK TABLES `emp` WRITE;
/*!40000 ALTER TABLE `emp` DISABLE KEYS */;
INSERT INTO `emp` VALUES ('a0@gmail.com','a0','Corporate bank','Associate','Nobody cares',1500,0),('a1@gmail.com','a1','Corporate bank','Associate','Nobody cares',230,80),('a2@gmail.com','a2','Corporate bank','Associate','Nobody cares',400,0),('a3@gmail.com','a3','Corporate bank','Associate','Nobody cares',450,50),('a4@gmail.com','a4','Corporate bank','Associate','Nobody cares',600,0),('a5@gmail.com','a5','Corporate bank','Associate','Nobody cares',80,20),('a6@gmail.com','a6','Corporate bank','Associate','Nobody cares',240,10),('a7@gmail.com','a7','Corporate bank','Associate','Nobody cares',670,80),('a8@gmail.com','a8','Corporate bank','Associate','Nobody cares',500,0),('a9@gmail.com','a9','Corporate bank','Associate','Nobody cares',600,0),('gakshat1999@gmail.com','Akshat Goel','Software Development','Software Engineer','blah blah blah whatever',1000,0);
/*!40000 ALTER TABLE `emp` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-08-15 22:04:31
