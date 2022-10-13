package ObstaclesAndParticipants;

public class Main {
    public static void main(String[] args) {
        Human fred = new Human("Fred", 1500, 3.5);
        Human john = new Human("John", 1500, 2.8);
        Human anna = new Human("Anna", 950, 3);

        Cat barsik = new Cat("Barsik", 3500, 4.5);
        Cat scratchy = new Cat("Scratchy", 4000, 5.5);
        Cat pushok = new Cat("Pushok", 2500, 3.8);

        Robot android = new Robot("Android", 4000, 6);
        Robot terminator = new Robot("T-1000", 5000, 8);
        Robot altron = new Robot("Altron", 10000, 10);

        RunningTrack track = new RunningTrack("running track", 1500);
        Wall woodenWall = new Wall("wooden wall", 3);

        Participant[] participants = {fred, john, anna, barsik, scratchy, pushok,
                android, terminator, altron};
        Obstacle[] obstacles = {track, woodenWall};

        Competition competition = new Competition(participants, obstacles);
        competition.startCompetition(participants, obstacles);
    }
}

class Competition{

    Participant[] participants;
    Obstacle[] obstacles;

    public Competition(Participant[] participants, Obstacle[] obstacles) {
        this.participants = participants;
        this.obstacles = obstacles;
    }

    public void startCompetition(Participant[] participants, Obstacle[] obstacles){
        for (Participant participant : participants) {
            for (Obstacle obstacle : obstacles) {
                if (participant.getActivity()){
                    competition(participant, obstacle);
                }
            }
        }
    }

    private void competition(Participant participant, Obstacle obstacle) {
        if (participant.overcomeObstacle(obstacle)) {
            System.out.println(participant.getName() + " overcome " + obstacle.getName()
                    + " " + obstacle.getObstacleSize() + " meters long");
        } else {
            participant.setActivity(false);
            System.out.println(participant.getName() + " cannot overcome the " + obstacle.getName() + " and" +
                    " is eliminated from the competition");
        }
    }
}
