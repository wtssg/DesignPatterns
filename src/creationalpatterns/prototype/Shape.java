package creationalpatterns.prototype;

import java.io.*;

public abstract class Shape implements Cloneable, Serializable {
    private  String id;
    private String type;

    public abstract void draw();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    /**
     * 浅复制，需要实现Cloneable接口
     * 基本数据类型的变量会重新创建，而引用类型指向的是原对象所指向的。
     * @return
     */
    public Object clone() {
        Object obj = null;
        try {
            obj = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return obj;
    }

    /**
     * 深复制需要实现Serializable接口
     * 不论是基本数据类型还是原对象所指向的数据类型都会重新创建。
     * @return
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public Object deepClone() throws IOException, ClassNotFoundException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(this);
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return ois.readObject();
    }
}
