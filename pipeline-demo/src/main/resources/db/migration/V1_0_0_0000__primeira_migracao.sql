
-----------------------------------------------------------------------------
-----------------------------------------------------------------------------
-------            Migrações Automaticas da Versão 1.0.0              -------
-------                                                               -------
-----------------------------------------------------------------------------
-----------------------------------------------------------------------------

-- create initial user
INSERT INTO public.users(id, login, password) VALUES (1, 'admin', 'admin');

