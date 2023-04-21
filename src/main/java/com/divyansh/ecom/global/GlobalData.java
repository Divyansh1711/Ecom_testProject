package com.divyansh.ecom.global;

import com.divyansh.ecom.model.Product;

import java.util.ArrayList;
import java.util.List;

public class GlobalData {
    public static List<Product> cart;
    static {
        cart =new ArrayList<Product>();
    }


}
