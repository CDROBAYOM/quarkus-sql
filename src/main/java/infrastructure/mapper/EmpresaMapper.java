package infrastructure.mapper;

import domain.model.EmpresaDTO;
import infrastructure.entity.EmpresaEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.NullValuePropertyMappingStrategy;
import java.util.List;

@Mapper(componentModel = "cdi",
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface EmpresaMapper {

    @Mapping(target = "tipoIdEmpresa")
    EmpresaDTO empreasEntityToDTO(EmpresaEntity empresaEntity);

    @Mapping(target = "tipoIdEmpresa")
    EmpresaEntity empresasDTOtoEntity(EmpresaDTO empresaDTO);

    List<EmpresaDTO> toEmpresasDTO(List<EmpresaEntity> empresaEntities);
}