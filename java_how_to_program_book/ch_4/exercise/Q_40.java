/*
4.40 (World Population Growth) World population has grown
considerably over the centuries. Continued growth could eventually
challenge the limits of breathable air, drinkable water, arable cropland and
other limited resources. There’s evidence that growth has been slowing in
recent years and that world population could peak some time this century,
then start to decline.
For this exercise, research world population growth issues online. Be sure
to investigate various viewpoints. Get estimates for the current world
population and its growth rate (the percentage by which it’s likely to
increase this year). Write a program that calculates world population
growth each year for the next 75 years, using the simplifying assumption
that the current growth rate will stay constant. Print the results in a table.
The first column should display the year from year 1 to year 75. The
second column should display the anticipated world population at the end
of that year. The third column should display the numerical increase in the
world population that would occur that year. Using your results, determine
the year in which the population would be double what it is today, if this
year’s growth rate were to persist.
 */
package java_how_to_program_book.ch_4.exercise;

import java.io.PrintStream;
import java.math.BigInteger;

public class Q_40 {
    public static void main(String[] args) {
        int i=2022;
        long x = 7753000000l;
        long increase=0;
        int growth=0;
        System.out.println("\t\tyears\t\t\tcurrent_Population\t\t\tincrease");
        while(i<=2097) {
            increase=x/100*1;
            i++;
             System.out.printf("\t\t%d\t\t\t\t%d\t\t\t\t%d \n", i, x,increase);
            x=x+increase;
        }
    }
}
