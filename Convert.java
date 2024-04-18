import java.util.HashMap;
import java.util.TreeMap;

public class Convert {
    TreeMap<String,Integer> room = new TreeMap<>();
    TreeMap<Integer,String> rooman = new TreeMap<>();
    public Convert(){
        room.put("I",1);
        room.put("II",2);
        room.put("III",3);
        room.put("IV",4);
        room.put("V",5);
        room.put("VI",6);
        room.put("VII",7);
        room.put("VIII",8);
        room.put("IX",9);
        room.put("X",10);

        rooman.put(10,"X");
        rooman.put(9,"IX");
        rooman.put(8,"VIII");
        rooman.put(7,"VII");
        rooman.put(6,"VI");
        rooman.put(5,"V");
        rooman.put(4,"IV");
        rooman.put(3,"III");
        rooman.put(2,"II");
        rooman.put(1,"I");
    }
   public boolean Roman (String nam){
        return room.containsKey(nam);
   }
   public int romanToInt(String s){
      return  room.get(s);
   }public String intToRoman(int num){
       String rezylt = "";
       int arabiankey;
       do {
           arabiankey = rooman.floorKey(num);
           rezylt += rooman.get(arabiankey);
           num -= arabiankey;
       }  while(num!=0);
           return rezylt;
       }
    }

