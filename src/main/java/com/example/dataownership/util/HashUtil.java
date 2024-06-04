package com.example.dataownership.util;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * @projectName: DataWeightDetermination
 * @package: com.example.dataownership.util
 * @className: HashUtil
 * @author: xjm
 * @description: TODO
 * @date: 2024/6/4 12:40
 * @version: 1.0
 */
public class HashUtil {
    /**
     * 对输入字符串进行哈希并返回BigInteger形式的哈希值。
     *
     * @param data 输入字符串
     * @return BigInteger形式的哈希值
     */
    public static BigInteger hash(String data) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hashBytes = digest.digest(data.getBytes());
            return new BigInteger(1, hashBytes);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }
}
