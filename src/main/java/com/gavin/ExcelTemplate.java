package com.gavin;

import java.util.List;
import java.util.Map;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public final class ExcelTemplate {

    private ExcelTemplate(){}

    public static void create(String[] title, List<Map<String, Object>> data, String filePath) {
        log.debug("filePath:{}", filePath);
    }

    public static void main(String[] args) {
        create(null, null, "hello");
    }

}
