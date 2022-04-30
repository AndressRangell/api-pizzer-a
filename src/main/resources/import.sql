/* Populate tabla clientes */
INSERT INTO cliente (nombre, email, telefono, create_at) VALUES(1, 'Camilo Rodriguez', 'profesor@gmail.com', '12345', '2018-01-01');
INSERT INTO cliente (nombre, email, telefono, create_at) VALUES(2, 'Mr. John Doe', 'john.doe@gmail.com', '12345', '2018-01-02');
INSERT INTO cliente (nombre, email, telefono, create_at) VALUES(4, 'Linus Torvalds', 'linus.torvalds@gmail.com', '12345', '2018-01-03');
INSERT INTO cliente (nombre, email, telefono, create_at) VALUES(4, 'Rasmus Lerdorf', 'rasmus.lerdorf@gmail.com', '12345', '2018-01-04');
INSERT INTO cliente (nombre, email, telefono, create_at) VALUES(4, 'Erich Gamma', 'erich.gamma@gmail.com', '12345', '2018-02-01');
INSERT INTO cliente (nombre, email, telefono, create_at) VALUES(3, 'Richard Helm', 'richard.helm@gmail.com', '12345', '2018-02-10');
INSERT INTO cliente (nombre, email, telefono, create_at) VALUES(3, 'Ralph Johnson', 'ralph.johnson@gmail.com', '12345', '2018-02-18');
INSERT INTO cliente (nombre, email, telefono, create_at) VALUES(3, 'John Vlissides', 'john.vlissides@gmail.com', '12345', '2018-02-28');
INSERT INTO cliente (nombre, email, telefono, create_at) VALUES(3, 'Dr. James Gosling', 'james.gosling@gmail.com', '12345', '2018-03-03');
INSERT INTO cliente (nombre, email, telefono, create_at) VALUES(5, 'Magma Lee', 'magma.lee@gmail.com', '12345', '2018-03-04');
INSERT INTO cliente (nombre, email, telefono, create_at) VALUES(6, 'Tornado Roe', 'tornado.roe@gmail.com', '12345', '2018-03-05');
INSERT INTO cliente (nombre, email, telefono, create_at) VALUES(7, 'Jade Doe', 'jane.doe@gmail.com', '12345', '2018-03-06');


/* Populate tabla productos */
INSERT INTO pizza (nombre, precio, create_at) VALUES('Champiñones', 25990, NOW());
INSERT INTO pizza (nombre, precio, create_at) VALUES('Carnes', 12490, NOW());
INSERT INTO pizza (nombre, precio, create_at) VALUES('Pollo - queso', 14990, NOW());
INSERT INTO pizza (nombre, precio, create_at) VALUES('Vegana', 13990, NOW());
INSERT INTO pizza (nombre, precio, create_at) VALUES('Hawaiana', 6990, NOW());
INSERT INTO pizza (nombre, precio, create_at) VALUES('Borde de queso', 6990, NOW());
INSERT INTO pizza (nombre, precio, create_at) VALUES('Ranchera', 21990, NOW());

/* Creamos algunos pedidos */
INSERT INTO pedido (observacion, cliente_id, create_at) VALUES('Pedido para el centro', 1, NOW());

INSERT INTO item (cantidad, pedido_id, pizza_id) VALUES(1, 1, 1);
INSERT INTO item (cantidad, pedido_id, pizza_id) VALUES(2, 1, 4);
INSERT INTO item (cantidad, pedido_id, pizza_id) VALUES(1, 1, 5);
INSERT INTO item (cantidad, pedido_id, pizza_id) VALUES(1, 1, 7);

INSERT INTO pedido (observacion, cliente_id, create_at) VALUES('Pedido para el cabecera', 1, NOW());
INSERT INTO item (cantidad, pedido_id, pizza_id) VALUES(3, 2, 6);

/*Creamos los usuario del sistema*/
INSERT INTO usuario (username, password, enabled, nombre, email) VALUES ('andres','$2a$10$pLQvxwsrJWNMmPxyaFVPGujMkcS7shC0SJqoLXVzFVFSveid3eiKy',true, 'Andres Rangel','profesor@gmail.com');
INSERT INTO usuario (username, password, enabled, nombre, email) VALUES ('admin','$2a$10$xL1HiyRWfJrPZ.86dhjxO.OR7GerM/0Bh9BssLqvuxbTZZOkryjQ2',true, 'John Doe','jhon.doe@gmail.com');

INSERT INTO roles (nombre) VALUES ('ROLE_USER');
INSERT INTO roles (nombre) VALUES ('ROLE_ADMIN');

INSERT INTO usuario_roles (usuario_id, role_id) VALUES (1, 1);
INSERT INTO usuario_roles (usuario_id, role_id) VALUES (2, 2);
INSERT INTO usuario_roles (usuario_id, role_id) VALUES (2, 1);
