package aggregation;
import java.util.*;
/**
 *
 * @author jovan
 */

//membuat class boss
class Boss{
    private String name;
    private String companyName;
    private List<Worker> workers;
    
    Boss(String name, String companyName, List<Worker> workers){
        this.name = name;
        this.companyName = companyName;
        this.workers = workers;
    }
    
    public List<Worker> getWorkers(){
        return workers;
    }
}

//boss memiliki pekerja
class Worker{
    private String name;
    private String position;
    private int salary;

    
    Worker(String name, String position, int salary){
        this.name = name;
        this.position = position;
        this.salary = salary;
    }
    
    @Override
    public String toString(){
        return "name: " + name + ", position: " + position + ", salary: " + salary;
    }
}
public class Aggregation {

    public static void main(String[] args) {
        List<Worker> workers = new ArrayList<Worker>();
        
        workers.add(new Worker("Bambang", "kuli", 3_000_000));
        workers.add(new Worker("Ruslan", "accountant", 10_500_000));
        workers.add(new Worker("Ilham", "marketing", 15_000_000));
        
        Boss boss = new Boss("Udin", "PT. Mencari Cinta Sejati", workers);
        
        for(Worker w : boss.getWorkers()){
            System.out.println(w.toString());
        }
    }
    
}

/*
Jawaban:
Aggregation adalah suatu relationship yang hampir mirip seperti association, namun
perbedaannya terletak pada suatu class memiliki koleksi yang berisikan class lainnya

pada kasus ini, seorang boss memiliki banyak pekerja
*/