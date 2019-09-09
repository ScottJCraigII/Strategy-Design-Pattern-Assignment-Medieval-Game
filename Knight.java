/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Scott
 */
public class Knight  extends Character{
    
    public Knight(String name){
        super(name);
        weaponBehavior = new WeaponBow();
    }
    
    public void display(){
        System.out.println(name + " is a valiant knight");
    }
}