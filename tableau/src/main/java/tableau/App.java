package tableau;

public final class App {
    private App() {
    }

    public static void main(String[] args) {
        String[] tab = {"1","2","123","ok","23"};
        int[] intTab = convertTab(tab);
        //showTab(intTab);
        System.out.println(maxVal(intTab));
    }

    public static void showTab(int[] intTab){
        for(int i=0; i<intTab.length; i++){
            System.out.println(intTab[i]);
        }
    }

    public static int maxVal(int[] tab){
        if(tab.length>0){
            int max = tab[0];
            for(int i=0; i<tab.length; i++){
                if(tab[i]>max){
                    max = tab[i];
                }
            }
            return max;
        }else
            System.out.println("Tab is empty");
            return 1;
    }

    public static int[] convertTab(String[] tab) throws NumberFormatException{
        int[] integerTab = new int[tab.length];
        for (int i=0; i<tab.length; i++){
            try{
                integerTab[i] = Integer.valueOf(tab[i]);
            }catch(NumberFormatException e){
                System.out.println(e);
            }
        }
        return integerTab;
    }
}
