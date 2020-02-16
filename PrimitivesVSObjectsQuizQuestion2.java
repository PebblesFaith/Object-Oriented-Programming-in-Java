public class PrimitivesVSObjectsQuizQuestion2 {
    public static void main(String[] args) {
        String s = "Hello!";
        boolean result = s.startsWith("");
        if (s == null) {
            throw new NullPointerException();
        }
        System.out.println(result);

    }
}
