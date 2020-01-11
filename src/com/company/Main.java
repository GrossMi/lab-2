package com.company;

public class Main {

    public static void main(String[] args) {
        Text txt = new Text();
        Decryption.decryption(txt.str1, '-', 4, 1067);
        Decryption.decryption(txt.str2, '+', 8, 1046);
        Decryption.decryption(txt.str3, '+', 14, 1053);
        Decryption.decrypttoaccording(txt.str4);
    }
}


