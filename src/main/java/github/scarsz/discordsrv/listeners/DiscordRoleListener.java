package github.scarsz.discordsrv.listeners;

import github.scarsz.discordsrv.DiscordSRV;
import github.scarsz.discordsrv.api.events.DiscordGuildMemberRoleAddEvent;
import github.scarsz.discordsrv.api.events.DiscordGuildMemberRoleRemoveEvent;
import net.dv8tion.jda.api.events.guild.member.GuildMemberRoleAddEvent;
import net.dv8tion.jda.api.events.guild.member.GuildMemberRoleRemoveEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;


public class DiscordRoleListener extends ListenerAdapter {
    @Override
    public void onGuildMemberRoleAdd(GuildMemberRoleAddEvent event) {
        DiscordSRV.api.callEvent(new DiscordGuildMemberRoleAddEvent(event));
    }
    @Override
    public void onGuildMemberRoleRemove(GuildMemberRoleRemoveEvent event) {
        DiscordSRV.api.callEvent(new DiscordGuildMemberRoleRemoveEvent(event));
    }
}
