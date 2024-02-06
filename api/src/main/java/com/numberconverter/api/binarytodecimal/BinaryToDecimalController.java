package com.numberconverter.api.binarytodecimal;

import com.numberconverter.api.auxiliary.Convert;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;

@RestController
@RequestMapping("binary-to-decimal")
@AllArgsConstructor
public class BinaryToDecimalController implements Convert<BigInteger, String> {

    private final BinaryToDecimalService service;

    @Override
    @GetMapping("{input}")
    public BigInteger convert(@PathVariable String input) {
        return service.convert(input);
    }

}
