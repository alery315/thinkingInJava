package design.observer;

import java.util.ArrayList;
import java.util.List;

public class SubjectFor3D implements Subject {

    private List<Observer> list = new ArrayList<>();

    private String msg;

    @Override
    public void registerObserver(Observer observer) {
        list.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int idx = list.indexOf(observer);
        if (idx >= 0) {
            list.remove(observer);
        }
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : list) {
            observer.update(msg);
        }
    }

    public void setMsg(String msg) {
        this.msg = msg;
        notifyObservers();
    }


    public static void main(String[] args) {
        SubjectFor3D subject = new SubjectFor3D();
        subject.registerObserver(new Observers.Observer1());
        subject.registerObserver(new Observers.Observer2());
        subject.setMsg("20141346049");
    }

}
