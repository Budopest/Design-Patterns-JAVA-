public interface SaleBehaviour {
    void sale();
}

class SaleOnline implements SaleBehaviour{

    @Override
    public void sale() {
        System.out.println("the book is availble online");
    }
}
class SaleOnCd implements SaleBehaviour{

    @Override
    public void sale() {
        System.out.println("the book is availble on cds");
    }
}
class SalePhysicalCopy implements SaleBehaviour{

    @Override
    public void sale() {
        System.out.println("the book is availble as physical copy");
    }
}
