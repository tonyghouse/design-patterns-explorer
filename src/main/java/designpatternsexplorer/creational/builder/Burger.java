package designpatternsexplorer.creational.builder;

public class Burger {
    private String size;
    private boolean nonVeg;

    private Burger(BurgerBuilder burgerBuilder){

        this.nonVeg=burgerBuilder.nonVeg;
        this.size=burgerBuilder.size;
    }

    @Override
    public String toString() {
        return "Burger{" +
                "size='" + size + '\'' +
                ", nonVeg=" + nonVeg +
                '}';
    }

    public static class BurgerBuilder {
        private String size;  // Change the name to match the attribute (e.g., "burgerSize")
        private boolean nonVeg;

        public BurgerBuilder size(String size) {
            this.size = size;
            return this;
        }

        public BurgerBuilder nonVeg(boolean nonVeg) {  // Rename this method
            this.nonVeg = nonVeg;
            return this;
        }

        public Burger build() {
            return new Burger(this);
        }
    }

}
