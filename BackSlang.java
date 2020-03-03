public class BackSlang {
    static void VoidBackSlang(String NewString) {
        char[] consonants = {'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y', 'z'};
        String pigLatin = "";
        int count = 0;
        String BackSlangWord="";
        for (int i = 0; i <NewString.length() && count<consonants.length-1; i++) {
            count=0;
            for (char consonant : consonants) {
                if(NewString.toLowerCase().charAt(i) == consonant){
                    pigLatin +=NewString.toLowerCase().charAt(i);
                    BackSlangWord = NewString.replace(pigLatin ,"") +"-"+ pigLatin + "ay";
                    count=0;
                    break;
                }
                else count++;
            }
        }
        System.out.println(BackSlangWord);
    }
}