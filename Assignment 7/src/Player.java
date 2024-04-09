//Player.java
//Jake Beahan
//Mar 29 2024

public class Player {

    private String name;
    private Weapon[] arsenal = new Weapon[4];
    private Weapon currentWeapon;
    private int currentWeaponIndex = 0;


    public Player(){
        name = "No name provided";
    }
    public Player(String name){

        this.name = name;

        arsenal[0] = new Knife();
        arsenal[1] = new Sword();
        arsenal[2] = new Pistol();
        arsenal[3] = new Rifle();

        currentWeapon = arsenal[0];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Weapon getCurrentWeapon() {
        return currentWeapon;
    }

    public int getCurrentWeaponIndex() {
        return currentWeaponIndex;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < arsenal.length; i++){
            sb.append(arsenal[i]);
            sb.append(" | ");
        }
        sb.deleteCharAt(sb.length() - 2);

        return "PLAYER: " + name + "\nCURRENT WEAPON: " + currentWeapon+ "\nINVENTORY: " + sb;
    }

    public void cycleForward(){
        if(currentWeaponIndex == 3) currentWeaponIndex = 0;
        else currentWeaponIndex++;
        currentWeapon = arsenal[currentWeaponIndex];
    }

    public void cycleBackward(){
        if(currentWeaponIndex == 0) currentWeaponIndex = 3;
        else currentWeaponIndex--;
        currentWeapon = arsenal[currentWeaponIndex];
    }
}