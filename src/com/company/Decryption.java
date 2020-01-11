package com.company;

public class Decryption {
    public static void decryption (String stri, char sign, int step, int z) {

        char str[] = stri.toCharArray();
        int sym;
        for(int i = 0; i < str.length; i++){
            if((str[i] != '.') && (str[i] != '!')) {
                if (str[i] != ' ') {
                    sym = (int) str[i];
                    if (sym == 1071) {
                        sym = z;
                    } else {
                        if (sign == '+') {
                            if ((sym + step) > 1071) {
                                sym -= 32;
                            }
                            sym += step;
                        } else {
                            if ((sym - step) < 1040) {
                                sym += 32;
                            }
                            sym -= step;
                        }
                    }
                    str[i] = (char) sym;
                }
                System.out.print(str[i]);
            }
        }
        System.out.println();
    }

    public static void decrypttoaccording (String str) {
        String StrWord[] = str.split(" ");
        char word1[] = StrWord[0].toCharArray();
        char word2[] = StrWord[1].toCharArray();
        char word3[] = StrWord[2].toCharArray();
        char word4[] = StrWord[3].toCharArray();
        char word5[] = StrWord[4].toCharArray();
        char word6[] = StrWord[5].toCharArray();
        char word7[] = StrWord[6].toCharArray();
        char word8[] = StrWord[7].toCharArray();
        char word9[] = StrWord[8].toCharArray();
        char word10[] = StrWord[9].toCharArray();
        decryptword(word1, '+', 3, 1000  );
        decryptword(word2, '-', 5, 1000  );
        decryptword(word3, '+', 10, 1000  );
        decryptword(word4, '+', 2, 1000  );
        decryptword(word5, '-', 1, 1000  );
        decryptword(word6, '-', 4, 1000  );
        decryptword(word7, '+', 1, 1000  );
        decryptword(word8, '+', 7, 1000  );
        decryptword(word9, '-', 2, 1000  );
        decryptword(word10, '+', 6, 1000  );

    }

    private static void decryptword(char word[], char sign, int step, int z) {
        int sym;
        for(int i = 0; i < word.length; i++) {
            if(word[i] != '.'){
                sym = (int) word[i];
                if (sym == 1071) {
                    sym = z;
                }
                else {
                    if (sign == '+') {
                        if ((sym + step) > 1071) {
                            sym -= 32;
                        }
                        sym += step;
                    }
                    else {
                        if((sym - step) < 1040) {
                            sym += 32;
                        }
                        sym -= step;

                    }
                }
                word[i] = (char) sym;
            }
        }

        String wordstr = new String(word);
        System.out.print(wordstr + " ");

    }


}
