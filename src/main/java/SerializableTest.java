/**
 * Copyright (C), 2011-2018, 微贷网.
 */

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * @author binglin 2018/3/17.
 */
public class SerializableTest implements Serializable {

    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    private void writeObject(java.io.ObjectOutputStream out) throws IOException {
        System.out.println("writeObject invoked");
        out.writeObject(this.message == null ? "hohohahaha" : this.message);
    }

    private void readObject(java.io.ObjectInputStream in) throws IOException,
            ClassNotFoundException {
        System.out.println("readObject invoked");
        this.message = (String) in.readObject();
        System.out.println("got message:" + message);
    }

    private Object writeReplace() throws ObjectStreamException {
        System.out.println("writeReplace invoked");
        return new SerializableTest();
    }

    private Object readResolve() throws ObjectStreamException {
        System.out.println("readResolve invoked");
        return this;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        SerializableTest test = new SerializableTest();
        test.setMessage("sssss");
        oos.writeObject(test);
        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        Object o = ois.readObject();


    }
}
