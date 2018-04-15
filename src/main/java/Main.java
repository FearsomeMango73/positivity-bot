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

    }

    @Override
    public void onMessageReceived(MessageReceivedEvent event){
        String[] challenges = {"Go outside and Enjoy the weather","",
                "ex","ex",
                "ex","ex",
                "ex","ex"};

        String[] stringQuotes = {"Yesterday is not ours to recover, but tomorrow is ours to win or lose.\n" + "-Lyndon B. Johnson","Yesterday is history, tomorrow is a mystery, and today is a gift...That's why they call it present!\n" + "-Master Oogway, Kung Fu Panda ",
                "Just becuase you're trash does not be you canot do great things. Its calld Garbage can, not Garbage cannot.\n" + "-JaydenW","You can't eat cake for breakfast' *World invents pop-tarts* Yup, challenging our assumptions can = breakthroughs",
                "When u feel like u don’t belong: “Nobody exists on purpose. Nobody belongs anywhere. \n" + "- Rick and Morty","ex",
                "ex","ex",
                "ex","ex",
                "ex","ex"};

        String[] punArray = {"Have a cup of positiviTEA","Donut let anyone tell you you're less thanincrEDIBLE",
                "Life is good for Optimus Prime. It's even better for Optimist Prime.","Think like a proton. Always positive.",
                "Everything whale be alright.","Achieve grapeness.",
                "Always BEE yourself.","How does a Computer get drunk? It takes screenSHOTS ",
                "ex","ex",
                "ex","ex",
                "ex","ex",
                "ex","ex",
                "ex","ex",};
        String[] givingArray = {"You CAN do it, ","Im ROOTing for you, "," is PEARfection!"};

        String[] positiveArray = {"https://www.youtube.com/watch?v=u7o3LR1WN8E&index=9"};

        if(event.getAuthor().isBot()){
            return;
        }

        System.out.println("We received a message from"+
                event.getAuthor().getName() + ":" +
                event.getMessage().getContentDisplay() );

        if(event.getMessage().getContentRaw().equals("!ping")){
            event.getChannel().sendMessage("Pong!").queue();
        }

        if(event.getMessage().getContentRaw().equals("!dailyChallenge")){
            event.getChannel().sendMessage( challenges[ (int)(Math.floor(Math.random() * challenges.length)) ] ).queue();
        }

        if(event.getMessage().getContentRaw().equals("!puntime")){
            event.getChannel().sendMessage( punArray[ (int)(Math.floor(Math.random() * punArray.length)) ] ).queue();
        }

        if(event.getMessage().getContentRaw().equals("You are loved")){
            event.getChannel().sendMessage( givingArray[ (int)(Math.floor(Math.random() * givingArray.length)) ] ).queue();
        }

        if(event.getMessage().getContentRaw().equals("sad")){
            event.getChannel().sendMessage( "Dont feel sad! you just gotta get up annd Dance with me!" + positiveArray[ (int)(Math.floor(Math.random() * positiveArray.length)) ] ).queue();
        }

        if(event.getMessage().getContentRaw().equals("!quotes")){
            event.getChannel().sendMessage( stringQuotes[ (int)(Math.floor(Math.random() * stringQuotes.length)) ] ).queue();
        }

        if(event.getMessage().getContentRaw().equals("damn")){
            event.getChannel().sendMessage("Did you mean: Dazzling Artistry My Neighbor!").queue();
        }

        if(event.getMessage().getContentRaw().equals("fuck")){
            event.getChannel().sendMessage("*ahem* Try \"Golly Gee Whiz\" next time!").queue();
        }

        if(event.getMessage().getContentRaw().equals("asshole")){
            event.getChannel().sendMessage("The word arse in English derives from the Germanic root -arsaz, which " +
                    "originated from the Proto-Indo-European root -ors, meaning \"buttocks\" or \"backside\". " +
                    "The combined form arsehole is first attested from 1500 in its literal use to refer to the anus. " +
                    "The metaphorical use of the word to refer to the worst place in a region (e.g., \"the arsehole of the world\"), " +
                    "is first attested in print in 1865; the use to refer to a contemptible person is first attested in 1933. " +
                    "Interesting fact: Pablo Picasso was never called an asshole.").queue();
        }

        if(event.getMessage().getContentRaw().equals("f u")) {
            event.getChannel().sendMessage("Fordham University?").queue();
        }

    }


}
