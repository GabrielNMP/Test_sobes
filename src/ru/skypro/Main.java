package ru.skypro;

public class Main {

    public static void main(String[] args) {
        int[] num1 = {6, 10, 30, 28};
        int[] num2 = {2, 0, 15};

        for (int i = 0; i < num1.length; i++) {
            try {
                System.out.println(num1[i] + "/" + num2[i] + " = " + num1[i]/num2[i]);
            }
            catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
                System.out.println( " ���-�� ����� �� ���, ���� ���� �������������� ������, ��� �� ��������� ���������� ��������� � �������. ");
            }

        }


        int[] mas1 = {6, 10, 30, 28};
        int[] mas2 = {2, 0, 15};

        for (int i = 0; i < mas1.length; i++) {
            try {
                System.out.println(mas1[i] + "/" + mas2[i] + " = " + mas1[i]/mas2[i]);
            }
            catch (ArithmeticException e) {
                System.out.println( " ������ �� ���� ������  ");
            }
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println( "  �� ��������� ���������� ��������� � �������. ");
            }

        }
    }
}
