package flashlingo.testutil;

import static flashlingo.logic.commands.CommandTestUtil.VALID_ORIGINAL_WORD_AMY;
import static flashlingo.logic.commands.CommandTestUtil.VALID_ORIGINAL_WORD_BOB;
import static flashlingo.logic.commands.CommandTestUtil.VALID_TRANSLATION_AMY;
import static flashlingo.logic.commands.CommandTestUtil.VALID_TRANSLATION_BOB;
import static seedu.flashlingo.logic.parser.CliSyntax.PREFIX_ORIGINAL_WORD;
import static seedu.flashlingo.logic.parser.CliSyntax.PREFIX_TRANSLATED_WORD;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import seedu.flashlingo.model.Flashlingo;
import seedu.flashlingo.model.flashcard.FlashCard;

/**
 * A utility class containing a list of {@code FlashCard} objects to be used in tests.
 */
public class TypicalFlashCards {

    public static final String DEFAULT_WHEN_TO_REVIEW = "2023-01-01T00:00:00Z";
    public static final FlashCard HELLO = new FlashCardBuilder().withOriginalWord("你好", "")
            .withTranslatedWord("hello", "")
            .withWhenToReview(new GregorianCalendar(2023, Calendar.DECEMBER, 11).getTime())
            .withLevel(1).build();
    public static final FlashCard WELCOME = new FlashCardBuilder().withOriginalWord("欢迎", "")
            .withTranslatedWord("welcome", "")
            .withWhenToReview(new GregorianCalendar(2023, Calendar.DECEMBER, 12).getTime())
            .withLevel(1).build();
    public static final FlashCard THANKS = new FlashCardBuilder().withOriginalWord("ありがとう", "")
            .withTranslatedWord("thanks", "")
            .withWhenToReview(new GregorianCalendar(2023, Calendar.DECEMBER, 13).getTime())
            .withLevel(1).build();
    public static final FlashCard PLEASE = new FlashCardBuilder().withOriginalWord("Bitte", "")
            .withTranslatedWord("please", "")
            .withWhenToReview(new GregorianCalendar(2023, Calendar.DECEMBER, 14).getTime())
            .withLevel(1).build();
    public static final FlashCard HONEST = new FlashCardBuilder().withOriginalWord("honnête", "")
            .withTranslatedWord("honest", "")
            .withWhenToReview(new GregorianCalendar(2023, Calendar.DECEMBER, 15).getTime())
            .withLevel(1).build();
    public static final FlashCard NICE = new FlashCardBuilder().withOriginalWord("Leuk", "")
            .withTranslatedWord("nice", "")
            .withWhenToReview(new GregorianCalendar(2023, Calendar.DECEMBER, 16).getTime())
            .withLevel(1).build();
    public static final FlashCard ALICE = new FlashCardBuilder()
            .withOriginalWord("Alice Pauline", "English")
            .withTranslatedWord("爱丽丝·宝琳", "Mandarin")
            .build();
    public static final FlashCard BENSON = new FlashCardBuilder()
            .withOriginalWord("Benson Meier", "English")
            .withTranslatedWord("本森·梅尔", "Mandarin")
           .build();
    public static final FlashCard CARL = new FlashCardBuilder()
            .withOriginalWord("Carl Kurz", "English")
            .withTranslatedWord("卡尔·库尔兹", "Mandarin")
            .build();
    public static final FlashCard DANIEL = new FlashCardBuilder().withOriginalWord("Daniel Meier",
                     "English")
            .withTranslatedWord("丹尼尔·梅尔", "Mandarin")
            .build();
    public static final FlashCard ELLE = new FlashCardBuilder().withOriginalWord("Elle Meyer",
                    "English")
            .withTranslatedWord("艾尔·迈耶", "Mandarin")
            .build();
    public static final FlashCard FIONA = new FlashCardBuilder().withOriginalWord("Fiona Kunz",
                     "English")
            .withTranslatedWord("菲奥娜昆兹", "Mandarin")
            .build();

    public static final FlashCard GEORGE = new FlashCardBuilder().withOriginalWord("George Best",
                     "English")
            .withTranslatedWord("乔治·贝斯特", "Mandarin")
            .build();

    // Manually added
    public static final FlashCard HOON = new FlashCardBuilder().withOriginalWord("Hoon Meier",
                     "English")
            .withTranslatedWord("胡恩·梅尔", "Mandarin")
            .build();
    public static final FlashCard IDA = new FlashCardBuilder().withOriginalWord("Ida Mueller",
                     "English")
            .withTranslatedWord("艾达·米勒", "Mandarin")
            .build();

    public static final FlashCard AMY = new FlashCardBuilder().withOriginalWord(VALID_ORIGINAL_WORD_AMY,
                    "")
            .withTranslatedWord(VALID_TRANSLATION_AMY, "")
            .build();
    public static final FlashCard BOB = new FlashCardBuilder().withOriginalWord(VALID_ORIGINAL_WORD_BOB,
                    "")
            .withTranslatedWord(VALID_TRANSLATION_BOB, "")
            .build();
    public static final String WORD_DESC_AMY = " " + PREFIX_ORIGINAL_WORD + VALID_ORIGINAL_WORD_AMY;
    public static final String WORD_DESC_BOB = " " + PREFIX_ORIGINAL_WORD + VALID_ORIGINAL_WORD_BOB;
    public static final String TRANSLATION_DESC_AMY = " " + PREFIX_TRANSLATED_WORD + VALID_TRANSLATION_AMY;
    public static final String TRANSLATION_DESC_BOB = " " + PREFIX_TRANSLATED_WORD + VALID_TRANSLATION_BOB;
    public static final FlashCard WORD = new FlashCardBuilder().withOriginalWord("你好", "Chinese")
            .withTranslatedWord("hi", "English").withLevel(2)
            .withWhenToReview(Date.from(Instant.parse(DEFAULT_WHEN_TO_REVIEW))).build();

    public static final String KEYWORD_MATCHING_MEIER = "Meier"; // A keyword that matches MEIER

    private TypicalFlashCards() {} // prevents instantiation

    /**
     * Returns an {@code FlashLingo} with all the typical persons.
     */
    public static Flashlingo getTypicalFlashlingo() {
        Flashlingo flashlingo = new Flashlingo();
        for (FlashCard flashCard : getTypicalFlashCards()) {
            flashlingo.addFlashCard(flashCard);
        }
        return flashlingo;
    }

    public static List<FlashCard> getTypicalFlashCards() {
        return new ArrayList<>(Arrays.asList(
                ALICE, BENSON, CARL, DANIEL, ELLE, FIONA, GEORGE));
    }
}
