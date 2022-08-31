CREATE DATABASE  IF NOT EXISTS `qlkl` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_vi_0900_as_cs */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `qlkl`;
-- MySQL dump 10.13  Distrib 8.0.27, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: qlkl
-- ------------------------------------------------------
-- Server version	8.0.27

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
-- Table structure for table `admin`
--

DROP TABLE IF EXISTS `admin`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `admin` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(50) COLLATE utf8mb4_vi_0900_as_cs NOT NULL,
  `username` varchar(50) COLLATE utf8mb4_vi_0900_as_cs NOT NULL,
  `password` varchar(50) COLLATE utf8mb4_vi_0900_as_cs NOT NULL,
  `email` varchar(50) COLLATE utf8mb4_vi_0900_as_cs DEFAULT NULL,
  `user` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `username` (`username`),
  KEY `user` (`user`),
  CONSTRAINT `admin_ibfk_1` FOREIGN KEY (`user`) REFERENCES `user` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_vi_0900_as_cs;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `admin`
--

LOCK TABLES `admin` WRITE;
/*!40000 ALTER TABLE `admin` DISABLE KEYS */;
/*!40000 ALTER TABLE `admin` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `chuyen_nganh`
--

DROP TABLE IF EXISTS `chuyen_nganh`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `chuyen_nganh` (
  `id` int NOT NULL AUTO_INCREMENT,
  `tenChuyenNganh` varchar(50) COLLATE utf8mb4_vi_0900_as_cs NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_vi_0900_as_cs;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `chuyen_nganh`
--

LOCK TABLES `chuyen_nganh` WRITE;
/*!40000 ALTER TABLE `chuyen_nganh` DISABLE KEYS */;
/*!40000 ALTER TABLE `chuyen_nganh` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `de_tai`
--

DROP TABLE IF EXISTS `de_tai`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `de_tai` (
  `id` int NOT NULL AUTO_INCREMENT,
  `tenDeTai` varchar(50) COLLATE utf8mb4_vi_0900_as_cs NOT NULL,
  `moTa` varchar(50) COLLATE utf8mb4_vi_0900_as_cs NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_vi_0900_as_cs;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `de_tai`
--

LOCK TABLES `de_tai` WRITE;
/*!40000 ALTER TABLE `de_tai` DISABLE KEYS */;
/*!40000 ALTER TABLE `de_tai` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `diem`
--

DROP TABLE IF EXISTS `diem`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `diem` (
  `id` int NOT NULL AUTO_INCREMENT,
  `diem` float DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_vi_0900_as_cs;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `diem`
--

LOCK TABLES `diem` WRITE;
/*!40000 ALTER TABLE `diem` DISABLE KEYS */;
/*!40000 ALTER TABLE `diem` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `giangvien`
--

DROP TABLE IF EXISTS `giangvien`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `giangvien` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(50) COLLATE utf8mb4_vi_0900_as_cs NOT NULL,
  `username` varchar(50) COLLATE utf8mb4_vi_0900_as_cs NOT NULL,
  `password` varchar(50) COLLATE utf8mb4_vi_0900_as_cs NOT NULL,
  `email` varchar(50) COLLATE utf8mb4_vi_0900_as_cs DEFAULT NULL,
  `user` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `username` (`username`),
  KEY `user` (`user`),
  CONSTRAINT `giangvien_ibfk_1` FOREIGN KEY (`user`) REFERENCES `user` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_vi_0900_as_cs;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `giangvien`
--

LOCK TABLES `giangvien` WRITE;
/*!40000 ALTER TABLE `giangvien` DISABLE KEYS */;
/*!40000 ALTER TABLE `giangvien` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `giaovu`
--

DROP TABLE IF EXISTS `giaovu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `giaovu` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(50) COLLATE utf8mb4_vi_0900_as_cs NOT NULL,
  `username` varchar(50) COLLATE utf8mb4_vi_0900_as_cs NOT NULL,
  `password` varchar(50) COLLATE utf8mb4_vi_0900_as_cs NOT NULL,
  `email` varchar(50) COLLATE utf8mb4_vi_0900_as_cs DEFAULT NULL,
  `user` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `username` (`username`),
  KEY `user` (`user`),
  CONSTRAINT `giaovu_ibfk_1` FOREIGN KEY (`user`) REFERENCES `user` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_vi_0900_as_cs;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `giaovu`
--

LOCK TABLES `giaovu` WRITE;
/*!40000 ALTER TABLE `giaovu` DISABLE KEYS */;
/*!40000 ALTER TABLE `giaovu` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hdbv`
--

DROP TABLE IF EXISTS `hdbv`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `hdbv` (
  `id` int NOT NULL AUTO_INCREMENT,
  `chuTich` int DEFAULT NULL,
  `thuKy` int DEFAULT NULL,
  `phanBien` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `chuTich` (`chuTich`),
  KEY `thuKy` (`thuKy`),
  KEY `phanBien` (`phanBien`),
  CONSTRAINT `hdbv_ibfk_1` FOREIGN KEY (`chuTich`) REFERENCES `giangvien` (`id`),
  CONSTRAINT `hdbv_ibfk_2` FOREIGN KEY (`thuKy`) REFERENCES `giangvien` (`id`),
  CONSTRAINT `hdbv_ibfk_3` FOREIGN KEY (`phanBien`) REFERENCES `giangvien` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_vi_0900_as_cs;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hdbv`
--

LOCK TABLES `hdbv` WRITE;
/*!40000 ALTER TABLE `hdbv` DISABLE KEYS */;
/*!40000 ALTER TABLE `hdbv` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `khoa`
--

DROP TABLE IF EXISTS `khoa`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `khoa` (
  `id` int NOT NULL AUTO_INCREMENT,
  `tenKhoa` varchar(50) COLLATE utf8mb4_vi_0900_as_cs NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_vi_0900_as_cs;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `khoa`
--

LOCK TABLES `khoa` WRITE;
/*!40000 ALTER TABLE `khoa` DISABLE KEYS */;
/*!40000 ALTER TABLE `khoa` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `khoa_hoc`
--

DROP TABLE IF EXISTS `khoa_hoc`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `khoa_hoc` (
  `id` int NOT NULL AUTO_INCREMENT,
  `tenKhoaHoc` varchar(50) COLLATE utf8mb4_vi_0900_as_cs NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_vi_0900_as_cs;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `khoa_hoc`
--

LOCK TABLES `khoa_hoc` WRITE;
/*!40000 ALTER TABLE `khoa_hoc` DISABLE KEYS */;
/*!40000 ALTER TABLE `khoa_hoc` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `khoa_luan`
--

DROP TABLE IF EXISTS `khoa_luan`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `khoa_luan` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(50) COLLATE utf8mb4_vi_0900_as_cs NOT NULL,
  `hdbv` int DEFAULT NULL,
  `ngaybatdau` datetime DEFAULT NULL,
  `sinhvien` int DEFAULT NULL,
  `tieuchichamdiem` int DEFAULT NULL,
  `detai` int DEFAULT NULL,
  `diem` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `hdbv` (`hdbv`),
  KEY `sinhvien` (`sinhvien`),
  KEY `tieuchichamdiem` (`tieuchichamdiem`),
  KEY `detai` (`detai`),
  KEY `diem` (`diem`),
  CONSTRAINT `khoa_luan_ibfk_1` FOREIGN KEY (`hdbv`) REFERENCES `hdbv` (`id`),
  CONSTRAINT `khoa_luan_ibfk_2` FOREIGN KEY (`sinhvien`) REFERENCES `sinhvien` (`id`),
  CONSTRAINT `khoa_luan_ibfk_3` FOREIGN KEY (`tieuchichamdiem`) REFERENCES `tieu_chi_cham_diem` (`id`),
  CONSTRAINT `khoa_luan_ibfk_4` FOREIGN KEY (`detai`) REFERENCES `de_tai` (`id`),
  CONSTRAINT `khoa_luan_ibfk_5` FOREIGN KEY (`diem`) REFERENCES `diem` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_vi_0900_as_cs;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `khoa_luan`
--

LOCK TABLES `khoa_luan` WRITE;
/*!40000 ALTER TABLE `khoa_luan` DISABLE KEYS */;
/*!40000 ALTER TABLE `khoa_luan` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sinhvien`
--

DROP TABLE IF EXISTS `sinhvien`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `sinhvien` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(50) COLLATE utf8mb4_vi_0900_as_cs NOT NULL,
  `username` varchar(50) COLLATE utf8mb4_vi_0900_as_cs NOT NULL,
  `password` varchar(50) COLLATE utf8mb4_vi_0900_as_cs NOT NULL,
  `email` varchar(50) COLLATE utf8mb4_vi_0900_as_cs DEFAULT NULL,
  `khoa` int DEFAULT NULL,
  `khoahoc` int DEFAULT NULL,
  `chuyennganh` int DEFAULT NULL,
  `user` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `username` (`username`),
  KEY `khoa` (`khoa`),
  KEY `khoahoc` (`khoahoc`),
  KEY `chuyennganh` (`chuyennganh`),
  KEY `user` (`user`),
  CONSTRAINT `sinhvien_ibfk_1` FOREIGN KEY (`khoa`) REFERENCES `khoa` (`id`),
  CONSTRAINT `sinhvien_ibfk_2` FOREIGN KEY (`khoahoc`) REFERENCES `khoa_hoc` (`id`),
  CONSTRAINT `sinhvien_ibfk_3` FOREIGN KEY (`chuyennganh`) REFERENCES `chuyen_nganh` (`id`),
  CONSTRAINT `sinhvien_ibfk_4` FOREIGN KEY (`user`) REFERENCES `user` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_vi_0900_as_cs;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sinhvien`
--

LOCK TABLES `sinhvien` WRITE;
/*!40000 ALTER TABLE `sinhvien` DISABLE KEYS */;
/*!40000 ALTER TABLE `sinhvien` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tieu_chi_cham_diem`
--

DROP TABLE IF EXISTS `tieu_chi_cham_diem`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tieu_chi_cham_diem` (
  `id` int NOT NULL AUTO_INCREMENT,
  `tenTieuChi` varchar(50) COLLATE utf8mb4_vi_0900_as_cs NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_vi_0900_as_cs;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tieu_chi_cham_diem`
--

LOCK TABLES `tieu_chi_cham_diem` WRITE;
/*!40000 ALTER TABLE `tieu_chi_cham_diem` DISABLE KEYS */;
/*!40000 ALTER TABLE `tieu_chi_cham_diem` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(50) COLLATE utf8mb4_vi_0900_as_cs NOT NULL,
  `username` varchar(50) COLLATE utf8mb4_vi_0900_as_cs NOT NULL,
  `password` varchar(50) COLLATE utf8mb4_vi_0900_as_cs NOT NULL,
  `email` varchar(50) COLLATE utf8mb4_vi_0900_as_cs DEFAULT NULL,
  `user_role` enum('ADMIN','GIAOVU','GIANGVIEN','SINHVIEN') COLLATE utf8mb4_vi_0900_as_cs DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `username` (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_vi_0900_as_cs;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-08-31 22:06:11
