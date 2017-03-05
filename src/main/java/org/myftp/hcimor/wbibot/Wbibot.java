package org.myftp.hcimor.wbibot;

import org.telegram.telegrambots.api.methods.send.SendMessage;
import org.telegram.telegrambots.api.objects.Update;
import org.telegram.telegrambots.bots.TelegramLongPollingCommandBot;
import org.telegram.telegrambots.exceptions.TelegramApiException;

/**
 * Created by Roman on 05.03.2017.
 */
public class Wbibot extends TelegramLongPollingCommandBot{

    private String botName;
    private String botToken;

    public Wbibot(String name, String token){
        super();
        botName = name;
        botToken = token;
    }

    /*
    public static void main (String args[]){
        ApiContextInitializer.init();
        TelegramBotsApi telegramBotsApi = new TelegramBotsApi();

        try {
            telegramBotsApi.registerBot(new Wbibot("hcimor_bot", "307590561:AAHAqI_BAco_-Qdx-wXMGxv7LUSZDtXqjQg"));
        }catch (TelegramApiException e){
            e.printStackTrace();
        }
    }
    */
    public void processNonCommandUpdate(Update update){

    }

    public String getBotUsername() {
        return botName;
    }

    public String getBotToken() {
        return botToken;
    }

    public void sendMsg (String chatId, String text){
        SendMessage sendMessage = new SendMessage();
        sendMessage.enableMarkdown(true);
        sendMessage.setChatId(chatId);
        sendMessage.setText(text);
        try{
            sendMessage(sendMessage);
        }catch (TelegramApiException e){
            e.printStackTrace();
        }
    }

}
