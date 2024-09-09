package abstractclass.language;

public class Japanese extends Language{
    @Override
    public void greeting(String value) {
        System.out.println("Ohayo, " + value);
    }
}
