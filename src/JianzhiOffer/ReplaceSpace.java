package JianzhiOffer;
//请实现一个函数，将一个字符串中的每个空格替换成“%20”。例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
public class ReplaceSpace {
	public String replaceSpace(StringBuffer str) {
        String s = str.toString();
        StringBuffer sb = new StringBuffer();
        char[] c = s.toCharArray();
        for(int i=0;i<c.length;i++){
            if(c[i]==' '){
                sb.append("%20");
            }else{
                sb.append(c[i]);
            }
        }
        return sb.toString();
    }
	
}
