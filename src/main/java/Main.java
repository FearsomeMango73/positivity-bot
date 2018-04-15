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
    

        String[] stringQuotes = {
                         };
    }

    @Override
    public void onMessageReceived(MessageReceivedEvent event){
        String[] challenges = {"Go outside and Enjoy the weather",
                                "Compliment someone you rarely comliment!",
                                "Check up on a friend you haven't talked to in a while.",
                               "Remind a sibling you actually like them. (Or that they aren't ALWAYS annoying, if you'd prefer)",
                                "ex","ex",
                                "ex","ex",
                                "ex","ex"};

        String[] stringQuotes = {"Just becuase you're trash does not be you canot do great things. Its calld Garbage can, not Garbage cannot.\n" + "-JaydenW",
                                "You can't eat cake for breakfast' *World invents pop-tarts* Yup, challenging our assumptions can = breakthroughs",
                                "When u feel like u don’t belong: “Nobody exists on purpose. Nobody belongs anywhere. \n" + "- Rick and Morty",
                                "Yesterday is not ours to recover, but tomorrow is ours to win or lose.\n" + "-Lyndon B. Johnson",
                                "Yesterday is history, tomorrow is a mystery, and today is a gift...That's why they call it present!\n" + "-Master Oogway, Kung Fu Panda ",
                                 "Your story may not have such a happy beginning but that does not make you who you are, it is the rest of it- who you choose to be.\n"+"-Soothsayer, Kung Fu Panda II",
                                 "Keep your face to the sunshine and you cannot see a shadow\n"+"-Helen Keller",
                                 "Once you replace negative thoughts with positive ones, you'll start having positive results.\n"+"-Willie Nelson",
                                 "In order to carry a positive action we must develop here a positive vision.\n"+"-Dalai Lama",
                                 "I always like to look on the optimistic side of life, but I am realistic enough to know that life is a complex matter.\n"+"-Walt Disney",
                                 "Positive thinking is more than just a tagline. It changes the way we behave. And I firmly believe that when I am positive, it not only makes me better, but it also makes those around me better.\n"+"-Harvey Mackay",
                                 "Good, better, best. Never let it rest. 'Til your good is better and your better is best.\n"+"-St. Jerome",
                                 "Optimism is the faith that leads to achievement. Nothing can be done without hope and confidence.\n"+"-Helen Keller",
                                 "With the new day comes new strength and new thoughts.\n"+"-Eleanor Roosevelt",
                                 "I seenow that the circumstances of one's birth are irrelevant. It is what you do with the gift of life that determines who you are.\n"+"-Mewtwo, Pokemon",
                                 "We do have a lot in common. The same earth, the same air, the same sky. Maybe if we started looking at what's the same...instead of always looking at what's different, well, who knows?\n"+"-Meowth, Pokemon",
                                 "We can't just give up because things aren't the way we want them to be.\n"+"-Piccolo, Dragonball",
                                 "Life is not easy for any of us. But what of that? We must have perseverance and above all confidence in ourselves. We must believe that we are gifted for something and that this thing must be attained.\n"+"-Marie Curie",
                                 "When the whole world is silent, even one voice becomes powerful.\n"+"-Malala Yousafzai",
                                 "One never notices what has been done; one can only see what remains to be done.\n"+"-Marie Curie",
                                 "We were scared, but our fear was not as strong as our courage.\n"+"-Malala Yousafzai",
                                 "Make the most of yourself by fanning the tiny, inner sparks of possibility into flames of achievement.\n"+"-Golda Meir"
                                 "The most difficult thing is the decision to act, the rest is merely tenacity.\n"+"-Amelia Earhart",
                                 "I’d rather regret the things I’ve done than regret the things I haven’t done.\n"+"-Lucille Ball",
                                 "Life is not measured by the number of breaths we take, but by the moments that take our breath away.\n"+"– Maya Angelou"
                                "ex","ex",
                                "ex","ex",
                                "ex","ex"};

        String[] punArray = {"Have a cup of positiviTEA","Donut let anyone tell you you're less thanincrEDIBLE",
                             "Life is good for Optimus Prime. It's even better for Optimist Prime.","Think like a proton. Always positive.",
                             "Everything whale be alright.","Achieve grapeness.",
                             "","How does a Computer get drunk? It takes screenSHOTS XD",
                             "What do you call a funny quantum physicist? A silly string theorist.",
                             "What do lawyers wear to court? A lawsuit.",
                             "No fig deal because YOU GOT THIS!",
                             "You have to be odd to be number one.",
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
