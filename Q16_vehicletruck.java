
class vehicle
{
    protected String make,model;
    protected int year,mileage;
    
    vehicle(String a,String b,int c,int d)
    {
        make=a;
        model=b;
        year=c;
        mileage=d;
    }
    int calc()
    {
        
        return (mileage*year);
    }
}

class car extends vehicle
{
    int price,fuelEco,mainCost;
    car(String a,String b,int c,int d,int e,int f,int g)
    {
        super(a,b,c,d);
        price=e;
        fuelEco=f;
        mainCost=g;
    }
    int total_cost()
    {
        
        return (price+fuelEco+mainCost);
    }
}


class truck extends vehicle
{
    int size,num;
    truck(String a,String b,int c,int d,int s,int n)
    {
        super(a,b,c,d);
        size=s;
        num=n;
    }
    int mweight()
    {
        
        return (size*num);
    }
    
}
class Q16_vehicletruck {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        
        car c=new car("Steel","S21",2021,23,23000,56,258);
        
        System.out.println("Total cost of ownership="+ c.total_cost());
        
        System.out.println("Distance="+c.calc());
        
        truck t=new truck("Metal","321G",2023,89,6,6);
        
        System.out.println("Max weight="+t.mweight());
    }
}
