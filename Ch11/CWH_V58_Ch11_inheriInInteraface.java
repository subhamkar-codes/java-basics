interface sample{
    void meth1();
    void meth2();
}
    interface ChildSampleInterface extends sample{
        void meth3();
        void meth4();
    }
    class MySampleClass implements ChildSampleInterface{
        @Override
        public void meth3() {
            System.out.println("U are good");
        }

        @Override
        public void meth4() {
            System.out.println("No U are not");
        }

        @Override
        public void meth1() {
            System.out.println("meth1");
        }

        @Override
        public void meth2() {
            System.out.println("meth2");
        }
    }

public class CWH_V58_Ch11_inheriInInteraface {
    static void main(String[] args) {
        MySampleClass msc = new MySampleClass();
        msc.meth1();
        msc.meth2();
        msc.meth3();
        msc.meth4();

    }
}
