package com.example.coupang.repository.entity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class AggregateRoot {

    private final List<Object> domainEvents = new ArrayList<>();

    protected void addDomainEvents(Object event){
        this.domainEvents.add(event);
    }


    public List<Object> getDomainEvents(){
        //외부에서 이벤트리스트에 접근하지 못하도록 제어
        return Collections.unmodifiableList(domainEvents);
    }

    public void clearDomainEvents(){
        this.domainEvents.clear();
    }
}
