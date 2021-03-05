package eu.senla.task7.roboРarts;

public class Head {

    private FormHead formHead;

    public Head() {
    }

    public Head(FormHead formHead) {
        this.formHead = formHead;
    }

    public Head(int numOfForm) {
        switch (numOfForm) {
            case 1:
                this.formHead = FormHead.CYLINDRICAL;
                break;
            case 2:
                this.formHead = FormHead.ROUND;
                break;
            case 3:
                this.formHead = FormHead.SQUARE;
                break;
        }
    }

    @Override
    public String toString() {
        return String.valueOf(formHead);
    }
}
