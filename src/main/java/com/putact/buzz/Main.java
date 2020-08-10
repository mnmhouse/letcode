package com.putact.buzz;

import java.util.Date;
import java.util.Scanner;

public class Main extends  ListNodeDemo {

    public static void main(String args[]){
       // 2019-02-10 data[4]="-",data[7]="-",data.length=10
        Scanner in = new Scanner(System.in);

        while(in.hasNext()){
            String str = in.nextLine();
            if(str.length()==10){
                String years = str.substring(0,3);
                String month= str.substring(5,6);
                String days = str.substring(8,9);

            }else {
                System.out.println("data format error ");

            }

            String  tt=str.substring(str.lastIndexOf(" ")+1);

            System.out.println(tt.length());

        }
        ListNodeDemo  demo = new ListNodeDemo();
        //demo.destCity()

    }
    public void tes(){
        //this.destCity()
        destCity(null);
    }

}
