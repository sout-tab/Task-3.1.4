INSERT INTO roles(name) VALUES ('ROLE_USER'),
                               ('ROLE_ADMIN');

INSERT INTO users(age, last_name, password, username) VALUES (22, 'userov', '$2a$12$7pIopZ3eKtdMaicIbedBwOmagM4/XmElKhwvaj6uIEDtWeq6tWTRi', 'user'),
                                                             (23, 'adminov', '$2a$12$QLMRL99R4vJDDttsSGFRR.0e60HUllQrCfltfUrfbQy2J4hX2MRqW', 'admin');

INSERT INTO users_roles VALUES (1, 1),
                               (2, 1),
                               (2, 2);