/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.finalproject;

import static com.example.finalproject.Siswa_.id;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Unang
 */
@CrossOrigin
@RestController
@RequestMapping("/siswa")
public class MyController {
    @Autowired
    private RepoMahasiswa myrepo;
    
    //private int NIM;

    @GetMapping("/all")
    @ResponseBody
    public List<Siswa> getData() {

        List<Siswa> siswa = new ArrayList<>();
        try {

            siswa = myrepo.findAll();

        } catch (Exception e) {
        }

        return siswa;
    }

    @GetMapping("/id")
    public List<Siswa> getUserById(@PathVariable("Id") int siswa) {
        return myrepo.findAll();

    }

    @PutMapping("/updatesiswa")
    public List<Siswa> updatemahasiswa(@RequestBody Siswa siswa) {
        return myrepo.findAll();
    }

    @DeleteMapping("/del/id")
    @ResponseBody
    public String deleteItem(@PathVariable String nim) {
        String respon = "";
        try {
            myrepo.deleteById(id);
            respon = HttpStatus.OK.toString();
        } catch (ExceptionInInitializerError e) {
            respon = HttpStatus.INTERNAL_SERVER_ERROR.toString();
        }
        return respon;

    }

    @PostMapping("/siswa")
    public List<Siswa> saveSiswa(@RequestBody Siswa siswa) {
        return myrepo.findAll();
    }
}
