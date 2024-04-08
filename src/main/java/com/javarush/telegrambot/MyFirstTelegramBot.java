package com.javarush.telegrambot;

import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

public class MyFirstTelegramBot extends MultiSessionTelegramBot {
    public static final String NAME = "MyNewJavaRushbot"; // TODO: добавьте имя бота в кавычках
    public static final String TOKEN = "7159228038:AAHSqu6hVNkcIVcv1IeQoZ-OO9dXkfjuVJI"; //TODO: добавьте токен бота в кавычках

    public MyFirstTelegramBot() {
        super(NAME, TOKEN);
    }

    @Override
    public void onUpdateEventReceived(Update update) {
        // TODO: основной функционал бота будем писать здесь
        sendTextMessageAsync("Привет будущий программист! Хорошего дня)");
        sendTextMessageAsync("Урааа!");

    }

    public static void main(String[] args) throws TelegramApiException {
        TelegramBotsApi telegramBotsApi = new TelegramBotsApi(DefaultBotSession.class);
        telegramBotsApi.registerBot(new MyFirstTelegramBot());
    }
}