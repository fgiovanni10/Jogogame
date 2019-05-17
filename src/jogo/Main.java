/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogo;
import engine.io.Window;
import org.lwjgl.glfw.GLFW;

/**
 *
 * @author aluno
 */
public class Main {

    public static final int WIDTH = 1080, HEIGHT = 720;
    public static final String TITLE = "Jogo";
    
    public static void main(String[] args) {
        Window window = new Window(WIDTH, HEIGHT, TITLE);
        window.create();
        window.setBackgroundColor(255, 0, 0);
        while(!window.closed()){
            window.update();
            
            if(window.isKeyPressed(GLFW.GLFW_KEY_A))
                System.out.println("pressionou A");
            if(window.isKeyReleased(GLFW.GLFW_KEY_A))
                System.out.println("soltou A");
            if(window.isMousePressed(GLFW.GLFW_MOUSE_BUTTON_LEFT))
                System.out.println("pressionou Botão Mouse");
            if(window.isMouseReleased(GLFW.GLFW_MOUSE_BUTTON_LEFT))
                System.out.println("soltou Botão Mouse");
            
            
            window.swapBuffers();
        }
    }
    
}
