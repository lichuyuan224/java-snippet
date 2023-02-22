import java.util.*;

/**
 * @author li
 */
class Book {
    String name;
    String author;
    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }
}

public class Hello {
    public static void main(String[] args) {
        System.out.println("hello world;");
        // 标识符支持 A-Z a-z _ $
        int $test = 1;
        int _test = 1;
        // 数据类型
        // 整型
        // byte 1字节 -128~127
        // short 2字节 -32768~32767
        // int 4字节 -2147483648~2147483647
        // long 8字节 -9223372036854775808~9223372036854775807
        // 浮点型
        // float 4字节
        // double 8字节
        // 字符型
        // char 2字节
        // 布尔型
        // boolean 1字节
        // 常量
         final int test = 1;
        // 变量
         int test2 = 1;
        // 强制类型转换
         int test3 = 1;
         double b = 1.1;
         test3 = (int) b;
         System.out.println("test3: " + test3);
         Collection list = new ArrayList();
         list.add(new Book("test1", "test2"));
         for (Object o : list) {
             System.out.println(((Book) o).name);
         }

         Map testMap = new HashMap();
         testMap.put("test", new Book("test1", "test2"));
         System.out.println(((Book) testMap.get("test")).name);
    }
}
