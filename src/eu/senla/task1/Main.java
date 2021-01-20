package eu.senla.task1;

public class Main {

    static byte b;
    static short s;
    static int i;
    static long l;
    static float f;
    static double d;
    static boolean one;
    static char letterA;

    static String words;
    static Byte aByte;
    static Short aShort;
    static Integer aInt;
    static Long aLong;
    static Float aFloat;
    static Double aDouble;
    static Boolean aBoolean;
    static Character character;


    public static void main (String[] args){
        Number allNumbers = new Number();

        byte b1 = 108;
        short s1 = -97;
        int p = 119;
        char x = (char) p; // 119 > w
        String word1 = "73";
        allNumbers.setS(Short.valueOf(word1)); // приведение String
        allNumbers.setCharacter((char)(Math.abs(s1))); // приведение по модулю числа переменной short
        allNumbers.setB((byte)p); // присвоение переменной типа int
        char letterB = (char) b1; // присвоение значения переменной типа byte
        char v = (char)allNumbers.getS(); // 73 > I присведение переменной short s c преобразованием в char
        allNumbers.setaLong((long)(Math.sqrt((byte)allNumbers.getS() * allNumbers.getB()))); // приведение квадратного корня из результата умножения двух переменных типа byte (с преобразованием одной переменной типа short)
        allNumbers.setaDouble(19.0);// присвоение значения
        allNumbers.setD(Double.valueOf(word1) / allNumbers.getB()); // приведение переменной типа String в Double и делим на тип byte
        allNumbers.setaBoolean(Boolean.parseBoolean(Double.toString(allNumbers.getaDouble()))); //  автоматическое преобразование в логическое значение false
        allNumbers.setOne(allNumbers.getaDouble().equals(allNumbers.getD())); // сравнение переменных примитив и обертка
        allNumbers.setLetterA((char) 120); //присвоение значения
        allNumbers.setaInt(Character.getNumericValue(allNumbers.getLetterA())); // приведение переменной char в тип Integer
        allNumbers.setI(Integer.valueOf("74")); // приведение текствого значения в тип int
        allNumbers.setL(allNumbers.getaInt().longValue() + allNumbers.getI()); // преобразвание тип Integer в long
        allNumbers.setF((float)allNumbers.getL()); // преобразование тип long в float
        char y = (char) Short.parseShort(String.valueOf(allNumbers.getaInt())); // Сначала преобразование переменнной Integer в String, затем в Short, а потом в char
        allNumbers.setaShort((short) 1000); //присвоение значения
        allNumbers.setaFloat((float) 1000); //присвоение значения

        byte h = 0;
        String str2 = "100";

        try {
            h = Byte.parseByte(str2); // преобразование переменной типа String в byte
        } catch (NumberFormatException e) {
            System.err.println("Неверный формат строки!");
        }

        allNumbers.setaByte(h); // присвоение значения
        allNumbers.setWords(Character.toString(v) + " " +
                            Character.toString(x) +
                            allNumbers.getCharacter() +
                            Character.toString(letterB) +
                            Character.toString((char) allNumbers.getL()) + y);
        System.out.println("Transformation String word1 to short s = " + allNumbers.getS());
        System.out.println("Transformation short = " + s1 +" to Character = " + allNumbers.getCharacter());
        System.out.println("byte b is value " + allNumbers.getB());
        System.out.println("Transformation byte b1 = " + b1 + " to char: " + letterB);
        System.out.println("Char is " + allNumbers.getLetterA() + ".");
        System.out.println("Transformation byte to long: " + allNumbers.getaLong());
        System.out.println("aBoolean value is " + allNumbers.getaBoolean());
        System.out.println("Transformation char to Integer: " + allNumbers.getaInt());
        System.out.println("Transformation Integer to long: " + allNumbers.getL());
        System.out.println("Transformation String to int: " + allNumbers.getI());
        System.out.println("aDouble value = " + allNumbers.getaDouble());
        System.out.println("Transformation String word1 to double: " + allNumbers.getD());
        System.out.println("Result is: " + allNumbers.isOne());
        System.out.println("Transformation long to float: " + allNumbers.getF());
        System.out.println(new StringBuilder().append("Final result is ").append(allNumbers.getaBoolean().equals(Float.valueOf((allNumbers.getaShort())).equals(allNumbers.getaFloat()))).toString()); // приведение переменной типа Short в Float и их сравнение, полученный результат сравниваем с результатом переменной aDouble
        System.out.println("aByte value is " + allNumbers.getaByte());
        System.out.println("\n" + "Nina B.:" + "\n" + "\"" + allNumbers.getWords() + "\"" );
    }



}
