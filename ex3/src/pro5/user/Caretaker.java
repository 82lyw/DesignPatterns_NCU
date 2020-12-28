package pro5.user;

public class Caretaker {
    private Memento memento;

    public Caretaker() {
        memento = new Memento();
    }

    public void addMemento(UserInfoDTO user) {
        this.memento.save(user);
    }

    public UserInfoDTO undo() {
        return memento.undo();
    }

    public Memento getMemento()
    {
        return memento;
    }

    public void setMemento(Memento memento)
    {
        this.memento=memento;
    }
}
