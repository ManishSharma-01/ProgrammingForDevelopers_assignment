
public class week4 {

    private static void sortArray(int array[]) {

        for (int i = 1; i < array.length; i++) {
            int j = i;
            int a = array[i];

            while ((j > 0) && (array[j - 1] > a)) {
                array[j] = array[j - 1]; 
                j--; 
            }
            array[j] = a; 
        }
    }

    public static void findTotalContainers(int array[]) {
        sortArray(array);

        int prevValue = 0; 
        int containerForCurrentVillage = 0;
        int totalContainers = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != prevValue) {
                prevValue = array[i];
                containerForCurrentVillage += 1;
                totalContainers += containerForCurrentVillage;
            }
            else {
                prevValue = array[i];
                totalContainers += containerForCurrentVillage;
            }
        }

        System.out.println(totalContainers);
    }

    public static void main(String[] args) {
        int array[] = { 5, 2, 4,4,6 };

        findTotalContainers(array);
    }
}

