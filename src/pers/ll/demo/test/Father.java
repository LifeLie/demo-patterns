package pers.ll.demo.test;

import java.util.HashMap;

/**
 * @author ll
 * @date 2018/11/14 4:26 PM
 */
public class Father {

    public static String ttt = "";

    static {
        System.out.println("baba");
        ttt = "bbbb";
    }

    protected static HashMap<String, String> map = new HashMap<>();

    public void setValue() {
        map.put("a", "a");
    }


}
