-- phpMyAdmin SQL Dump
-- version 4.6.5.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jul 31, 2017 at 02:07 PM
-- Server version: 10.1.21-MariaDB
-- PHP Version: 7.1.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `inventorymanagement`
--

-- --------------------------------------------------------

--
-- Table structure for table `productdetails`
--

CREATE TABLE `productdetails` (
  `id` int(11) NOT NULL,
  `productName` varchar(30) NOT NULL,
  `price` int(11) NOT NULL,
  `weight` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `productdetails`
--

INSERT INTO `productdetails` (`id`, `productName`, `price`, `weight`) VALUES
(1, 'Colgate Toothpaste', 50, 25),
(2, 'Dabur lal dantamanjan', 40, 30),
(3, 'Gillette Shaver', 150, 25),
(4, 'hairOil', 250, 100),
(5, 'Wai Wai', 18, 50),
(6, 'rum pum', 20, 100),
(7, 'Rara noodles', 12, 50),
(8, 'DDC Milk', 35, 150),
(9, 'Digestive Biscuits', 85, 150),
(10, 'Hardrive', 7000, 500),
(11, 'Chowmin', 25, 30),
(12, 'Chowmin', 35, 30),
(13, 'Chowmin', 35, 30),
(14, 'Biscuits', 35, 30),
(15, 'Pen', 25, 10),
(16, 'Pen', 25, 10),
(17, 'DairyMilk', 50, 25),
(18, 'DairyMilk', 50, 25),
(19, 'DairyMilk', 50, 25),
(20, 'DairyMilk', 50, 25);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `productdetails`
--
ALTER TABLE `productdetails`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `productdetails`
--
ALTER TABLE `productdetails`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=21;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
