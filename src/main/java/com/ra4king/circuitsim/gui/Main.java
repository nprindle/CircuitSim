package com.ra4king.circuitsim.gui;

import com.ra4king.circuitsim.gui.CircuitSim;

// When the main class extends Application, sun.launcher.LauncherHelper in the
// java.base module will search for javafx.graphics and fail if it is absent, so
// we introduce a wrapper for the main class here
public class Main {
	public static void main(String[] args) {
		CircuitSim.main(args);
	}
}
