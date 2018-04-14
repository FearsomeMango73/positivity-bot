import net.dv8tion.jda.core.JDABuilder;
import net.dv8tion.jda.core.AccountType;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

import javax.security.auth.login.LoginException;
public class Main extends ListenerAdapter {

    public static void Main(String[] args) throws LoginException{
        JDABuilder builder = new JDABuilder(AccountType.BOT);
        String token = "NDM0ODI4NzY2MzQ3NTI2MTQ1";
        builder.setToken(token);
        builder.addEventListener(new Main());
        builder.buildAsync();
    }
    @Override
    public void onMessageReceived(MessageReceivedEvent event){
        if(event.getAuthor().isBot()){
            return;
        }
        System.out.println("We received a message from"+
                event.getAuthor().getName() + ":" +
                event.getMessage().getContentDisplay() );
        if(event.getMessage().getContentRaw().equals("!ping")){
            event.getChannel().sendMessage("Pong!").queue();
        }


    }


}
