package com.example.apiptratica.Funcionarios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class FuncionarioTeste {

    @Autowired
    private FuncionarioRepository funcionarioRepository;

    public Funcionario adicionarFuncionario(Funcionario funcionario) {
        return funcionarioRepository.save(funcionario);
    }

    public List<Funcionario> getAllFuncionarios() {
        return funcionarioRepository.findAll();
    }

    public Optional<Funcionario> getFuncionarioById(Integer id) {
        return funcionarioRepository.findById(id);
    }

    public Funcionario atualizarFuncionario(Integer id, Funcionario funcionarioDetails) {
        Optional<Funcionario> optionalFuncionario = funcionarioRepository.findById(id);
        if(optionalFuncionario.isPresent()) {
            Funcionario funcionario = optionalFuncionario.get();
            funcionario.setCargo(funcionarioDetails.getCargo());
            funcionario.setSalario(funcionarioDetails.getSalario());
            funcionario.setDepartamento(funcionarioDetails.getDepartamento());
            return funcionarioRepository.save(funcionario);
        }
        return null;
    }

    public void deletarFuncionarios(Integer id) {
        funcionarioRepository.deleteById(id);
    }

    public void  deletarPorData(String data){

    }
}

