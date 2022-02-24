package Terminals;

import Entities.Message;
import Entities.Queue;

public class MessageQueue extends Queue<Message> {
    //TODO: does this has to be all uppercase?
    private final static int MSGQSIZE = 10;
    MessageQueue(){
        super(MSGQSIZE);
    }



}
