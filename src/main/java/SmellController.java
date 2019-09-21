import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class SmellController {

    @RequestMapping(value = "/get")
    public String getDateAndTime() {
        return "teste";
    }
}