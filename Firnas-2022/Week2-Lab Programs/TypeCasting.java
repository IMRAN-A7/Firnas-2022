
public class TypeCasting {
	public static void main(String[] args) {
		byte b=10;
		int i = b;
		//byte a = i; shows error, it won't accept higher value.
		byte c = (byte)i;//it accept's compatible value while in casting.
		byte d = 10;
		byte e = 20;
		//byte sum = d*e;shows error because of using arithmetic opertors in byte which makes larger storage for byte
		
	}
}
