-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 09-Jun-2022 às 15:35
-- Versão do servidor: 10.3.16-MariaDB
-- versão do PHP: 7.3.7

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `bd_mywallet`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `tb_clients`
--

CREATE TABLE `tb_clients` (
  `ID` int(250) NOT NULL,
  `name` varchar(250) COLLATE utf8_bin NOT NULL,
  `users` varchar(250) COLLATE utf8_bin NOT NULL,
  `cpf` varchar(250) COLLATE utf8_bin NOT NULL,
  `passwords` varchar(250) COLLATE utf8_bin NOT NULL,
  `birthday` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Extraindo dados da tabela `tb_clients`
--

INSERT INTO `tb_clients` (`ID`, `name`, `users`, `cpf`, `passwords`, `birthday`) VALUES
(1, 'TESTE', 'TESTE', 'TESTE', 'TESTE', '2022-02-15');

-- --------------------------------------------------------

--
-- Estrutura da tabela `tb_movimentation`
--

CREATE TABLE `tb_movimentation` (
  `ID` int(250) NOT NULL,
  `moviDate` date NOT NULL,
  `money` int(250) NOT NULL,
  `notes` varchar(250) COLLATE utf8_bin NOT NULL,
  `type` varchar(250) COLLATE utf8_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Estrutura da tabela `tb_wallet`
--

CREATE TABLE `tb_wallet` (
  `ID` int(250) NOT NULL,
  `name` varchar(250) COLLATE utf8_bin NOT NULL,
  `budget` int(250) NOT NULL,
  `openCount` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Índices para tabelas despejadas
--

--
-- Índices para tabela `tb_clients`
--
ALTER TABLE `tb_clients`
  ADD PRIMARY KEY (`ID`);

--
-- Índices para tabela `tb_movimentation`
--
ALTER TABLE `tb_movimentation`
  ADD PRIMARY KEY (`ID`);

--
-- Índices para tabela `tb_wallet`
--
ALTER TABLE `tb_wallet`
  ADD PRIMARY KEY (`ID`);

--
-- AUTO_INCREMENT de tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `tb_clients`
--
ALTER TABLE `tb_clients`
  MODIFY `ID` int(250) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de tabela `tb_movimentation`
--
ALTER TABLE `tb_movimentation`
  MODIFY `ID` int(250) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de tabela `tb_wallet`
--
ALTER TABLE `tb_wallet`
  MODIFY `ID` int(250) NOT NULL AUTO_INCREMENT;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
