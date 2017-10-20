package Inner.Classes.Nested;

public class Human {
    Relations relations;

    String name;

    int age;

    static public class Relations{
        private final String name;

        public String getName() {
            return name;
        }

        public Relations(String name) {

            this.name = name;
        }
    }
}

class HumanUsage{
    public static void main(String[] args) {
        final Human max = new Human();
        max.relations = new Human.Relations("single");
    }
}
