package Huawei;

class Solution {
	int index = 0;

	String decode(char[] arr, int len) {
		StringBuffer sb = new StringBuffer();
		int n = 0;
		while (index < len) {
			if (arr[index] >= '0' && arr[index] <= '9') {
				n = n * 10 + Integer.parseInt(String.valueOf(arr[index]));
				index++;
			} else if (arr[index] == '[') {
				index++;
				if (n > 0) {
					String str = decode(arr, len);
					for (int i = 0; i < n; i++) {
						sb.append(str);
					}
					n = 0;
				}
			} else if (arr[index] == ']') {
				index++;
				return sb.toString();
			} else {
				sb.append(arr[index]);
				index++;
			}
		}

		return sb.toString();
	}

	public String decodeString(String s) {
		char[] chars = s.toCharArray();
		return decode(chars, chars.length);
	}
}
