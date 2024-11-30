public class Primes {
    public static void main(String[] args) {
        final int N = Integer.parseInt(args[0]);
        boolean[] prime = new boolean[N + 1];
        //to initialize the array 
        for (int i = 2; i < prime.length; i++){
            prime[i] = true;
        }
        int index = 2;
        while(index <= Math.sqrt(N)){
            for (int i = index + 1; i < prime.length; i++)
            if (i %  index == 0)
            prime[i] = false;
            index++;
        }
        int count = 0;
        for (int i = 0; i < prime.length; i++){
            if (prime[i]){
            System.out.println(i);
            count++;
            }
        }
        double percentage = count / 100;
        System.out.println("There are" + count + "primes between 2 and" + N + 
                           "(" + percentage + "% are primes)");
    
    }

}