package mygitdemo.mygitdemo;

/**
 * Created by gavin
 * Time 2017/4/12  10:08
 * Email:molu_clown@163.com
 */

public class User {

    private String useName;

    private int age;

    public void feature1(String useName) {
        this.useName = useName;

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void feature3(int age){
        this.age=age;
    }

    public void feature2(){

    }
}
