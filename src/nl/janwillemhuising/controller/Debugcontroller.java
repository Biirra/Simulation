package nl.janwillemhuising.controller;

import nl.janwillemhuising.model.DebugPanel;
import nl.janwillemhuising.view.DebugView;

public class DebugController {

    private DebugPanel model;
    private DebugView view;

    public DebugController(DebugPanel model, DebugView view) {
        this.model = model;
        this.view = view;
    }
    public void update(long now){
        view.seTextFpsLabel(model.getFPS(now));
    }
}
