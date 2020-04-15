class Exp3{
    public static void main(String... args){
        int a=25;
        System.out.println("In Byte Format");
        System.out.println("Size of Byte = "+ (Byte.SIZE/8)+" byte");
        System.out.println("Size of Short = "+ (Short.SIZE/8)+" bytes");
        System.out.println("Size of Int = "+ (Integer.SIZE/8)+" bytes");
        System.out.println("Size of Long = "+ (Long.SIZE/8)+" bytes");
        System.out.println("Size of Double = "+ (Double.SIZE/8)+" bytes");
        System.out.println("Size of Float = "+ (Float.SIZE/8)+" bytes");
        System.out.println("Size of Char = "+ (Character.SIZE/8)+" bytes");


        System.out.println("In Bit Format");
        System.out.println("Size of Byte = "+ (Byte.SIZE)+" bits");
        System.out.println("Size of Short = "+ (Short.SIZE)+" bits");
        System.out.println("Size of Int = "+ (Integer.SIZE)+" bits");
        System.out.println("Size of Long = "+ (Long.SIZE)+" bits");
        System.out.println("Size of Double = "+ (Double.SIZE)+" bits");
        System.out.println("Size of Float = "+ (Float.SIZE)+" bits");
        System.out.println("Size of Char = "+ (Character.SIZE)+" bits");


        System.out.println(15);
        System.out.println("The value of a is = " +a);

    }
}