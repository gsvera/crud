package com.crud.crud.Clases;

import com.crud.crud.Interfaces.UsuarioInterface;
import com.crud.crud.Models.usuario;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
@Transactional
public class UsuarioClass implements UsuarioInterface{

    @PersistenceContext
    private EntityManager entityManager;
    public List<usuario> GetUsuarios()
    {
        String query = "FROM usuario";

        return entityManager.createQuery(query).getResultList();
    }
}
