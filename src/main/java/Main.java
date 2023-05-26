
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {
        System.out.println("aaaaa");
        int intervalSeconds = Integer
            .parseInt(
                Utils.readConfig("src/main/resources/config_scheduler.yml")
                .get("interval_seconds")
                .toString()
            );
        System.out.println("aaaa");

        ScheduledExecutorService executorService;
        executorService = Executors.newSingleThreadScheduledExecutor();
        executorService.scheduleAtFixedRate(SmolScheduler::run, 0, intervalSeconds, TimeUnit.SECONDS);
    }
}
