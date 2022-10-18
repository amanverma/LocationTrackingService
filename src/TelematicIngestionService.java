import java.time.LocalDateTime;

public class TelematicIngestionService implements  TrackingService{
    @Override
    public void updateTelematics(TelematicsData telematicsData) {

    }

    @Override
    public Report getReport(int user_id, LocalDateTime startTime, LocalDateTime endTime) {
        return null;
    }
}
