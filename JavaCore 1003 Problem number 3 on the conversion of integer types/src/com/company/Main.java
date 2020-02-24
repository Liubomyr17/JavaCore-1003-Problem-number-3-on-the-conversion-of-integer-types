package com.company;

/*

1003 Problem number 3 on the conversion of integer types

Add one type conversion operation to get the answer: b = 0
float f = (float) 128.50;
int i = (int) f;
int b = (int) (i + f);

Requirements:
1. The program should display the text on the screen.
2. You cannot change the display command.
3. The main () method must contain a variable f of type float.
4. The main () method must contain an i variable of type int.
5. The main () method must contain a variable b of type int.
6. The initial value of the variables during initialization cannot be changed. You can add only cast operators.
7. The program should print the number 0.

 */

import java.io.*;
import java.lang.reflect.Array;
import java.net.URISyntaxException;
import java.nio.file.FileSystemException;
import java.nio.file.attribute.AclFileAttributeView;
import java.rmi.RemoteException;
import java.text.SimpleDateFormat;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        float f = (float) 128.50;
        int i = (int) f;
        int b = (byte)(int) (i + f);
        System.out.println(b);
    }
}














