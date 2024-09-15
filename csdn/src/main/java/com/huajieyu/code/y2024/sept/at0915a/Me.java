package com.huajieyu.code.y2024.sept.at0915a;

public final class Me {

    private final Father father;
    private final Mother mother;

    // 不提供无参构造器，必须要创建对象时初始化所有字段
    public Me(Father father, Mother mother) {
        this.father = father;
        this.mother = mother;
    }

    public Father getFather() {
        // 不能直接return对象
        // return father;
        // 而是要创建一个新对象
        return new Father(father.getName(), father.getAge());
    }

    public Mother getMother() {
        // 不能直接return对象
        // return mother;
        // 而是要创建一个新对象
        return new Mother(mother.getName(), mother.getAge());
    }

    @Override
    public String toString() {
        return "Me{" +
                "father=" + father +
                ", mother=" + mother +
                '}';
    }
}
