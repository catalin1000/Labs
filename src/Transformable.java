// Interfața Transformable
interface Transformable {
    void transform();
}

// Excepție pentru obiectele care nu sunt transformabile
class NotTransformableException extends Exception {
    public NotTransformableException(String message) {
        super(message);
    }
}

// Clasa Bumblebee care implementează interfața Transformable
class Bumblebee implements Transformable {
    private String color;
    private boolean friendly;

    public Bumblebee(String color, boolean friendly) {
        this.color = color;
        this.friendly = friendly;
    }

    public void transform() {
        // Implementarea transformării pentru Bumblebee
        System.out.println("Bumblebee is transforming...");
    }
}

// Clasa Sofa care nu implementează interfața Transformable
class Sofa {
    private String colour;
    private int age;

    public Sofa(String colour, int age) {
        this.colour = colour;
        this.age = age;
    }
}

// Clasa care efectuează transformările și aruncă excepția în cazul unui obiect ne-transformabil
class Transformer {
    public static void transformObject(Object object) throws NotTransformableException {
        if (object instanceof Transformable) {
            ((Transformable) object).transform();
        } else {
            throw new NotTransformableException("Object cannot be transformed");
        }
    }
}

// Clasa de test pentru obiectele de tip Bumblebee
class TestTransformable {
    public static void main(String[] args) {
        Bumblebee bumblebee = new Bumblebee("Yellow", true);
        try {
            Transformer.transformObject(bumblebee);
        } catch (NotTransformableException e) {
            System.out.println(e.getMessage());
        }
    }
}

// Clasa de test pentru obiectele de tip Sofa
class TestNotTransformable {
    public static void main(String[] args) {
        Sofa sofa = new Sofa("Brown", 5);
        try {
            Transformer.transformObject(sofa);
        } catch (NotTransformableException e) {
            System.out.println(e.getMessage());
        }
    }
}
