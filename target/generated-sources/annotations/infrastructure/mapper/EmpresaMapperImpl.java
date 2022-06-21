package infrastructure.mapper;

import domain.model.EmpresaDTO;
import domain.model.EmpresaDTO.EmpresaDTOBuilder;
import infrastructure.entity.EmpresaEntity;
import infrastructure.entity.EmpresaEntity.EmpresaEntityBuilder;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import javax.enterprise.context.ApplicationScoped;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-06-21T09:46:27-0500",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.14.1 (Eclipse Adoptium)"
)
@ApplicationScoped
public class EmpresaMapperImpl implements EmpresaMapper {

    @Override
    public EmpresaDTO empreasEntityToDTO(EmpresaEntity empresaEntity) {
        if ( empresaEntity == null ) {
            return null;
        }

        EmpresaDTOBuilder empresaDTO = EmpresaDTO.builder();

        empresaDTO.tipoIdEmpresa( empresaEntity.getTipoIdEmpresa() );
        empresaDTO.numeroIdRmpresa( empresaEntity.getNumeroIdRmpresa() );
        empresaDTO.nombreEmpresa( empresaEntity.getNombreEmpresa() );
        empresaDTO.numeroEmpleados( empresaEntity.getNumeroEmpleados() );
        empresaDTO.direccionEmpresa( empresaEntity.getDireccionEmpresa() );
        empresaDTO.camposAuditoria( empresaEntity.getCamposAuditoria() );

        return empresaDTO.build();
    }

    @Override
    public EmpresaEntity empresasDTOtoEntity(EmpresaDTO empresaDTO) {
        if ( empresaDTO == null ) {
            return null;
        }

        EmpresaEntityBuilder empresaEntity = EmpresaEntity.builder();

        empresaEntity.tipoIdEmpresa( empresaDTO.getTipoIdEmpresa() );
        empresaEntity.numeroIdRmpresa( empresaDTO.getNumeroIdRmpresa() );
        empresaEntity.nombreEmpresa( empresaDTO.getNombreEmpresa() );
        empresaEntity.numeroEmpleados( empresaDTO.getNumeroEmpleados() );
        empresaEntity.direccionEmpresa( empresaDTO.getDireccionEmpresa() );
        empresaEntity.camposAuditoria( empresaDTO.getCamposAuditoria() );

        return empresaEntity.build();
    }

    @Override
    public List<EmpresaDTO> toEmpresasDTO(List<EmpresaEntity> empresaEntities) {
        if ( empresaEntities == null ) {
            return null;
        }

        List<EmpresaDTO> list = new ArrayList<EmpresaDTO>( empresaEntities.size() );
        for ( EmpresaEntity empresaEntity : empresaEntities ) {
            list.add( empreasEntityToDTO( empresaEntity ) );
        }

        return list;
    }
}
