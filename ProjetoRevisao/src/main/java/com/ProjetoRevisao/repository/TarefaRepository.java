package com.ProjetoRevisao.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ProjetoRevisao.entities.Tarefa;

public interface TarefaRepository extends JpaRepository <Tarefa, Long> {

}
