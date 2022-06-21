package infrastructure.repository;

import infrastructure.entity.EmpresaEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface Repository extends CrudRepository<EmpresaEntity,Integer> {

    List<EmpresaEntity> findByTipoIdEmpresa(int idEmpresa);
}
