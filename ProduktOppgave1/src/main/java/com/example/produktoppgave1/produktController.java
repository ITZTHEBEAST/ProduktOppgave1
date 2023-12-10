package com.example.produktoppgave1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;



        import org.springframework.web.bind.annotation.GetMapping;
        import org.springframework.web.bind.annotation.PostMapping;
        import org.springframework.web.bind.annotation.RestController;

        import java.util.ArrayList;
        import java.util.List;


@RestController
public class produktController{

    //opprette en list med arraylist og list importer
    private final List<produkt> alleKunder = new ArrayList<>();


    //oppretter post
    @PostMapping("/lagre")
    public void lagreKunde(produkt innKunde){
        alleKunder.add(innKunde);

    }

    @GetMapping("/hentAlle")
    public List<produkt> hentAlle(){
        return alleKunder;
    }
    @GetMapping("/slettAlle")
    public void slettAlle(){
        alleKunder.clear();
    }
}


