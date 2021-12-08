import javax.security.auth.login.LoginException;

import commands.ping;
import commands.purge;
import net.dv8tion.jda.api.requests.GatewayIntent;
import net.dv8tion.jda.api.sharding.DefaultShardManagerBuilder;
import net.dv8tion.jda.api.utils.MemberCachePolicy;

public class Main
{
    public static void main(String[] args) throws LoginException
    {

	DefaultShardManagerBuilder builder = DefaultShardManagerBuilder.createDefault("OTE4MDkyNzk2NDA4MjMzOTk2.YbCOjA.h9QSKLMXOnopfRl1lxrSNWDeOcw")
                                                .setMemberCachePolicy(MemberCachePolicy.ALL)
                                                .enableIntents(GatewayIntent.GUILD_MEMBERS)
                                                .enableIntents(GatewayIntent.GUILD_MESSAGES)
                                                .enableIntents(GatewayIntent.GUILD_PRESENCES);

	builder.addEventListeners(
		new purge()
		);

	builder.build();

    }
}
