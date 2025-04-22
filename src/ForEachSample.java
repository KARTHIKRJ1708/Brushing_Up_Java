public class ForEachSample {

    public static void main(String[] args){

        int votecount[] ={230,440,550,212,542,768};

        int maxvote = findMaxVote(votecount);

        System.out.println("Maximum number of votes in this province:" + maxvote);

    }

    public static int findMaxVote(int[] n) {
        int max = n[0];
        for (int n1 : n) {
            if (n1 > max) {
                max = n1;
            }
        }
        return max;
    }
}
