package creationalpatterns.prototype;

import java.io.*;

public class Prototype implements Cloneable, Serializable {

    /**
     * 浅复制，需要实现Cloneable接口
     * 只能复制原对象的引用，基本数据类型无法复制
     * @return
     * @throws CloneNotSupportedException
     */
    public Object clone() throws CloneNotSupportedException {
        Prototype pro = (Prototype) super.clone();
        return clone();
    }

    /**
     * 深复制需要实现Serializable接口
     * 完全复制与原对象相同
     * @return
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public Object deepClone() throws IOException, ClassNotFoundException {
        // 写入当前对象的二进制流
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(this);

        // 读出二进制流产生新的对象
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return ois.readObject();
    }

}
