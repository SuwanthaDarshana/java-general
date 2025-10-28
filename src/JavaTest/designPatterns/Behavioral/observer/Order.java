package JavaTest.designPatterns.Behavioral.observer;

import java.util.ArrayList;
import java.util.List;

//Subject
public class Order {

    private String status;  //current status of the order
    private List<OrderObserver> observers = new ArrayList<>();           //list of objects that want to be notified when status changes.


    public void addObserver(OrderObserver observer){                //Allows observers to register themselves with this subject.
        observers.add(observer);
    }

    public void setStatus(String status){                       //Updates the status of the order and notifies all observers.
        this.status = status;
        notifyObservers();
    }

    private void notifyObservers(){                          //Notifies all observers about the change in status.
        for(OrderObserver obs : observers){
            obs.update(status);
        }
    }






}
