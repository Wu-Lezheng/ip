public class Deadline extends Task {

    private String by;

    public Deadline(String description, String by) throws DukeException {
        super(description);
        if (by == null) {
            throw new DukeException("☹ OOPS!!! Please follow the format </by date>.");
        }
        this.by = by;
    }

    @Override
    public String toString() {
        return "[D]" + super.toString() + " (by: " + by + ")";
    }

}
