package Homework1;


import java.util.ArrayList;
import java.util.List;
import java.util.SortedMap;

public class Clan {
    private String clan_name;
    private List<Calisan>  clan_list;

    public Clan(String clan_name, List<Calisan> clan_list) {
        super();
        this.clan_name = clan_name;
        this.clan_list = clan_list;
    }

    public String getClan_name() {
        return clan_name;
    }

    public void setClan_name(String clan_name) {
        this.clan_name = clan_name;
    }

    public List<Calisan> getClan_list() {
        return clan_list;
    }

    public void setClan_list(List<Calisan>  clan_list) {
        this.clan_list = clan_list;
    }
    public void detail(List<Calisan>clan_list){
        List<Calisan> analist_list = new ArrayList<Calisan>();
        List<Calisan> developer_list = new ArrayList<Calisan>();
        List<Calisan> tester_list = new ArrayList<Calisan>();

        for (int i = 0; i <this.clan_list.size() ; i++) {
            if (clan_list.get(i) == null) {
                continue;
            }
            else if (clan_list.get(i) instanceof Analist) {
                analist_list.add(clan_list.get(i));
            }
            else if (clan_list.get(i) instanceof Tester) {
                developer_list.add(clan_list.get(i));
            }
            else if (clan_list.get(i) instanceof Developer) {
                tester_list.add(clan_list.get(i));
            }

        }
        showClan(analist_list,developer_list,tester_list);

    }
    public void showClan(List<Calisan> analist_clan, List<Calisan> developers_clan, List<Calisan> testers_clan){
        for (int i = 0; i < analist_clan.size(); i++) {
            System.out.println("Analistlerin ismleri: " + analist_clan.get(i).getIsim() + " Takımları: " + analist_clan.get(i).getTakim() );
        }
        for (int c = 0; c < developers_clan.size(); c++) {
            System.out.println("Developer ismleri: " + developers_clan.get(c).getIsim()+ " Takımları: " + developers_clan.get(c).getTakim() );
        }
        for (int x = 0; x < testers_clan.size(); x++) {
            System.out.println("Tester ismleri: " + testers_clan.get(x).getIsim()+ " Takımları: " + testers_clan.get(x).getTakim() );
        }

    }


}
