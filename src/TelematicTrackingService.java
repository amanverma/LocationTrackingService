import java.time.LocalDateTime;

public class TelematicTrackingService{
    public TrackingService trackingService;
    //for every 60 sec
    TelematicTrackingService(){
        trackingService = new TelematicIngestionService();
    }

    public void update(TelematicsData tData){
        trackingService.updateTelematics(tData);
    }

    public Report getReport(int user_id, LocalDateTime startTime, LocalDateTime endTime){
        return trackingService.getReport(user_id, startTime, endTime);
    }
}
