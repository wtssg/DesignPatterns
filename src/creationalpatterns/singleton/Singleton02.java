package creationalpatterns.singleton;

/*
 * 懒汉式
 * 优点：只有在使用的时候才会初始化实例，节约内存空间和启动速度。
 * 缺点：先天不是线程安全的，在多线程环境下需要加锁会影响效率
 */

/*
 * 1、懒汉式，线程不安全
 * 不考虑线程安全，在多线程环境下无法使用
 */
//public class Singleton02 {
//    private static Singleton02 instance = null;
//    private Singleton02() {}
//    public static Singleton02 getInstance() {
//        if (instance == null) {
//            instance = new Singleton02();
//        }
//        return instance;
//    }
//}

/*
 * 2、懒汉式，线程安全，在方法上加锁
 * 效率低下，99%情况下不需要同步
 */
//class Singleton02 {
//    private static Singleton02 instance = null;
//    private Singleton02() {}
//    public static synchronized Singleton02 getInstance() {
//        if (instance == null) {
//            instance = new Singleton02();
//        }
//        return instance;
//    }
//}

/*
 * 3、双检锁/双重检验锁（DCL）
 * 优点：安全，在多线程的环境下能保持高性能
 * 缺点：可能出现问题，Java指令创建对象和赋值操作是分开进行的
 * 通过给instance加上volatile使指令顺序执行，防止由于指令重排优化导致出错
 */
//class Singleton02 {
//    private static volatile Singleton02 instance = null;
//    private Singleton02() {}
//    public static Singleton02 getInstance() {
//        if (instance == null) {
//            synchronized (Singleton02.class) {
//                if (instance == null) {
//                    instance = new Singleton02();
//                }
//            }
//        }
//        return instance;
//    }
//}

/*
 * 4、登记式/静态内部类
 * 更加安全，在多线程的环境下能保持高性能
 *JVM保证类加载的时候是线程互斥的
 */
class Singleton02 {
    private static Singleton02 instance = null;

    private Singleton02() {}

    private static class SingletonHolder {
        private static final Singleton02 INSTANCE = new Singleton02();
    }
    public static Singleton02 getInstance() {
        return SingletonHolder.INSTANCE;
    }
    public void showMessage() {
        System.out.println("Hello World！！！");
    }
}


