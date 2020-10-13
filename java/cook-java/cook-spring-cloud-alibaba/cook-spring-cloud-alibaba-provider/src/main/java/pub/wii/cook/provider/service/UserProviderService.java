package pub.wii.cook.provider.service;

import org.apache.dubbo.config.annotation.DubboService;
import pub.wii.cook.User;
import pub.wii.cook.api.UserServiceIFace;
import pub.wii.cook.user.Request;
import pub.wii.cook.user.Response;

@DubboService(protocol = "dubbo")
public class UserProviderService implements UserServiceIFace {

    @Override
    public Response getUser(Request request) {
        return new Response().setUser(new User().setId(request.getId()).setName("Wii").setAge(18));
    }
}
