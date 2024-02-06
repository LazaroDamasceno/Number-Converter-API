package com.numberconverter.api;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;

@RestController
@RequestMapping("decimal-to-binary")
@AllArgsConstructor
public class DecimalToBinaryController implements Convert<BigInteger, Integer> {

    private final DecimalToBinaryService service;

    @Override
    @GetMapping("{input}")
    public BigInteger convert(@PathVariable Integer input) {
        return service.convert(input);
    }

}
