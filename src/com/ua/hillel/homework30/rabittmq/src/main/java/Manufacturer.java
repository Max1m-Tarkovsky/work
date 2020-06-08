import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

public class Manufacturer {
    public final static String QUEUE_NAME = "Hillel_HomeWork2020";

    public static void main(String[] args) throws IOException, TimeoutException {
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("localhost");
        Connection connection = factory.newConnection();
        Channel channel = connection.createChannel();

        String message = "I try it ";
       /* channel.queueDeclare(QUEUE_NAME, false, false, false, null)*/;
        for (int i = 1; i < 15; i++) {
            channel.basicPublish("", QUEUE_NAME, null, (message+i).getBytes());
            System.out.println("( " + message + " " + i + " times)");
        }
        channel.close();
        connection.close();
    }
}

