package appname.view;
import appname.model.ModelName;

public class AppNamePresenter {
    private final  ModelName model;
    private final  AppNameView view;

    public AppNamePresenter(
            ModelName model, AppNameView view) {
        this.model = model;
        this.view = view;
        addEventHandlers();
        updateView();
    }

    private void addEventHandlers() {}
    private void updateView() {/* fills view*/}
}
