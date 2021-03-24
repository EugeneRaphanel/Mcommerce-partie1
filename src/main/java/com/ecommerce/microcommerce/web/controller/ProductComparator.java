package com.ecommerce.microcommerce.web.controller;
import com.ecommerce.microcommerce.model.Product;
import java.util.*;
public class ProductComparator implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return o1.getNom().compareTo(o2.getNom());
    }
}
