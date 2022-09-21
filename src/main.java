public class main {
    public static void main(String[] args) {
        dynamic_arrays dynamic_array = new dynamic_arrays();
        System.out.println(dynamic_array.capacity);


        // I don't need to call toString();
        System.out.println(dynamic_array);
        System.out.println("empty: " + dynamic_array.isEmpty());

        dynamic_array.add("A");
        dynamic_array.add("B");
        dynamic_array.add("C");
        dynamic_array.add("D");
        dynamic_array.add("E");
        dynamic_array.add("F");
        dynamic_array.add("G");
        dynamic_array.add("H");
        dynamic_array.add("I");
        dynamic_array.add("J");
        dynamic_array.add("K");
        dynamic_array.add("L");

        dynamic_array.insert(0, "X");

        dynamic_array.delete("A");

        System.out.println("C is at index: " + dynamic_array.search("C"));




        System.out.println(dynamic_array);
        System.out.println("capacity :" + dynamic_array.capacity);
        System.out.println("size: " + dynamic_array.size);
        System.out.println("empty: " + dynamic_array.isEmpty());
    }
}
