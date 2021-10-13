import java.util.*;

public class AnushkaProblem
{
public static void main(String[] args)
{
String str = "sggvvvgss";
int count;
char ch;
HashMap<Character,Integer> hashMap = new HashMap<Character, Integer>();
for(int i=0; i< str.length(); i++)
{
ch = str.charAt(i);
if(hashMap.containsKey(ch))
{
count = hashMap.get(ch);
count++;
hashMap.replace(ch, count);
} 
else {
hashMap.put(ch,1);
}
}
for(Character key : hashMap.keySet())
{
System.out.print(key + "" + hashMap.get(key));
}
}
}








