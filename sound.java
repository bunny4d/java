abstract class animal {
    public abstract void sound();
    }

    class tiger extends animal{
        @Override
        public void sound(){
            System.out.println("Tiger sounds : hehe ");
    }
}
    class lion extends animal{
        @Override
        public void sound(){
            System.out.println("Lion sounds : haha ");
            }
            }
public class sound {
            public static void main(String[] args) {
                animal t = new tiger();
                animal l = new lion();
                t.sound();
                l.sound();
                }
                }

