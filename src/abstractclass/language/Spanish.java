package abstractclass.language;

public class Spanish extends Language{
    @Override
    public void greeting(String value) {
        System.out.println("Ola, " + value);
    }
}
