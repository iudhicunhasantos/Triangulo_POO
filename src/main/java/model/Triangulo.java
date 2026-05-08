package model;

import javax.swing.JOptionPane;

public class Triangulo {

    private int base;
    private int altura;
    private double area;

    public Triangulo() {
        this(0, 0);
    }

    public Triangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public int getAltura() {
        return altura;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getArea() {
        return calculo();
    }

    public void leitura() {
        setBase(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a base: ")));
        setAltura(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a altura: ")));
    }

    private double calculo() {
        setArea((getBase() * getAltura()) / 2.0);
        return area;
    }

    public void imprimir() {
        JOptionPane.showMessageDialog(null, "A área do triangulo é: " + getArea());
    }
}
