package appname.view;
import appname.model.Background;

public class AppNamePresenter {
    private final Background model;
    private final  AppNameView view;

    public AppNamePresenter(
        Background model, AppNameView view) {
        this.model = model;
        this.view = view;
        addEventHandlers();
        updateView();
    }

    private void addEventHandlers() {}
    private void updateView() {/* fills view*/}
}
