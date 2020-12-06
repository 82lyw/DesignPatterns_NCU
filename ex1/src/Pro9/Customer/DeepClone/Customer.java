package Pro9.Customer.DeepClone;

import java.io.*;

public class Customer implements Serializable {
    private Address address = null;

    public Customer() {
        this.address = new Address();
    }

    public Object deepClone() throws IOException, ClassNotFoundException, OptionalDataException {
        ByteArrayOutputStream bao = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bao);
        oos.writeObject(this);

        ByteArrayInputStream bis = new ByteArrayInputStream(bao.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return (ois.readObject());
    }

    public Address getAddress() {
        return this.address;
    }

    public void display() {
        System.out.println("查看地址");
    }
}
