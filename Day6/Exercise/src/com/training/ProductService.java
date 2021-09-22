package com.training;

import java.util.ArrayList;
import java.util.Collections;

public class ProductService {​​​​​
    ArrayList<Product>list=null;
  
    public void addItem(Product product) {​​​​​
        
        if(this.list==null) {​​​​​
            this.list=new ArrayList<>();
        }​​​​​
        
        this.list.add(product);
        
    }​​​​​
    
    public ArrayList<Product> get(){​​​​​
        
        return this.list;
    }​​​​​
    
    public void print(){​​​​​
        Collections.sort(this.list);
        int l=0;
        for(Product pro:this.list) {​​​​​
            if(l<3) {​​​​​
                System.out.println(pro);
                l++;
             }​​​​​
            this.list=null;
         }
    }
    
    
    ​​​​​
 }​​​​​
}​​​​​
 





