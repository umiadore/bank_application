import java.util.Objects;

public class Person {
    private long id;
    private String name;
    private AgeCategory category;

    public Person(long id, String name, int age) {
        this.id = id;
        this.name = name;
        this.category = AgeCategory.getCategoryByAge(age);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AgeCategory getCategory() {
        return category;
    }

    public void setCategory(AgeCategory category) {
        this.category = category;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person person)) return false;
        return id == person.id && Objects.equals(name, person.name) && category == person.category;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, category);
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", category=" + category +
                '}';
    }
}
