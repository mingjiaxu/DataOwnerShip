package com.example.dataownership.util;

import java.math.BigInteger;
import java.util.Random;

/**
 * @projectName: DataWeightDetermination
 * @package: com.example.dataownership.util
 * @className: PrimeGenerator
 * @author: xjm
 * @description: TODO
 * @date: 2024/6/4 13:00
 * @version: 1.0
 */
public class PrimeGenerator {

    public static BigInteger generateRandomPrime(int bitLength){
        return BigInteger.probablePrime(bitLength,new Random());
    }
    public static BigInteger generateStrongPrime(int bitLength) {
        BigInteger q, p;
        do {
            q = generateRandomPrime(bitLength - 1); // 生成 q
            p = q.multiply(BigInteger.TWO).add(BigInteger.ONE); // p = 2q + 1
        } while (!p.isProbablePrime(100)); // 100 表示置信度
        return p;
    }
}
