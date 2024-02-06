package com.numberconverter.api;

import java.util.List;

public record GetStringFrom<T>(List<T> list) {

    public String get() {
        StringBuilder stringBuilder = new StringBuilder();
        list.forEach(stringBuilder::append);
        return stringBuilder.toString();
    }

}
