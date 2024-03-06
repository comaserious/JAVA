package com.ohgiraffers.section05.parameter;

public class RectAngle {

    private double width;
    private double height;

    /*필기. 기본생성자로 객체 생성을 막고, 모든 필드를 초기화하는 생성자 추가하여 초기값 입력해 인스턴스를 생성하도록 해보자*/
    public RectAngle(double width,double height){
        this.width = width;
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
    public void calArea(){
        double area = width*height;

        System.out.println("이 사각형의 넓이는 : "+area);
    }
    public void calRound(){
        double round = width*2+height*2;
        System.out.println("이 사각형의 둘레는 : "+round);
    }

}
