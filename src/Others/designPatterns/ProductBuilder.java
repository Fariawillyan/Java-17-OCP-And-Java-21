package Others.designPatterns;

public class ProductBuilder {

    private String name;
    private String description;
    private double price;


    public ProductBuilder withName(String name){
        this.name = name;
        return this;
    }

    public ProductBuilder withDescription(String description){
        this.description = description;
        return this;
    }

    public ProductBuilder withPrice(double price){
        this.price = price;
        return this;
    }

    public Product builder(){
        return new Product(name, description, price);
    }

    public static void main(String[] args) {
        Product product = new ProductBuilder()
                .withName("ball")
                .withDescription("ofFootball")
                .withPrice(2000)
                .builder();


        System.out.println("Product name: " + product.getName());
        System.out.println("Product description: " + product.getDescription());
        System.out.println("Product price: " + product.getPrice());

    }


}
