package domain.service;

import domain.model.EmpresaDTO;
import infrastructure.repository.RepositoryAdapter;
import io.quarkus.cache.CacheResult;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.List;
import java.util.Optional;

@ApplicationScoped
public class EmpresaService {

    @Inject
    RepositoryAdapter repositoryAdapter;

    public EmpresaDTO save(EmpresaDTO empresaDTO){return repositoryAdapter.save(empresaDTO);}

    @CacheResult(cacheName = "cache-empresas")
    public List<EmpresaDTO> findById(int idEmpresa){return repositoryAdapter.findById(idEmpresa);}

    public List<EmpresaDTO> findAll(){return repositoryAdapter.findAll();}

    public EmpresaDTO update(EmpresaDTO empresaDTO) {
        EmpresaDTO resp = null;
        if(!repositoryAdapter.findById(empresaDTO.getTipoIdEmpresa()).isEmpty()){
            resp = repositoryAdapter.update(empresaDTO);
        }
        return resp;
    }

    public void delete(int idEmpresa) {
        repositoryAdapter.delete(idEmpresa);
    }





}
