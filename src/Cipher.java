public class Cipher {
    private String abc = "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ";

    public String encoder (String text, int shiftValue) {
        String out = "";
        final int length = text.length();
        for(int i = 0; i < length; ++i){
            char ch = text.charAt(i);
            if (Character.isLetter(ch)){
                out += shift(ch, shiftValue);
            } else {
                out += ch;
            }
        }
        return out;
    }
    private char shift (char ch, int shiftValue){
// TODO: need encoder realization
        int index = abc.indexOf(ch);
        int indexNew = index + shiftValue; // FIXME
        if (indexNew > 32)
        {
            indexNew = indexNew - 33;
        }
        if (indexNew < 0)
        {
            indexNew = indexNew + 33;
        }
        return abc.charAt(indexNew);
    }
}
