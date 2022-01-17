public class Lesson5_Home {
    public static void main(String[] args) {
        Comp comp1 = new Comp("Intel", 1,512,3);
        comp1.setDisk(180);
        comp1.printComp();

        comp1.OnComp();
        comp1.OffComp();

//        for (int i = 1; i < 4; i++) {
//            comp1.OnComp();
//            comp1.OffComp();
//        }
//        для циклов


    }
}
