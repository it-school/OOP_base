package com.itschool;

public class Table
{
    private short length;
    private short width;
    private short height;
    private String color;
    private short weight;
    private byte drawersQuantity;
    private String model;


    public short getLength() {
        return length;
    }

    public void setLength(short length) {
        this.length = length > 0 ? length : 100;
    }

    public short getWidth() {
        return width;
    }

    public void setWidth(short width) {
        this.width = width > 0 ? width : 60;
    }

    public short getHeight() {
        return height;
    }

    public void setHeight(short height) {
        this.height = height > 0 ? height : 70;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public short getWeight() {
        return weight;
    }

    public void setWeight(short weight) {
        this.weight = weight > 0 ? weight : 50;
    }

    public byte getDrawersQuantity() {
        return drawersQuantity;
    }

    public void setDrawersQuantity(byte drawersQuantity) {
        this.drawersQuantity = drawersQuantity >= 0 ? drawersQuantity : 0;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String toString()
    {
        return "This is a table:\n" + "Model: " + model + "\nРазмеры: " + length + " x " + width + " x " + height + "\n" +
                "Color: " + color + "\n" + "Weight: " + weight + " kg\n" +
                "Drawers quantity: " + drawersQuantity;
    }

    public Table()
    {

    }

    public Table(int length, int width, int height, String color, int weight, int drawersQuanity, String model)
    {
        setLength((short)length);
        setWidth((short)width);
        setHeight((short)height);
        setColor(color);
        setWeight((short)weight);
        setDrawersQuantity((byte)drawersQuanity);
        setModel(model);
    }
}
