CREATE SEQUENCE bm_id_seq
    START WITH 1
    INCREMENT BY 50;

CREATE TABLE bookmark (
    id BIGINT DEFAULT nextval('bm_id_seq') NOT NULL,
    created_at TIMESTAMP,
    title VARCHAR(255) NOT NULL,
    url VARCHAR(255) NOT NULL,
    PRIMARY KEY (id)
);
