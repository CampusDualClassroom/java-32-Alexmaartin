package com.campusdual.classroom;

import com.campusdual.util.Utils;

import java.io.*;

public class Exercise32 {

    public static void main(String[] args) {

    }

    public static String generateStringToSave(String string) {
        if (string != null){
            return string;
        }else {
            return generateUserInputToSave();
        }
    }

    private static String generateUserInputToSave(){
        StringBuilder sb = new StringBuilder();
        System.out.println("Escribe debajo el texto que quieras. Pulsa \"ENTER\" 2 veces seguidas para finalizar:");
        String string;
        while(!(string = Utils.string()).isEmpty()){
            sb.append(string).append(System.lineSeparator());
        }
        return sb.toString();
    }

    public static void printToFile(String string) {
        String filePath = "src/main/resources/data.txt";
        File file = new File(filePath);
        file.getParentFile().mkdirs();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))){
            writer.write(string);
        } catch (IOException e) {
            System.out.println("Ha habido un fallo a la hora de escribir el fichero: " + e.getMessage());
        }
    }


}
