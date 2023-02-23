class worker {
    private String name;

    public worker(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void workUp () {
        System.out.println(getName() + " Eating");
    }
}
class  manager extends worker {
    public manager(String name) {
        super(name);
    }
    @Override
    public void workUp() {
        super.workUp();
    }
}
class  ıt extends worker {
    public ıt(String name) {
        super(name);
    }
    @Override
    public void workUp() {
        super.workUp();
    }
}
class  ceo extends worker {
    public ceo(String name) {
        super(name);
    }
    @Override
    public void workUp() {
        super.workUp();
    }
}


public class Main {
    public static void main(String[] args) {
        worker worker = new worker("Worker");
        manager manager = new manager("theManagerİs");
        ceo ceo = new ceo("CEO");
        ıt ıt = new ıt("IT personal ");

        worker.workUp();
        manager.workUp();
        ceo.workUp();
        ıt.workUp();

    }
}