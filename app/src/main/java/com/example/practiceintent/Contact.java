package com.example.practiceintent;

import org.parceler.Parcel;

@Parcel
public class Contact {

    String name, phone;

    public Contact() {
    }

    public Contact(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name=" + name +
                ", phone=" + phone +
                '}';
    }
}
