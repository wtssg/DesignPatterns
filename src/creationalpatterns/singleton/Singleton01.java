package creationalpatterns.singleton;

/**
 * 饿汉式单例
 * 优点：天生就是线程安全的，不需要加锁，执行效率高
 * 缺点：类加载时就初始化，浪费内存
 * 它基于classloader机制避免多线程的同步问题，JVM保证类加载的时候是线程互斥的。
 * 不过，instance在类加载时就实例化，虽然导致类加载的原因很多，
 * 在单例模式中大多数情况都是调用getInstance方法
 */
//public class Singleton01 {
//    private static Singleton01 instance = new Singleton01();
//
//    private Singleton01() {}
//
//    public static Singleton01 getInstance() {
//        return instance;
//    }
//
//    public void showMessage() {
//        System.out.println("Hello World！！！");
//    }
//}

/**
 * 实现单例的最佳方法，它更简洁，自动支持序列化机制，防止反序列化创建新的对象，绝对防止多次实例化
 */
public enum Singleton01 {
    INSTANCE;
    public void showMessage() {
        System.out.println("Hello World！！！");
    }
}
