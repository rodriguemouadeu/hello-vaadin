package com.rodriguemouadeu.hellovaadin;

import com.vaadin.Application;
import com.vaadin.ui.*;

/**
 * Main application class.
 */
public class HelloVaadinApplication extends Application {

	@Override
	public void init() {
		Window mainWindow = new Window("Hello Vaadin Application");
		Label label = new Label("Hello Vaadin user changed");
		mainWindow.addComponent(label);
		setMainWindow(mainWindow);
	}

}

