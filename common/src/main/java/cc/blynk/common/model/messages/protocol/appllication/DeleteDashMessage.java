package cc.blynk.common.model.messages.protocol.appllication;

import cc.blynk.common.model.messages.Message;

import static cc.blynk.common.enums.Command.DELETE_DASH;

/**
 * The Blynk Project.
 * Created by Dmitriy Dumanskiy.
 * Created on 2/1/2015.
 */
public class DeleteDashMessage extends Message {

    public DeleteDashMessage(int messageId, String body) {
        super(messageId, DELETE_DASH, body.length(), body);
    }

    @Override
    public String toString() {
        return "DeleteDashMessage{" + super.toString() + "}";
    }
}