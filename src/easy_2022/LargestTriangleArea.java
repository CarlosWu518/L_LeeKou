package easy_2022;

public class LargestTriangleArea {
    public static void main(String[] args) {
        int[][] points  = {{0,0}, {0,1},{1,3},{0,2},{2,0}};
        new LargestTriangleArea().largestTriangleArea(points);
    }
    public double largestTriangleArea(int[][] points) {
        int x = 0;
        int y = 0;
        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points[i].length; j++) {
                System.out.println(points[i][j]);
                if (j % 2 == 0){
                    x = x < points[i][j] ?points[i][j] : x;
                }else{
                    y = y < points[i][j] ? points[i][j] : y;
                };
            }
        }

        return 0;
    }
}
