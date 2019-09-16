import com.enigma.model.Employee;
import com.enigma.model.Programmer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader =  new BufferedReader(new InputStreamReader(System.in));

        System.out.print("silahkan masukan jumlah gaji pokok: ");
        Integer salery = Integer.parseInt(reader.readLine());
        System.out.print("silahkan masukan jumlah tunjangan kesehatan: ");
        Integer healthBenefits = Integer.parseInt(reader.readLine());
        System.out.print("silahkan masukan jumlah bonus: ");
        Integer bonus = Integer.parseInt(reader.readLine());
        System.out.println("===================");
        System.out.println("Gaji Programmer");

        Programmer programmerSalery = new Programmer(salery,healthBenefits,bonus);
        programmerSalery.getSalery(salery,healthBenefits,bonus);
        System.out.println(programmerSalery.print());

        System.out.println("===================");
        System.out.println("Gaji Karyawan Umum");
        System.out.print("silahkan masukan jumlah gaji pokok: ");
        Integer saleryEmployee = Integer.parseInt(reader.readLine());
        System.out.print("silahkan masukan jumlah tunjangan kesehatan: ");
        Integer healthBenefitsEmployee = Integer.parseInt(reader.readLine());

        Employee saleryE = new Employee(saleryEmployee,healthBenefitsEmployee);
        saleryE.getSalery(saleryEmployee,healthBenefitsEmployee);
        System.out.println(saleryE.print());

    }
}
