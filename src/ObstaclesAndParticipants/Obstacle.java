package ObstaclesAndParticipants;

public class Obstacle {
    private final String name;
    private final int obstacleSize;


    public Obstacle(String name, int obstacleSize) {
        this.name = name;
        this.obstacleSize = obstacleSize;
    }

    public int getObstacleSize() {
        return obstacleSize;
    }

    public String getName() {
        return name;
    }
}
