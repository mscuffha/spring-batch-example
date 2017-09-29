package mysqldbtoxml;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.batch.core.BatchStatus;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.item.ExecutionContext;
import org.springframework.batch.test.JobLauncherTestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
        "classpath:mysqldbtoxml/jobs/jobs-extract-users.xml",
        "classpath:mysqldbtoxml/config/context.xml",
        "classpath:mysqldbtoxml/config/database.xml",
        "classpath:mysqldbtoxml/config/test-context.xml"})
public class AppTest {

    @Autowired
    private JobLauncherTestUtils jobLauncherTestUtils;

    @Test
    public void launchJob() throws Exception {

        JobParameters param = new JobParametersBuilder().addString("age", "20").toJobParameters();

        //testing a job
        JobExecution jobExecution = jobLauncherTestUtils.launchJob(param);

        //Testing a individual step
        //JobExecution jobExecution = jobLauncherTestUtils.launchStep("step1");

        assertEquals(BatchStatus.COMPLETED, jobExecution.getStatus());

        ExecutionContext e = jobExecution.getExecutionContext();
    }
}