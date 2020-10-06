package Homework1;


import java.util.*;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;


public class Main {

   public static List<Calisan> teamRolDefine(String[][] team){
       Random ran = new Random();
       int analist_counter=0;
       int dev_counter=0;
       int test_counter=0;
       List<Calisan> list = new ArrayList<Calisan>();
       int counter = 0;

       for (int i = 0; i <42; i++) {
            int role = ran.nextInt(3);
            int who = ran.nextInt(7);
            int which = ran.nextInt(6);
            if (who == 0) {
                who++;
            }

            if (role == 0 && analist_counter <=7) {
                Analist analist = new Analist(team[which][who],"30",team[which][0]);
                //System.out.println("Analist: " + analist.getIsim());

                list.add(analist);
                analist_counter++;
                counter++;

            }
            else  if (role == 1 && test_counter <=7) {
                Tester tester = new Tester(team[which][who],"25",team[which][0]);
                //System.out.println("Test: " + tester.getIsim());
                //System.out.println(tester);
                list.add(tester);
                test_counter++;
                //System.out.println(test_counter);
                //System.out.println(list);
                counter++;
            }
            else if (role == 2 && dev_counter <=7) {
                Developer developer = new Developer(team[which][who],"100",team[which][0]);
                list.add(developer);
                //System.out.println("Developer: " + developer.getIsim());
                dev_counter++;
                counter++;
            }

        }
       return list;


    }

    public static void main(String[] args){

        String team_list[] = new String[]{"CF-1", "CF-2", "CF-3", "CF-4", "CF-5","CF-6"};
        String team_members[] = new String[]{"Melike Şahin", "Eda Baba", "Deniz Tekin", "Ceylan Ertem", "Nil İpek",
        "Sezen Aksu","Yıldız Tilbe","Nüket Duru","Müzeyyen Senar","Sıla","Katty Perry","Bergen","Hande Yener","Sertap Erener",
        "Erhan Saltan","Yahya Kemal Kara","Macide Hilal Karakaşlı","Merve Gültekin","Oğuzhan Erdem","Efecan Köksal","Tuğçe Kor"};
        String[][] team = new TeamGenerator().team(team_list, team_members);

        List<Calisan> list = teamRolDefine(team);
        //System.out.println(list.get(0));

        Clan clan = new Clan("Yemeksepeti Clan",list);
        clan.detail(list);








    }

}
