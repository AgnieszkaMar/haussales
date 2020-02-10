package model;

public class House {

    private int area;
    private int price;
    private int rooms;
    private boolean balcony;
    private Address address;

    public House(int area, int price, int rooms, boolean balcony, Address address) {
        this.area = area;
        this.price = price;
        this.rooms = rooms;
        this.balcony = balcony;
        this.address = address;
    }



    public int getArea() {
        return area;
    }
    public int getPrice() {
        return price;
    }

    public int getRooms() {
        return rooms;
    }

    public boolean isBalcony() {
        return balcony;
    }

    public Address getAddress() {
        return address;
    }



    public void setArea(int area) {
        this.area = area;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
    }

    public void setBalcony(boolean balcony) {
        this.balcony = balcony;
    }

    public void setAddress(Address address) {
        this.address = address;
    }


}
