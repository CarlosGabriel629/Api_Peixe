package com.SEDUC1.Peixe.Controller;


import com.SEDUC1.Peixe.Repositores.PeixeRepository;
import com.SEDUC1.Peixe.entity.Peixe;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("api/peixe")
public class PeixeController {



    private final PeixeRepository peixeRepository;
    public PeixeController(PeixeRepository peixeRepository) {
        this.peixeRepository = peixeRepository;
    }

    @GetMapping
    public List<Peixe> findAll() {
        return peixeRepository.findAll();
    }

    @PostMapping
    public Peixe save(@RequestBody Peixe p) {
        return peixeRepository.save(p);
    }





}
