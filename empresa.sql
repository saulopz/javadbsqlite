CREATE TABLE funcionario (
    func_id INTEGER PRIMARY KEY,
    nome TEXT,
    salario DECIMAL (7, 2)
);

CREATE TABLE dependente (
    func_id INTEGER,
    dep_id INTEGER PRIMARY KEY,
    nome TEXT,
    idade INTEGER
);