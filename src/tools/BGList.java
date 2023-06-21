package tools;

import java.util.ArrayList;
import logic.Interfaces.Background;
import logic.Backgrounds.*;

public class BGList {
    
    private ArrayList<Background> bgList = new ArrayList<Background>() {
        {
            add(new Acolyte());
            add(new Charlatan());
            add(new Criminal());
            add(new Entertainer());
            add(new FolkHero());
            add(new GuildArtisan());
            add(new Hermit());
            add(new Noble());
            add(new Outlander());
            add(new Sage());
            add(new Sailor());
            add(new Soldier());
            add(new Urchin());
        }       
    };

    public ArrayList<Background> getBGList() {
        return bgList;
    }

}
