create database descanso;
use descanso;
CREATE TABLE area
(
	IdArea               CHAR(4) NOT NULL,
	Anombre              VARCHAR(50) NULL
);



ALTER TABLE area
ADD PRIMARY KEY (IdArea);



CREATE TABLE descanso
(
	IdDescanso           CHAR(6) NOT NULL,
	DFinicio             DATE NULL,
	DFfin                DATE NULL,
	Ddiagnostico         VARCHAR(250) NULL,
	DCentroSalud         VARCHAR(100) NULL,
	DMedico              VARCHAR(200) NULL,
	DCMP                 CHAR(6) NULL,
	IdTrabajador         CHAR(10) NOT NULL
);



ALTER TABLE descanso
ADD PRIMARY KEY (IdDescanso,IdTrabajador);



CREATE TABLE Detalle_Area_Trab
(
	IdTrabajador         CHAR(10) NOT NULL,
	IdArea               CHAR(4) NOT NULL,
	DetFechaIngreso      DATE NULL
);



ALTER TABLE Detalle_Area_Trab
ADD PRIMARY KEY (IdTrabajador,IdArea);



CREATE TABLE trabajador
(
	IdTrabajador         CHAR(10) NOT NULL,
	Tnombre              VARCHAR(50) NULL,
	Tapellido            VARCHAR(50) NULL,
	TFnac                DATE NULL,
	Tdirec               VARCHAR(100) NULL,
	Tsexo                CHAR(1) NULL,
	Tdni                 CHAR(8) NULL,
	TestadoCiv           CHAR(1) NULL
);



ALTER TABLE trabajador
ADD PRIMARY KEY (IdTrabajador);



ALTER TABLE descanso
ADD FOREIGN KEY R_3 (IdTrabajador) REFERENCES trabajador (IdTrabajador);



ALTER TABLE Detalle_Area_Trab
ADD FOREIGN KEY R_1 (IdTrabajador) REFERENCES trabajador (IdTrabajador);



ALTER TABLE Detalle_Area_Trab
ADD FOREIGN KEY R_2 (IdArea) REFERENCES area (IdArea);