import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import org.bson.Document;

import java.util.ArrayList;
import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


     //1.Create hotel booking java application with mongoDB
     //2.Create the client for establish the connection
     //3.Create Database and Collections(HotelBookingDB bookingCollection)
     //4.Create Booking document(noOfrooms,noOfadults,checkingDate,hotelName,checkoutDate,roomPreference,meal) and insert document into collection
     //5.Update booking document
     //6.Access all booking document
     //7.Delete the booking document
     public static void main(String[] args) {
         //Configure the maven in your project and add mongoDB dependency
         //Create the mongoDB client for connection
         var client= MongoClients.create("mongodb://localhost:27017/");
         //create or get the database with name hotelBookingBD
         //it will create the database if not exists else access the database
         var hotelDB = client.getDatabase("hotelBookingDB");

         //create the bookingCollection collection in hotelBookingDB database
         hotelDB.createCollection("bookingCollection");
         // to insert multiple document
         ArrayList<Document> bookingList=new ArrayList<>();

         //create document and add hotel booking details
         var bookingDocument =new Document();
         //add the booking info
         var random=new Random();
         int no=random.nextInt(99999);
         bookingDocument.append("bookingID",random.nextInt(99999));
         bookingDocument.append("hotelName","Taj");
         bookingDocument.append("userName","Pawan Sharma");
         bookingDocument.append("userEmail","aman@gmail.com");
         bookingDocument.append("userMobile","3298274382");
         bookingDocument.append("checkInDate","28 August 2024");
         bookingDocument.append("checkOutDate","29 August 2024");
         bookingDocument.append("noOfDays",1);
         bookingDocument.append("price",2500);
         bookingDocument.append("noOfRooms",1);
         bookingDocument.append("roomPreference","River Face");
         bookingDocument.append("noOfAdults",2);
         bookingDocument.append("meals",false);

         bookingList.add(bookingDocument);

         var bookingDocument1 =new Document();
         bookingDocument1.append("bookingID",random.nextInt(99999));
         bookingDocument1.append("hotelName","Taj");
         bookingDocument1.append("userName","Aman Singh");
         bookingDocument1.append("userEmail","aman@gmail.com");
         bookingDocument1.append("userMobile","3298274382");
         bookingDocument1.append("checkInDate","28 August 2024");
         bookingDocument1.append("checkOutDate","29 August 2024");
         bookingDocument1.append("noOfDays",1);
         bookingDocument1.append("price",2500);
         bookingDocument1.append("noOfRooms",1);
         bookingDocument1.append("roomPreference","River Face");
         bookingDocument1.append("noOfAdults",2);
         bookingDocument1.append("meals",false);

         bookingList.add(bookingDocument1);

         var bookingDocument2 =new Document();
         bookingDocument2.append("bookingID",random.nextInt(99999));
         bookingDocument2.append("hotelName","Taj");
         bookingDocument2.append("userName","Dadi");
         bookingDocument2.append("userEmail","aman@gmail.com");
         bookingDocument2.append("userMobile","3298274382");
         bookingDocument2.append("checkInDate","28 August 2024");
         bookingDocument2.append("checkOutDate","29 August 2024");
         bookingDocument2.append("noOfDays",1);
         bookingDocument2.append("price",2500);
         bookingDocument2.append("noOfRooms",1);
         bookingDocument2.append("roomPreference","River Face");
         bookingDocument2.append("noOfAdults",2);
         bookingDocument2.append("meals",false);

         bookingList.add(bookingDocument2);

         //to access the bookingCollection
         var bookingCollection=hotelDB.getCollection("bookingCollection");
         //to insert the document into bookingCollection
         bookingCollection.insertMany(bookingList);





    }
}