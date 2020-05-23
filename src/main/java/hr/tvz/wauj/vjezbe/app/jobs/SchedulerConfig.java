package hr.tvz.wauj.vjezbe.app.jobs;

import org.quartz.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SchedulerConfig {

    private static final String STUDENT_PRINT_JOB_IDENTITY = "studentPrintJob";
    private static final String STUDENT_PRINT_TRIGGER = "studentPrintTrigger";
    
    @Bean
    public JobDetail studentPrintJobDetail() {
        return JobBuilder.newJob(StudentPrintJob.class).withIdentity(STUDENT_PRINT_JOB_IDENTITY)
                .storeDurably().build();
    }

    @Bean
    public SimpleTrigger studentPrintTrigger() {
        SimpleScheduleBuilder scheduleBuilder = SimpleScheduleBuilder.simpleSchedule()
                .withIntervalInSeconds(5).repeatForever();

        return TriggerBuilder.newTrigger().forJob(studentPrintJobDetail())
                .withIdentity(STUDENT_PRINT_TRIGGER).withSchedule(scheduleBuilder).build();
    }
    
}
