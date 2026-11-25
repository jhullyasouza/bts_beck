package com.seduc2.bts.Controller;

import com.seduc2.bts.Entity.BTS;
import com.seduc2.bts.Service.btsService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("api")
@RestController
public class btsController {

    private final btsService service;
    public btsController(btsService service) {
        this.service = service;
    }

    @PostMapping
    public String save(@RequestBody BTS b) {
        return service.salvar(b) + "Park Jimin Lindo";
    }
    @GetMapping
    public List<BTS> listar () {
        return service.listar();
    }
}
