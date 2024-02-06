package com.numberconverter.api.decimaltobinary;

import com.numberconverter.api.auxiliary.Convert;
import com.numberconverter.api.auxiliary.GetStringFrom;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class DecimalToBinaryService implements Convert<BigInteger, Integer> {

    @Override
    public BigInteger convert(Integer input) {
        List<Integer> binaryNumbers = new ArrayList<>();
        while (input >= 1) {
            int binaryNumber = input % 2;
            binaryNumbers.add(binaryNumber);
            input /= 2;
        }
        Collections.reverse(binaryNumbers);
        String string = new GetStringFrom<>(binaryNumbers).get();
        return new BigInteger(string);
    }

}
