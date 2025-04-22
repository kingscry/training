package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNoValidation {

public static void main(String[] args) {
String regex = "[789]\\d{9}";
//String regex = "^[789]\\d{9}"; this was constraint , it takes only first 10 digits including the first digit that should start from 7,8 or 9.
String text = "7538203920,7896543256";

Pattern pattern = Pattern.compile(regex);
Matcher matcher = pattern.matcher(text);

while(matcher.find()) {
System.out.println(matcher.group()+" "+matcher.start());

}

//if(matcher.find()) {
//System.out.println(matcher.group()+" "+matcher.start());
//
//}
//else {
//System.out.println("match not found");
//}
}
}
