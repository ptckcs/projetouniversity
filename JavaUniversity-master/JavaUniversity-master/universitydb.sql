USE universitybd;

CREATE TABLE `aluno` (
    `aluno_id` int(10) AUTO_INCREMENT KEY,
    `nome` varchar(100) NOT NULL,
    `cpf` varchar(30) NOT NULL,
    `rg` varchar(10) NOT NULL,
    `sexo` int(1)

    
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

