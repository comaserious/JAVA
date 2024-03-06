package com.ohgiraffers.section04.dto;

import java.util.Date;

public class UserDTO {

    /*필기. 모든 필드를 private 접근제한 설정*/
    private String id;
    private String pwd;
    private String name;
    private java.util.Date enrollDate;



    /*필기. 기본생성자 명시적으로 작성*/
    public UserDTO () {}

    /*필기. 매개변수 있는 생성자는 선택사항이다
    *      필요에 따라 만들지만 일반적으로 가장 많이 사용되는 생성자는
    *      모든 필드를 초기화 하는 생성자이다*/
    public UserDTO(String id, String pwd, String name, java.util.Date enrollDate){
        this.id =id;
        this.pwd = pwd;
        this.name = name;
        this.enrollDate= enrollDate;
    }

    /*필기.
    *  설정자(setter) / 접근자(getter)
    *  모든 필드에 대해 각 설정자와 접근자를 작성하며 접근제한 범위는 public으로 설정한다
    * */

    // alt-insert 로 getter와 setter를 자동으로 만들수 있다
    public void setId(String id) {
        this.id = id;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEnrollDate(Date enrollDate) {
        this.enrollDate = enrollDate;
    }

    public String getId() {
        return id;
    }

    public String getPwd() {
        return pwd;
    }

    public String getName() {
        return name;
    }

    public Date getEnrollDate() {
        return enrollDate;
    }

    public String getInfo(){

        return "UserDTO [ id : "+this.id+" pwd : "+this.pwd+" name : "+this.name+" enrolldate : "+this.enrollDate+"]";
    }

}
