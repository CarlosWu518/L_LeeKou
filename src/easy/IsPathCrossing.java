package easy;

import java.util.*;

/*
 * @Description: 给你一个字符串 path，其中 path[i] 的值可以是 'N'、'S'、'E' 或者 'W'，分别表示向北、向南、向东、向西移动一个单位。
    机器人从二维平面上的原点 (0, 0) 处开始出发，按 path 所指示的路径行走。
    如果路径在任何位置上出现相交的情况，也就是走到之前已经走过的位置，请返回 True ；否则，返回 False 。
    来源：力扣（LeetCode）
    链接：https://leetcode-cn.com/problems/path-crossing
    著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @Author: CarlosWu
 * @Date: 2020/8/6 17:30
 * @Version: 0.0.1
 */
public class IsPathCrossing {

    public static void main(String[] args) {
    String path = "NNSWWEWSSESSWENNW";
    new IsPathCrossing().isPathCrossing(path);
    }
    public boolean isPathCrossing(String path) {
        List list = new ArrayList();
        int x = 0;
        int y = 0;
        String robot = "00";
            list.add(robot);
        for (int i = 0; i < path.length(); i++) {
            char c = path.charAt(i);
            if (c=='N'){
                y+=1;
            }
            else if (c=='S'){
                y-=1;
            }
            else if (c=='E'){
                x+=1;
            }
            else if (c=='W'){
                x-=1;
            }
            robot =""+x+y;
            if (list.contains(robot)){
                return true;
            }else {
                list.add(robot);
            }
        }
        return false;
    }
}
