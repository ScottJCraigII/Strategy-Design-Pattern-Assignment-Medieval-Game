/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Scott
 */
public class King extends Character{
    
    public King(String name){
        super(name);
        weaponBehavior = new WeaponSword();
    }
    
    public void display(){
        System.out.println(name + " is a Noble King");
    }
}
