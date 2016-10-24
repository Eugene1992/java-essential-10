package cw01;

public class TestProc {
    public static void main(String[] args) {
        String empOneName = "Marina";
        String empTwoName = "Vadim";
        String empThreeName = "Zhenya";

        int empOneSalary = 20000;
        int empTwoSalary = 25000;
        int empThreeSalary = 30000;

        if (empOneSalary > empTwoSalary && empOneSalary > empThreeSalary) {
            System.out.println(empOneName);
        }

        if (empTwoSalary > empOneSalary && empTwoSalary > empThreeSalary) {
            System.out.println(empTwoName);
        }

        if (empThreeSalary > empOneSalary && empThreeSalary > empTwoSalary) {
            System.out.println(empThreeName);
        }

        String[] names = {empOneName, empTwoName, empThreeName, "Ivan"};
        int[] ages = {empOneSalary, empTwoSalary, empThreeSalary, 50_000};

        int maxSalary = ages[0];
        int maxSalaryIndex = 0;
        for (int i = 0; i < ages.length; i++) {
            if (maxSalary < ages[i]) maxSalaryIndex = i;
        }

        System.out.println(names[maxSalaryIndex]);
    }
}
