package br.com.academy.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.academy.model.Aluno;

public interface AlunoDao extends JpaRepository<Aluno, Integer> {
	
	@Query("select d from Aluno d where d.status = 'ATIVO' ")
	public List<Aluno> findByStatusAtivos();
	
	@Query("select j from Aluno j where j.status = 'INATIVO' ")
	public List<Aluno> findByStatusInativos();
	
	@Query("select j from Aluno j where j.status = 'TRANCADO' ")
	public List<Aluno> findByStatusTrancados();
	
	@Query("select j from Aluno j where j.status = 'CANCELADO' ")
	public List<Aluno> findByStatusCancelado();
	
	public List<Aluno> findByNomeContainingIgnoreCase(String nome);
	
	

}
