/*-
 * LICENSE
 * DiscordSRV
 * -------------
 * Copyright (C) 2016 - 2021 Austin "Scarsz" Shapiro
 * -------------
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/gpl-3.0.html>.
 * END
 */

package github.scarsz.discordsrv.api.events;

import lombok.Getter;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.entities.Member;
import net.dv8tion.jda.api.entities.Role;
import net.dv8tion.jda.api.entities.User;
import net.dv8tion.jda.api.events.guild.member.GuildMemberRoleRemoveEvent;

import java.util.List;

public class DiscordGuildMemberRoleRemoveEvent extends DiscordEvent<GuildMemberRoleRemoveEvent>{
    @Getter private JDA jda;
    @Getter private List<Role> roles;
    @Getter private Member member;
    @Getter private User user;

    public DiscordGuildMemberRoleRemoveEvent(GuildMemberRoleRemoveEvent jdaEvent) {
        super(jdaEvent.getJDA(), jdaEvent);
        this.roles = jdaEvent.getRoles();
        this.jda = jdaEvent.getJDA();
        this.member = jdaEvent.getMember();
        this.user = jdaEvent.getUser();
    }
}
