/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Scott
 */
public class MedievalDriver {
    public static void main(String[] args) {
		Character king = new King("Thomas");
		Character queen = new Queen("Isabella");
		Character knight = new Knight("Luke");
		Character troll = new Troll("Brownwen");
		
		king.display();
		king.attack();
		System.out.println("----------------");
		
		queen.display();
		queen.attack();
		System.out.println("----------------");
		
		knight.display();
		knight.attack();
		System.out.println("----------------");
		
		troll.display();
		troll.attack();
		troll.setWeaponBehavior(new WeaponNone());
		troll.attack();

	}
}
