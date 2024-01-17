--
-- PostgreSQL database dump
--

-- Dumped from database version 16.1 (Debian 16.1-1.pgdg120+1)
-- Dumped by pg_dump version 16.1 (Debian 16.1-1.pgdg120+1)

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

--
-- Name: hotelparadise; Type: SCHEMA; Schema: -; Owner: postgres
--

CREATE SCHEMA hotelparadise;


ALTER SCHEMA hotelparadise OWNER TO postgres;

--
-- Name: tipo_habitacion; Type: TYPE; Schema: public; Owner: postgres
--

CREATE TYPE public.tipo_habitacion AS ENUM (
    'Estandar',
    'Superior',
    'Deluxe'
);


ALTER TYPE public.tipo_habitacion OWNER TO postgres;

SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- Name: cliente; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.cliente (
    "contraseña" character varying(45) NOT NULL,
    usuario character varying(45) NOT NULL,
    nombre character varying(45),
    apellidos character varying(45),
    email character varying(45),
    telefono integer,
    dir_postal character varying(45),
    dni integer NOT NULL,
    pasaporte integer,
    num_credito integer
);


ALTER TABLE public.cliente OWNER TO postgres;

--
-- Name: habitaciones; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.habitaciones (
    "Capacidad_adultos" integer,
    "Capacidad_niños" integer,
    tipo public.tipo_habitacion,
    estado character varying,
    id_hab integer NOT NULL
);


ALTER TABLE public.habitaciones OWNER TO postgres;

--
-- Name: precio; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.precio (
    nombre character varying(45)[] NOT NULL,
    valor integer
);


ALTER TABLE public.precio OWNER TO postgres;

--
-- Name: reserva; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.reserva (
    dni_cli integer,
    num_reserva integer NOT NULL,
    fecha_inicio date,
    fecha_fin date,
    acomodacion character varying,
    num_adultos integer,
    "num_niños" integer,
    id_hab integer
);


ALTER TABLE public.reserva OWNER TO postgres;

--
-- Data for Name: cliente; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.cliente ("contraseña", usuario, nombre, apellidos, email, telefono, dir_postal, dni, pasaporte, num_credito) FROM stdin;
\.


--
-- Data for Name: habitaciones; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.habitaciones ("Capacidad_adultos", "Capacidad_niños", tipo, estado, id_hab) FROM stdin;
\.


--
-- Data for Name: precio; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.precio (nombre, valor) FROM stdin;
\.


--
-- Data for Name: reserva; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.reserva (dni_cli, num_reserva, fecha_inicio, fecha_fin, acomodacion, num_adultos, "num_niños", id_hab) FROM stdin;
\.


--
-- Name: cliente cliente_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.cliente
    ADD CONSTRAINT cliente_pkey PRIMARY KEY (dni);


--
-- Name: habitaciones habitaciones_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.habitaciones
    ADD CONSTRAINT habitaciones_pkey PRIMARY KEY (id_hab);


--
-- Name: precio precio_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.precio
    ADD CONSTRAINT precio_pkey PRIMARY KEY (nombre);


--
-- Name: reserva reserva_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.reserva
    ADD CONSTRAINT reserva_pkey PRIMARY KEY (num_reserva);


--
-- Name: reserva dni_cliente; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.reserva
    ADD CONSTRAINT dni_cliente FOREIGN KEY (dni_cli) REFERENCES public.cliente(dni);


--
-- Name: reserva id_habitaciones; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.reserva
    ADD CONSTRAINT id_habitaciones FOREIGN KEY (id_hab) REFERENCES public.habitaciones(id_hab) NOT VALID;


--
-- PostgreSQL database dump complete
--

