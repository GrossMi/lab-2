public class Algorythm {
    public void start(){
        Cipher cipher = new Cipher();
        final String text1 = "ЗТЕФТИ ЧЦФТ!";
        final String text2 = "ЙЛЗ Б ЗЦИЭ Й ГЖКДЭКГШЕБ Ъ НЖДЖЬБДФЁБГЭ.";
        final String text3 = "БЪВАШЬЪ УГЦ ЯЦ ЦЙН УЦИЦВАЮ БВЪХЕД ФАГДЪ.";
        final String text41 = "ЗЛКСВПЗЁ ";
        final String text42 = "Н ";
        final String text43 = "ЁЫНЫДТЫ ";
        final String text44 = "А ";
        final String text45 = "ЩЛБХШЙЛЁ ";
        final String text46 = "ХЗИПДН ";
        final String text47 = "ТПНЙЗ ";
        final String text48 = "ЫЮРЮЙЗЁ ";
        final String text49 = "СТРДЖТА. ";
        final String text491 = "ПГПГ.";
        final int shift1 = -4;
        final int shift2 = 8;
        final int shift3 = 15;
        final int shift41 = 3;
        final int shift42 = -5;
        final int shift43 = 10;
        final int shift44 = 2;
        final int shift45 = -1;
        final int shift46 = -4;
        final int shift47 = 1;
        final int shift48 = 7;
        final int shift49 = -2;
        final int shift491 = -3;
        String decoderText1 = cipher.encoder(text1, shift1);
        String decoderText2 = cipher.encoder(text2, shift2);
        String decoderText3 = cipher.encoder(text3, shift3);
        String decoderText41 = cipher.encoder(text41, shift41);
        String decoderText42 = cipher.encoder(text42, shift42);
        String decoderText43 = cipher.encoder(text43, shift43);
        String decoderText44 = cipher.encoder(text44, shift44);
        String decoderText45 = cipher.encoder(text45, shift45);
        String decoderText46 = cipher.encoder(text46, shift46);
        String decoderText47 = cipher.encoder(text47, shift47);
        String decoderText48 = cipher.encoder(text48, shift48);
        String decoderText49 = cipher.encoder(text49, shift49);
        String decoderText491 = cipher.encoder(text491, shift491);
        String decoderText4 = decoderText41+decoderText42+decoderText43+decoderText44+decoderText45+decoderText46+decoderText47+decoderText48+decoderText49+decoderText491;
        System.out.println(decoderText1);
        System.out.println(decoderText2);
        System.out.println(decoderText3);
        System.out.println(decoderText4);
    }
}