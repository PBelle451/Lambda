package co.pedrobelle.curso.Ex50;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();
        list.add(new Product("Ultra Magnus", 900.00));
        list.add(new Product("Optimus Prime",  750.00));
        list.add(new Product("Bumblebee", 50.00));
        list.add(new Product("Megatron", 80.90));
        ProductService ps = new ProductService();
        double sum = ps.filteredSum(list, p -> p.getName().charAt(0) == 'M');
        System.out.println("Sum = " + String.format("%.2f", sum));
    }
}
