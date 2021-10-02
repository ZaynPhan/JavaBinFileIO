import java.io.*;
import java.time.LocalDate;

public class App {
    public static void main(String[] args) {

        //Đọc tạp tin Person có cùng version
        try{
            FileInputStream fis = new FileInputStream("person.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);

            Person p = (Person) ois.readObject();
            System.out.println(p);
            ois.close();
        }catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }

        //Ghi tập tin Person có version
        Person p = new Person("Ryu", 30);
        try {
            FileOutputStream fos = new FileOutputStream("person.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(p);

            oos.flush();
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

//        //Đọc data dạng binary từ 1 binary data
//        try {
//            FileInputStream fis = new FileInputStream("orders.bin");
//            DataInputStream dis = new DataInputStream(fis);
//            while (dis.available() > 0) {
//                String name = dis.readUTF();
//                String date = dis.readUTF();
//                double total = dis.readDouble();
//
//                LocalDate ld = LocalDate.parse(date);
//                Order ord = new Order(ld, name, total);
//                System.out.println(ord);
//            }
//            dis.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

//        //Ghi data dạng binary vào 1 data file
//        Order[] orders = new Order[]{
//                new Order(LocalDate.now(), "Minh", 500f),
//                new Order(LocalDate.now(), "Ryan", 12f),
//                new Order(LocalDate.now(), "Duke", 14.5f),
//                new Order(LocalDate.now(), "Mariah", 19.4f),
//                new Order(LocalDate.now(), "Sue", 32.9f),
//                new Order(LocalDate.now(), "Tom", 10.11f)
//        };
//        try {
//            FileOutputStream fos = new FileOutputStream("orders.bin");
//            BufferedOutputStream bos = new BufferedOutputStream(fos);
//            DataOutputStream dos = new DataOutputStream(bos);
//
//            for (Order ord : orders) {
//                dos.writeUTF(ord.getCustomerName());
//                dos.writeUTF(ord.getDate().toString());
//                dos.writeDouble(ord.getTotal());
//            }
//            dos.flush();
//            dos.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

//        try {
//            FileOutputStream fos = new FileOutputStream("data.bin");
//            BufferedOutputStream bos = new BufferedOutputStream(fos);
//
//            bos.write("Hello!".getBytes());
//            bos.write("\n".getBytes());
//            bos.write("How are you today?".getBytes());
//            bos.write("\n".getBytes());
//            bos.write(77);
//
//            bos.flush();
//            bos.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        try {
//            FileInputStream fis = new FileInputStream("data.bin");
//            BufferedInputStream bis = new BufferedInputStream(fis);
//
//            // read 1 byte
//            int ch;
//            ch = bis.read();
//            while (ch != -1) {
//                System.out.print((char) ch);
//                ch = bis.read();
//            }
//            fis.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

    }
}
