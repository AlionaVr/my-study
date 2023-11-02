package tasks.oleg;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

class Company {
    private final ArrayList<Worker> workers;

    public Company(ArrayList<Worker> workers) {
        this.workers = workers;
    }

    // нужно подсчитать, сколько компания потратила суммарно денег, выплачивая зарплату каждому сотруднику в месяц
    float costs(LocalDate fromDate) {
        float overallCosts = 0f;
        for (Worker worker : workers) {
            float salary = worker.getSalary();
            LocalDate workersFirstDate = worker.getFirstDateAtWork();
            if (!workersFirstDate.isAfter(fromDate)) {
                Period period = Period.between(workersFirstDate, fromDate);
                int monthsBetween = period.getYears() * 12 + period.getMonths();
                overallCosts += salary * monthsBetween;
            }
        }
        return overallCosts;
    }
}

class Worker {
    private final String name;
    private final String position;
    private final float salary;
    private final LocalDate firstDateAtWork;

    public Worker(String name, String position, LocalDate firstDateAtWork, float salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
        this.firstDateAtWork = firstDateAtWork;
    }

    public float getSalary() {
        return salary;
    }

    public LocalDate getFirstDateAtWork() {
        return firstDateAtWork;
    }
}

public class OlegReview {
    public static void main(String[] args) {
        ArrayList<Worker> workersForCompanyA = new ArrayList<>();
        workersForCompanyA.add(new Worker("Alena", "Director", LocalDate.of(2023, 5, 1), 1000f));
        workersForCompanyA.add(new Worker("Alena1", "Director1", LocalDate.of(2022, 12, 1), 101f));
        workersForCompanyA.add(new Worker("Alena2", "Director2", LocalDate.of(2021, 12, 1), 502f));
        Company companyA = new Company(workersForCompanyA);
        float overallCosts = companyA.costs(LocalDate.of(2022, 1, 1));
        System.out.printf("Overall costs of the company A: %f", overallCosts);
    }
}