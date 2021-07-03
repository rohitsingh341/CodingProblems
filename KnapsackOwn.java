package DynamicProgramming;

public class KnapsackOwn {

    public static void main(String[] args) {
        int profit[] = {0, 1, 6, 10, 16};
        int weight[] = {0, 1, 2, 3, 5};

        int capacity = 7;
        int items = 4;
        int table[][] = new int[items + 1][capacity + 1];

        for (int i = 0; i <= items; i++) {
            for (int w = 0; w <= capacity; w++) {
                if (i == 0 || w == 0)
                    table[i][w] = 0;
                else if (weight[i] <= w)
                    table[i][w] = Math.max(
                            table[i - 1][w],    // Profit of previous item
                            profit[i] + table[i - 1][w - weight[i]] // Profit of current item + Profit of previous item (after deducting the weight of current item)
                    );
                else
                    table[i][w] = table[i-1][w];
            }
        }
        System.out.println("Max profit : " + table[items][capacity]);
    }

}
