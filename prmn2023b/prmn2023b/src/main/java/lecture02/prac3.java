package lecture02;

public class prac3 {
    public static void main(String[] args) {
        String[][] numlist = new String[5][];
        numlist[0] = new String[2];
        numlist[0][0] = "B2221110";
        numlist[0][1] = "aaaaa";
        numlist[1] = new String[2];
        numlist[1][0] = "B2222220";
        numlist[1][1] = "bbbbb";
        numlist[2] = new String[2];
        numlist[2][0] = "B2223330";
        numlist[2][1] = "ccccc";
        numlist[3] = new String[2];
        numlist[3][0] = "B2224440";
        numlist[3][1] = "ddddd";
        numlist[4] = new String[2];
        numlist[4][0] = "B2225550";
        numlist[4][1] = "eeeee";

        Name name = new Name();
        int j = name.search(numlist);
        name.access(numlist, j);
    }
}
