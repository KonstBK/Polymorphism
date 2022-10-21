package ObstaclesAndParticipants;

public abstract class Participant {
    private final String name;
    private final double runningDistance;
    private final double jumpHeight;

    private boolean isActive = true;

    public Participant(String name, double runningDistance, double jumpHeight) {
        this.name = name;
        this.runningDistance = runningDistance;
        this.jumpHeight = jumpHeight;
    }

    boolean run(Obstacle obstacle){
        return obstacle.getObstacleSize() <= getRunningDistance();
    }

    boolean jump(Obstacle obstacle){
        return obstacle.getObstacleSize() <= getJumpHeight();
    }

    public boolean getActivity() {
        return isActive;
    }

    public void setActivity(boolean active) {
        isActive = active;
    }

    public String getName() {
        return name;
    }

    public double getRunningDistance() {
        return runningDistance;
    }

    public double getJumpHeight() {
        return jumpHeight;
    }

    public boolean overcomeObstacle(Obstacle obstacle){
        if (obstacle instanceof RunningTrack){
            if (run(obstacle)){
                return true;
            }
        }

        if (obstacle instanceof Wall){
            if (jump(obstacle)){
                return true;
            }
        }
        return false;
    }
}
