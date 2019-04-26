/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;

/**
 *
 * @author User
 */
public class FacadeDemo {
    Square square;
    Triangle triangle;

    public FacadeDemo() {
        square=new Square();
        triangle=new Triangle();
    }
    
    void drawSquare(){
        square.show();
    }
    
    void drawTriangle(){
        triangle.show();
    }
}
