public class towerOfHanoi {

    public static void main(String[] args) {
        int n = 3; // Number of disks
        moveTowerOfHanoi(n, 'A', 'C', 'B');
    }

    public static void moveTowerOfHanoi(int n, char source, char destination, char auxiliary) {
        if (n == 1) {
            System.out.println("Move disk 1 from " + source + " to " + destination);
        } else {
            moveTowerOfHanoi(n - 1, source, auxiliary, destination);
            System.out.println("Move disk " + n + " from " + source + " to " + destination);
            moveTowerOfHanoi(n - 1, auxiliary, destination, source);
        }
    }
}
