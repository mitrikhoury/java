package java_fundamentals.hashMap_task;
import java.util.HashMap;
import java.util.Set;
public class hashMap_task {
    
    public static void main(String[] args) {
    
        HashMap<String , String> trackList  = new HashMap<String , String >();

        trackList.put("song_title_1", "song_1");
        trackList.put("song_title_2", "song_2");
        trackList.put("song_title_3", "song_3");
        trackList.put("song_title_4", "song_4");

        System.out.println(trackList.get("song_title_2"));

        Set<String> keys = trackList.keySet();
        
        for(String key : keys) {
        System.out.print(key + "   ");
        System.out.println(trackList.get(key));    
         }
         
    }
}
