package com.jagasa;

import com.jagasa.api.DummyApi;
import com.jagasa.models.DummyDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class DummyApiImpl implements DummyApi {

    @Override
    public ResponseEntity<DummyDTO> dummyGreeting() {
        DummyDTO dummy = new DummyDTO();
        dummy.setGreeting("heeeeeeeeeeeelloooo");
        System.out.println("------------------dummyGreeting------------------");
        return ResponseEntity.status(HttpStatus.OK).body(dummy);
    }
}
