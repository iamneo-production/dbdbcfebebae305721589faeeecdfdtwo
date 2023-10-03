
package home.coder.project.workspace.springapp.model;
public class Laptop{
    private int laptopId,laptopPrice;
    private String laptopBrand;
    Laptop(){
        
    }
    Laptop(int laptopId,int laptopPrice,String laptopBrand){
        this.laptopId=laptopId;
        this.laptopPrice=laptopPrice;
        this.laptopBrand=laptopBrand;
    }
    int getLaptopId(){
        return laptopId;
    }
    int getLaptopPrice(){
        return laptopPrice;
    }
    String getLaptopBrand(){
        return laptopBrand;
    }

    void setLaptopId(int laptopId){
        this.laptopId=laptopId;
    }

    void setLaptopPrice(int laptopPrice){
        this.laptopPrice=laptopPrice;
    }

    void setLaptopBrand(String laptopBrand){
        this.laptopBrand=laptopBrand;
    }
}

