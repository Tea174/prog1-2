import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class PlayingCard {
      enum Rank {
        TWO(2), THREE(3), FOUR(4), FIVE(5),
        SIX(6), SEVEN(7), EIGHT(8), NINE(9), TEN(10),
        JACK(10), QUEEN(10), KING(10), ACE(1);

        private final int value;
        Rank(int value) {
            this.value = value;
        }

         public int getValue() {
             return value;
         }

         @Override
        public String toString() {
            return name().toLowerCase();
        }
    }

     enum Suit {
        HEARTS, SPADES, CLUBS,DIAMONDS;

        @Override
        public String toString() {
            return name().toLowerCase();
        }
    }

    public static Random random = new Random();

    private Rank rank;
    private Suit suit;

    public PlayingCard(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public Rank getRank() {
        return rank;
    }

    public Suit getSuit() {
        return suit;
    }

    public int getValue(){
        return rank.getValue();
    }

    public static PlayingCard generateRandomPlayingCard() {
        Rank[] rankArray = Rank.values();
        Suit[] suitArray = Suit.values();

        //randomIndexArray:
        int randomIndexRank = random.nextInt(rankArray.length);
        int randomIndexSuit = random.nextInt(suitArray.length);
        Rank rank = rankArray[randomIndexRank];
        Suit suit = suitArray[randomIndexSuit];
        return new PlayingCard(rank, suit) ;
    }



    @Override
    public String toString() {
        return rank + " of " + suit;
    }
}
