package com.tungse.idea.study;

import java.util.ArrayList;
import java.util.Arrays;

public class AAAAAAAAAAAAAAAAAAAa {

    //模版1: psvm  public static void main(String[] args)
    public static void main(String[] args) {
        //模版2: sout、soutp、soutm、soutv、serr
        System.out.println();
        System.err.println();
        System.out.println("args = " + Arrays.deepToString(args));
        //模版3: fori、 itar、
        for (int i = 0; i < args.length; i++) {
        }
        //模版4: list.for 、list.fori、 list.forr
        ArrayList<String> list = new ArrayList<>();
        for (String string : list) { }
        for (int i = 0; i < list.size(); i++) { }
        for (int i = list.size() - 1; i >= 0; i--) { }


    }

    public void method(){
        ArrayList<String> list = new ArrayList<>();
        list.add("aa");
        list.add("aa");
        list.add("aa");
    
        //模版5: ifn、inn、xxx.nn
        if (list == null) { }
        if (list != null) { }
        //list.
        if (list != null) { }
    }
}
