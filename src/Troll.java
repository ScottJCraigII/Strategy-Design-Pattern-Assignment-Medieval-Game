/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Scott
 */
public class Troll  extends Character{
    
    public Troll(String name){
        super(name);
        weaponBehavior = new WeaponAxe();
    }
    
    public void display(){
        System.out.println(name + " is a funny troll");
    }
}
