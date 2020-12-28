package pro9.book2;

public class Member {
    private String name;

    public Member(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void updateName() {
        System.out.println("Note " + getName() + ": book's name changes!");
    }

    public void updatePrice() {
        System.out.println("Note " + getName() + ": book's name changes!");
    }
}
