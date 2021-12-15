package com.kuang.pojo;

public class Proxy implements Rent {

    private Host host;

    public Proxy(Host host) {
        this.host = host;
    }

    public  Proxy(){}

    public void rent() {
        System.out.println("带房客看房");
        host.rent();
        System.out.println("收中介费");
    }
}
