package email;

import email.model.EmailForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EmailController {

    @GetMapping("/index")
    public String indexForm(Model model) {
        model.addAttribute("emailForm", new EmailForm());
        return "index";
    }

    @PostMapping("/sendEmail")
    public String sendEmail(@ModelAttribute EmailForm emailForm, Model model) {
        if (emailForm.getTo().isEmpty()) {
            model.addAttribute("error", "'Кому' не должно быть пустым");
            return "index";
        }
        return "result";
    }

    @GetMapping("/")
    public String about() {
        return "start_page"; // about.html
    }

    @GetMapping("/start_page")
    public String start() {
        return "start_page"; // about.html
    }

    @GetMapping("/survey")
    public String showSurveyPage() {
        return "survey"; // survey.html в templates/
    }

    @PostMapping("/results")
    public String submitSurvey(
            @RequestParam("feedbackApp") String feedbackApp,
            @RequestParam("feedbackUsage") String feedbackUsage,
            @RequestParam("additionalFeedback") String additionalFeedback,
            Model model) {

        // Добавляем данные в модель
        model.addAttribute("feedbackApp", feedbackApp);
        model.addAttribute("feedbackUsage", feedbackUsage);
        model.addAttribute("additionalFeedback", additionalFeedback);

        // Перенаправляем на страницу с результатами
        return "results";
    }


}
