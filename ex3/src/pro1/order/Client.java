package pro1.order;

public class Client {
    public static void main(String args[]) {
        Leader d,dm,sgm,gm,meeting;
        d = new Director("王一");
        dm = new DepartmentManager("林二");
        sgm = new SubGeneralManager("刘三");
        gm = new GeneralManager("赵四");
        d.setSuccessor(dm);
        dm.setSuccessor(sgm);
        sgm.setSuccessor(gm);

        OrderRequest order1 = new OrderRequest("橄榄油",8000);
        OrderRequest order2 = new OrderRequest("大米",21000);
        OrderRequest order3 = new OrderRequest("麦片",56000);
        OrderRequest order4 = new OrderRequest("坚果",11000);
        OrderRequest order5 = new OrderRequest("面条",220000);
        d.handleRequest(order1);
        d.handleRequest(order2);
        d.handleRequest(order3);
        d.handleRequest(order4);
        d.handleRequest(order5);
    }
}
