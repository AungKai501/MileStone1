//Current code for milestone 1


import java.util.random;
import java.util.scanner;
import org.apache.commons.lang3.ArrayUtils;

public class mileStone1 {
    public static void main(String[] args){
        System.out.println("Welcome to Grave of the Fire Flies");
    
        Boolean fight = True
        int playerHealth = 100
        int enemyHealth = 100

    // the main function for fighting 
    while (fight) {
    
    # determine whose turn it is
    turn = random.rand.nextInt(1,2) # heads or tails
    if(turn == 1){
        boolean player_turn = True
        boolean computer_turn = False
        System.out.println("Player will go first.");
    else:
        boolean player_turn = False
        boolean computer_turn = True
        System.out.println("Computer will go first.");

    } // This is the loop that determines who gets to take the first turn
        

}
    
// This loop will iterate until either the player and the enemy 
    System.out.println("Player health: " + playerHealth, "Computer health: ", computerHealth);

    // set up the main game loop
    while (playerHealth != 0 ||computerHealth != 0);

        boolean heal_up = False // determine if heal has been used by the player. Resets false each loop.
        boolean miss = False //determine if the chosen move will miss.

        # create a dictionary of the possible moves and randomly select the damage it does when selected
       //  String [] moves = {"Punch" == rand.nextInt(18, 25),
       //  "Pyro Punch" == rand.nextInt(10, 35),
       //   "Heal" == rand.nextInt(20, 25)}

        if(player_turn){ // This iterates if it is the player's turn

            System.out.println("Please select a move:  1. Punch (Deal damage between 20-25)2. Pyro Punch (Deal damage between 20-35) 3. Heal (Restore between 20-25 health")

            Scanner eNtry = new Scanner(System.in);  
            String player_move = eNtry.nextLine(); 

            int move_miss = random.nextInt(5) // your charcter has a 20 percent chance of missing their attack
            if (move_miss == 1){
                return true;
            }
            else{
                return false;
            }
            else {

                if(player_move == 'punch' || player_move == '1'){
                    Random rd = new Random();
                    int low_damage = 18
                    int crit = 25
                    int damage = rd.nextInt(crit - low_damage) + low_damage;
                    System.out.println("You used Punch. It dealt "+ damage + " damage.");
                    computerHealth -= damage

                }    
                else if(player_move == 'Pyro Punch' || player_move == '2'){
                    Random rd = new Random();
                    int low-damage = 30
                    int crit = 45
                    int damage = rd.nextInt(crit - low_damage) + low_damage;
                    System.out.println("You used Pyro Punch. It dealt " + damage + " damage.");


                }   
                else if(player_move == 'Heal' || player_move == '3'){
                    boolean heal_up = true;
                    int heal = random.nextInt(25)
                    System.out.println("You used Heal. It healed for " + heal + " health.");
                    player_health += heal
                        if player_health > 100{
                            player_health = 100 // meant to cap player health at 100 
                        }
                             


                }      
                else{
                    System.out.println("That is not a valid move.")
                }
                
            }
        }

        else{ // This is the computer's move 

            int move_miss = random.nextInt(1,5);
            if(move_miss == 1){
                
                boolean miss = true
            }
            else{

                boolean miss = false
            }
            if(miss){
                System.out.println("The enemy missed their attack") // the computer missed and did not damage


            }
                
            else{
                if(computer_health > 50){
                    final String[] high_elementals = {"Burst", "Laser", "Amber"};
                    Random random = new Random();
                    int index = random.nextInt(high_elementals.length);
                    int enemy_damage = random.nextInt(15,25);

                    System.out.println("The computer used" + high_elemental[index] + "It dealt" + enemy_damage);
                    

                    }

                }
                
        }

            if player_turn:
                computer_health -= player_move
                if computer_health < 0:
                    computer_health = 0 
                    winner = "Player"
                    break
            else:
                player_health -= computer_move
                if player_health < 0:
                    player_health = 0
                    winner = "Computer"
                    break

        print("\nPlayer health: ", player_health, "Computer health: ", computer_health)

        # switch turns
        player_turn = not player_turn
        computer_turn = not computer_turn

    // once main game while loop breaks, determine winner and congratulate

    if winner == "Player":
        print("\nPlayer health: ", player_health, "Computer health: ", computer_health)
        print("\nCongratulations! You have won. You're an animal!!")
    else:
        print("\nPlayer health: ", player_health, "Computer health: ", computer_health)
        print("\nSorry, but your opponent wiped the floor with you. Better luck next time.")

    print("\nWould you like to play again?")

    answer = input("> ").lower()
    if answer not in ("yes", "y"):
        play_again = False

main()







