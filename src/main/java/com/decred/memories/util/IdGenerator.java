package com.decred.memories.util;

import java.util.Date;
import java.util.Random;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.time.LocalDateTime;

/**
 * Utileria para generar ids de forma dinámica
 * 
 * @author alain.bonilla
 */
public class IdGenerator {

    private static final SecureRandom SECURE_RANDOM = new SecureRandom();

    public static Long nextId() {
        return Double.valueOf(
                System.currentTimeMillis() * 1000l
                + SECURE_RANDOM.nextDouble() * 999l
        ).longValue();
    }
    
    public static String generateToken(LocalDateTime date, String username) {
        
        String originalData = username + "." + date.toString();
        
        try {
             MessageDigest digest = MessageDigest.getInstance("SHA-256");
             
             byte[] encodedHash = digest.digest(originalData.getBytes(StandardCharsets.UTF_8));

             return bytesToHex(encodedHash);
             
        } catch (NoSuchAlgorithmException e) {
           return "";
        }
     }
     
     private static String bytesToHex(byte[] hash) {
     	
        StringBuffer hexString = new StringBuffer();
        
        for (int i = 0; i < hash.length; i++) {
           String hex = Integer.toHexString(0xff & hash[i]);
           
           if (hex.length() == 1) {
              hexString.append('0');
           }
           
           hexString.append(hex);
         }
         return hexString.toString();
     }
     
     public static String getRhinoTransactionId() {
    	 
       Random r = new Random();
       String alphabet = "abcdefghijklmnopqrstuvwxyz";
       String appCode = "appcod";    	 
       StringBuilder transactionId = new StringBuilder();
       
       transactionId.append(alphabet.charAt(r.nextInt(alphabet.length())));
       transactionId.append(alphabet.charAt(r.nextInt(alphabet.length())));
    	 
       Date date = new Date();  
       DateFormat dateFormat = new SimpleDateFormat("SSSssmmHHddMMyyyy");
    	 
       transactionId.append(dateFormat.format(date));
       transactionId.append("_" + appCode);
    	 
       return transactionId.toString();
     }
}

