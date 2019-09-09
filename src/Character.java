/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Scott
 */
public abstract class Character {
    protected String name;
    WeaponBehavior weaponBehavior;
    
    public Character(String name){
        this.name = name;
    }
    
    public abstract void display();
    
    public void attack(){
        weaponBehavior.attack();
    }
    
    public void setWeaponBehavior(WeaponBehavior wb){
        weaponBehavior = wb;
    }
    
}
