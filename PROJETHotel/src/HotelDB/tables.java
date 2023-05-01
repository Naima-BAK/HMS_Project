/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HotelDB;

import java.sql.Connection;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author NAIMA BEKNCHICH
 */
public class tables {
    public static void main(String[] args){
        Connection con =null;
        Statement st= null;
        try{
            con =ConnectionProvider.getCon();
            st=con.createStatement();
             //3.st.executeUpdate("create table Reservation(id int,idC int,name varchar(25),mobileNumber int(10),checkIn varchar(50),roomNum varchar(10),bed varchar(20), roomType varchar(20),pricePerDay int(10),numberOfDayStay int(10),totalAmount varchar(200),checkOut varchar(50))");
            //2.st.executeUpdate("create table room(roomNum varchar(10),roomType varchar(20),bed varchar(20),price int,status varchar(20))");
            //1.st.executeUpdate("create table Client(id int,name varchar(50),mobileNumber int(10),nationality varchar(25),gender varchar(25),identityCode varchar(25),email varchar(50),address varchar(50))");
            //st.executeUpdate("create table user(name varchar(25),email varchar(50),password varchar(25),securityID varchar(25),adresse varchar(50),status varchar(20))");
           //st.executeUpdate("create table room(roomNum varchar(10),roomType varchar(20),bed varchar(20),price int,status varchar(20))");
          // st.executeUpdate("create table customer(id int,name varchar(25),mobileNumber int(10),nationality varchar(25),gender varchar(20),email varchar(200),idProof varchar(200),address varchar(200),checkIn varchar(50),roomNum varchar(10),bed varchar(20), roomType varchar(20),pricePerDay int(10),numberOfDayStay int(10),totalAmount varchar(200),checkOut varchar(50))");
          st.executeUpdate("create table Employee(id int,name varchar(25),mobileNumber int(10),age int,gender varchar(25),job varchar(25),salary int,email varchar(50),address varchar(50))");
          JOptionPane.showMessageDialog(null, "la table créé avec succès!");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            
        }
        finally{
            try{
                con.close();
                st.close();
            }
            catch(Exception e){
            
        }
    
    }}}
//primary key :
// alter table room add constraint room1 primary key (roomNum);
//alter table client add constraint client1 primary key (id);
//alter table Reservation add constraint Reservation1 primary key (id);
//Foreign key :
//alter table Reservation add constraint Reservation2 foreign key (idC) references client(id);
//alter table Reservation add constraint Reservation3 foreign key (roomNum) references room(roomNum);