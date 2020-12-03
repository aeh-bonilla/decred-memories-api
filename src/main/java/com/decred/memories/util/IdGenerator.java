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
}

