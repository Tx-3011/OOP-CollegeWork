import java.util.*;
class program{

    public static void main(String [] args){

	Scanner in = new Scanner(System.in);

	System.out.println("Enter Name of the person : ");
	String name = in.nextLine();

	String newString = formatEmployeeName(name);

	System.out.println(newString);

    generateEmail(name);

    }


	public static String formatEmployeeName(String name){

		char[] nameArr = name.toCharArray();

		nameArr[0] = Character.toUpperCase(nameArr[0]);


		for(int i =1; i<nameArr.length; i++){
		

			if(nameArr[i-1] == ' '){
				nameArr[i] = Character.toUpperCase(nameArr[i]);
			}else{nameArr[i] = Character.toLowerCase(nameArr[i]);}

		
	

	}


		return new String(nameArr);

}

    public static void generateEmail(String name){
        char [] nameArr = name.toCharArray();
        ArrayList<Character> charList = new ArrayList<>();
        
        charList.add(Character.toLowerCase(nameArr[0]));
        for(int i = 0; i<nameArr.length; i++ ){
            if(nameArr[i] == ' '){
                for(int j = i+1; j<nameArr.length; j++){
                    charList.add(Character.toLowerCase(nameArr[j]));
                }
            }
        }

        StringBuilder build = new StringBuilder();
        for(Character ch: charList){
            build.append(ch);
        }

        String email = build.toString();

        System.out.print(email + "@example.com");
    }

}