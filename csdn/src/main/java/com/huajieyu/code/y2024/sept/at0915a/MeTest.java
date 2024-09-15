package com.huajieyu.code.y2024.sept.at0915a;

public class MeTest {

    public static void main(String[] args) {
        Father father = new Father("Fa", 40);
        Mother mother = new Mother("Mo", 39);

        // 人出生时必须绑定父母关系，并且这种血缘关系无法被修改
        Me me = new Me(father, mother);

        // 输出属性变量查看地址
        System.out.println(System.identityHashCode(me.getFather()));
        System.out.println(System.identityHashCode(me.getMother()));
        System.out.println("---------------------------------");

        // 再次输出属性变量查看地址
        System.out.println(System.identityHashCode(me.getFather()));
        System.out.println(System.identityHashCode(me.getMother()));
    }
}
