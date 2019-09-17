package DD;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main002 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        List<List<Integer>> adlist = new ArrayList<>();
        int start = s.nextInt();
        List<String> strings = new ArrayList<>();
        for (int j = 0; j < start; j++) {
            int end = s.nextInt();
            int sum = s.nextInt();
            for (int i = 0; i < end; i++) {
                adlist.add(new ArrayList<>());
            }
            for (int i = 0; i < sum; i++) {
                int st = s.nextInt();
                int ed = s.nextInt();
                adlist.get(st - 1).add(ed - 1);
                adlist.get(ed - 1).add(st - 1);
            }
            List<List<Integer>> result = new ArrayList<>();
            dfs(adlist, 0, end - 1, result);

            if (result.size() == 0) {
                strings.add("IMPOSSIBLE");
            } else {
                boolean flag = false;
                for (List<Integer> list : result) {
                    if (list.size() - 1 <= 2) {
                        flag = true;
                    }
                }
                if (flag)
                    strings.add("POSSIBLE");
                else
                    strings.add("IMPOSSIBLE");
            }
        }
        strings.stream().forEach(string -> System.out.println(string));
    }
    public static void dfs(List<List<Integer>> adjLists, int s, int d, List<List<Integer>> result) {
        int n = adjLists.size();
        boolean[] visited = new boolean[n];

        List<Integer> path = new ArrayList<Integer>();
        int path_index = 0;
        dfs_rec(adjLists, visited, s, d, path, result);
    }
    private static void dfs_rec(List<List<Integer>> adjLists, boolean[] visited, int v, int d,
                                List<Integer> path, List<List<Integer>> result) {
        visited[v] = true;
        path.add(v);
        if (v == d) {
            result.add(new ArrayList<>(path));
        } else {
            for (int w : adjLists.get(v)) {
                if (!visited[w]) {
                    dfs_rec(adjLists, visited, w, d, path, result);
                }
            }
        }
        path.remove(path.size() - 1);
        visited[v] = false;
    }
}
