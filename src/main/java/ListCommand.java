public class ListCommand extends Command {

    @Override
    public void execute(TaskList tasks, Ui ui, Storage storage) {
        ui.listTasks(ui, tasks);
    }

    @Override
    public boolean isExit() {
        return false;
    }
}