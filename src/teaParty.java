public class teaParty {
    public static void main (String[] args){
        System.out.println(teaParty(20, 6));
        System.out.println(teaParty(6, 8));
    }
    public static int teaParty(int tea, int candy){
        if (tea < 5 || candy < 5){
            return 0;
        }
        if (tea >= 5 && candy >= 5){
            return 1;
        }
        if (tea >= 2 * candy || candy >= 2 * tea){
            return 2;
        }
        return 1;
    }
}
