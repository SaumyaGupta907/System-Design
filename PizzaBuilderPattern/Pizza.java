package PizzaBuilderPattern;

// Product class
public class Pizza {
  private String size;
  private String crust;
  private boolean extraCheese;
  private boolean chicken;
  private boolean vegetables;

  // Private constructor to enforce use of Builder
  private Pizza(PizzaBuilder builder) {
    this.size = builder.size;
    this.crust = builder.crust;
    this.extraCheese = builder.extraCheese;
    this.chicken = builder.chicken;
    this.vegetables = builder.vegetables;
  }

  @Override
  public String toString() {
    return "Pizza [size=" + size + ", crust=" + crust +
            ", extraCheese=" + extraCheese +
            ", chicken=" + chicken +
            ", vegetables=" + vegetables + "]";
  }

  // Builder Class
  public static class PizzaBuilder {
    private String size;   // mandatory
    private String crust;  // optional
    private boolean extraCheese;
    private boolean chicken;
    private boolean vegetables;

    // Constructor for mandatory field
    public PizzaBuilder(String size) {
      this.size = size;
    }

    // Optional setters returning 'this'
    public PizzaBuilder crust(String crust) {
      this.crust = crust;
      return this;
    }

    public PizzaBuilder extraCheese(boolean extraCheese) {
      this.extraCheese = extraCheese;
      return this;
    }

    public PizzaBuilder chicken(boolean chicken) {
      this.chicken = chicken;
      return this;
    }

    public PizzaBuilder vegetables(boolean vegetables) {
      this.vegetables = vegetables;
      return this;
    }

    // Build method
    public Pizza build() {
      return new Pizza(this);
    }
  }
}

