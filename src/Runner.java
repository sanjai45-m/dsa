


public class Runner {
    public static void main(String[] args) {
        LinkedsList list = new LinkedsList();  
        list.insert(20);
        list.insert(12);
        list.insert(22);
        list.insertAtStart(44);
        list.insertAt(2, 55);
        list.deleteAt(1);
        list.show();
    }
}
 