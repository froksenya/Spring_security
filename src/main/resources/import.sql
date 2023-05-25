-- username = password

INSERT INTO users (username, password, name, surname, city, age) VALUES ('user1', '$2a$10$eT5mD/yW.rVpIsjhH0HzsexuV9lK8LT1sakU/lEjaw6PYn5JHvKTm', 'userOne', 'surnameOne', 'Moscow', 35);
INSERT INTO users (username, password, name, surname, city, age) VALUES ('user2', '$2a$10$kNI2Mmn8dEBko7eAwn1eYuzIOmt5hhH6GHDPob4wvVOIJWfmUe4Ei', 'userTwo', 'surnameTwo', 'Orel', 20);
INSERT INTO users (username, password, name, surname, city, age) VALUES ('user3', '$2a$12$7aEdSk0Su3KX0wlQv1ytlO8wo1at/QSwhGOPMD3KdLZmCsJLVDFhy', 'useThree', 'surnameThree', 'Suzdal', 18);
INSERT INTO users (username, password, name, surname, city, age) VALUES ('user4', '$2a$12$VXOOtnQJQJgo4AyDDveKfOX51UEAdEETk4g9bi3in4u7mGNvk7jhC', 'userFour', 'surnameFour', 'Moscow', 26);
INSERT INTO users (username, password, name, surname, city, age) VALUES ('user5', '$2a$12$GH3VtgmHmTqbn/hlQNsGe.fbTenoXFZWuv46.jqqBKMbFJJYDeA5G', 'userFive', 'surnameFive', 'Samara', 30);
INSERT INTO users (username, password, name, surname, city, age) VALUES ('admin', '$2a$10$0zGnMACMezZ89ZDPtMgfRu/qC.3h0X9puvNwXH0dFPbB.nPZrQbQu', 'adminOne', 'surnameAdminOne', 'Samara', 40);

INSERT INTO roles (name) VALUES ('ROLE_USER');
INSERT INTO roles (name) VALUES ('ROLE_ADMIN');

INSERT INTO users_roles (user_id, roles_id) VALUES (1,1);
INSERT INTO users_roles (user_id, roles_id) VALUES (2,1);
INSERT INTO users_roles (user_id, roles_id) VALUES (3,1);
INSERT INTO users_roles (user_id, roles_id) VALUES (4,1);
INSERT INTO users_roles (user_id, roles_id) VALUES (5,1);
INSERT INTO users_roles (user_id, roles_id) VALUES (6,1);
INSERT INTO users_roles (user_id, roles_id) VALUES (6,2);



