-- phpMyAdmin SQL Dump
-- version 4.8.4
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1:3308
-- Tiempo de generación: 25-05-2019 a las 22:52:54
-- Versión del servidor: 5.7.24
-- Versión de PHP: 7.2.14

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `proyecto`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `coloriphone`
--

DROP TABLE IF EXISTS `coloriphone`;
CREATE TABLE IF NOT EXISTS `coloriphone` (
  `iphone` int(2) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `coloriphone`
--

INSERT INTO `coloriphone` (`iphone`) VALUES
(1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `contraseña`
--

DROP TABLE IF EXISTS `contraseña`;
CREATE TABLE IF NOT EXISTS `contraseña` (
  `contra` varchar(20) NOT NULL,
  `contra2` varchar(20) NOT NULL,
  `contra3` varchar(20) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `contraseña`
--

INSERT INTO `contraseña` (`contra`, `contra2`, `contra3`) VALUES
('0123', '1234', '0');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `fondopantalla`
--

DROP TABLE IF EXISTS `fondopantalla`;
CREATE TABLE IF NOT EXISTS `fondopantalla` (
  `wallpaper` int(6) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `fondopantalla`
--

INSERT INTO `fondopantalla` (`wallpaper`) VALUES
(1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `juegobola`
--

DROP TABLE IF EXISTS `juegobola`;
CREATE TABLE IF NOT EXISTS `juegobola` (
  `id` int(2) NOT NULL AUTO_INCREMENT,
  `usuario` varchar(50) NOT NULL,
  `puntaje` int(11) NOT NULL,
  `longitud` int(11) NOT NULL,
  `fechahora` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=31 DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `juegobola`
--

INSERT INTO `juegobola` (`id`, `usuario`, `puntaje`, `longitud`, `fechahora`) VALUES
(1, 'Julio Armando', 4, 4, '2019-05-19 18:25:14'),
(2, 'Miguel Alberto', 16, 16, '2019-05-19 18:27:30'),
(3, 'Duck Hudson', 52, 52, '2019-05-19 18:29:00'),
(4, 'El dios Julio', 52, 52, '2019-05-19 18:34:54'),
(5, 'TinaPuerquito', 30, 30, '2019-05-19 18:45:55'),
(6, 'Barragan', 12, 12, '2019-05-19 18:49:23'),
(7, 'Cristina', 11, 11, '2019-05-19 20:59:12'),
(8, 'TeodoraGorda', 6, 6, '2019-05-19 21:00:10'),
(9, 'JulioBien', 13, 13, '2019-05-25 17:09:10'),
(10, '', 0, 0, '2019-05-25 17:23:33'),
(11, 'POR FIN QUEDÓ!!', 13, 13, '2019-05-25 17:36:26'),
(12, 'Prueba', 1, 1, '2019-05-25 17:38:55'),
(13, 'Ha Quedado esto prro', 48, 48, '2019-05-25 17:42:38'),
(14, 'MAria', 12, 12, '2019-05-25 18:29:52'),
(15, 'ElMero', 47, 47, '2019-05-25 19:31:16'),
(16, 'Maria', 46, 46, '2019-05-25 19:36:24'),
(17, 'tity', 17, 17, '2019-05-25 19:41:42'),
(18, '', 7, 7, '2019-05-25 19:46:44'),
(19, 'tity', 23, 23, '2019-05-25 19:52:05'),
(20, 'ok', 9, 9, '2019-05-25 21:36:38'),
(21, 'ok', 9, 9, '2019-05-25 21:37:32'),
(22, '', 2, 2, '2019-05-25 22:00:15'),
(23, 'tity', 2, 2, '2019-05-25 22:01:28'),
(24, 'tity', 2, 2, '2019-05-25 22:02:22'),
(25, 'tity', 7, 7, '2019-05-25 22:04:24'),
(26, 'GretaPig', 48, 48, '2019-05-25 22:08:13'),
(27, 'llo', 12, 12, '2019-05-25 22:15:17'),
(28, 'TACO', 1, 1, '2019-05-25 22:17:23'),
(29, 'Usuario', 28, 28, '2019-05-25 22:30:46'),
(30, 'Artu', 21, 21, '2019-05-25 22:44:00');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `juegotennis`
--

DROP TABLE IF EXISTS `juegotennis`;
CREATE TABLE IF NOT EXISTS `juegotennis` (
  `ID` int(45) NOT NULL AUTO_INCREMENT,
  `Usuario` varchar(45) NOT NULL,
  `Puntaje` int(11) NOT NULL,
  `FechaHora` timestamp(6) NOT NULL DEFAULT CURRENT_TIMESTAMP(6),
  PRIMARY KEY (`ID`)
) ENGINE=MyISAM AUTO_INCREMENT=18 DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `juegotennis`
--

INSERT INTO `juegotennis` (`ID`, `Usuario`, `Puntaje`, `FechaHora`) VALUES
(1, 'Julio Armando', 4, '2019-05-25 20:54:29.987781'),
(2, 'Miguel', 2, '2019-05-25 20:56:20.976885'),
(3, 'Mother', 4, '2019-05-25 20:59:43.271547'),
(4, 'GretaMarranito', 2, '2019-05-25 21:00:59.715351'),
(5, 'Duck', 0, '2019-05-25 21:04:15.970978'),
(6, 'tyty', 2, '2019-05-25 21:12:02.253140'),
(7, 'tyty', 3, '2019-05-25 21:13:08.762914'),
(8, 'Teodora', 2, '2019-05-25 21:13:56.887236'),
(9, 'cris', 132, '2019-05-25 21:14:49.283539'),
(10, 'mike', 2, '2019-05-25 21:38:04.286553'),
(11, 'tity', 1, '2019-05-25 22:03:21.879735'),
(12, 'tity', 3, '2019-05-25 22:05:09.783023'),
(13, 'Hola', 1, '2019-05-25 22:05:54.639921'),
(14, 'Julio', 15, '2019-05-25 22:07:07.687805'),
(15, 'Armando', 101, '2019-05-25 22:10:58.187147'),
(16, 'Kok', 1, '2019-05-25 22:19:55.208927'),
(17, 'Malo', 0, '2019-05-25 22:21:49.810395');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
