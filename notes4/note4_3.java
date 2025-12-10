
public class note4_3{
	public static void main(String[] args){
		char a[] = {'a','b','c','D','E','F'};
		for(int i=0;i<a.length;i++){
			if(Character.isLowerCase(a[i]))
				a[i] = Character.toUpperCase(a[i]);
			else if(Character.isUpperCase(a[i]))
				a[i] = Character.toLowerCase(a[i]);
		}
		for(int i=0;i<a.length;i++){
			System.out.printf("%6c",a[i]);
		}
		System.out.print("\n");

		Integer m[] = new Integer[10];
		for(int i=0;i<10;i++){
			m[i] = new Integer(101+i);
		}
		for(int i=0;i<10;i++){
			System.out.println(m[i].intValue());
		}


	}



}