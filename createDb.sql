BEGIN;

CREATE TABLE IF NOT EXISTS "feet"
(
    "id" bigint GENERATED ALWAYS AS IDENTITY PRIMARY KEY UNIQUE,
    "phrase" text  NOT NULL,
    "syllable" integer NOT NULL,
    "rhyme" text NOT NULL,
    "option" text
);
CREATE TABLE IF NOT EXISTS "feet"
(
    "id" integer GENERATED ALWAYS AS IDENTITY PRIMARY KEY UNIQUE,
    "label" text  NOT NULL

);

CREATE TABLE feet_has_theme (
	"id_theme" bigint REFERENCES theme(id),
	"id_feet" integer REFERENCES feet(id)
);
COMMIT;