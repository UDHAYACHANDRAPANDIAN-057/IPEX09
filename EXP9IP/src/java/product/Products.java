/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template

// */

package product;

public class Products {
    public String name;
    public double price;
    public String inStock;

    public Products(String name, double price, String inStock) {
        this.name = name;
        this.price = price;
        this.inStock = inStock;
    }
}






//package product;
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Comparator;
//
//class Products {
//    public String name;
//    public double price;
//    public String inStock;
//
//    public Products(String name, double price, String inStock) {
//        this.name = name;
//        this.price = price;
//        this.inStock = inStock;
//    }
//    
//}
//public class SortArray{
//    public static void main(String[] args) {
//        
//        ArrayList<Products> alproduct = new ArrayList();
//
//        String name;
//        double price;
//        String inStock;
//        int count;
//        
//        
//        alproduct.add(new Products("product1",10.99,"yes"));
//        alproduct.add(new Products("product2",5.99,"No"));
//        alproduct.add(new Products("product1",20.50,"yes"));
//        for(count =0;count<alproduct.size();count++){
//            
//            System.out.println(alproduct.get(count).name+"\t"+alproduct.get(count).price+"\t"+alproduct.get(count).inStock);
//        }
//        Collections.sort(alproduct,new Comparator<Products>(){
//            
//            @Override
//            public int compare(Products p1,Products p2){
//                
//                return Double.compare(p2.price, p1.price);
//            }
//        });
//        
//        for(count =0;count<alproduct.size();count++){
//            
//            System.out.println(alproduct.get(count).name+"\t"+alproduct.get(count).price+"\t"+alproduct.get(count).inStock);
//        }
//
//    }
//
//}
//
//
//
//
//
//
//
//
//
