package creationalpatterns.singleton;

/**
 * 单例模式保证一个类只有一个实例，并提供了访问它的全局访问点。
 * 当一个全局使用的类频繁的创建和销毁的时候，使用单例可以控制实例数量，节约系统资源
 */
public class SingletonDemo {
    public static void main(String[] args) {
        // 无法创建singleton的实例
//        Singleton01 singleton01 = new Singleton01();
        Singleton02 singleton = Singleton02.getInstance();
        singleton.showMessage();

        Singleton01 singleton02 = Singleton01.INSTANCE;
        singleton02.showMessage();
    }
}
