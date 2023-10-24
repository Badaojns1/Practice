
import java.util.Collections;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author thang
 */
public class MyCar implements ICar{

    @Override
    public int f1(List<Car> t) {
        int sum=0;
        for(int i=0;i<t.size();i++){
            sum+=t.get(i).getRate();
        }
        return sum/t.size();
    }

    @Override
    public void f2(List<Car> t) {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int index_min=-1;
        int index_max=-1;
        for(int i=0;i<t.size();i++){
            if(t.get(i).getRate()<min){
                min=t.get(i).getRate();
                index_min=i;
            }
            else if(t.get(i).getRate()>max){
                max=t.get(i).getRate();
                index_max=i;
            }
        }
       Car temp = t.get(index_max);
       t.set(index_max, t.get(index_min));
       t.set(index_min, temp);
       
    }

    @Override
    public void f3(List<Car> t) {
        Collections.sort(t, (Car o1,Car o2)->{
            if(o1.getMaker().equals(o2.getMaker())){
                return -Integer.compare(o1.getRate(), o2.getRate());
            }
            else return o1.getMaker().compareTo(o2.getMaker());
        });
    }
    
}
