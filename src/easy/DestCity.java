package easy;

import java.util.*;

/**
 * @Description： 给你一份旅游线路图，该线路图中的旅行线路用数组 paths 表示，其中 paths[i] = [cityAi, cityBi]
 * 表示该线路将会从 cityAi 直接前往 cityBi 。请你找出这次旅行的终点站，即没有任何可以通往其他城市的线路的城市。
 * 题目数据保证线路图会形成一条不存在循环的线路，因此只会有一个旅行终点站。Start in any city and use the path to move to the next city.  Eventually, you will reach a city with no path outgoing, this is the destination city.
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/destination-city
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @author： CarlosWu
 * @date： 2020/7/21 14:58
 */
public class DestCity {
    public static void main(String[] args) {
        List<List<String>> paths = new ArrayList<>();
        List<String> a = new ArrayList<>();
        a.add("pYyNGfBYbm");
        a.add("wxAscRuzOl");
        List<String> b = new ArrayList<>();
        b.add("A");
        b.add("A");
        List<String> c = new ArrayList<>();
        c.add("kzwEQHfwce");
        c.add("pYyNGfBYbm");
        paths.add(a);
        paths.add(b);
        paths.add(c);
        new DestCity().destCity(paths);
    }
    public String destCity(List<List<String>> paths) {
        Set start = new LinkedHashSet();
        Set end = new LinkedHashSet();
        for (List<String> path : paths) {
            for (int i = 0; i < path.size(); i++) {
                if (i == 0 && i % 2 ==0 ){
                    start.add(path.get(i));
                }else {
                    end.add(path.get(i));
                }
            }
        }
        for (Object o : end) {
            start.add(o);
        }
        List last = new ArrayList(start);
        String s = last.get(last.size()-1).toString();
        return s;
    }
}



















