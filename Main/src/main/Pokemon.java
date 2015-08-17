/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author Michael
 */

/*
 * Type list: Normal 01, Fighting 02, Flying 03, Poison 04, Ground 05, Rock 06, 
 * Bug 07, Ghost 08, Steel 09, Fire 10, Water 11, Grass 12, Electric 13, 
 * Psychic 14, Ice 15, Dragon 16, Dark 17.
 */


public class Pokemon {
    public int pokeID;
    public String pokeName;
    public String pokeNickName;
    public int type1;
    public int type2;
    public int totalHP;
    public int currentHP;
    public int atk;
    public int def;
    public int spatk;
    public int spdef;
    public int speed;
    public int exp;
    
    public Pokemon(){
        // Todo add the database and a method of pulling from it here
    }
}
