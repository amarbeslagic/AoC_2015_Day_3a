import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        File file = new File("inputs//input_AoC_3a.txt");

        BufferedReader br = new BufferedReader(new FileReader(file));

        String s = br.readLine();

        int horisontalPosition = 0;
        int verticalPosition = 0;

        List<String> listOfPositions = new ArrayList<>();
        Set<String> setOfPositions = new HashSet<>();

        listOfPositions.add( horisontalPosition + " " + verticalPosition);
        setOfPositions.add( horisontalPosition + " " + verticalPosition);

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);

            if(ch == '<'){
                horisontalPosition -= 1;
                listOfPositions.add( horisontalPosition + " " + verticalPosition);
                setOfPositions.add( horisontalPosition + " " + verticalPosition);
            }
            else if(ch == '>'){
                horisontalPosition += 1;
                listOfPositions.add( horisontalPosition + " " + verticalPosition);
                setOfPositions.add( horisontalPosition + " " + verticalPosition);
            }
            else if (ch == 'v'){
                verticalPosition -= 1;
                listOfPositions.add( horisontalPosition + " " + verticalPosition);
                setOfPositions.add( horisontalPosition + " " + verticalPosition);
            }
            else if(ch == '^'){
                verticalPosition += 1;
                listOfPositions.add( horisontalPosition + " " + verticalPosition);
                setOfPositions.add( horisontalPosition + " " + verticalPosition);
            }
        }

//        for(String g : listOfPositions){
//            System.out.println(g);
//        }

        System.out.println("Number of visiting: " + listOfPositions.size());

        System.out.println("Number of visited houses: " + setOfPositions.size());

//        for(String g : setOfPositions){
//            System.out.println(g);
//        }
    }
}