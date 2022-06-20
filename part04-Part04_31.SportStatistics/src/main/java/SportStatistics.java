
import java.nio.file.Paths;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("File: ");
        String file = scan.nextLine();
        
        System.out.println("Team:");
        String team = scan.nextLine().toLowerCase();
        
        int games = 0, wins = 0, loses = 0;
        try(Scanner readFile = new Scanner(Paths.get(file))){
            while(readFile.hasNextLine()){
                
                String line = readFile.nextLine();
                String[] parts = line.split(",");
                if(parts.equals("")){
                    continue;
                }
                String homeTeam = parts[0].trim();
                String visitingTeam = parts[1].trim();
                int homeTeamPoints = Integer.valueOf(parts[2].trim());
                int visitingTeamPoints = Integer.valueOf(parts[3].trim());
                
                
                if (team.equals(homeTeam.toLowerCase())) {  
                    games++;
                    if (homeTeamPoints > visitingTeamPoints){
                        wins++;
                    }else {
                        loses++;
                    }
                }
                
                if (team.equals(visitingTeam.toLowerCase())){
                    games++;
                    if (visitingTeamPoints > homeTeamPoints){
                        wins++;
                    }else{
                        loses++;
                    }
                }
                
                
            }
        }catch(Exception e){
            System.out.println("Was not able to read the file " + e.getMessage());
        }
        System.out.println("Games: " + games);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + loses);

    }

}
