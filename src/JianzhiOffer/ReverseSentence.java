package JianzhiOffer;
//ţ���������һ����Ա��Fish��ÿ���糿���ǻ�����һ��Ӣ����־��дЩ�����ڱ����ϡ�ͬ��Cat��Fishд�������ĸ���Ȥ����һ������Fish������������ȴ������������˼�����磬��student. a am I������������ʶ������һ�ԭ���Ѿ��ӵ��ʵ�˳��ת�ˣ���ȷ�ľ���Ӧ���ǡ�I am a student.����Cat��һһ�ķ�ת��Щ����˳��ɲ����У����ܰ�����ô��
public class ReverseSentence {

	public String ReverseSentence(String str) {
		String t = str.trim();
		StringBuffer sb = new StringBuffer();
        String s = new StringBuffer(sb).reverse().toString();
        String[] arr = s.split(" ");
        for(int i=0;i<arr.length-1;i++){
        	arr[i] = new StringBuffer(arr[i]).reverse().toString();
        	sb.append(arr[i]);
        	sb.append(" ");
        }
        return sb.toString();
	}
}
