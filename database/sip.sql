CREATE DATABASE  IF NOT EXISTS `sliet` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `sliet`;
-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: localhost    Database: sliet
-- ------------------------------------------------------
-- Server version	5.7.21-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `atteug14`
--

DROP TABLE IF EXISTS `atteug14`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `atteug14` (
  `regno` varchar(20) NOT NULL,
  `Numerical_Analysis` varchar(45) NOT NULL,
  `System_Software` varchar(40) NOT NULL,
  `Industrial_Chemistry` varchar(45) DEFAULT NULL,
  `Computer_organisation` varchar(45) DEFAULT NULL,
  `Data_Communication` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `atteug14`
--

LOCK TABLES `atteug14` WRITE;
/*!40000 ALTER TABLE `atteug14` DISABLE KEYS */;
INSERT INTO `atteug14` VALUES ('gcs1530050','34','23','54','67','68'),('gcs1530063','75','45','56','89','12'),('gcs1530050','34','23','54','67','68'),('gcs1530049','67','67','78','5','78'),('gcs1530048','80','90','89','78','90'),('gcs1530028','89','87','76','56','98');
/*!40000 ALTER TABLE `atteug14` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hostel`
--

DROP TABLE IF EXISTS `hostel`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `hostel` (
  `regno` varchar(15) NOT NULL,
  `fees` int(11) NOT NULL,
  `rebate` int(11) DEFAULT NULL,
  PRIMARY KEY (`regno`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hostel`
--

LOCK TABLES `hostel` WRITE;
/*!40000 ALTER TABLE `hostel` DISABLE KEYS */;
INSERT INTO `hostel` VALUES ('gcs1530028',4525,34),('gcs1530050',2250,3);
/*!40000 ALTER TABLE `hostel` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `markug14`
--

DROP TABLE IF EXISTS `markug14`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `markug14` (
  `regno` varchar(20) NOT NULL,
  `Numerical_Analysis` varchar(45) DEFAULT NULL,
  `System_software` varchar(45) DEFAULT NULL,
  `Industrial_Chemistry` varchar(45) DEFAULT NULL,
  `Computer_Organisation` varchar(45) DEFAULT NULL,
  `Data_Communication` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`regno`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `markug14`
--

LOCK TABLES `markug14` WRITE;
/*!40000 ALTER TABLE `markug14` DISABLE KEYS */;
INSERT INTO `markug14` VALUES ('GCS1530028','10','9','9.8','10','9'),('gcs1530048','100','100','100','100','100'),('gcs1530050','100','99','88','77','89');
/*!40000 ALTER TABLE `markug14` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ug14`
--

DROP TABLE IF EXISTS `ug14`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ug14` (
  `regno` varchar(20) NOT NULL,
  `name` varchar(20) DEFAULT NULL,
  `contactNo` varchar(12) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `hostel` int(11) DEFAULT NULL,
  `room` int(11) DEFAULT NULL,
  `category` varchar(20) DEFAULT NULL,
  `gender` varchar(20) DEFAULT NULL,
  `adhar` varchar(14) DEFAULT NULL,
  `semester` int(11) DEFAULT NULL,
  `day` int(11) DEFAULT NULL,
  `month` int(11) DEFAULT NULL,
  `year` int(11) DEFAULT NULL,
  `pass` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`regno`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ug14`
--

LOCK TABLES `ug14` WRITE;
/*!40000 ALTER TABLE `ug14` DISABLE KEYS */;
INSERT INTO `ug14` VALUES ('gcs1530028','Aakanchha','9955145100','jbj.030615@gmail.com ',1,331,'General','Female','1234567789190',1,14,2000,1,'akki'),('gcs1530048','Nishant Kumar','8968846037','kumarnishant279@gmail.com',4,105,'General','Male','123412341234',8,27,1995,1,'123');
/*!40000 ALTER TABLE `ug14` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-06-12  9:18:01
