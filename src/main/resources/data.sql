
INSERT INTO usuario (email, username, password, role)
  VALUES ('maria.silva@email.com', 'maria.silva', '$2a$12$d57OqTxkLw/Jz3BI/MOWzu18jgbYO9wYyx5OjN.dRs3JbRrAJRsbG', 'ADMIN');
INSERT INTO usuario (email, username, password, role)
  VALUES ('joao.santos@email.com', 'joao.santos', '$2a$12$oQK7JbjBbCtcjNV1ChlDE.v0LHZ2YH8CeOJ8uXZ7ow/Ux0CfFItEq', 'ADMIN');
INSERT INTO usuario (email, username, password, role)
  VALUES ('ana.pereira@email.com', 'ana.pereira', '$2a$12$o2O21a5I9gxqYmEMfdMu9eo5bFSWKjyRsJqiODMAkSQ1zewyeN1V.', 'DEPARTAMENTO1');
INSERT INTO usuario (email, username, password, role)
  VALUES ('pedro.oliveira@email.com', 'pedro.oliveira', '$2a$12$/yuuVxz8TIBpwYbcMHdTAODMtRtylfkRLHK5oC5FclLtYTN6/uuq.', 'DEPARTAMENTO1');
INSERT INTO usuario (email, username, password, role)
  VALUES ('laura.costa@email.com', 'laura.costa', '$2a$12$0F7xyirflMdMHYxIW79rJuZy3kpCQrddDePGDWVX69..4Cnqd2Pt.', 'DEPARTAMENTO1');
INSERT INTO usuario (email, username, password, role)
  VALUES ('luis.rodrigues@email.com', 'luis.rodrigues', '$2a$12$FAeYay7E4OF480XqSd.DCOyKvotPy1w/7UxI1E7nNsSdq8ssqIp7m', 'DEPARTAMENTO1');
INSERT INTO usuario (email, username, password, role)
  VALUES ('sofia.almeida@email.com', 'sofia.almeida', '$2a$12$VXYcP6ZpJHQFAyoWmdITd.l5qE06qDtu0V0uuc0fdqzRQVfD8Now6', 'DEPARTAMENTO1');
INSERT INTO usuario (email, username, password, role)
  VALUES ('miguel.ferreira@email.com', 'miguel.ferreira', '$2a$12$fEutdrPpxd.7CeIZn3fOJOlXKTs7is1afKECf4pui2LZYw2LheTe6', 'DEPARTAMENTO1');
INSERT INTO usuario (email, username, password, role)
  VALUES ('carolina.sousa@email.com', 'carolina.sousa', '$2a$12$2Jc7Y4ecLcn9zI6Vkvjqd.RBbV3zMc7CCCRldlI6153Y2RzGQVpa2', 'DEPARTAMENTO1');
INSERT INTO usuario (email, username, password, role)
  VALUES ('tiago.santos@email.com', 'tiago.santos', '$2a$12$NcbYFE2h/9t9f/6O0nfNru..y4/L.nZW/rnlk4cxx01/TMFdmhdLG', 'DEPARTAMENTO1');

INSERT INTO encomenda (uuid, nome_remetente, nome_destinatario, descricao, tipo_pacote, origem_logradouro, origem_numero, origem_cidade, origem_estado, origem_codigo_postal, destino_logradouro, destino_numero, destino_cidade, destino_estado, destino_codigo_postal, valor_frete, usuario_id)
VALUES
('d633013e-6ea8-48e0-b2a1-0c42adeb3431', 'Pedro Oliveira', 'Luisa Costa', 'Eletrônicos', 'MEDIO', 'Rua das Oliveiras', '25', 'Porto Alegre', 'RS', '56789-012', 'Avenida dos Pinheiros', '35', 'Curitiba', 'PR', '12345-678', 60.00, 4),
('017af59e-e6a3-4a26-81ca-07ecfe81f681', 'Fernanda Almeida', 'Ricardo Santos', 'Jogos', 'PEQUENO', 'Rua das Aroeiras', '15', 'Belo Horizonte', 'MG', '34567-890', 'Avenida dos Ipês', '25', 'Florianópolis', 'SC', '23456-789', 70.00, 5),
('a482e4f2-d275-47ef-bc72-afaf26a32a2f', 'Juliana Rodrigues', 'Fábio Silva', 'Cosméticos', 'PEQUENO', 'Rua dos Jasmins', '5', 'Goiânia', 'GO', '45678-901', 'Avenida das Camélias', '15', 'São Luís', 'MA', '34567-890', 45.00, 6),
('ca6c3621-fcaf-4e80-8985-07a75bc62502', 'Mariana Oliveira', 'Rodrigo Alves', 'Roupas', 'GRANDE', 'Rua das Azaleias', '40', 'Manaus', 'AM', '56789-012', 'Avenida das Orquídeas', '30', 'Vitória', 'ES', '45678-901', 90.00, 7),
('e699ef16-7fb7-4135-8159-e4b13f12a5b3', 'Roberto Castro', 'Sandra Santos', 'Livros', 'EXTRAGRANDE', 'Rua dos Cravos', '20', 'Recife', 'PE', '67890-123', 'Avenida das Rosas', '10', 'João Pessoa', 'PB', '56789-012', 55.00, 8),
('60357ea6-d9b9-48b9-9c3f-718afa9683a1', 'Patricia Almeida', 'Rafaela Lima', 'Eletrônicos', 'GRANDE', 'Rua das Margaridas', '30', 'Salvador', 'BA', '78901-234', 'Avenida das Tulipas', '5', 'Maceió', 'AL', '67890-123', 85.00, 9),
('9b1dd733-84b3-470d-ac40-88b0b5236a1e', 'Lucas Oliveira', 'Vinicius Santos', 'Jogos', 'MEDIO', 'Rua das Violetas', '15', 'Natal', 'RN', '89012-345', 'Avenida das Bromélias', '25', 'Aracaju', 'SE', '78901-234', 65.00, 9),
('6602c9c4-8a44-41cb-803d-4d6d096791f1', 'Renata Alves', 'Fernanda Lima', 'Cosméticos', 'PEQUENO', 'Rua dos Girassóis', '10', 'Brasília', 'DF', '90123-456', 'Avenida das Dálias', '20', 'Porto Velho', 'RO', '89012-345', 40.00, 9);

