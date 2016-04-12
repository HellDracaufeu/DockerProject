-- phpMyAdmin SQL Dump
-- version 4.4.10
-- http://www.phpmyadmin.net
--
-- Client :  localhost:3306
-- Généré le :  Mar 12 Avril 2016 à 16:27
-- Version du serveur :  5.5.42
-- Version de PHP :  7.0.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";

--
-- Base de données :  `rest`
--

-- --------------------------------------------------------

--
-- Structure de la table `dog`
--

CREATE TABLE `dog` (
`id` int(11) NOT NULL,
`name` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
`orga_id` int(11) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Contenu de la table `dog`
--

INSERT INTO `dog` (`id`, `name`, `orga_id`) VALUES
(1, 'Tyson', 1),
(2, 'Ramada', 2),
(3, 'Tina', 1);

--
-- Index pour les tables exportées
--

--
-- Index pour la table `dog`
--
ALTER TABLE `dog`
ADD PRIMARY KEY (`id`),
ADD KEY `orga_id` (`orga_id`);

--
-- AUTO_INCREMENT pour les tables exportées
--

--
-- AUTO_INCREMENT pour la table `dog`
--
ALTER TABLE `dog`
MODIFY `id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=4;
--
-- Contraintes pour les tables exportées
--

--
-- Contraintes pour la table `dog`
--
ALTER TABLE `dog`
ADD CONSTRAINT `dog_ibfk_1` FOREIGN KEY (`orga_id`) REFERENCES `organization` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;
