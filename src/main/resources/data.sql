
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

--INSERT INTO Encomenda (uuid, nome_Remetente, nome_Destinatario, descricao, tipo_Pacote, origem_logradouro, origem_numero, origem_cidade, origem_estado, origem_codigo_postal, destino_logradouro, destino_numero, destino_cidade, destino_estado, destino_codigo_postal, valor_Frete, usuario_id)
--VALUES
--('b3e4d5a2-4f6a-9c2d-5e6b-7f8a1d4e', 'Pedro Oliveira', 'Luisa Costa', 'Eletrônicos', 'MEDIO', 'Rua das Oliveiras', '25', 'Porto Alegre', 'RS', '56789-012', 'Avenida dos Pinheiros', '35', 'Curitiba', 'PR', '12345-678', 60.0, 3),
--('g2h3i4j5-6k7l-8m9n-0o1p-2q3r4s5t6u7v', 'Fernanda Almeida', 'Ricardo Santos', 'Jogos', 'PEQUENO', 'Rua das Aroeiras', '15', 'Belo Horizonte', 'MG', '34567-890', 'Avenida dos Ipês', '25', 'Florianópolis', 'SC', '23456-789', 70.0, 4),
--('w1x2y3z4-5a6b-7c8d-9e0f-1g2h3i4j5k6l', 'Juliana Rodrigues', 'Fábio Silva', 'Cosméticos', 'PEQUENO', 'Rua dos Jasmins', '5', 'Goiânia', 'GO', '45678-901', 'Avenida das Camélias', '15', 'São Luís', 'MA', '34567-890', 45.0, 5),
--('m9n8b7v6-5c4x3z2-1q2w3e4r5t6y', 'Mariana Oliveira', 'Rodrigo Alves', 'Roupas', 'GRANDE', 'Rua das Azaleias', '40', 'Manaus', 'AM', '56789-012', 'Avenida das Orquídeas', '30', 'Vitória', 'ES', '45678-901', 90.0, 6),
--('s1a2d3f4-5g6h7j8-9k0l1z2x3c4v', 'Roberto Castro', 'Sandra Santos', 'Livros', 'EXTRAGRANDE', 'Rua dos Cravos', '20', 'Recife', 'PE', '67890-123', 'Avenida das Rosas', '10', 'João Pessoa', 'PB', '56789-012', 55.0, 7),
--('b9v8c7x6-5z4k3m2-1n2b3v4b5n6m', 'Patricia Almeida', 'Rafaela Lima', 'Eletrônicos', 'GRANDE', 'Rua das Margaridas', '30', 'Salvador', 'BA', '78901-234', 'Avenida das Tulipas', '5', 'Maceió', 'AL', '67890-123', 85.0, 8),
--('p0o9i8u7-6y5t4r3-2e1w2q3-4a5s6d7f8g9', 'Lucas Oliveira', 'Vinicius Santos', 'Jogos', 'MEDIO', 'Rua das Violetas', '15', 'Natal', 'RN', '89012-345', 'Avenida das Bromélias', '25', 'Aracaju', 'SE', '78901-234', 65.0, 9),
--('c2v3b4n5-6m7b8v9-0l1z2x3-4a5s6d7f8g9h', 'Renata Alves', 'Fernanda Lima', 'Cosméticos', 'PEQUENO', 'Rua dos Girassóis', '10', 'Brasília', 'DF', '90123-456', 'Avenida das Dálias', '20', 'Porto Velho', 'RO', '89012-345', 40.0, 10);