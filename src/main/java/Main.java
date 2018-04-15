//package main;

import net.dv8tion.jda.core.JDABuilder;
import net.dv8tion.jda.core.AccountType;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

import javax.security.auth.login.LoginException;

public class Main extends ListenerAdapter {

    public static void main(String[] args) throws LoginException{
        JDABuilder builder = new JDABuilder(AccountType.BOT);
        String token = "NDM0ODI4NzY2MzQ3NTI2MTQ1.DbQWzw.mY_YkwWN_chyztyCUPo_uWrdbek";
        builder.setToken(token);
        builder.addEventListener(new Main());
        builder.buildAsync();
        //string[30] stringQuotes;
        //punArray[20];
    }

    /*stringQuotes[0]="Yesterday is not ours to recover, but tomorrow is ours to win or lose.
     -Lyndon B. Johnson
     ";
    stringQuotes[1]="Yesterday is history, tomorrow is a mystery, and today is a gift...That's why they call it present!
    -Master Oogway, Kung Fu Panda
    "; */

    /*
    punArray[0]="Have a cup of positiviTEA";
    punArray[1]="Donut let anyone tell you you're less thanincrEDIBLE";
    punArray[2]="Life is good for Optimus Prime. It's even better for Optimist Prime.";
    punArray[3]="Think like a proton. Always positive.";
    punArray[4]="Everything whale be alright.";
    punArray[5]="Achieve grapeness.";
    */


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
        if(event.getMessage().getContentRaw().equals("!puntime")){
            event.getChannel().sendMessage("How does a Computer get drunk? It takes screenSHOTS XD").queue();
        }


    }


}
