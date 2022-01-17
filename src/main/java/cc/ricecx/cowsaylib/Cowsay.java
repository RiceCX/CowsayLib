package cc.ricecx.cowsaylib;

public class Cowsay {

    /**
     * Cowsay :)
     * @return String
     */
    @org.jetbrains.annotations.NotNull
    @org.jetbrains.annotations.Contract(pure = true)
    public static String cow() {
        return """
                 ________________________________________
                / You have Egyptian flu: you're going to \\
                \\ be a mummy.                            /
                 ----------------------------------------
                        \\   ^__^
                         \\  (oo)\\_______
                            (__)\\       )\\/\\
                                ||----w |
                                ||     ||
                                
                """;
    }
}
