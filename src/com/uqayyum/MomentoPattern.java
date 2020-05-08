package com.uqayyum;

import momento.Caretaker;
import momento.Originator;

/**
 * @author UMAIR QAYYUM
 *
 */

public class MomentoPattern {

    public static void TestMomentoFlow(){
        var editor = new Originator();
        var history = new Caretaker();

        editor.setContent("a");
        history.push(editor.createState());

        editor.setContent("b");
        history.push(editor.createState());

        editor.setContent("c");

        System.out.println(editor.getContent());

        editor.restore(history.pop());
        System.out.println(editor.getContent());

        editor.restore(history.pop());
        System.out.println(editor.getContent());

        editor.restore(history.pop());
        System.out.println(editor.getContent());
    }
}
