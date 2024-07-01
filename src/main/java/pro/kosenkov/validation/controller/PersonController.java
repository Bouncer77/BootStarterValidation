package pro.kosenkov.validation.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pro.kosenkov.validation.dto.PersonDto;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/v1/person")
public class PersonController {

    @PostMapping
    public ResponseEntity<String> valid(@Valid @RequestBody PersonDto personDto) {
        return ResponseEntity.ok("valid");
    }

}
