package hr.tvz.wauj.vjezbe.app.jobs;

import hr.tvz.wauj.vjezbe.app.student.Student;
import hr.tvz.wauj.vjezbe.app.student.StudentRepository;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.quartz.QuartzJobBean;

import java.util.Set;

public class StudentPrintJob extends QuartzJobBean {

    private Logger log = LoggerFactory.getLogger(StudentPrintJob.class);
    
    private final StudentRepository studentRepository;

    public StudentPrintJob(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    protected void executeInternal(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        final Set<Student> studentSet = studentRepository.findAll();
        
        if(!studentSet.isEmpty()){
            log.info("Ovo su trenutno upisani studenti");
            log.info("------------------------------");
            studentSet.forEach(
                    student -> log.info(student.toString())
            );
            log.info("------------------------------");
        } else {
            log.info("Trenutno nema upisanih studenata");
        }
                
    }
}
