/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.finalproject;

import javax.persistence.metamodel.SingularAttribute;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Unang
 */
@Repository
public interface RepoMahasiswa extends JpaRepository<Siswa, String>{

    public void deleteById(SingularAttribute<Siswa, Integer> id);
    
}
