package br.com.tinnova.veiculos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.tinnova.veiculos.model.Veiculo;

public interface VeiculosRepository extends JpaRepository<Veiculo, Integer>{

}
