package org.API_Rest.restAPI.repository;

import org.API_Rest.restAPI.handler.BusinessException;
import org.API_Rest.restAPI.model.Users;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


@Repository
public class UserRepository {
    public void save(Users users){
    if (users.getLogin()==null)
        throw new BusinessException("O CAMPO LOGIN É OBRIGATORIO");

        if (users.getId()==null)
            System.out.println("SAVE - RECEBENDO O USUARIO NA CAMADA DE REPOSITORIO");
        else
            System.out.println("UPDATE - RECEBENDO O USUARIO NA CAMADA DE REPOSITORIO");

        System.out.println(users);
    }
    public void deleteById(Integer id){
        System.out.printf("DELETE/id - RECEBENDO O ID: %d PARA DELETAR", id);
        System.out.println(id);
    }
    public List<Users> findAll(){
        System.out.println("LIST - LISTANDO TODOS OS USUARIOS DO SISTEMA");
        List<Users> users = new ArrayList<>();
        users.add(new Users("champs", "nemSei"));
        users.add(new Users("daniel", "danielChipolesk20"));

        return users;
    }

    public Users findById(Integer id){
        System.out.printf("FIND/id - RECEBENDO O ID: %d PARA LOCALIZAR UM USUARIO", id);
        return new Users("champs", "nemSei");
    }
    public Users findByUsername(String username){
        System.out.printf("FIND/username - RECEBENDO O USERNAME: %s PARA LOCALIZAR UM USUARIO", username);
        return new Users("champs", "nemSei");
    }


}
