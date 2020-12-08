package br.com.tinnova.veiculos.resource;

import java.sql.Timestamp;
import java.util.Calendar;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.tinnova.veiculos.model.Veiculo;
import br.com.tinnova.veiculos.repository.VeiculosRepository;

@RestController
@RequestMapping("/veiculo")
public class VeiculoResource {

	@Autowired
	private VeiculosRepository veiculoRepository;

	@GetMapping
	public List<Veiculo> getAll() {
		return veiculoRepository.findAll();
	}

	// GET /veiculos/find
	@GetMapping("/find")
	public Optional<Veiculo> find() {
		return null;
	}

	// GET /veiculos/{id}
	@GetMapping("/find/{id}")
	public Optional<Veiculo> findOne(@PathVariable("id") Integer id) {
		return veiculoRepository.findById(id);
	}

	// POST /veiculos
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Veiculo insert(@RequestBody Veiculo veiculo) {
		veiculo.setCreated(new Timestamp(Calendar.getInstance().getTimeInMillis()));
		veiculo.setUpdated(new Timestamp(Calendar.getInstance().getTimeInMillis()));
		veiculo.setVendido(false);
		Veiculo veiculoSalvo = veiculoRepository.save(veiculo);
		return veiculoSalvo;
	}

//  TODO
//  PUT /veiculos/{id}
//	@PutMapping("{id}")
//	public Veiculo update(Veiculo veiculo) {
//		return veiculoRepository.save(veiculo);
//	}

//	TODO
//	PATCH /veiculos/{id}
//	@PatchMapping("{id}")
//	public Veiculo updateEven(Veiculo veiculo) {
//		return veiculoRepository.save(veiculo);
//	}

	// DELETE /veiculos/{id}
	@DeleteMapping("{id}")
	public void delete(@PathVariable("id") Integer id) {
		veiculoRepository.deleteById(id);
	}

}