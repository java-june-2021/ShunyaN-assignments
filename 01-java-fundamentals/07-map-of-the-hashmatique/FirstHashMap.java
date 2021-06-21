import java.util.HashMap;
import java.util.Set;
public class FirstHashMap {
    public void Display(){
        HashMap<String, String> trackList = new HashMap<String, String>();
        trackList.put("Riversi", "Listen promt prominance...");
        trackList.put("Go-on", "Nannimo Shinaide Asobudake...");
        trackList.put("Hakanakumo..","Aiga Aiwo Omosugirutte...");
        trackList.put("Odd Future", "Dream, Are you ready?...");

        System.out.println(trackList.get("Riversi"));
        for(String key: trackList.keySet()){
            System.out.println(String.format("Track: %s: Lyrics: %s", key, trackList.get(key)));
        }
    }
}