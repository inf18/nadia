-- phpMyAdmin SQL Dump
-- version 3.5.2
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Jun 10, 2017 at 02:16 AM
-- Server version: 5.5.25a
-- PHP Version: 5.4.4

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `tiketkonser`
--

-- --------------------------------------------------------

--
-- Table structure for table `tiket`
--

CREATE TABLE IF NOT EXISTS `tiket` (
  `kelas` varchar(10) NOT NULL,
  `jenis_tiket` varchar(10) NOT NULL,
  `harga` int(10) NOT NULL,
  `stok` int(5) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tiket`
--

INSERT INTO `tiket` (`kelas`, `jenis_tiket`, `harga`, `stok`) VALUES
('festival', 'OTS', 75000, 24),
('tribun', 'OTS', 125000, 24),
('festival', 'Presale 1', 25000, 7),
('tribun', 'Presale 1', 50000, 7),
('festival', 'Presale 2', 35000, 45),
('tribun', 'Presale 2', 75000, 45),
('festival', 'Presale 3', 50000, 47),
('tribun', 'Presale 3', 100000, 47);

-- --------------------------------------------------------

--
-- Table structure for table `transaksi`
--

CREATE TABLE IF NOT EXISTS `transaksi` (
  `tanggal_transaksi` date NOT NULL,
  `no_tiket` varchar(5) NOT NULL,
  `nama` varchar(30) NOT NULL,
  `kelas` varchar(10) NOT NULL,
  `jenis_tiket` varchar(10) NOT NULL,
  `jumlah` varchar(5) NOT NULL,
  `harga` int(10) NOT NULL,
  `bayar` int(10) NOT NULL,
  `kembalian` int(10) NOT NULL,
  PRIMARY KEY (`no_tiket`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `transaksi`
--

INSERT INTO `transaksi` (`tanggal_transaksi`, `no_tiket`, `nama`, `kelas`, `jenis_tiket`, `jumlah`, `harga`, `bayar`, `kembalian`) VALUES
('2017-05-15', 'T001', 'Kevin', 'festival', 'Presale 1', '1', 25000, 30000, 5000),
('2017-05-22', 'T002', 'Hana', 'festival', 'Presale 1', '1', 50000, 50000, 0),
('2017-05-22', 'T003', 'cimin', 'festival', 'Presale 1', '1', 50000, 100000, 50000),
('2017-05-22', 'T004', 'hadi', 'tribun', 'Presale 2', '1', 75000, 100000, 25000),
('2017-05-22', 'T005', 'jahs', 'festival', 'Presale 2', '1', 75000, 100000, 25000),
('2017-05-22', 'T006', 'ciatt', 'festival', 'Presale 1', '1', 50000, 100000, 50000),
('2017-05-22', 'T007', 'bismillah', 'tribun', 'Presale 3', '1', 100000, 100000, 0),
('2017-06-03', 'T008', 'Hasasimi', 'festival', 'Presale 3', '1', 100000, 100000, 0),
('2017-06-03', 'T009', 'cia', 'festival', 'Presale 1', '1', 50000, 50000, 0),
('2017-06-03', 'T0010', 'Giva', 'festival', 'Presale 2', '1', 75000, 100000, 25000),
('2017-06-03', 'T0011', 'Annisa', 'festival', 'Presale 2', '1', 75000, 100000, 25000),
('2017-06-09', 'T0012', 'hawd', 'tribun', 'Presale 2', '1', 75000, 100000, 25000);

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE IF NOT EXISTS `user` (
  `username` varchar(30) NOT NULL,
  `password` varchar(30) NOT NULL,
  `bagian` varchar(10) NOT NULL,
  PRIMARY KEY (`username`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`username`, `password`, `bagian`) VALUES
('admin', 'admin', 'Admin'),
('nadia', 'rutbah', 'Sirkulasi');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
