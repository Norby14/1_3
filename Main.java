import java.util.*;
import java.util.Scanner;
import static java.lang.Math.*;
class Main {
  public static void main(String[] args) {
Scanner pobierz = new Scanner(System.in);
        double liczba1,liczba2;
				System.out.println("Wpisz pierwszą liczbę:");
        liczba1 = pobierz.nextInt();
				System.out.println("Wpisz drugą liczbę:");
        liczba2 = pobierz.nextInt();
				double wynik;
        wynik = sqrt(liczba1)+sqrt(liczba2);
			System.out.println(wynik);
  }
}
	