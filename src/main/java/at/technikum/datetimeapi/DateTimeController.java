package at.technikum.datetimeapi;


        import org.springframework.web.bind.annotation.GetMapping;
        import org.springframework.web.bind.annotation.RestController;
        import java.text.SimpleDateFormat;
        import java.util.Date;
    @RestController
    public class DateTimeController {
        @GetMapping("/api/time")
        public String zeit(){
            SimpleDateFormat form = new SimpleDateFormat("HH:mm:ss");
            Date datum = new Date();
            return form.format(datum);
        }
        @GetMapping("/api/date")
        public String datum(){
            SimpleDateFormat form = new SimpleDateFormat("dd/MM/yyyy");
            Date datum = new Date();
            return form.format(datum);
        }

    }

