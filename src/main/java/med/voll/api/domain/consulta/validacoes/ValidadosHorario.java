package med.voll.api.domain.consulta.validacoes;

import med.voll.api.domain.ValidacaoException;
import med.voll.api.domain.consulta.DadosAgendamentoConsulta;

import java.time.DayOfWeek;

public class ValidadosHorario {

    public void validar(DadosAgendamentoConsulta dados){

        var dataConsulta = dados.data();
        var domingo = dataConsulta.getDayOfWeek().equals(DayOfWeek.SUNDAY);
        var antesDaAberturaClinica = dataConsulta.getHour()<7;
        var depoisDoFechamento = dataConsulta.getHour()>18;

        if(domingo || antesDaAberturaClinica || depoisDoFechamento) {
            throw new ValidacaoException("Consulta fora do horario de funcionamento");
        }

    }

}
