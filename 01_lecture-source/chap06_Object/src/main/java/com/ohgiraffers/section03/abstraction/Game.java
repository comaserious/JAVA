package com.ohgiraffers.section03.abstraction;

public class Game {

    private final String[] cardShape = new String[] {"ACE","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};

    private String nowCard;

    private int bathCount;




    public String getCardShape() {
        int num = (int)(Math.random()*13);
        this.nowCard = this.cardShape[num];
        return this.nowCard;
    }

    public void whatGame() {

        switch(this.nowCard){

            case "ACE" :
                System.out.println("뽑은 카드는 "+this.nowCard+"입니다");
                System.out.println("");
                break;
            case "2" :
                System.out.println("뽑은 카드는 "+this.nowCard+"입니다");
                if(this.bathCount>3){
                    System.out.println("더이상 화장실을 뽑을 수 없습니다");
                }
                else{
                    ++this.bathCount;
                    System.out.println("당신은 화장실을 갈수 있습니다");
                    System.out.println("남은 화장실 횟수는 "+(4-this.bathCount)+"입니다");
                }
                break;

            case "3" :
                System.out.println("뽑은 카드는 "+this.nowCard+"입니다");
                System.out.println("");
                break;
            case "4" :
                System.out.println("뽑은 카드는 "+this.nowCard+"입니다");
                System.out.println();
                break;
            case "5" :
                System.out.println("뽑은 카드는 "+this.nowCard+"입니다");
                System.out.println();
                break;
            case "6" :
                System.out.println("뽑은 카드는 "+this.nowCard+"입니다");
                System.out.println();
                break;
            case "7" :
                System.out.println("뽑은 카드는 "+this.nowCard+"입니다");
                System.out.println();
                break;
            case "8" :
                System.out.println("뽑은 카드는 "+this.nowCard+"입니다");
                System.out.println();
                break;
            case "9" :
                System.out.println("뽑은 카드는 "+this.nowCard+"입니다");
                System.out.println();
                break;
            case "10" :
                System.out.println("뽑은 카드는 "+this.nowCard+"입니다");
                System.out.println();
                break;

            case "King" :
                System.out.println("뽑은 카드는 "+this.nowCard+"입니다");
                System.out.println();
                break;
            case "Queen" :
                System.out.println("뽑은 카드는 "+this.nowCard+"입니다");
                System.out.println();
                break;
            case "Jack" :
                System.out.println("뽑은 카드는 "+this.nowCard+"입니다");
                System.out.println();
                break;

        }

    }






}
