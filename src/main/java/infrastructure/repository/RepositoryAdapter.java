package infrastructure.repository;

import domain.model.EmpresaDTO;
import domain.model.repository.RequestGateway;
import infrastructure.entity.EmpresaEntity;
import infrastructure.mapper.EmpresaMapper;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

@ApplicationScoped
public class RepositoryAdapter implements RequestGateway {

    private final Logger LOG = Logger.getLogger(RepositoryAdapter.class.getName());

    @Inject
    Repository repository;

    @Inject
    EmpresaMapper mapper;

    @Override
    public EmpresaDTO save(EmpresaDTO empresaDTO) {
        EmpresaEntity empresaEntity = mapper.empresasDTOtoEntity(empresaDTO);
        return mapper.empreasEntityToDTO(repository.save(empresaEntity));
    }

    @Override
    public List<EmpresaDTO> findById(int idEmpresa) {
        LOG.info("Consumo DB");
        List<EmpresaEntity> result = repository.findByTipoIdEmpresa(idEmpresa);
        return mapper.toEmpresasDTO(result);
    }

    @Override
    public List<EmpresaDTO> findAll() {
        List<EmpresaEntity> resp = (List<EmpresaEntity>) repository.findAll();
        return mapper.toEmpresasDTO(resp);
    }

    @Override
    public EmpresaDTO update(EmpresaDTO empresaDTO) {
        EmpresaEntity empresaEntity = mapper.empresasDTOtoEntity(empresaDTO);
        return mapper.empreasEntityToDTO(repository.save(empresaEntity));
    }

    @Override
    public void delete(int idEmpresa) {
        repository.deleteById(idEmpresa);
    }
}
