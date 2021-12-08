package commands;

import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class purge extends ListenerAdapter
{
    @Override
    public void onMessageReceived(MessageReceivedEvent event)
    {
	if(event.getMessage().getContentRaw().equalsIgnoreCase("!purge"))
	{
	    event.getChannel().sendMessage("purged").queue();
	}
    }

}
