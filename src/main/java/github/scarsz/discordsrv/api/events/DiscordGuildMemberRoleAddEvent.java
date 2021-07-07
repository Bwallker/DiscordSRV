package github.scarsz.discordsrv.api.events;

import lombok.Getter;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.entities.Member;
import net.dv8tion.jda.api.entities.Role;
import net.dv8tion.jda.api.entities.User;
import net.dv8tion.jda.api.events.guild.member.GuildMemberRoleAddEvent;

import java.util.List;

public class DiscordGuildMemberRoleAddEvent extends DiscordEvent<GuildMemberRoleAddEvent>{
    @Getter private JDA jda;
    @Getter private List<Role> roles;
    @Getter private Member member;
    @Getter private User user;

    public DiscordGuildMemberRoleAddEvent(GuildMemberRoleAddEvent jdaEvent) {
        super(jdaEvent.getJDA(), jdaEvent);
        this.roles = jdaEvent.getRoles();
        this.jda = jdaEvent.getJDA();
        this.member = jdaEvent.getMember();
        this.user = jdaEvent.getUser();
    }
}
