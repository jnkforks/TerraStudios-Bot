package com.terrastudios.tsbot.core.util.extensions

import com.terrastudios.tsbot.core.util.MessageType
import net.dv8tion.jda.api.EmbedBuilder
import net.dv8tion.jda.api.entities.MessageEmbed
import java.util.*


class EmbedFactory {
    companion object {
        fun getEmbed(type: MessageType, title: String, text: String): MessageEmbed {
            return EmbedBuilder()
                .setTitle(title)
                .setDescription(text)
                .setColor(type.color)
                .setTimestamp(Date().toInstant())
                .setFooter("TerraStudios Bot")
                .build()
        }
    }


}