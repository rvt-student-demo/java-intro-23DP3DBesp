package lv.rvt;

public class Statistic {
    private int count;
    private int sum;

    public Statistic() {

    }

    public void addNumber(int number){
        this.count += 1;
        this.sum += number;
    }

    public int getCount(){
        return this.count;
    }
    
    public int sum(){
        return this.sum;

    }

    public double average(){
        return sum/count;
    }
}

