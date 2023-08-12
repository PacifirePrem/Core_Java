package com.company;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Digitsorted implements Comparable<Digitsorted> {

    private int digit;
    public Digitsorted(int digit) {
        super();
        this.digit = digit;
        }


        public int getdigit() {return digit;}

        public void setdigit(int digit) {this.digit = digit;}


        @Override
        public int compareTo(Digitsorted n) {

        if (n.getdigit() > this.getdigit()) {
            return 1;
            } else if (n.getdigit() < this.getdigit()) {
                return -1;
            }

            return 0;

        }

            private int getno() {
                return digit;
            }
    @Override
    public String toString() {return "Digitsorted [digit=" + digit + "]";
    }

    }
    class RandomSorted {
                public static void main(String[] args) {
                    List<Digitsorted> num = new ArrayList<>();

                    num.add(new Digitsorted(76));
                    num.add(new Digitsorted(66));
                    num.add(new Digitsorted(46));
                    num.add(new Digitsorted(86));
                    num.add(new Digitsorted(16));
                    num.add(new Digitsorted(19));
                    num.add(new Digitsorted(65));
                    num.add(new Digitsorted(36));
                    num.add(new Digitsorted(98));
                    num.add(new Digitsorted(33));
                    System.out.println("Before sorting custom list of numbers : ");
                    Iterator<Digitsorted> it = num.iterator();
                    while (it.hasNext()) {
                        System.out.println(it.next());
                    }
                    Collections.sort(num);

                    System.out.println("After sorting custom list of numbers in natural order: ");
                    it = num.iterator();
                    while (it.hasNext()) {
                        System.out.println(it.next());
                    }

                    Collections.sort(num, Collections.reverseOrder());

                    System.out.println("After sorting custom list of numbers in ascending order: ");
                    it = num.iterator();
                    while (it.hasNext()) {
                        System.out.println(it.next());
                    }


                }

            }




