//as per the single responsibility principle a single class should only pander to a single responsibility to
//keep code decoupled.A class should have only 1 responsibility.
package org.example.SingleResponsibilityPrinciple;

class ErrorScenario{
    public void calc(){
       //do some calculations
    }
    public void show(){
        //do some data formating
    }
    public void save(){
        //persist the data
    }
}

//in the above scenario all the code are written in a single class which handles multiple responsibilities like
//calculations, formating and data persisting. this can cause issue in the long run as this could read to
//harder to maintain - we will have to change the code in the class if any single responsibility requires change
//reusability -  we can't resuse a particular functionality in some other class
//risk to modify - change to a particular responsibility could lead to bug in some other responsibility

public class SingleResponsibilityPrinciple {
Calc c=new Calc();
View v=new View();
Persist p =new Persist();
}

class Calc{
    public void calc(){
        //do some calculations
    }
}

class View{
    public void show(){
        //do some data formating
    }
}

class Persist{
    public void save(){
        //persist the data
    }
}


//if any responsibility need to modify or breaks we can directly look into that perticular responsibility
// instead of updating in 1 common place


