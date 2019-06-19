package com.shenk.utils;

import java.io.*;

public class FileUtil {

    private final static String EQUAL_STR = "=";

    /**
     * transfer csv file to properties,the csv must be two columns,the result is reserved
     * @param in
     * @param outPutPath
     */
    public static void csv2Properties(InputStream in, String outPutPath) {

        try(
                BufferedReader reader = new BufferedReader(new InputStreamReader(in));
                BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(outPutPath)))
                ){
            reader.mark(1);
            String first = reader.readLine();
            if(first != null) {
                if(first.split(",").length != 2){
                    return;
                }
            }
            reader.reset();
            while((first=reader.readLine()) != null) {
                String[] vars = first.split(",");
                    writer.write(vars[1] + EQUAL_STR + vars[0]);
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println(e);
           return;
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        csv2Properties(new FileInputStream("D:\\7045.csv"),"D:\\alarm7045.properties");
    }
}
