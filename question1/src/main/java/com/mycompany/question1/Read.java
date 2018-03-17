/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.question1;

import java.io.File;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.Writer;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.DataFormatter;

/**
 *
 * @author Saufi
 */


public class Read {
    public static final String FILE_NAME = "C:/Users/Saufi/Documents/A1.xlsx";
    
    
    
    public void read() throws IOException{
        Writer writer = null;
        
        boolean title = true;
        File file = new File ("C:\\Users\\Saufi\\239955-STIW3054-A172-A1.wiki/Home.md");
            writer = new BufferedWriter (new FileWriter(file));
            
        try {
            
            
            
            DataFormatter dataFormat = new DataFormatter();

            FileInputStream excelFile = new FileInputStream(new File(FILE_NAME));
            Workbook workbook = new XSSFWorkbook(excelFile);
            Sheet datatypeSheet = workbook.getSheetAt(0);
            Iterator<Row> iterator = datatypeSheet.iterator();
            
           
            
            while (iterator.hasNext()) {

                Row currentRow = iterator.next();
                Iterator<Cell> cellIterator = currentRow.iterator();

                while (cellIterator.hasNext()) {

                    Cell currentCell = cellIterator.next();
                    String value = dataFormat.formatCellValue(currentCell);
                    
                    System.out.print(value + " \t");
                    writer.write(value+ "|");
               
                    
                }
                
                 System.out.println();
                 writer.write("\n");
                
                if(title ==true){
                    
                    writer.write ("--|--|--|--\n");
                    title = false;
                }
               
                

            }
        } catch (FileNotFoundException e) {
        } catch (IOException e) {
        }
        try{
            if (writer != null)
            {
                writer.close();
            }
        } catch (IOException e){
            e.printStackTrace();
        }
        
        
        
    }

    }
    

