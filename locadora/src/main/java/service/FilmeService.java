package service;

import java.util.List;
import java.util.Optional;

import Shared.FilmeCompletoDto;
import Shared.FilmeDto;



public interface FilmeService {
  List<FilmeCompletoDto> obterTodos();
  Optional<FilmeDto> obterPorId(String id);
  void excluirPorId(String id);
  FilmeCompletoDto cadastrar(FilmeCompletoDto dto);
  Optional<FilmeCompletoDto> atualizarPorId(String id, FilmeCompletoDto dto);
}
