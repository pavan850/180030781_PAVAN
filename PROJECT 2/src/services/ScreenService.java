package services;

import screens.FileOptionsScreen;
import screens.Screen;
import screens.Welcome;
import entities.Directory;


public class ScreenService {
	
	//static Directory dir = new Directory();
	
	
	
	public static Welcome Welcome = new Welcome();
    public static FileOptionsScreen FileOptionsScreen = new FileOptionsScreen();
    
    

    public static Screen CurrentScreen = Welcome;

    
    public static Screen getCurrentScreen() {
        return CurrentScreen;
    }

    
    public static void setCurrentScreen(Screen currentScreen) {
        CurrentScreen = currentScreen;
    }
    
    
    
}