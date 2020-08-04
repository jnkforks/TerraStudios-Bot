package com.terrastudios.tsbot.commands

import com.terrastudios.tsbot.core.commands.annotations.DiscordCommand
import com.terrastudios.tsbot.core.events.extensions.reply
import com.terrastudios.tsbot.core.util.MessageType
import com.terrastudios.tsbot.core.util.extensions.EmbedFactory
import net.dv8tion.jda.api.events.message.MessageReceivedEvent

class TestCommand {

    @DiscordCommand(
        commandName = "test"
    )
    fun onMessageReceived(event: MessageReceivedEvent) {
        event.reply(EmbedFactory.getEmbed(MessageType.INFO, "INFO", "Hey, that's pretty neat"))
    }

}