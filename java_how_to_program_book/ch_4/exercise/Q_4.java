/*4. 4.4 Write Java statements to accomplish each of the following tasks:
1. Use one statement to assign the sum of x and y to z, then
   increment x by 1.
2. Test whether variable count is greater than 10. If it is, print
   "Count is greater than 10".
3. Use one statement to decrement the variable x by 1, then subtract
   it from variable total and store the result in variable total.
4. Calculate the remainder after q is divided by divisor, and
   assign the result to q. Write this statement in two different ways.*/
package java_how_to_program_book.ch_4.exercise;

public class Q_4 {
    public static void main(String[] args) {
        //Use one statement to assign the sum of x and y to z, then increment x by 1.
        int x=6,y=7 ,z=y+x++;

        //2. Test whether variable count is greater than 10. If it is, print "Count is greater than 10".
        int count=11;
        if(count>10){
            System.out.println("count is greater than 10");
        }
        /*3. Use one statement to decrement the variable x by 1, then subtract
              it from variable total and store the result in variable total.
        */
        int total=count;
        System.out.println(total);
       total=(total- --x);
        System.out.println(total);

        /*4. Calculate the remainder after q is divided by divisor, and
             assign the result to q. Write this statement in two different ways.
        */
        int q=total;
         q=q/2;
        System.out.println("1st way is q=q/2 : "+q);
         q=total;
         q/=2;
        System.out.println("2nd way is q/=2 : "+q);

    }
}
