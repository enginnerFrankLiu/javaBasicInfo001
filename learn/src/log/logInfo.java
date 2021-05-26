package log;

import java.util.Random;

public class logInfo {

    //这里重要强调一点：不要以为某些数据是final就可以在编译期知道其值通过final_03我们就知道了，在这里是使用随机数其进行初始化，他要在运行期才能知道其值、、
    //通过final_03我们就知道了，在这里是使用随机数其进行初始化，他要在运行期才能知道其值

    public static Random random=new Random();

    private final int final_03=random.nextInt(10);

   public final Object obj=new Object();

    private final String final_01="version";

    //有些变量 我们希望它可以根据对象的不同而有不同的表现，但 同时又不希望它被修改.
    //这个时候 我们就可以考虑运行时常量；对于运行时常量她可以是 基本数据类型 也可以引用类型
    //基本数据类型表示其内容不可变
    //引用数据类型变量 其引用不可变
    private final String final_02;
    public logInfo(String info){
        this.final_02=info;
    }


    /**
     * 编译期常量，永远不会变
     * 必须初始化，且不能改变
     *
     * final 修饰方法：表示方法不能被继承 更改
     * 所以对于final方法使用的第一个原因就是方法锁定，以防止任何子类来对它的修改
     *   如果某个类用final修改，表明该类是最终类，它不希望也不允许其他来继承它。在程序设计中处于安全或者其他原因
     */
    public void info(){


    }
    /**
     * 还可以修饰参数、若某个参数被final修饰了，则代表了该参数是不可改变的。
     * @param age
     */
    public void showAge(final int age){

        System.out.println(age);
    }

    /**
     * The final local variable x cannot be assigned. It must be blank and not using a compound assignment
     * @param person
     */
    public void showPerson(final Person person){

//        person=new Person();
    }
}
