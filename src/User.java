public class User {
    @ValidateField(nullable = false)
    private String name;
    private String surName;
    @ValidateField(nullable = false)
    private Integer age;
    @ValidateField()
    private Double height;
    private Double weight;

    public User(String name, String surName, Integer age, Double height, Double weight) {
        this.name = name;
        this.surName = surName;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }
}
