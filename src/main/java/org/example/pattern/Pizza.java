package org.example.pattern;

public class Pizza {

    private String dough;
    private String sauce;
    private String topping;


    public Pizza() {
    }


    private Pizza(PizzaBuilder builder) {
        this.dough = builder.dough;
        this.sauce = builder.sauce;
        this.topping = builder.topping;
    }


    public class PizzaBuilder {
        private String dough;
        private String sauce;
        private String topping;

        public PizzaBuilder() {
        }

        public PizzaBuilder dough(String dough) {
            this.dough = dough;
            return this;
        }

        public PizzaBuilder sauce(String sauce) {
            this.sauce = sauce;
            return this;
        }

        public PizzaBuilder topping(String topping) {
            this.topping = topping;
            return this;
        }

        public Pizza build() {
            return new Pizza(this);
        }
    }

    public static PizzaBuilder builder() {
        return new Pizza().new PizzaBuilder();
    }


}
