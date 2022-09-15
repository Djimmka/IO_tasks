import java.io.*;
import java.util.Objects;

public class Animalization {

    class Animal implements Serializable {
        private final String name;

        public Animal(String name) {
            this.name = name;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof Animal) {
                return Objects.equals(name, ((Animal) obj).name);
            }
            return false;
        }
    }

public static Animal[] deserializeAnimalArray(byte[] data) {
    int length = 0;
    ByteArrayInputStream readering = new ByteArrayInputStream(data);
    ObjectInput in = null;
    try {
        in = new ObjectInputStream(readering);
        length = in.readInt();
        Animal[] result = new Animal[length];
        for (int i = 0; i < length; i++) {
            Object readed = in.readObject();
            if (readed instanceof Animal) {
                result[i] = (Animal) readed;
            } else {
                throw new IllegalArgumentException();
            }
        }
        return result;
    } catch (IOException e) {
        throw new IllegalArgumentException(e);
    } catch (ClassNotFoundException e) {
        throw new IllegalArgumentException(e);
    } catch (RuntimeException e) {
        throw new IllegalArgumentException(e);
    }
}

    public static void main(String[] args) {

    }
}
