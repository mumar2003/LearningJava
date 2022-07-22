/*
4.39 (Enforcing Privacy with Cryptography) The explosive growth of
Internet communications and data storage on Internet-connected
computers has greatly increased privacy concerns. The field of
cryptography is concerned with coding data to make it difficult (and
hopefully—with the most advanced schemes—impossible) for
unauthorized users to read. In this exercise you’ll investigate a simple
scheme for encrypting and decrypting data. A company that wants to send
data over the Internet has asked you to write a program that will encrypt it
so that it may be transmitted more securely. All the data is transmitted as
four-digit integers. Your application should read a four-digit integer
entered by the user and encrypt it as follows: Replace each digit with the
result of adding 7 to the digit and getting the remainder after dividing the
new value by 10. Then swap the first digit with the third, and swap the
second digit with the fourth. Then print the encrypted integer. Write a
separate application that inputs an encrypted four-digit integer and
decrypts it (by reversing the encryption scheme) to form the original
number. [Optional reading project: Research “public key cryptography” in
general and the PGP (Pretty Good Privacy) specific public key scheme.
You may also want to investigate the RSA scheme, which is widely used
in industrial-strength applications.]
 */
package java_how_to_program_book.ch_4.exercise;

import java.util.Scanner;

public class Q_39 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("this program is for encrpt the ");
        System.out.println("Please Enter the number");
        int N = input.nextInt();
        int R = 0, j = 1,odd=0;
        int encrpt = 0, NewEncrpt = 0;
        if (N >= 1000 && N <= 9999) {
            int i = 0;
            while (i < 4) {
                R = (N % 10 + 7) % 10;
                System.out.println("r=" + R);
                encrpt = encrpt + (R * j);
                if (i == 0) {
                    NewEncrpt = NewEncrpt + (R * 100);
                } else if (i == 1) {
                    NewEncrpt = NewEncrpt + (R * 1000);
                } else if (i == 2) {
                    NewEncrpt = NewEncrpt + (R * 1);
                } else if (i == 3) {
                    NewEncrpt = NewEncrpt + (R * 10);
                }
                i++;
                j = j * 10;
                N = N / 10;
                System.out.println("N=" + N);
                System.out.println("encrpt =" + encrpt);
                System.out.println("NewEncrpt =" + NewEncrpt);

            }
        }
        //for decrpt the value
        System.out.println("Please Enter the number that you want to decrpt");
        int N2 = input.nextInt();
        int k = 0, N3 = 0;
        if (N2 / 1000 == 0) {
            N2 = N2 + 1000;
            odd=odd+10;
        } else {
            N2=N2;}
            while (k < 4) {
                if (k == 0) {
                    N3 = N3 + ((N2 % 10) * 100);
                } else if (k == 1) {
                    N3 = N3 + (((N2 / 10) % 10) * 1000);
                } else if (k == 2) {
                    N3 = N3 + ((N2 / 100) % 10);
                } else if (k == 3) {
                    N3 = N3 + ((N2 / 1000) * 10);
                }

                k++;
            }

            N3=N3-odd;
            System.out.println("N3 =" + N3);
            int l = 0, N4 = 0, m = 1;
            int Rs = 0;
            while (l < 4) {
                Rs = (N3 % 10 - 7);
                System.out.println("Rs =" + Rs);
                if (Rs < 0) {
                    Rs = 10 + Rs;
                    System.out.println(Rs);
                }
                N4 = N4 + Rs * m;
                System.out.println("N4 =" + N4);
                l++;
                m = m * 10;
                N3 = N3 / 10;

            }

            }
        }


