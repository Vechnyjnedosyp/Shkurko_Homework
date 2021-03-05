package eu.senla.task7.robot;

public class Robot <T> {

    private T part1;
    private T part2;
    private String nameRobot;

    public Robot(T part1, T part2, String nameRobot) {
        this.part1 = part1;
        this.part2 = part2;
        this.nameRobot = nameRobot;
    }

    @Override
    public String toString() {
        return String.format("Robot '%s' and his PARTS: %s, %s.",nameRobot, part1, part2);
    }
}
