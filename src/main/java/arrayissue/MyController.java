package arrayissue;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Post;
import javax.annotation.Nullable;

@Controller("/test")
public class MyController {

    @Post
    public String test(@Nullable MyEnum id) {
        return "Id is " + id;
    }
}
