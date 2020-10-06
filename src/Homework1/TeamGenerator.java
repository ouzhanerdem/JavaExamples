package Homework1;

import java.util.Random;

public class TeamGenerator {

    public String[][] team(String[]  team_list, String[]  team_members){
        Random ran = new Random();
        String[][] team = new String[8][8];
        String[] team_member_list = new String[team_members.length];
        int c = 0;
        for (int x = 0; x <=5 ; x++) {
            String team_name = team_list[x];
            for (int i = 0; i < 6 ; i++) {
                int team_member_number = ran.nextInt(team_member_list.length);
                team_member_list[i] = team_members[team_member_number];

            }


            team[c][0]=team_name;


            for (int b = 1; b <=6 ; b++) {
                 team[x][b] = team_member_list[b-1];
                 //System.out.println(team[x][1]);
            }
            c++;

        }

        /*for (int h = 0; h < team.length-2; h++) {
            for (int e = 0; e <7 ; e++) {
                System.out.println(team[h][e]);
            }

        }*/

        return team;
    }
}
