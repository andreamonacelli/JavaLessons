package com.amonacelli.lessons;

//Lecture date: 9th March 2023
public class ClickCounter {
    //Class that will count the number of clicks on a certain area
    int clicks;     //Attribute that represents the number of clicks

    //Default Constructor for the class
    public ClickCounter() {     //This constructor initializes all the attributes of the class (in this case we just have a single attribute)
        clicks = 0;
    }

    public int getValue(){
        return clicks;      //This method returns the current value of clicks
    }

    public void click(){
        clicks += 1;        //This method increments the number of clicks
    }

    public void undo(){     //This method decreases the number of clicks
        clicks -= 1;
        if(clicks <= 0){    //Number of clicks cannot be less than 0
            clicks = 0;
        }
    }

    //The following method is pretty much self-explanatory
    public void reset(){
        clicks = 0;
    }

    /*
    public static void main(String[] args) {
        ClickCounter cc1 = new ClickCounter();
        cc1.click();
        cc1.click();
        //cc1.reset();
        //cc1.undo();
        //cc1.undo();
        //cc1.undo();
        //cc1.undo();
        System.out.println(cc1.getValue());

    }
    */
    //We generally won't use a main to test the methods we put in our classes
    //The best practice is to run tests: right click anywhere on the window, select Generate, then select Test
    //IntelliJ will automatically generate the test programs for you to run

}
