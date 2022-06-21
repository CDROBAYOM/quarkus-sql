package domain.model.repository;

import domain.model.EmpresaDTO;

import java.util.List;
import java.util.Optional;

public interface RequestGateway {

    EmpresaDTO save (EmpresaDTO empresaDTO);
    List<EmpresaDTO> findById(int idEmpresa);
    List<EmpresaDTO> findAll();
    EmpresaDTO update(EmpresaDTO empresaDTO);
    void delete(int idEmpresa);
}
