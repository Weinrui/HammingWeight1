package com.example.hammingweight1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HammingWeight1Controller {
@RequestMapping("/")
    public int hammingWeight(int m) {

        int ones = 0;

        while (m != 0) {
            ones += m & 1;
            m >>>= 1;
        }
        return ones;
    }
}
