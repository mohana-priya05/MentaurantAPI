package com.mentaurantpro.mentaurant.utils;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;

public class EncryptionDecryption {
    ///AES Encryption
    public static String encrypt(String password,String secretKey) {
        String AES_TRANSFORMATION = "AES/ECB/PKCS5Padding";
        String AES_ALGORITHM = "AES";
        try {
            Cipher cipher = Cipher.getInstance(AES_TRANSFORMATION);
            byte[] keyBytes = Base64.getDecoder().decode(secretKey);

            SecretKeySpec key = new SecretKeySpec(keyBytes, AES_ALGORITHM);
            cipher.init(Cipher.ENCRYPT_MODE, key);
            byte[] encryptedBytes = cipher.doFinal(password.getBytes());
            return Base64.getEncoder().encodeToString(encryptedBytes);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static String decrypt(String encryptedPassword,String secretKey) {
        String AES_TRANSFORMATION = "AES/ECB/PKCS5Padding";
        String AES_ALGORITHM = "AES";
        try {
            Cipher cipher = Cipher.getInstance(AES_TRANSFORMATION);
            byte[] keyBytes = Base64.getDecoder().decode(secretKey);
            SecretKeySpec key = new SecretKeySpec(keyBytes, AES_ALGORITHM);
            cipher.init(Cipher.DECRYPT_MODE, key);
            byte[] decryptedBytes = cipher.doFinal(Base64.getDecoder().decode(encryptedPassword));
            return new String(decryptedBytes);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    public static void main(String[] args) {
        //use this secret key to encryt or decrypt, place this in application.properties file and access that in code
        String secretKey = "LL8dD4joDIdaot+/ov7RtMR1mVwjgpvzwzPVot4R7lY=";
    }
}