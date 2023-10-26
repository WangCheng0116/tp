package flashlingo.testutil;

import seedu.flashlingo.model.flashcard.FlashCard;
import seedu.flashlingo.logic.commands.AddCommand;

import static seedu.flashlingo.logic.parser.CliSyntax.*;

/**
 * A utility class for FlashCard.
 */
public class FlashCardUtil {

    /**
     * Returns an add command string for adding the {@code FlashCard}.
     */
    public static String getAddCommand(FlashCard flashCard) {
        return AddCommand.COMMAND_WORD + " " + getFlashCardDetails(flashCard);
    }

    /**
     * Returns the part of command string for the given {@code FlashCard}'s details.
     */
    public static String getFlashCardDetails(FlashCard flashCard) {
        StringBuilder sb = new StringBuilder();
        sb.append(PREFIX_ORIGINAL_WORD + flashCard.getOriginalWord().getWord() + " ");
        sb.append(PREFIX_TRANSLATED_WORD + flashCard.getTranslatedWord().getWord() + " ");
//        sb.append(PREFIX_EMAIL + flashCard.getEmail().value + " ");
//        sb.append(PREFIX_ADDRESS + flashCard.getAddress().value + " ");
//        FlashCard.getTags().stream().forEach(
//            s -> sb.append(PREFIX_TAG + s.tagName + " ")
//        );
        return sb.toString();
    }

    /**
     * Returns the part of command string for the given {@code EditPersonDescriptor}'s details.
     */
//    public static String getEditPersonDescriptorDetails(EditPersonDescriptor descriptor) {
//        StringBuilder sb = new StringBuilder();
//        descriptor.getName().ifPresent(name -> sb.append(PREFIX_NAME).append(name.fullName).append(" "));
//        descriptor.getPhone().ifPresent(phone -> sb.append(PREFIX_PHONE).append(phone.value).append(" "));
//        descriptor.getEmail().ifPresent(email -> sb.append(PREFIX_EMAIL).append(email.value).append(" "));
//        descriptor.getAddress().ifPresent(address -> sb.append(PREFIX_ADDRESS).append(address.value).append(" "));
//        if (descriptor.getTags().isPresent()) {
//            Set<Tag> tags = descriptor.getTags().get();
//            if (tags.isEmpty()) {
//                sb.append(PREFIX_TAG);
//            } else {
//                tags.forEach(s -> sb.append(PREFIX_TAG).append(s.tagName).append(" "));
//            }
//        }
//        return sb.toString();
//    }
}
