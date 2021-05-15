-- Database: hrms

-- DROP DATABASE hrms;

CREATE DATABASE hrms
    WITH 
    OWNER = postgres
    ENCODING = 'UTF8'
    LC_COLLATE = 'Turkish_Turkey.1254'
    LC_CTYPE = 'Turkish_Turkey.1254'
    TABLESPACE = pg_default
    CONNECTION LIMIT = -1;
	
-- Table: public.Users

-- DROP TABLE public."Users";

CREATE TABLE public."Users"
(
    "Id" integer NOT NULL GENERATED ALWAYS AS IDENTITY ( INCREMENT 1 START 1 MINVALUE 1 MAXVALUE 2147483647 CACHE 1 ),
    "Email" character(50) COLLATE pg_catalog."default" NOT NULL,
    "Password" character(50) COLLATE pg_catalog."default" NOT NULL,
    "ConfirmEmail" boolean NOT NULL,
    CONSTRAINT "Users_pkey" PRIMARY KEY ("Id"),
    CONSTRAINT "UK_Email" UNIQUE ("Email")
)

TABLESPACE pg_default;

ALTER TABLE public."Users"
    OWNER to postgres;

COMMENT ON DATABASE hrms
    IS 'Human Resource Management System';
	
-- Table: public.Personals

-- DROP TABLE public."Personals";

CREATE TABLE public."Personals"
(
    "UserId" integer NOT NULL,
    "FirstName" character(50) COLLATE pg_catalog."default" NOT NULL,
    "LastName" character(50) COLLATE pg_catalog."default" NOT NULL,
    CONSTRAINT "PK_Personals" PRIMARY KEY ("UserId"),
    CONSTRAINT "FK_Personals_Users" FOREIGN KEY ("UserId")
        REFERENCES public."Users" ("Id") MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
        NOT VALID
)

TABLESPACE pg_default;

ALTER TABLE public."Personals"
    OWNER to postgres;
	
-- Table: public.JobSeekers

-- DROP TABLE public."JobSeekers";

CREATE TABLE public."JobSeekers"
(
    "UserId" integer NOT NULL,
    "FirstName" character(50) COLLATE pg_catalog."default" NOT NULL,
    "LastName" character(50) COLLATE pg_catalog."default" NOT NULL,
    "NationalId" character(11) COLLATE pg_catalog."default" NOT NULL,
    "YearOfBirth" date NOT NULL,
    CONSTRAINT "PK_JobSeekers" PRIMARY KEY ("UserId"),
    CONSTRAINT "UK_NationalId" UNIQUE ("NationalId")
        INCLUDE("NationalId"),
    CONSTRAINT "FK_JobSeekers_Users" FOREIGN KEY ("UserId")
        REFERENCES public."Users" ("Id") MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
)

TABLESPACE pg_default;

ALTER TABLE public."JobSeekers"
    OWNER to postgres;
	
-- Table: public.Employers

-- DROP TABLE public."Employers";

CREATE TABLE public."Employers"
(
    "UserId" integer NOT NULL,
    "CompanyName" character(100) COLLATE pg_catalog."default" NOT NULL,
    "WebSiteAddress" character(50) COLLATE pg_catalog."default" NOT NULL,
    "PhoneNumber" character(15) COLLATE pg_catalog."default" NOT NULL,
    "ConfirmOfSystem" boolean NOT NULL,
    CONSTRAINT "PK_Employers" PRIMARY KEY ("UserId"),
    CONSTRAINT "UK_CompanyName" UNIQUE ("CompanyName")
        INCLUDE("CompanyName"),
    CONSTRAINT "UK_WebSiteAddress" UNIQUE ("WebSiteAddress")
        INCLUDE("WebSiteAddress"),
    CONSTRAINT "FK_Employers_Users" FOREIGN KEY ("UserId")
        REFERENCES public."Users" ("Id") MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
)

TABLESPACE pg_default;

ALTER TABLE public."Employers"
    OWNER to postgres;
	
-- Table: public.Jobs

-- DROP TABLE public."Jobs";

CREATE TABLE public."Jobs"
(
    "Id" integer NOT NULL GENERATED ALWAYS AS IDENTITY ( INCREMENT 1 START 1 MINVALUE 1 MAXVALUE 2147483647 CACHE 1 ),
    "Name" character(50) COLLATE pg_catalog."default" NOT NULL,
    "Description" character(100) COLLATE pg_catalog."default" NOT NULL,
    CONSTRAINT "PK_Jobs" PRIMARY KEY ("Id")
        INCLUDE("Id")
)

TABLESPACE pg_default;

ALTER TABLE public."Jobs"
    OWNER to postgres;
