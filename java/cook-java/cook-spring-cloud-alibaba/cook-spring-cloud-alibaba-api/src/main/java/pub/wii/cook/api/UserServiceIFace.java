package pub.wii.cook.api;

import pub.wii.cook.user.Request;
import pub.wii.cook.user.Response;

public interface UserServiceIFace {
    Response getUser(Request request);
}
