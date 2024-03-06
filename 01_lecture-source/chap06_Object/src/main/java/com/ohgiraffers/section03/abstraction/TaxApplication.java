package com.ohgiraffers.section03.abstraction;

public class TaxApplication {

    public static void main(String[] args) {

        Product product1 = new Product("ssgnote9","갤럭시노트9","경기도 수원",960000,10);
        Product product2 = new Product("lgxnote5","LG스마트폰5","경기도 평택",780000,0.7);
        Product product3 = new Product("ktsnote3","KT스마트폰3", "서울시 강남",250000,0.3);

        System.out.println(product1.information());
        System.out.println(product2.information());
        System.out.println(product3.information());

        product1.setPrice(1200000);
        product2.setPrice(1200000);
        product3.setPrice(1200000);

        System.out.println();

        product1.setTax(0.05);
        product2.setTax(0.05);
        product3.setTax(0.05);

        System.out.println(product1.information());
        System.out.println(product2.information());
        System.out.println(product3.information());

        System.out.println();
        System.out.println("상품이름 : "+product1.getProductName()+" 전체금액 : " + product1.getFullPrice());
        System.out.println("상품이름 : "+product2.getProductName()+" 전체금액 : "+ product2.getFullPrice());
        System.out.println("상품이름 : " +product3.getProductName()+" 전체금액 : " +product3.getFullPrice());










    }
}
