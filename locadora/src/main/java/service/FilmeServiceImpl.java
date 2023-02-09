package service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Shared.FilmeCompletoDto;
import Shared.FilmeDto;
import model.Filme;
import repository.FilmeRepository;

@Service
public class FilmeServiceImpl implements FilmeService {
  @Autowired
  private FilmeRepository repositorio;

  @Override
  public List<FilmeCompletoDto> obterTodos() {
    List<Filme> filmes = repositorio.findAll();
    
    return filmes.stream()
                .map(f -> new ModelMapper().map(f, FilmeCompletoDto.class))
                .collect(Collectors.toList());
  }

  @Override
  public Optional<FilmeDto> obterPorId(String id) {
    Optional<Filme> filme  = repositorio.findById(id);

    if (filme.isPresent()) {
      return Optional.of(new ModelMapper().map(filme.get(), FilmeDto.class));
    }
    return Optional.empty();
  }

  @Override
  public void excluirPorId(String id) {
    repositorio.deleteById(id);
  }

  @Override
  public FilmeCompletoDto cadastrar(FilmeCompletoDto dto) {
    Filme filme = new ModelMapper().map(dto, Filme.class);
    repositorio.save(filme);
    return new ModelMapper().map(filme, FilmeCompletoDto.class);  
  }

  @Override
  public Optional<FilmeCompletoDto> atualizarPorId(String id, FilmeCompletoDto dto) { 
    Optional<Filme> retorno = repositorio.findById(id);

    if (retorno.isPresent()) {
      Filme filme = new ModelMapper().map(dto, Filme.class);
      filme.setId(id);
      repositorio.save(filme);
      return Optional.of(new ModelMapper().map(filme, FilmeCompletoDto.class));
    } else {
      return Optional.empty();
    }
    
   
  }
  
}