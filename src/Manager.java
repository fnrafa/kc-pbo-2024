public class Manager extends Employee implements Perusahaan, Kota {
    private final String name;
    private final double salary;
    private final double bonus;

    public void tampilkanNama() {
        System.out.println(name);
    }

    public void tampilkanKota() {
        System.out.println("malang");
    }

    public Manager(String name, double salary, double bonus) {
        this.name = name;
        this.salary = salary;
        this.bonus = bonus;
    }


    @Override
    public double getBonus() {
        return salary + bonus;
    }
}