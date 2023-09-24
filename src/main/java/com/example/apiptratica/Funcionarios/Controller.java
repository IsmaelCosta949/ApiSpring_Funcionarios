package com.example.apiptratica.Funcionarios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/funcionarios")
public class Controller {


    @Autowired
    private FuncionarioTeste funcionarios;

    // Cadastrar funcionário
    @PostMapping("/adicionarFuncionario")
    public Funcionario adicionarFuncionario(@RequestBody Funcionario funcionario) {
        return funcionarios.adicionarFuncionario(funcionario);
    }

    // Listar todos os funcionários
    @GetMapping("/ListarFuncionarios")
    public List<Funcionario> ListarFuncionarios() {
        return funcionarios.getAllFuncionarios();
    }

    // Buscar funcionário pelo id
    @GetMapping("BuscarId/{id}")
    public ResponseEntity<Funcionario> BuscarId(@PathVariable Integer id) {
        Optional<Funcionario> optionalFuncionario = funcionarios.getFuncionarioById(id);
        if(optionalFuncionario.isPresent()) {
            return ResponseEntity.ok(optionalFuncionario.get());
        }
        return ResponseEntity.notFound().build();
    }

    // Atualizar por id
    @PutMapping("/atualizarFuncionarios/{id}")
    public ResponseEntity<Funcionario> atualizarFuncionarios(@PathVariable Integer id, @RequestBody Funcionario funcionarioDetails) {
        Funcionario updatedFuncionario = funcionarios.atualizarFuncionario(id, funcionarioDetails);
        if(updatedFuncionario != null) {
            return ResponseEntity.ok(updatedFuncionario);
        }
        return ResponseEntity.notFound().build();
    }

    // Excluir pelo id
    @DeleteMapping("/DeletarFuncionarios/{id}")
    public ResponseEntity<Void> deletarFuncionarios(@PathVariable Integer id) {
        try {
            funcionarios.deletarFuncionarios(id);
            return ResponseEntity.noContent().build();
        } catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
    }
}
