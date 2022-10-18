import java.time.LocalDateTime;

public interface TrackingService {
    public void updateTelematics(TelematicsData telematicsData); //this is called every 1 min

    public Report getReport(int user_id, LocalDateTime startTime, LocalDateTime endTime);
}
