package seedu.address.logic.commands;

import seedu.address.model.Model;

/**
 * Lists all persons in the address book to the user.
 */
public abstract class ViewCommand extends Command {

    public static final String COMMAND_WORD = "view";

//    public static final String MESSAGE_SUCCESS = "Listed all persons";

    public static final String MESSAGE_USAGE = COMMAND_WORD + ": Lists information according to the command inputted.\n"
            + "view -s: View Student information\n"
            + "view -c / view -cp / view -cu: View Consultation sessions\n"
            + "view -mc / view -mcp / view -mcu: View Mastery Check sessions\n"
            + "view -u: View ungraded Missions and Quests\n"
            + "view -m: View deadline for Missions\n"
            + "view -q: View deadline for Quests\n"
            + "view -i: View deadline for specific mission/quest by id\n"
            + "view -t / view -tt / view -te / view -td: View Tasks(Todos, Events, Deadlines)\n";

    public abstract CommandResult execute(Model model);

}

