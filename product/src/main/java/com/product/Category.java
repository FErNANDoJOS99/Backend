package com.product;


public class Category {

    Integer category_id;
    String category;
    String tag;
    Integer status;


    public Category(Integer id ,String category1 , String tag1,Integer status1 ){


        category_id=id;
        category= category1;
        tag=tag1;
        status=status1;
    }


     public String toString(){
     
        return "{"+category_id+","+category+","+tag+","+status+"}";
     }


   

    public void changeStatus(){
            status=0;
    }

    public String getcategory(){
        return category;
    }


    public String gettag(){
        return tag;
    }
}

