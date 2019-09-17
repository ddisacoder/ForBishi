package DD;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Test {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (s.hasNext()) {
            String str = s.nextLine();
            if(!Pattern.matches("[0-9a-fA-F:.]+",str)){
                System.out.println("Neither");
            }else if(Pattern.matches("[0-9]+[.][0-9]+[.][0-9]+[.][0-9]+",str)){
                isIPv4(str);
            }
            //==========以下为IPv6的判断=================
            else if(Pattern.matches("([0-9a-fA-F]{1,4}[:]){7}[0-9a-fA-F]{1,4}",str)){
                System.out.println("IPv6");
            }else if(str == "::"){
                System.out.println("IPv6");
            }else if(Pattern.matches("^(([0-9a-f]{1,4}:){1,6})((:[0-9a-f]{1,4}){1,6})",str)){
                str = str.replaceAll(":"," ");
                String[] strings = str.split("\\s+");
                if(str.length() <=7){
                    System.out.println("IPv6");
                }else
                    System.out.println("Neither");
            }else if(Pattern.matches("([0-9a-fA-F]{1,4}:){1,7}:",str)){
                System.out.println("IPv6");
            }
            else if(Pattern.matches(":(:[0-9a-fA-F]{1,4}){1,7}",str)) {
                System.out.println("IPv6");
            }else if(Pattern.matches("([0-9a-fA-F]{1,4}:){6}(([0-9]+.){3}[0-9]+)",str)){
                str = str.substring(str.lastIndexOf(":")+1,str.length());
                iPv6IncludeIPv4(str);
            }else if(Pattern.matches("([0-9a-fA-F]{1,4}:){1,5}:(([0-9]+.){3}[0-9]+)",str)){
                str = str.substring(str.lastIndexOf(":")+1,str.length());
                iPv6IncludeIPv4(str);
            }else if(Pattern.matches("::([0-9a-fA-F]{1,4}:){0,5}(([0-9]+.){3}[0-9]+)",str)){
                str = str.substring(str.lastIndexOf(":")+1,str.length());
                iPv6IncludeIPv4(str);
            }else if(Pattern.matches("([0-9a-fA-F]{1,4}:){1,4}(:[0-9a-fA-F]{1,4}){1,4}:(([0-9]+.){3}[0-9]+)",str)){
                String m = str.substring(0,str.lastIndexOf(":"));
                String[] mm = m.replaceAll(":"," ").split("\\s+");
                if(mm.length <= 5){
                    str = str.substring(str.lastIndexOf(":")+1,str.length());
                    iPv6IncludeIPv4(str);
                }else {
                    System.out.println("Neither");
                }
            }else {
                System.out.println("Neither");
            }
        }
    }

    public static void isIPv4(String str){
        String[] sp = str.split("\\.");
        if(Integer.parseInt(sp[0])>0 && Integer.parseInt(sp[0])<256 && sp[0].equals(String.valueOf(Integer.parseInt(sp[0]))) &&
                Integer.parseInt(sp[1])>=0 && Integer.parseInt(sp[1])<256 && sp[1].equals(String.valueOf(Integer.parseInt(sp[1]))) &&
                Integer.parseInt(sp[2])>=0 && Integer.parseInt(sp[2])<256 && sp[2].equals(String.valueOf(Integer.parseInt(sp[2]))) &&
                Integer.parseInt(sp[3])>=0 && Integer.parseInt(sp[3])<256 && sp[3].equals(String.valueOf(Integer.parseInt(sp[3]))))
            System.out.println("IPv4");
        else
            System.out.println("Neither");
    }
    public static void iPv6IncludeIPv4(String str) {
        String[] sp = str.split("\\.");
        if(Integer.parseInt(sp[0])>=0 && Integer.parseInt(sp[0])<256 && sp[0].equals(String.valueOf(Integer.parseInt(sp[0]))) &&
                Integer.parseInt(sp[1])>=0 && Integer.parseInt(sp[1])<256 && sp[1].equals(String.valueOf(Integer.parseInt(sp[1]))) &&
                Integer.parseInt(sp[2])>=0 && Integer.parseInt(sp[2])<256 && sp[2].equals(String.valueOf(Integer.parseInt(sp[2]))) &&
                Integer.parseInt(sp[3])>=0 && Integer.parseInt(sp[3])<256 && sp[3].equals(String.valueOf(Integer.parseInt(sp[3]))))
            System.out.println("IPv6");
        else
            System.out.println("Neither");
    }
}
