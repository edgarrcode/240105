public class Operations {
    public static void main(String[] args){
        StringNode L = new StringNode(getRandString(2+(int)(Math.random()*5)));
        StringNode temp = L;
        for (int i = 0; i < 10; i++){
            temp.next=new StringNode(getRandString(2+(int)(Math.random()*5)));
            temp=temp.next;
        }
        System.out.println("All Strings in the list:");
        printMyList(L);
        System.out.println();
        System.out.println("Count of k-length strings");
        System.out.println("k\tNo. of Strings with length k");
        for (int k=0; k<7; k++){
            System.out.println(k+"\t"+countKLenghthStrings(L, k));
        }
        System.out.println("Longest String="+longestStringOfMyList(L));
        System.out.println("Length="+lengthOfMyList(L));
        L=reverseMyList(L);
        System.out.println("All string in the reversed list:");
        printMyList(L);
        System.out.println();
    }
    /* Write a method getRandString to generate a random String of length
    provided in the parameter.*/
    static String getRandString(int length) {
    /* Write your code here */
    }
    /* Write a recursive method to print all the Strings separated by lines.
    This method cannot contain any loop (that is, uses of for, while, do while
    are prohibited). */
    public static void printMyList(StringNode M){
    /* Write your code here */
    }
    /* Write a recursive method to retrieve the number of strings that have
    exactly the same length provided in the parameter. This method cannot
    contain any loop (that is, uses of for, while, do while are prohibited).
    */
    public static int countKLenghthStrings (StringNode M, int k){
    /* Write your code here */
    }
    /* Write a recursive method to retrieve the longest String from the list.
    Assume that there is at least one String in the given list when the method
    is called from the main function. This method cannot contain any loop (that
    is, uses of for, while, do while are prohibited).*/
    public static String longestStringOfMyList (StringNode M){
    /* Write your code here */
    }
    /* Write a recursive method to compute the length of a list.
    This method cannot contain any loop (that is, uses of for, while, do while
    are prohibited).
    */
    public static int lengthOfMyList (StringNode M){
    /* Write your code here */
    }
    /* Write a recursive method named reverseMyList that will reverse a given
    linked list M. Return the head of the reversed linked list. It is fine
    if you need to modify the given linked list to obtain the reversed one.
    */
    public static StringNode reverseMyList (StringNode M){
    /* Write your code here */
    }
}