package med.voll.api.domain.consulta;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import med.voll.api.domain.medico.Medico;
import med.voll.api.domain.paciente.Paciente;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;


@Table(name = "consultas")
@Entity(name = "Consulta")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Consulta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "medico_id")
    private Medico medico;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "paciente_id")
    private Paciente paciente;

    private LocalDateTime data;

    @Column(name = "motivo_cancelamento")
    @Enumerated(EnumType.STRING)
    private MotivoCancelamento motivoCancelamento;

    private boolean ativo = true;

    public Consulta(Object o, Medico medico, Paciente paciente, LocalDateTime data, Object o1) {
    }

    public void desmarcar(MotivoCancelamento motivo) {
        this.motivoCancelamento = motivo;
        this.ativo = false;
    }

    public void excluir() {
        this.ativo = false;
    }
}
