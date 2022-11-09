package com.example.calculatorwebservice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/calculate")
public class CalculationController {
    @GetMapping("add/{firstArg}/{secondArg}")
    public ResponseEntity<Double> Add(@PathVariable Double firstArg, @PathVariable Double secondArg) {
        var result = firstArg + secondArg;
        return new ResponseEntity<Double>(result, HttpStatus.ACCEPTED);
    }

    @GetMapping("multiply/{firstArg}/{secondArg}")
    public ResponseEntity<Double> Multiply(@PathVariable Double firstArg, @PathVariable Double secondArg) {
        var result = firstArg * secondArg;
        return new ResponseEntity<Double>(result, HttpStatus.ACCEPTED);
    }

    @GetMapping("minus/{firstArg}/{secondArg}")
    public ResponseEntity<Double> Minus(@PathVariable Double firstArg, @PathVariable Double secondArg) {
        var result = firstArg - secondArg;
        return new ResponseEntity<Double>(result, HttpStatus.ACCEPTED);
    }

    @GetMapping("divide/{firstArg}/{secondArg}")
    public ResponseEntity<Double> Divide(@PathVariable Double firstArg, @PathVariable Double secondArg) {
        if (secondArg == 0) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        var result = firstArg - secondArg;
        return new ResponseEntity<Double>(result, HttpStatus.ACCEPTED);
    }
}
