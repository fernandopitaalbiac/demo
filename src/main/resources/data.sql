-- Insertar profesores con especialidad1 y especialidad2 (null)
INSERT INTO profesores (nombre, especialidad1, especialidad2) VALUES ('Juan Pérez', 'Matemáticas', NULL);
INSERT INTO profesores (nombre, especialidad1, especialidad2) VALUES ('María López', 'Historia', NULL);
INSERT INTO profesores (nombre, especialidad1, especialidad2) VALUES ('Carlos García', 'Programación', NULL);

-- Insertar asignaturas
INSERT INTO asignaturas (nombre, profesor_id) VALUES ('Álgebra', 1);
INSERT INTO asignaturas (nombre, profesor_id) VALUES ('Historia Universal', 2);
INSERT INTO asignaturas (nombre, profesor_id) VALUES ('Java Avanzado', 3);

-- Insertar alumnos
INSERT INTO alumnos (nombre, apellido, email) VALUES ('Ana', 'Martínez', 'ana.martinez@example.com');
INSERT INTO alumnos (nombre, apellido, email) VALUES ('Luis', 'Fernández', 'luis.fernandez@example.com');
INSERT INTO alumnos (nombre, apellido, email) VALUES ('Elena', 'Gómez', 'elena.gomez@example.com');