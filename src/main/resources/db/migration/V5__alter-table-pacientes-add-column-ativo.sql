ALTER TABLE pacientes ADD COLUMN ativo boolean DEFAULT true;

UPDATE pacientes SET ativo = true;  -- Isso já define o valor para todas as linhas existentes
