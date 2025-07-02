import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class UserServiceApp extends SpringBootServletInitializer {
    public static void main(String[] args) {
        SpringApplication.run(UserServiceApp.class, args);
        System.out.println("User Service Application is running...");

        Runnable startupTask = () -> {
            String threadName = Thread.currentThread().getName();
            System.out.println("Running startup task in thread: " + threadName);
            // Simulate some startup work
            try {
                Thread.sleep(2000); // Simulating a delay for startup task
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt(); // Restore interrupted status
                System.err.println("Startup task interrupted: " + e.getMessage());
            }
            System.out.println("Startup task completed.");
        };
        Thread startupThread = new Thread(startupTask);
        startupThread.start();
    }
    @Override
            protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
                return builder.sources(UserServiceApp.class);
        };
    }