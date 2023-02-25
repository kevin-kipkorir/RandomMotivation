package com.example.randommotication;

import java.util.Random;

public class MotivationalGenerator {
        private static final String[] QUOTES = {"You're almost there see you.", "Tommorrow is not promised."," failure is not fatal: it is the courage to continue that counts.", "The only way to do great work is to love what you do.", "I have not failed. I've just found 10,000 ways that won't work.", "Don't watch the clock; do what it does. Keep going.", "If you look at what you have in life, you'll always have more. If you look at what you don't have in life, you'll never have enough."};
        private static final Random RANDOM = new Random();

        public static String generateQuote() {
            return QUOTES[RANDOM.nextInt(QUOTES.length)];
        }
    }

