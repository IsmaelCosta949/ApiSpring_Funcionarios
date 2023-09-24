package com.example.apiptratica.Funcionarios;

import com.example.apiptratica.Funcionarios.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FuncionarioRepository extends JpaRepository<Funcionario, Integer> {
}

