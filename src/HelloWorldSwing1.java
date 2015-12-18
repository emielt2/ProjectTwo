/**
 * Created by E on 18/12/2015.
 */
//public class x {
//}

/*
 * Copyright (c) 1995, 2008, Oracle and/or its affiliates. All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *   - Redistributions of source code must retain the above copyright
 *     notice, this list of conditions and the following disclaimer.
 *
 *   - Redistributions in binary form must reproduce the above copyright
 *     notice, this list of conditions and the following disclaimer in the
 *     documentation and/or other materials provided with the distribution.
 *
 *   - Neither the name of Oracle or the names of its
 *     contributors may be used to endorse or promote products derived
 *     from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS
 * IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
 * THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
 * PURPOSE ARE DISCLAIMED.  IN NO EVENT SHALL THE COPYRIGHT OWNER OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
 * PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

/**
 * This example, like all Swing examples, exists in a package:
 * in this case, the "start" package.
 * If you are using an IDE, such as NetBeans, this should work
 * seamlessly.  If you are compiling and running the examples
 * from the command-line, this may be confusing if you aren't
 * used to using named packages.  In most cases,
 * the quick and dirty solution is to delete or comment out
 * the "package" line from all the source files and the code
 * should work as expected.  For an explanation of how to
 * use the Swing examples as-is from the command line, see
 * http://docs.oracle.com/javase/javatutorials/tutorial/uiswing/start/compile.html#package
 */
package start;

/*
 * HelloWorldSwing.java requires no other files.
 */
import javax.swing.*;

import static java.lang.Thread.sleep;

public class HelloWorldSwing1 {
    String output1 = "Output 111111";
    /**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from the
     * event-dispatching thread.
     */
    private static void createAndShowGUI() {
        //Create and set up the window.

        JFrame frame = new JFrame("Valuta Comparer 1.0");
        frame.setLocation(800,200);
        frame.pack();


        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Add the ubiquitous "Hello World" label.
        JLabel label = new JLabel("Hello World");
        JTextArea textArea1 = new JTextArea(10,40);


        //frame.getContentPane().add(label);
        frame.pack();
        //try {sleep(2000);}catch(InterruptedException e){e.printStackTrace();}
        frame.getContentPane().add(textArea1);
        frame.pack();

        frame.setVisible(true);
        //textArea1.setText("Dit is ASDFACVZXCVASDF asdf asdf asdf asdf asdf zxcv zxcv asdf asdf zxcv sdf weqr qwr x df asdf wer wr sdf xv ");
        String output2 = new HelloWorldSwing1().output1;
        textArea1.setText(output2);
       //try {sleep(2000);}catch(InterruptedException e){e.printStackTrace();}

    }

    void modifyAndShowGUI(String input1){
        //textArea1
    }

    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.

        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
                System.out.println("x");
            }

        });
        System.out.println("Y");
        for(int i=0 ; i<10 ; i++){

        }
    }
}