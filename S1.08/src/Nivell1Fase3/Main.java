package Nivell1Fase3;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	FunctionalInterface reverseString=(str)->{
		String result="";
		for(int i=str.length()-1;i>=0;i--) 
			result+=str.charAt(i);
		return result;
		};
	System.out.println(reverseString.reverse("Hola que tal"));
	}

	}

