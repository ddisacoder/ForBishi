package YouZan;

import java.lang.*;
import java.util.*;
//# : a:3#b:8#c:9

public class Mainb{
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        String str=r.nextLine();
        String[] strs=str.split(" ");

        String part=strs[0];
        String cut=strs[1];
        String deal=strs[2];
        String[] lis=deal.split(part);

        System.out.println(lis.length);
        for(String s:lis) {
            String[] kv=s.split(cut);
            String key=kv[0];
            String val=kv[1];
            System.out.println(key+" "+val);
        }

        /*
        #include <iostream>
#include <vector>
#include <sstream>
#include <string>
#include <algorithm>
#include <unordered_map>

using namespace std;
int main()
{
	string str;
	string strpair;
	string strvalue;
	vector<string>arr;

	cin >> strpair;
	cin >> strvalue;
	cin >> str;


	stringstream in1(str);
	string s;
	vector<string> v;
	while (getline(in1, s, strpair[0]))
		v.push_back(s);
	cout << v.size() << endl;
	for (int i = 0; i < v.size(); ++i)
	{
		s = v[i];
		for (int j = 0; j < s.size(); ++j)
		{
			if (s[j] == strvalue[0])
				cout << ' ';
			else
				cout << s[j];
		}
		cout << endl;
	}
}
         */
    }
}
