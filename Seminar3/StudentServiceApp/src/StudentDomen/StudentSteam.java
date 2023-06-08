package StudentDomen;
import java.util.Iterator;
import java.util.List;

import java.util.List;

public class StudentSteam implements Iterable<StudentGroup> {
    private int steamNumber;
    private List<StudentGroup> steam;
    public StudentSteam(List<StudentGroup> steam){
        this.steam = steam;
    }
    public int getSteamNumber(){
        return steamNumber;
    }
    public void setSteamNumber(int steamNumber){
        this.steamNumber = steamNumber;
    }
    public List<StudentGroup> getGroup(){
        return steam;
    }
    public void setGroup(List<StudentGroup> steam){
        this.steam = steam;
    }

    /**
     * Использование анонимного итератора
     * @return
     */
    @Override
    public Iterator<StudentGroup> iterator() {
        return new Iterator<StudentGroup>() {
            private int index = 0;
            @Override
            public boolean hasNext() {
                return index < steam.size();
            }
            @Override
            public StudentGroup next() {
                if(!hasNext()){
                    return null;
                }
                else {
                    return steam.get(index++);
                }
            }
        };
    }
}
