package eu.senla.task7.factory;

import eu.senla.task7.roboРarts.Body;
import eu.senla.task7.roboРarts.FormBody;
import eu.senla.task7.roboРarts.FormHead;
import eu.senla.task7.roboРarts.Head;
import static java.lang.Math.random;

public class Factory {

    private BodyFactory bodyFactory;
    private HeadFactory headFactory;

    public Object createBodyFactory(){
        this.bodyFactory = new BodyFactory();
        bodyFactory.createPartOfRobot();
        return bodyFactory;
    }

    public Object createHeadFactory(){
        this.headFactory = new HeadFactory();
        headFactory.createPartOfRobot();
        return headFactory;
    }
    public class BodyFactory implements ICreatable{

        private Body robotBody;

        public BodyFactory() {
        }

        public BodyFactory(FormBody formBody) {
            this.robotBody = new Body(formBody);
        }

        @Override
        public Object createPartOfRobot() {
            int from = 1;
            int to = 3;
            int numOfForm = from + (int)(random()*((to - from) + 1));
            return this.robotBody = new Body(numOfForm);
        }

        @Override
        public String toString() {
            return "Body = " + robotBody;
        }
    }

    public class HeadFactory implements ICreatable {

        private Head robotHead;

        public HeadFactory() {
        }

        public HeadFactory(FormHead formHead){
            this.robotHead = new Head(formHead);
        }

        @Override
        public Object createPartOfRobot() {
            int from = 1;
            int to = 3;
            int numOfForm = from + (int)(random()*((to - from) + 1));
            return this.robotHead = new Head(numOfForm);
        }

        @Override
        public String toString() {
            return " Head = " + robotHead;
        }
    }



}
