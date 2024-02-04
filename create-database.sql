CREATE TABLE IF NOT EXISTS public.restaurant
(
    id uuid NOT NULL,
    name character varying(255) COLLATE pg_catalog."default",
    CONSTRAINT restaurant_pkey PRIMARY KEY (id)
    )

    TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.restaurant
    OWNER to postgres;

CREATE TABLE IF NOT EXISTS public."order"
(
    order_status smallint,
    customer_id uuid,
    id uuid NOT NULL,
    restaurant_id uuid,
    CONSTRAINT order_pkey PRIMARY KEY (id),
    CONSTRAINT order_order_status_check CHECK (order_status >= 0 AND order_status <= 3)
    )

    TABLESPACE pg_default;

ALTER TABLE IF EXISTS public."order"
    OWNER to postgres;


CREATE TABLE IF NOT EXISTS public.item
(
    price integer NOT NULL,
    id uuid NOT NULL,
    restaurant_id uuid NOT NULL,
    description character varying(255) COLLATE pg_catalog."default",
    name character varying(255) COLLATE pg_catalog."default",
    CONSTRAINT item_pkey PRIMARY KEY (id),
    CONSTRAINT fk2ip7t8cv2p1ghfi1e796yet7d FOREIGN KEY (restaurant_id)
    REFERENCES public.restaurant (id) MATCH SIMPLE
    ON UPDATE NO ACTION
    ON DELETE NO ACTION
    )

    TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.item
    OWNER to postgres;


CREATE TABLE IF NOT EXISTS public.order_item
(
    quantity integer NOT NULL,
    id uuid NOT NULL,
    item_id uuid,
    order_id uuid NOT NULL,
    instructions character varying(255) COLLATE pg_catalog."default",
    CONSTRAINT order_item_pkey PRIMARY KEY (id),
    CONSTRAINT fks234mi6jususbx4b37k44cipy FOREIGN KEY (order_id)
    REFERENCES public."order" (id) MATCH SIMPLE
    ON UPDATE NO ACTION
    ON DELETE NO ACTION
    )

    TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.order_item
    OWNER to postgres;


CREATE TABLE IF NOT EXISTS public.customer
(
    id uuid NOT NULL,
    email character varying(255) COLLATE pg_catalog."default",
    name character varying(255) COLLATE pg_catalog."default",
    CONSTRAINT customer_pkey PRIMARY KEY (id)
    )

    TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.customer
    OWNER to postgres;
