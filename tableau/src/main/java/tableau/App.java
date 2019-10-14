package tableau;

public final class App {

    public static void main(String[] args) {
        // String[] tab = {"1","2","123","ok","23"};
        // String[] tab2 = {"24","11","1303","89","-78"};
        // int[] intTab = convertTab(tab);
        // int[] intTab2 = convertTab(tab2);
        //showTab(intTab);
        //System.out.println(maxVal(intTab));
        // int [][] swappedTabs = swapMinMax(intTab, intTab2);  
        // showTab(swappedTabs[0]);
        // showTab(swappedTabs[1]);
        System.out.println(addAll(454,231,12,90,2133));
    }
    /**
     * 
     * @param intTab
     */
    public static void showTab(int[] intTab){
        System.out.print("[");
        for(int i=0; i<intTab.length; i++){
            if(i!=intTab.length-1)
                System.out.print(intTab[i] + ",");
            else
                System.out.print(intTab[i]);   
        }
        System.out.print("]\n");
    }
    /**
     * 
     * @param tab
     * @return
     */
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
    /**
     * 
     * @param min
     * @param max
     * @return
     */
    public static int[][] swapMinMax(int[] min, int[] max){
        int valMin = min[0];
        int posMin = 0;
        int valMax = max[0];
        int posMax = 0;
        for(int i=0; i<min.length; i++){
            if(valMin>min[i]){
                valMin = min[i];
                posMin = i;
            }
        }
        for(int i=0; i<max.length; i++){
            if(valMax<max[i]){
                valMax = max[i];
                posMax = i;
            }
        }
        int temp = min[posMin];
        min[posMin] = max[posMax];
        max[posMax] = temp;

        int[][] outputTab = {min,max};
        return outputTab;
    }
    /**
     * 
     * @param tab
     * @return
     * @throws NumberFormatException
     */
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
    /**
     * 
     * @param args
     * @return
     */
    public static int addAll(int... args){
        int sum = 0;
        for (int arg : args){
            sum+=arg;
        }
        return sum;
    }
}
