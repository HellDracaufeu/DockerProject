package fr.master.lebret.websocket;
 
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
 
import javax.websocket.CloseReason;
import javax.websocket.OnClose;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.CloseReason.CloseCodes;
import javax.websocket.server.ServerEndpoint;
 
@ServerEndpoint(value = "/dog")
public class DoggyEndPoint {
 
    private Logger logger = Logger.getLogger(this.getClass().getName());
    private static List<Session> sessions = new ArrayList<Session>();
 
    @OnOpen
    public void onOpen(Session session) {
        sessions.add(session);
        logger.info("Connected ... " + session.getId());
    }
 
    @OnMessage
    public void onMessage(String message, Session session) {
        switch (message) {
        case "quit":
            try {
                session.close(new CloseReason(CloseCodes.NORMAL_CLOSURE, "Communication closed"));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            break;
        }

        for (Session s: sessions){
            try {
                s.getBasicRemote().sendText(message);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
 
    @OnClose
    public void onClose(Session session, CloseReason closeReason) {
        sessions.remove(session);
        logger.info(String.format("Session %s closed because of %s", session.getId(), closeReason));
    }
}