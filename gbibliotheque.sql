-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1
-- Généré le : ven. 14 avr. 2023 à 00:34
-- Version du serveur : 10.4.25-MariaDB
-- Version de PHP : 8.1.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : `gestionbilbio`
--

-- --------------------------------------------------------

--
-- Structure de la table `oeuvre`
--

CREATE TABLE `oeuvre` (
  `ID` int(11) NOT NULL,
  `ISBN` varchar(50) NOT NULL,
  `titre` varchar(255) NOT NULL,
  `auteur` varchar(255) NOT NULL,
  `categorie` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `oeuvre`
--

INSERT INTO `oeuvre` (`ID`, `ISBN`, `titre`, `auteur`, `categorie`) VALUES
(1, '1234567890', 'The Great Gatsby', 'F. Scott Fitzgerald', 'Fiction'),
(2, '0987654321', 'To Kill a Mockingbird', 'Harper Lee', 'Fiction'),
(3, '1111111111', '1984', 'George Orwell', 'Fiction'),
(4, '2222222222', 'Pride and Prejudice', 'Jane Austen', 'Fiction'),
(5, '3333333333', 'The Hobbit', 'J.R.R. Tolkien', 'Fiction'),
(6, '4444444444', 'The Catcher in the Rye', 'J.D. Salinger', 'Fiction'),
(7, '5555555555', 'One Hundred Years of Solitude', 'Gabriel Garcia Marquez', 'Fiction'),
(8, '6666666666', 'The Stranger', 'Albert Camus', 'Fiction'),
(9, '7777777777', 'The Odyssey', 'Homer', 'Fiction');

--
-- Index pour les tables déchargées
--

--
-- Index pour la table `oeuvre`
--
ALTER TABLE `oeuvre`
  ADD PRIMARY KEY (`ID`);

--
-- AUTO_INCREMENT pour les tables déchargées
--

--
-- AUTO_INCREMENT pour la table `oeuvre`
--
ALTER TABLE `oeuvre`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
