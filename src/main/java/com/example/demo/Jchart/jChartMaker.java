package com.example.demo.Jchart;

import com.example.demo.ApacheDatabase.ApacheDatabase;
import com.example.demo.ExcelSheetReader.ExcelReader;
import com.example.demo.Model.Employee;

import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.*;

import com.itextpdf.layout.element.Image;;
import org.jfree.chart.JFreeChart;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.*;
import java.sql.*;
import java.util.List;

public class jChartMaker {

    static public void main(String[] args) {
        ApacheDatabase database=new ApacheDatabase();
        ExcelReader excelReader = new ExcelReader();
        List<Employee> Employees = excelReader.getEmployeeList();
        ApacheDatabase.Insertion(Employees);
        generateCharts(Employees);
    }
    private static void generateCharts(List<Employee> Employees) {
        String pdfPath = "QueriesJchartResults.pdf";

        try (OutputStream os = new FileOutputStream(pdfPath);
             PdfWriter writer = new PdfWriter(os);
             PdfDocument pdfDocument = new PdfDocument(writer);
             Document document = new Document(pdfDocument)) {


            JFreeChart chart1 = ApacheDatabase.findMaxInterview();
            System.out.println(chart1);
            BufferedImage image = chart1.createBufferedImage(700, 500);
            Image itextImage = new Image(ImageDataFactory.create(image, null));

            document.add(itextImage);

            JFreeChart chart2 = ApacheDatabase.findMinInterview();
            BufferedImage image2 = chart2.createBufferedImage(700, 500);
            Image itextImage2 = new Image(ImageDataFactory.create(image2, null));

            document.add(itextImage2);

            JFreeChart chart5 = ApacheDatabase.viewTop3Skill();
            BufferedImage image5 = chart5.createBufferedImage(700, 500);
            Image itextImage5 = new Image(ImageDataFactory.create(image5, null));

            document.add(itextImage5);

            JFreeChart chart4 = ApacheDatabase.viewTop3SkillsInPeakTime();
            BufferedImage image4 = chart4.createBufferedImage(700, 500);
            Image itextImage4 = new Image(ImageDataFactory.create(image4, null));

            document.add(itextImage4);

            JFreeChart chart3 = ApacheDatabase.getTop3Panels(Employees);
            System.out.println(chart3);
            BufferedImage image3 = chart3.createBufferedImage(700, 500);
            Image itextImage3 = new Image(ImageDataFactory.create(image3, null));

            document.add(itextImage3);

            System.out.println("Path of the generated pdf: " + pdfPath);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

