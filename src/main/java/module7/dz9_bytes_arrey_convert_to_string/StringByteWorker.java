package module7.dz9_bytes_arrey_convert_to_string;

public class StringByteWorker {
    public static void main(String[] args) {
        byte[] startBytes = {74, 97, 86, 97};

        //java
        System.out.println(new StringByteWorker().process(startBytes));
    }

    // приймає на вхід масив байт,
    // робить з цього масиву рядок, наводить його в нижній регістр
    public String process(byte[] bytes){

        return (new String(bytes).toLowerCase());
    }
}
