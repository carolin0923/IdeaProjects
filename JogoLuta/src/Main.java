public class Main {
    public static void main(String[] args) {
        Lutador l[]= new Lutador[6];
        l[0]= new Lutador("Pretty Boy", "França", 31, 1.75f, 68.9f, 11,2, 1);
        l[1]= new Lutador("Putscript", "Brasil", 29, 1.68f, 57.6f, 14, 2, 3);
        l[0].apresentar();
        l[0].status();

    }
}