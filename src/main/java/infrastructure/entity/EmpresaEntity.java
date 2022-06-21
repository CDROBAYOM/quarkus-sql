package infrastructure.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "POC_EMPRESAS")
@Entity
@Builder
public class EmpresaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "TIPO_ID_EMPRESA")
    private Integer tipoIdEmpresa;

    @Column(name = "NUMERO_ID_EMPRESA")
    private Integer numeroIdRmpresa;

    @Column(name = "NOMBRE_EMPRESA")
    private String nombreEmpresa;

    @Column(name = "NUMERO_EMPLEADOS")
    private Integer numeroEmpleados;

    @Column(name = "DIRECCION_EMPRESA")
    private String direccionEmpresa;

    @Column(name = "AUDITORIA")
    private String camposAuditoria;
}
