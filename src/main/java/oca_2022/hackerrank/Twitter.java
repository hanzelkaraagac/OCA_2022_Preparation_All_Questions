package oca_2022.hackerrank;

public class Twitter {

    //Given a tweet, parse out the hashtags.
    //Input: "This #is a #tweet", Output: ["is", "tweet"]


    public static void main(String[] args) {
        String tweet = "This #is a #tweet";
        String[] hashtags = getHashtags(tweet);

        for (String hashtag : hashtags) {
            System.out.println(hashtag);
        }
    }

    public static String[] getHashtags(String tweet) {
        String[] words = tweet.split(" ");
        String[] hashtags = new String[words.length];
        int i = 0;
        for (String word : words) {
            if (word.startsWith("#")) {
                hashtags[i] = word.substring(1);
                i++;
            }
        }
        return hashtags;
    }



}
