package eu.senla.task7.main;

import eu.senla.task7.factory.Factory;
import eu.senla.task7.robot.Robot;

public class Test {

    public static void main(String[] args) {

        Factory factory = new Factory();
        Robot robot = new Robot(factory.createBodyFactory(),factory.createHeadFactory(),"Wall-e");
        System.out.println(robot);
        for (int i = 1; i < 9; i++){
            Robot newRobot = new Robot(factory.createHeadFactory(),factory.createBodyFactory(),"R"+i);
            System.out.println(newRobot);
        }

    }
}
