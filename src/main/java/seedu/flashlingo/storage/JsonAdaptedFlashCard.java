package seedu.flashlingo.storage;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import seedu.flashlingo.commons.exceptions.IllegalValueException;
import seedu.flashlingo.model.flashcard.FlashCard;
import seedu.flashlingo.model.flashcard.OriginalWord;
import seedu.flashlingo.model.flashcard.Translation;
import seedu.flashlingo.model.tag.Tag;

/**
 * Jackson-friendly version of {@link FlashCard}.
 */
public class JsonAdaptedFlashCard {
    public static final String MISSING_FIELD_MESSAGE_FORMAT = "Flash card's %s field is missing!";

    private final String originalWord;
    private final String translatedWord;
    private final String whenToReview;
    private final int level;
    private final String toDelete;

    /**
     * Constructs a {@code JsonAdaptedFlashCard} with the given person details.
     */
    @JsonCreator
    public JsonAdaptedFlashCard(@JsonProperty("originalWord") String originalWord,
                                @JsonProperty("translatedWord") String translatedWord,
                                @JsonProperty("whenToReview") String whenToReview,
                                @JsonProperty("level") int level,
                                @JsonProperty("toDelete") String toDelete) {
        this.originalWord = originalWord;
        this.translatedWord = translatedWord;
        this.whenToReview = whenToReview;
        this.level = level;
        this.toDelete = toDelete;
    }

    /**
     * Converts a given {@code FlashCard} into this class for Jackson use.
     */
    public JsonAdaptedFlashCard(FlashCard source) {
        originalWord = source.getOriginalWord().toString();
        translatedWord = source.getTranslatedWord().toString();
        whenToReview = source.getWhenToReview().toString();
        //Todo: bad method names, optimize
        level = source.getLevel().getLevel();
        toDelete = source.getToDelete() ? "T" : "F";
    }

    /**
     * Converts this Jackson-friendly adapted person object into the model's {@code Person} object.
     *
     * @throws IllegalValueException if there were any data constraints violated in the adapted person.
     */
    public FlashCard toModelType() throws IllegalValueException {
        final List<Tag> personTags = new ArrayList<>();

        if (originalWord == null) {
            throw new IllegalValueException(String.format(MISSING_FIELD_MESSAGE_FORMAT, OriginalWord.class.getSimpleName()));
        }
        final String modelOriginalWord = originalWord;

        if (translatedWord == null) {
            throw new IllegalValueException(String.format(MISSING_FIELD_MESSAGE_FORMAT, Translation.class.getSimpleName()));
        }
        final String modelTranslatedWord = translatedWord;

        if (whenToReview == null) {
            throw new IllegalValueException(String.format(MISSING_FIELD_MESSAGE_FORMAT));
        }
        final Date modelWhenToReview = new Date(whenToReview);

        final int modelLevel = level;

        if (toDelete == null) {
            throw new IllegalValueException(String.format(MISSING_FIELD_MESSAGE_FORMAT));
        }

        return new FlashCard(new OriginalWord(modelOriginalWord), new Translation(modelTranslatedWord), modelWhenToReview, level);
    }
}
