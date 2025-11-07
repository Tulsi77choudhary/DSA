package Optional_Class;
import java.util.Optional;

class Optional_Exam {

    public static void main(String[] args) {
        Optional<String>optional = Optional.of("Tulsi");

        Optional<String> opt = Optional.ofNullable(null);
        Optional<String> empty = Optional.empty();


        System.out.println(optional.get());
        System.out.println(opt.orElse("Unknown"));
        System.out.println(empty.orElse("No Value"));
    }
}