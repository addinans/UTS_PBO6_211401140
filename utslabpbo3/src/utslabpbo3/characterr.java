/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package utslabpbo3;

public class characterr {

    String nama;
    int heal;
    String weapon;
    int attackP;
    int mana;
    
    // membuat constructor
    characterr (String nama, int heal, String weapon, int attackP, int mana){ 
        this.nama = nama;
        this.heal = heal; 
        this.weapon = weapon;
        this.attackP = attackP;
        this.mana = mana;
        print();
    }
    void attack(){
        this.mana -= 5;
        System.out.println(this.nama + " menyerang dengan kekuatan " + this.attackP + "!");
        // system.out.println("sotong terkena demage sebanyak "+this.attackP );

    }
    void damage(int attackP){
        System.out.println(this.nama + " terkena demage sebanyak " + attackP);
        this.heal -= attackP;
    }
    void print(){
        System.out.println("nama: "+this.nama);  
        System.out.println("heal: "+ this.heal);
        System.out.println("weapon: "+this.weapon);
        System.out.println("attack power: " +this.attackP);
        System.out.println("mana : " +this.mana);
    }
    
    public static void main(String[] args) {
        characterr character1 = new characterr ("ucup", 100, "pedang excalibur", 5, 100);
        character1.attack();
        character1.damage(10);
        character1.print();
    }
    
}
