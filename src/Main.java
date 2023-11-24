import java.util.Scanner;
public class Main {
    private int number;
    private int[] n;
    public Main(int number) {
        this.number = number;
        this.n = new int[number];
    }
    public void Swap(){
        int x = n.length;
        for(int i = 0; i < x; i++){
            for(int j = i+1; j < x; j++){
                if(n[i] > n[j]){
                    int temp = n[i];
                    n[i] = n[j];
                    n[j] = temp;
                }
            }
        }
    }
    public void Result(){
        System.out.println("result");
        for(int i = 0; i < number; i++){
            System.out.println(n[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number = s.nextInt();
        Main Num = new Main(number);

        for(int i = 0; i < number; i++){
            Scanner x = new Scanner(System.in);
            System.out.print("Enter Input "+ ( i + 1 ) + " = ");
            int value = x.nextInt();
            Num.n[i] = value;
        }
        Num.Swap();
        Num.Result();
    }
}