CREATE TABLE consultas (
    id serial NOT NULL,
    medico_id bigint NOT NULL,
    paciente_id bigint NOT NULL,
    data timestamp NOT NULL,  -- Alterado para timestamp

    PRIMARY KEY (id),
    CONSTRAINT fk_consultas_medico_id FOREIGN KEY (medico_id) REFERENCES medicos(id),
    CONSTRAINT fk_consultas_paciente_id FOREIGN KEY (paciente_id) REFERENCES pacientes(id)
);
