package com.example.tools;

import com.example.global.Constants;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringTool {

    public static void printFormatedLine(String... lines) {
        List<String> formattedLines = Arrays.stream(lines).map(line ->
                String.format("%s --- %s.", Constants.APP_NAME, line)).collect(Collectors.toList());

        System.out.println(formattedLines);
    }
}
