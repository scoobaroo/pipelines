/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apa;

/**
 *
 * @author suejanehan
 */
public class AirlinePerformance {
   public static Map<String, Integer> getTotalDelays(String fileName) {  }
   public static Map<String, Double> getAverageDelays(String fileName) {  }
   public static void displayTables(String fileName) {
      Map<String, Integer> totals = getTotalDelays(fileName);
      Map<String, Double> averages = getAverageDelays(fileName);
      System.out.println("total delays = " + totals);
      System.out.println("average delays = " + averages);
      System.out.println("... and the worst carrier is: ");
   }
   public static void main(String args[]) {
      displayTables("ONTIME.csv");
   }
}
