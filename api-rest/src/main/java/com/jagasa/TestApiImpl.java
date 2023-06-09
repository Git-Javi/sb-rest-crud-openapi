package com.jagasa;


import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class TestApiImpl {

    @GetMapping("/test")
    public ResponseEntity<String> testGreeting() {
        System.out.println("------------------testGreeting------------------");
        return ResponseEntity.status(HttpStatus.OK).body("Helloooooooo");
    }
}
