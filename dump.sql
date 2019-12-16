--
-- PostgreSQL database dump
--

-- Dumped from database version 12.1 (Ubuntu 12.1-1.pgdg18.04+1)
-- Dumped by pg_dump version 12.1 (Ubuntu 12.1-1.pgdg18.04+1)

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

DROP DATABASE printedition;
--
-- Name: printedition; Type: DATABASE; Schema: -; Owner: postgres
--

CREATE DATABASE printedition WITH TEMPLATE = template0 ENCODING = 'UTF8' LC_COLLATE = 'ru_RU.UTF-8' LC_CTYPE = 'ru_RU.UTF-8';


ALTER DATABASE printedition OWNER TO postgres;

\connect printedition

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

SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- Name: books; Type: TABLE; Schema: public; Owner: labs_soa
--

CREATE TABLE public.books (
    id_book integer NOT NULL,
    name_book character varying(200),
    genre character varying(100),
    publication character varying(200),
    author character varying(200),
    cost integer
);


ALTER TABLE public.books OWNER TO labs_soa;

--
-- Name: books_id_book_seq; Type: SEQUENCE; Schema: public; Owner: labs_soa
--

CREATE SEQUENCE public.books_id_book_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.books_id_book_seq OWNER TO labs_soa;

--
-- Name: books_id_book_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: labs_soa
--

ALTER SEQUENCE public.books_id_book_seq OWNED BY public.books.id_book;


--
-- Name: magazine; Type: TABLE; Schema: public; Owner: labs_soa
--

CREATE TABLE public.magazine (
    id_magazin integer NOT NULL,
    name_magazine character varying(200),
    publication character varying(200),
    category character varying(100),
    journal_number character varying(50),
    cost integer
);


ALTER TABLE public.magazine OWNER TO labs_soa;

--
-- Name: magazine_id_magazin_seq; Type: SEQUENCE; Schema: public; Owner: labs_soa
--

CREATE SEQUENCE public.magazine_id_magazin_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.magazine_id_magazin_seq OWNER TO labs_soa;

--
-- Name: magazine_id_magazin_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: labs_soa
--

ALTER SEQUENCE public.magazine_id_magazin_seq OWNED BY public.magazine.id_magazin;


--
-- Name: schoolbook; Type: TABLE; Schema: public; Owner: labs_soa
--

CREATE TABLE public.schoolbook (
    id_schoolbook integer NOT NULL,
    name_schoolbook character varying(200),
    class_school integer,
    publication character varying(200),
    author character varying(200),
    cost integer
);


ALTER TABLE public.schoolbook OWNER TO labs_soa;

--
-- Name: schoolbook_id_schoolbook_seq; Type: SEQUENCE; Schema: public; Owner: labs_soa
--

CREATE SEQUENCE public.schoolbook_id_schoolbook_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.schoolbook_id_schoolbook_seq OWNER TO labs_soa;

--
-- Name: schoolbook_id_schoolbook_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: labs_soa
--

ALTER SEQUENCE public.schoolbook_id_schoolbook_seq OWNED BY public.schoolbook.id_schoolbook;


--
-- Name: books id_book; Type: DEFAULT; Schema: public; Owner: labs_soa
--

ALTER TABLE ONLY public.books ALTER COLUMN id_book SET DEFAULT nextval('public.books_id_book_seq'::regclass);


--
-- Name: magazine id_magazin; Type: DEFAULT; Schema: public; Owner: labs_soa
--

ALTER TABLE ONLY public.magazine ALTER COLUMN id_magazin SET DEFAULT nextval('public.magazine_id_magazin_seq'::regclass);


--
-- Name: schoolbook id_schoolbook; Type: DEFAULT; Schema: public; Owner: labs_soa
--

ALTER TABLE ONLY public.schoolbook ALTER COLUMN id_schoolbook SET DEFAULT nextval('public.schoolbook_id_schoolbook_seq'::regclass);


--
-- Data for Name: books; Type: TABLE DATA; Schema: public; Owner: labs_soa
--

COPY public.books (id_book, name_book, genre, publication, author, cost) FROM stdin;
1	Королевский конфуз	Современная зарубежная проза	 Аркадия, 2020 г.	Риз Боуэн	348
2	Большое путешествие по телу человека	Атласы и энциклопедии для детей	Лабиринт, 2019 г.	Джон Фарндон	470
3	Сулажин	Роман	АСТ, 2019 г.	Борис Акунин	675
4	Ветер в его сердце	Роман	Аркадия, 2019 г.	де Линт Чарльз	528
10	asd	dsd	gfd	dd	55
11	DSD	SDSD	ASD	QWE	888
12	asd	dsd	gfd		55
13	asd	dsd	gfd		55
\.


--
-- Data for Name: magazine; Type: TABLE DATA; Schema: public; Owner: labs_soa
--

COPY public.magazine (id_magazin, name_magazine, publication, category, journal_number, cost) FROM stdin;
1	СӨЕМБИКӘ	Филиал ОАО «Татмедиа» «Редакция журнала «Сююмбикэ»	Женский журнал	11-2019	60
2	5 КОЛЕСО	ООО "5К"	Авто	11-2019 14/11/19	85
3	СОВЕТСКИЙ СПОРТ	ООО "Редакция газеты "Советский спорт"	ФУТБОЛ	34-2019 12/11/19	30
4	СМЕНА	ООО «Журнал «Смена»	Досуг и развлечение	12-2019 20/11/19	50
5	tttt	ooo yyy	hren	55	50
\.


--
-- Data for Name: schoolbook; Type: TABLE DATA; Schema: public; Owner: labs_soa
--

COPY public.schoolbook (id_schoolbook, name_schoolbook, class_school, publication, author, cost) FROM stdin;
7	ЕГЭ-20 Русский язык. Типовые экзаменационные варианты. 36 вариантов.	11	Национальное образование, 2019 г.	Цыбулько	504
8	Алгебра. 9 класс. Дидактические материалы	9	Вентана-Граф, 2020 г.	Мерзляк Аркадий Григорьевич	234
9	Биология. 7 класс. Рабочая тетрадь. В 2-х частях. Часть 1	7	Вентана-Граф, 2020 г.	Суматохин Сергей Витальевич	280
10	Математика. 5 класс. Тесты к учебнику А.Г. Мерзляка и др.	5	Экзамен, 2019 г.	Ерина Татьяна Михайловна	103
\.


--
-- Name: books_id_book_seq; Type: SEQUENCE SET; Schema: public; Owner: labs_soa
--

SELECT pg_catalog.setval('public.books_id_book_seq', 13, true);


--
-- Name: magazine_id_magazin_seq; Type: SEQUENCE SET; Schema: public; Owner: labs_soa
--

SELECT pg_catalog.setval('public.magazine_id_magazin_seq', 5, true);


--
-- Name: schoolbook_id_schoolbook_seq; Type: SEQUENCE SET; Schema: public; Owner: labs_soa
--

SELECT pg_catalog.setval('public.schoolbook_id_schoolbook_seq', 10, true);


--
-- Name: books books_pkey; Type: CONSTRAINT; Schema: public; Owner: labs_soa
--

ALTER TABLE ONLY public.books
    ADD CONSTRAINT books_pkey PRIMARY KEY (id_book);


--
-- Name: magazine magazine_pkey; Type: CONSTRAINT; Schema: public; Owner: labs_soa
--

ALTER TABLE ONLY public.magazine
    ADD CONSTRAINT magazine_pkey PRIMARY KEY (id_magazin);


--
-- Name: schoolbook schoolbook_pkey; Type: CONSTRAINT; Schema: public; Owner: labs_soa
--

ALTER TABLE ONLY public.schoolbook
    ADD CONSTRAINT schoolbook_pkey PRIMARY KEY (id_schoolbook);


--
-- Name: DATABASE printedition; Type: ACL; Schema: -; Owner: postgres
--

GRANT ALL ON DATABASE printedition TO labs_soa;


--
-- PostgreSQL database dump complete
--

