package gmail.leejaewon264.apiserver;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class FrontController {
    @GetMapping("/")
    public Map<String, Object> index(){
        Map<String, Object> data = new HashMap<>();
        data.put("result", "suc");

        List<Map> list = new ArrayList<>();
        Map<String, String> map1 = new HashMap<>();
        map1.put("id", "potato");
        map1.put("name", "감자");
        list.add(map1);

        data.put("list", list);

        return data;
    }
}
