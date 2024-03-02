public class TestPlayingCard {
    public static void main(String[] args) {
        PlayingCard card = new PlayingCard(PlayingCard.Rank.SEVEN,
                PlayingCard.Suit.HEARTS);
        System.out.println(card.getSuit() + " " + card.getRank() +
                " " + card.getValue());
        System.out.println(card);

        for (int i = 0; i < 20; i++) {
            PlayingCard randomCard = PlayingCard.generateRandomPlayingCard();
            System.out.printf("Card %2d: %s\n", (i + 1), randomCard);
        }
    }
}