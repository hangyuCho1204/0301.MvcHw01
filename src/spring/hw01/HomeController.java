package spring.hw01;

import java.sql.Date;
import java.util.Calendar;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
public class HomeController {
	Calendar cal = Calendar.getInstance();
	Date d= null;
	
	@RequestMapping(value="ex/time", method=RequestMethod.GET)
	public String time(Model model){
		
		long ld = cal.getTimeInMillis();
		d= new Date(ld);
		
		model.addAttribute("date", d);
		return "time";
	}
}

