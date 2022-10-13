package com.translate.service;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class DictionaryServiceImpl implements IDictionaryService {
    private static Map<String,String> map=new HashMap<>();
    static {
        map.put("Hello","Xin chào");
        map.put("Bye","Tạm Biệt");
        map.put("Love","Yêu");
        map.put("Apple","Quả Táo");
    }
    @Override
    public String change(String english) {
        for (String s:map.keySet()) {
            if (s.equals(english)){
                return map.get(s);
            }
        }
        return "không tìm thấy ";
    }
}
