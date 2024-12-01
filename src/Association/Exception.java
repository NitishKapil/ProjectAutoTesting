package Association;

class Exceptions {
    public static void main(String[] args) {
        String name = "PARmod";
        try {
            String a1 = args[1];
            System.out.println(a1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
