package org.gisela.dacd.eventstore;

import org.gisela.dacd.eventstore.application.Subscriber;
import org.gisela.dacd.eventstore.application.EventStoreManager;
import org.gisela.dacd.eventstore.infrastructure.SubscriberActiveMQ;

public class Main {
    private static final String BROKER_URL = "tcp://localhost:61616";
    private static final String CLIENT_ID = "Gisela";
    private static final String PREDICTION_WEATHER_TOPIC = "prediction.Weather";
    private static final String HOTEL_TOPIC = "sensor.Hotel";
    private static final String SUBSCRIBER_ID = "Gisela";

    public static void main(String[] args) {
        EventStoreManager eventStoreManager = new EventStoreManager();
        Subscriber subscriber = new SubscriberActiveMQ(BROKER_URL,CLIENT_ID, SUBSCRIBER_ID, eventStoreManager);
        subscriber.start();
        subscriber.subscribe(PREDICTION_WEATHER_TOPIC);
        subscriber.subscribe(HOTEL_TOPIC);
    }
}
