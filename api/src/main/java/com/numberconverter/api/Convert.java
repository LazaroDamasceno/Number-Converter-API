package com.numberconverter.api;

public interface Convert<T, U> {

    T convert(U input);

}
