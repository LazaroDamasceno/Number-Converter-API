package com.numberconverter.api.auxiliary;

public interface Convert<T, U> {

    T convert(U input);

}
