package domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EmpresaDTO {

    private Integer tipoIdEmpresa;
    private Integer numeroIdRmpresa;
    private String nombreEmpresa;
    private Integer numeroEmpleados;
    private String direccionEmpresa;
    private String camposAuditoria;

}
