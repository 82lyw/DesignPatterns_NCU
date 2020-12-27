package pro4.un;

public abstract class Country {
    protected UN wto,who,wfc;
    protected String name;
    public Country(String name) {
        this.name = name;
    }

    public UN getWto() {
        return wto;
    }

    public void setWto(UN wto) {
        this.wto = wto;
    }

    public UN getWho() {
        return who;
    }

    public UN getWfc() {
        return wfc;
    }

    public void setWfc(UN wfc) {
        this.wfc = wfc;
    }

    public void setWho(UN who) {
        this.who = who;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void SendMessageByWTO(String cou, String msg) {
        wto.sendMessage(this.name,cou,msg);
    }

    public void SendMessageByWHO(String cou, String msg) {
        who.sendMessage(this.name,cou,msg);
    }

    public void SendMessageByWFC(String cou, String msg) {
        wfc.sendMessage(this.name, cou, msg);
    }

    public void ReceiveMessage(String cou, String msg) {
        System.out.println(name + " receives " + cou + "'s message: "+msg+".");
    }

    @Override
    public boolean equals(Object co) {
        Country c = (Country) co;
        if (co == null || this.name == null || c.getName() == null) {
            return false;
        }
        return name.equals(c.getName());
    }
}
