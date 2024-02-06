package com.numberconverter.api.binarytodecimal;

import com.numberconverter.api.auxiliary.Convert;
import org.springframework.stereotype.Service;

import java.math.BigInteger;

@Service
public class BinaryToDecimalService implements Convert<BigInteger, String> {

    @Override
    public BigInteger convert(String input) {
        String[] strings = input.split("");
        int index = input.length() - 1;
        int sum = 0;
        for (int i = 0; i < input.length(); i++) {
            sum += Integer.parseInt(strings[i]) * (int) Math.pow(2, index);
            --index;
        }
        return new BigInteger(String.valueOf(sum));
    }

}
