package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.sql.Time;
import java.util.Date;
import java.util.TimeZone;

@Controller
public class TimeController {
    @GetMapping("/")
    public String getTime(ModelMap model,@RequestParam(name = "city",required = false,defaultValue = "Asia/Ho_Chi_Minh") String city) {
        Date date=new Date();
        TimeZone local=TimeZone.getDefault();
        TimeZone locale = TimeZone.getTimeZone(city);
        long locale_time=date.getTime()+ (local.getRawOffset()-locale.getRawOffset());
        date.setTime(locale_time);
        model.addAttribute("city",city);
        model.addAttribute("date",date);
        return "index";


    }
}
