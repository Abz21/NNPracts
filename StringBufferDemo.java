public class StringBufferDemo {
    public static void main(String[] args) {
        String name = "TCS";
        StringBuffer str = new StringBuffer(name);
        str.append(" to JAVA");
        System.out.println(str);
        System.out.println(str.insert(2,"Hi"));
        System.out.println(str.delete(2,4));
        System.out.println(str.substring(2,8));
        System.out.println(str.toString());

    }/*oops concepts=>
constructor, object creation, static, final keywords, inheritance, polymorphism, abstraction, encapsulation, interface, all loops, arrays, super keyword,
string class, object class, wrapper classes
string buffer and string builder
Comparator, Comparable, collection classes
Cloning,

today night or tommorw concentrate on array related programs/ String related programs
public class StringMask {

	public static void main(String[] args) {

		String creditCardNumber="4554123485649874";
		String preceedenceValue="XXXXXXXXXXXX";

		if(creditCardNumber.length()==16){
			String last4DigitsOfCreditCard= creditCardNumber.substring(12);

			System.out.println(preceedenceValue.concat(last4DigitsOfCreditCard));

		}else{
			System.out.println("Input credicard number is not correct");
		}
	}

}*/
}
