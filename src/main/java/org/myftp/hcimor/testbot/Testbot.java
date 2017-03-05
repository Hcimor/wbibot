package org.myftp.hcimor.testbot;


import org.myftp.hcimor.wbibot.Wbibot;
import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.TelegramBotsApi;
import org.telegram.telegrambots.exceptions.TelegramApiException;

/**
 * Created by Roman on 05.03.2017.
 */
public class Testbot {
    public static void main (String args[]){
        ApiContextInitializer.init();
        TelegramBotsApi telegramBotsApi = new TelegramBotsApi();
        Wbibot newBot = new Wbibot("name_bot", "token");
        try {
            telegramBotsApi.registerBot(newBot);
        }catch (TelegramApiException e){
            e.printStackTrace();
        }

        newBot.sendMsg("chatid", "Проверка");
    }
}
