package java_fundamentals.alfredBot;
import java.util.Date;

public class AlfredQuotes {
    public String basicGreeting() {
        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String name) {
        return "Hello , " + name + " how are you .";
    }
    
    public String dateAnnouncement() {
         Date date = new Date();
        return "it is currently " + date;
    }
    
    public String respondBeforeAlexis(String conversation) {
        if(conversation.contains("Alexis")){
         return "Right away, sir. She certainly isn't sophisticated enough for that.";
        }else if (conversation.contains("Alfred")){
         return "At your service. As you wish, naturally.";
        }else {
        return "Right. And with that I shall retire.";
        }
    }
    
    public String guestGreeting(String name , String dayPeriod) {  // overload method 
        return dayPeriod+" ," + name + " how are you .";
    }
}
